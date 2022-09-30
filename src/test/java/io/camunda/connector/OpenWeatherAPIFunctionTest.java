package io.camunda.connector;

import static org.assertj.core.api.Assertions.assertThat;

import io.camunda.connector.test.outbound.OutboundConnectorContextBuilder;
import org.junit.jupiter.api.Test;

public class MyFunctionTest {

  @Test
  void shouldReturnUnauthorizedMessageWhenExecuteWithoutSecret() throws Exception {
    // given
    var input = new OpenWeatherAPIRequest();
    // Berlin
    input.setLongitude("13.404954");
    input.setLatitude("52.520008");
    input.setApiKey("XXXXXXX");
    input.setUnits("metric");
    var function = new OpenWeatherAPIFunction();
    var context = OutboundConnectorContextBuilder.create()
      .variables(input)
      .build();
    // when
    var result = function.execute(context);
    // then
    assertThat(result)
      .isInstanceOf(OpenWeatherAPIResult.class)
      .extracting("code")
      .isEqualTo(401);
  }

//  @Test
//  void shouldReturnReceivedMessageWhenExecute() throws Exception {
//    // given
//    var input = new OpenWeatherAPIRequest();
//    // Berlin
//    input.setLongitude("13.404954");
//    input.setLatitude("52.520008");
//    input.setApiKey("secrets.MY_TOKEN");
//    input.setUnits("metric");
//    var function = new OpenWeatherAPIFunction();
//    var context = OutboundConnectorContextBuilder.create()
//            .variables(input)
//            // You need to set a valid key here for this test
//            .secret("MY_TOKEN", "OPENWEATHER_API_KEY")
//            .build();
//    context.replaceSecrets(input);
//    // when
//    var result = function.execute(context);
//    // then
//    assertThat(result)
//            .isInstanceOf(OpenWeatherAPIResult.class)
//            .extracting("code")
//            .isEqualTo(200);
//  }
}