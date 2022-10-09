package io.camunda.connector;

import java.util.Objects;

public class OpenWeatherAPIResult {

  private String forecast;
  private int code;

  public void setCode(int code) { this.code = code; }

  public int getCode() { return this.code; }

  public String getForecast() {
    return forecast;
  }

  public void setForecast(String forecast) {
    this.forecast = forecast;
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
    return Objects.equals(forecast, that.forecast);
  }

  @Override
  public int hashCode() {
    return Objects.hash(forecast);
  }

  @Override
  public String toString() {
    return "OpenWeatherAPIResult [forecast=" + forecast + " code=" + code + "]";
  }
}
