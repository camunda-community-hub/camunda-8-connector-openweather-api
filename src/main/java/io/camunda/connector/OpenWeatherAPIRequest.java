package io.camunda.connector;

import io.camunda.connector.api.annotation.Secret;

import java.util.Objects;

public class OpenWeatherAPIRequest {

  private String latitude;
  private String longitude;
  private String units;
  @Secret
  private String apiKey;

  public String getLatitude() {
    return latitude;
  }

  public void setLatitude(String latitude) {
    this.latitude = latitude;
  }

  public String getLongitude() { return longitude; }

  public void setLongitude(String longitude) { this.longitude = longitude; }

  public String getUnits() { return units; }

  public void setUnits(String units) { this.units = units; }

  public String getApiKey() { return apiKey; }

  public void setApiKey(String apiKey) { this.apiKey = apiKey; }

  @Override
  public int hashCode() {
    return Objects.hash(latitude, longitude, units, apiKey);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    OpenWeatherAPIRequest other = (OpenWeatherAPIRequest) obj;
    return Objects.equals(latitude, other.latitude)
        && Objects.equals(longitude, other.longitude)
        && Objects.equals(units, other.units)
        && Objects.equals(apiKey, other.apiKey);
  }

  @Override
  public String toString() {
    return "OpenWeatherAPIRequest [latitude=" + latitude + ", longitude=" + longitude + ", units=" + units + ", apiKey=" + apiKey + "]";
  }
}
