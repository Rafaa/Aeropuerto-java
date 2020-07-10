package com.aero.models.google.search;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * GoogleSearchCandidates
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-07-10T15:26:48.962Z")

public class GoogleSearchCandidates   {
  @JsonProperty("formatted_address")
  private String formattedAddress = null;

  @JsonProperty("geometry")
  private GoogleSearchGeometry geometry = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("photos")
  @Valid
  private List<GoogleSearchPhotos> photos = null;

  @JsonProperty("place_id")
  private String placeId = null;

  public GoogleSearchCandidates formattedAddress(String formattedAddress) {
    this.formattedAddress = formattedAddress;
    return this;
  }

  /**
   * Get formattedAddress
   * @return formattedAddress
  **/


  public String getFormattedAddress() {
    return formattedAddress;
  }

  public void setFormattedAddress(String formattedAddress) {
    this.formattedAddress = formattedAddress;
  }

  public GoogleSearchCandidates geometry(GoogleSearchGeometry geometry) {
    this.geometry = geometry;
    return this;
  }

  /**
   * Get geometry
   * @return geometry
  **/

  @Valid

  public GoogleSearchGeometry getGeometry() {
    return geometry;
  }

  public void setGeometry(GoogleSearchGeometry geometry) {
    this.geometry = geometry;
  }

  public GoogleSearchCandidates name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GoogleSearchCandidates photos(List<GoogleSearchPhotos> photos) {
    this.photos = photos;
    return this;
  }

  public GoogleSearchCandidates addPhotosItem(GoogleSearchPhotos photosItem) {
    if (this.photos == null) {
      this.photos = new ArrayList<GoogleSearchPhotos>();
    }
    this.photos.add(photosItem);
    return this;
  }

  /**
   * Get photos
   * @return photos
  **/

  @Valid

  public List<GoogleSearchPhotos> getPhotos() {
    return photos;
  }

  public void setPhotos(List<GoogleSearchPhotos> photos) {
    this.photos = photos;
  }

  public GoogleSearchCandidates placeId(String placeId) {
    this.placeId = placeId;
    return this;
  }

  /**
   * Get placeId
   * @return placeId
  **/


  public String getPlaceId() {
    return placeId;
  }

  public void setPlaceId(String placeId) {
    this.placeId = placeId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleSearchCandidates googleSearchCandidates = (GoogleSearchCandidates) o;
    return Objects.equals(this.formattedAddress, googleSearchCandidates.formattedAddress) &&
        Objects.equals(this.geometry, googleSearchCandidates.geometry) &&
        Objects.equals(this.name, googleSearchCandidates.name) &&
        Objects.equals(this.photos, googleSearchCandidates.photos) &&
        Objects.equals(this.placeId, googleSearchCandidates.placeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(formattedAddress, geometry, name, photos, placeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleSearchCandidates {\n");
    
    sb.append("    formattedAddress: ").append(toIndentedString(formattedAddress)).append("\n");
    sb.append("    geometry: ").append(toIndentedString(geometry)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    photos: ").append(toIndentedString(photos)).append("\n");
    sb.append("    placeId: ").append(toIndentedString(placeId)).append("\n");
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

