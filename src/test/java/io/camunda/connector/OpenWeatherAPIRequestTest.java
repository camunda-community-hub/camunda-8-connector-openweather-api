package io.camunda.connector;

import static org.assertj.core.api.Assertions.assertThat;
import io.camunda.connector.test.outbound.OutboundConnectorContextBuilder;
import org.junit.jupiter.api.Test;

public class MyRequestTest {

  @Test
  void shouldReplaceTokenSecretWhenReplaceSecrets() {
    // given
    var input = new OpenWeatherAPIRequest();
    input.setLongitude("-96");
    input.setApiKey("secrets.MY_TOKEN");
    input.setLatitude("23");
    input.setUnits("metric");
    var context = OutboundConnectorContextBuilder.create()
      .secret("MY_TOKEN", "token value")
      .build();
    // when
    context.replaceSecrets(input);
    // then
    assertThat(input)
      .extracting("apiKey")
      .isEqualTo("token value");
  }
}