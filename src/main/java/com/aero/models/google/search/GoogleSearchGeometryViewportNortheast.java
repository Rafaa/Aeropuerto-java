package com.aero.models.google.search;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * GoogleSearchGeometryViewportNortheast
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-07-10T15:26:48.962Z")

public class GoogleSearchGeometryViewportNortheast   {
  @JsonProperty("lat")
  private BigDecimal lat = null;

  @JsonProperty("lng")
  private BigDecimal lng = null;

  public GoogleSearchGeometryViewportNortheast lat(BigDecimal lat) {
    this.lat = lat;
    return this;
  }

  /**
   * Get lat
   * @return lat
  **/
  @NotNull

  @Valid

  public BigDecimal getLat() {
    return lat;
  }

  public void setLat(BigDecimal lat) {
    this.lat = lat;
  }

  public GoogleSearchGeometryViewportNortheast lng(BigDecimal lng) {
    this.lng = lng;
    return this;
  }

  /**
   * Get lng
   * @return lng
  **/
  @NotNull

  @Valid

  public BigDecimal getLng() {
    return lng;
  }

  public void setLng(BigDecimal lng) {
    this.lng = lng;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleSearchGeometryViewportNortheast googleSearchGeometryViewportNortheast = (GoogleSearchGeometryViewportNortheast) o;
    return Objects.equals(this.lat, googleSearchGeometryViewportNortheast.lat) &&
        Objects.equals(this.lng, googleSearchGeometryViewportNortheast.lng);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lat, lng);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleSearchGeometryViewportNortheast {\n");
    
    sb.append("    lat: ").append(toIndentedString(lat)).append("\n");
    sb.append("    lng: ").append(toIndentedString(lng)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

