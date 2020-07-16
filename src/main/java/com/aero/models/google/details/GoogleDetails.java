package com.aero.models.google.details;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * GoogleDetails
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-07-15T14:12:45.427Z")

public class GoogleDetails   {
  @JsonProperty("html_attributions")
  @Valid
  private List<Object> htmlAttributions = new ArrayList<Object>();

  @JsonProperty("result")
  private GoogleDetailsResult result = null;

  @JsonProperty("status")
  private String status = null;

  public GoogleDetails htmlAttributions(List<Object> htmlAttributions) {
    this.htmlAttributions = htmlAttributions;
    return this;
  }

  public GoogleDetails addHtmlAttributionsItem(Object htmlAttributionsItem) {
    this.htmlAttributions.add(htmlAttributionsItem);
    return this;
  }

  /**
   * Get htmlAttributions
   * @return htmlAttributions
  **/
  @NotNull


  public List<Object> getHtmlAttributions() {
    return htmlAttributions;
  }

  public void setHtmlAttributions(List<Object> htmlAttributions) {
    this.htmlAttributions = htmlAttributions;
  }

  public GoogleDetails result(GoogleDetailsResult result) {
    this.result = result;
    return this;
  }

  /**
   * Get result
   * @return result
  **/
  @NotNull

  @Valid

  public GoogleDetailsResult getResult() {
    return result;
  }

  public void setResult(GoogleDetailsResult result) {
    this.result = result;
  }

  public GoogleDetails status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  **/
  @NotNull


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleDetails googleDetails = (GoogleDetails) o;
    return Objects.equals(this.htmlAttributions, googleDetails.htmlAttributions) &&
        Objects.equals(this.result, googleDetails.result) &&
        Objects.equals(this.status, googleDetails.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(htmlAttributions, result, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleDetails {\n");
    
    sb.append("    htmlAttributions: ").append(toIndentedString(htmlAttributions)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

