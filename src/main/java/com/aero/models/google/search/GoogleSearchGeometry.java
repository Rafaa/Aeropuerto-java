package com.aero.models.google.search;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * GoogleSearchGeometry
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-07-10T15:26:48.962Z")

public class GoogleSearchGeometry   {
  @JsonProperty("location")
  private GoogleSearchGeometryLocation location = null;

  @JsonProperty("viewport")
  private GoogleSearchGeometryViewport viewport = null;

  public GoogleSearchGeometry location(GoogleSearchGeometryLocation location) {
    this.location = location;
    return this;
  }

  /**
   * Get location
   * @return location
  **/
  @NotNull

  @Valid

  public GoogleSearchGeometryLocation getLocation() {
    return location;
  }

  public void setLocation(GoogleSearchGeometryLocation location) {
    this.location = location;
  }

  public GoogleSearchGeometry viewport(GoogleSearchGeometryViewport viewport) {
    this.viewport = viewport;
    return this;
  }

  /**
   * Get viewport
   * @return viewport
  **/
  @NotNull

  @Valid

  public GoogleSearchGeometryViewport getViewport() {
    return viewport;
  }

  public void setViewport(GoogleSearchGeometryViewport viewport) {
    this.viewport = viewport;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleSearchGeometry googleSearchGeometry = (GoogleSearchGeometry) o;
    return Objects.equals(this.location, googleSearchGeometry.location) &&
        Objects.equals(this.viewport, googleSearchGeometry.viewport);
  }

  @Override
  public int hashCode() {
    return Objects.hash(location, viewport);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleSearchGeometry {\n");
    
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    viewport: ").append(toIndentedString(viewport)).append("\n");
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

