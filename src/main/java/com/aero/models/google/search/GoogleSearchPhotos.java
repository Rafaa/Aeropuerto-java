package com.aero.models.google.search;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * GoogleSearchPhotos
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-07-10T15:26:48.962Z")

public class GoogleSearchPhotos   {
  @JsonProperty("height")
  private BigDecimal height = null;

  @JsonProperty("html_attributions")
  @Valid
  private List<String> htmlAttributions = null;

  @JsonProperty("photo_reference")
  private String photoReference = null;

  @JsonProperty("width")
  private BigDecimal width = null;

  public GoogleSearchPhotos height(BigDecimal height) {
    this.height = height;
    return this;
  }

  /**
   * Get height
   * @return height
  **/

  @Valid

  public BigDecimal getHeight() {
    return height;
  }

  public void setHeight(BigDecimal height) {
    this.height = height;
  }

  public GoogleSearchPhotos htmlAttributions(List<String> htmlAttributions) {
    this.htmlAttributions = htmlAttributions;
    return this;
  }

  public GoogleSearchPhotos addHtmlAttributionsItem(String htmlAttributionsItem) {
    if (this.htmlAttributions == null) {
      this.htmlAttributions = new ArrayList<String>();
    }
    this.htmlAttributions.add(htmlAttributionsItem);
    return this;
  }

  /**
   * Get htmlAttributions
   * @return htmlAttributions
  **/


  public List<String> getHtmlAttributions() {
    return htmlAttributions;
  }

  public void setHtmlAttributions(List<String> htmlAttributions) {
    this.htmlAttributions = htmlAttributions;
  }

  public GoogleSearchPhotos photoReference(String photoReference) {
    this.photoReference = photoReference;
    return this;
  }

  /**
   * Get photoReference
   * @return photoReference
  **/


  public String getPhotoReference() {
    return photoReference;
  }

  public void setPhotoReference(String photoReference) {
    this.photoReference = photoReference;
  }

  public GoogleSearchPhotos width(BigDecimal width) {
    this.width = width;
    return this;
  }

  /**
   * Get width
   * @return width
  **/

  @Valid

  public BigDecimal getWidth() {
    return width;
  }

  public void setWidth(BigDecimal width) {
    this.width = width;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleSearchPhotos googleSearchPhotos = (GoogleSearchPhotos) o;
    return Objects.equals(this.height, googleSearchPhotos.height) &&
        Objects.equals(this.htmlAttributions, googleSearchPhotos.htmlAttributions) &&
        Objects.equals(this.photoReference, googleSearchPhotos.photoReference) &&
        Objects.equals(this.width, googleSearchPhotos.width);
  }

  @Override
  public int hashCode() {
    return Objects.hash(height, htmlAttributions, photoReference, width);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleSearchPhotos {\n");
    
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    htmlAttributions: ").append(toIndentedString(htmlAttributions)).append("\n");
    sb.append("    photoReference: ").append(toIndentedString(photoReference)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
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

