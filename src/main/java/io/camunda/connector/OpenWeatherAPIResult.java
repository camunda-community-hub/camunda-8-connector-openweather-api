package io.camunda.connector;

import java.util.Objects;

public class OpenWeatherAPIResult {

  private String result;
  private int code;

  public void setCode(int code) { this.code = code; }

  public int getCode() { return this.code; }

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
    final OpenWeatherAPIResult that = (OpenWeatherAPIResult) o;
    return Objects.equals(result, that.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result);
  }

  @Override
  public String toString() {
    return "OpenWeatherAPIResult [result=" + result + "]";
  }

}
