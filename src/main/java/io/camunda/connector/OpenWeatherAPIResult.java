package io.camunda.connector;

import java.util.Objects;

public class MyConnectorResult {

  // TODO: define connector result properties, which are returned to the process engine
  private String result;

  public String getResult() {
    return result;
  }

  public void setResult(String results) {
    this.result = results;
  }

  @Override
  public boolean equals(final Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    final MyConnectorResult that = (MyConnectorResult) o;
    return Objects.equals(result, that.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result);
  }

  @Override
  public String toString() {
    return "MyConnectorResult [result=" + result + "]";
  }

}
