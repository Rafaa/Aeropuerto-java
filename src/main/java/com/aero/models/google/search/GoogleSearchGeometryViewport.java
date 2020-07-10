package com.aero.models.google.search;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * GoogleSearchGeometryViewport
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-07-10T15:26:48.962Z")

public class GoogleSearchGeometryViewport   {
  @JsonProperty("northeast")
  private GoogleSearchGeometryViewportNortheast northeast = null;

  @JsonProperty("southwest")
  private GoogleSearchGeometryViewportSouthwest southwest = null;

  public GoogleSearchGeometryViewport northeast(GoogleSearchGeometryViewportNortheast northeast) {
    this.northeast = northeast;
    return this;
  }

  /**
   * Get northeast
   * @return northeast
  **/
  @NotNull

  @Valid

  public GoogleSearchGeometryViewportNortheast getNortheast() {
    return northeast;
  }

  public void setNortheast(GoogleSearchGeometryViewportNortheast northeast) {
    this.northeast = northeast;
  }

  public GoogleSearchGeometryViewport southwest(GoogleSearchGeometryViewportSouthwest southwest) {
    this.southwest = southwest;
    return this;
  }

  /**
   * Get southwest
   * @return southwest
  **/
  @NotNull

  @Valid

  public GoogleSearchGeometryViewportSouthwest getSouthwest() {
    return southwest;
  }

  public void setSouthwest(GoogleSearchGeometryViewportSouthwest southwest) {
    this.southwest = southwest;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleSearchGeometryViewport googleSearchGeometryViewport = (GoogleSearchGeometryViewport) o;
    return Objects.equals(this.northeast, googleSearchGeometryViewport.northeast) &&
        Objects.equals(this.southwest, googleSearchGeometryViewport.southwest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(northeast, southwest);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleSearchGeometryViewport {\n");
    
    sb.append("    northeast: ").append(toIndentedString(northeast)).append("\n");
    sb.append("    southwest: ").append(toIndentedString(southwest)).append("\n");
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

