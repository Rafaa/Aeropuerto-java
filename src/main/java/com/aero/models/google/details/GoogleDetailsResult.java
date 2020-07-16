package com.aero.models.google.details;

import java.util.Objects;

import com.aero.models.google.search.GoogleSearchGeometry;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * GoogleDetailsResult
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-07-15T14:12:45.427Z")

public class GoogleDetailsResult   {
  @JsonProperty("address_components")
  @Valid
  private List<GoogleDetailsResultAddressComponents> addressComponents = new ArrayList<GoogleDetailsResultAddressComponents>();

  @JsonProperty("adr_address")
  private String adrAddress = null;

  @JsonProperty("formatted_address")
  private String formattedAddress = null;

  @JsonProperty("geometry")
  private GoogleSearchGeometry geometry = null;

  @JsonProperty("icon")
  private String icon = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("photos")
  @Valid
  private List<GoogleDetailsResultPhotos> photos = new ArrayList<GoogleDetailsResultPhotos>();

  @JsonProperty("place_id")
  private String placeId = null;

  @JsonProperty("reference")
  private String reference = null;

  @JsonProperty("scope")
  private String scope = null;

  @JsonProperty("types")
  @Valid
  private List<String> types = new ArrayList<String>();

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("utc_offset")
  private BigDecimal utcOffset = null;

  @JsonProperty("vicinity")
  private String vicinity = null;

  public GoogleDetailsResult addressComponents(List<GoogleDetailsResultAddressComponents> addressComponents) {
    this.addressComponents = addressComponents;
    return this;
  }

  public GoogleDetailsResult addAddressComponentsItem(GoogleDetailsResultAddressComponents addressComponentsItem) {
    this.addressComponents.add(addressComponentsItem);
    return this;
  }

  /**
   * Get addressComponents
   * @return addressComponents
  **/
  @NotNull

  @Valid

  public List<GoogleDetailsResultAddressComponents> getAddressComponents() {
    return addressComponents;
  }

  public void setAddressComponents(List<GoogleDetailsResultAddressComponents> addressComponents) {
    this.addressComponents = addressComponents;
  }

  public GoogleDetailsResult adrAddress(String adrAddress) {
    this.adrAddress = adrAddress;
    return this;
  }

  /**
   * Get adrAddress
   * @return adrAddress
  **/
  @NotNull


  public String getAdrAddress() {
    return adrAddress;
  }

  public void setAdrAddress(String adrAddress) {
    this.adrAddress = adrAddress;
  }

  public GoogleDetailsResult formattedAddress(String formattedAddress) {
    this.formattedAddress = formattedAddress;
    return this;
  }

  /**
   * Get formattedAddress
   * @return formattedAddress
  **/
  @NotNull


  public String getFormattedAddress() {
    return formattedAddress;
  }

  public void setFormattedAddress(String formattedAddress) {
    this.formattedAddress = formattedAddress;
  }

  public GoogleDetailsResult geometry(GoogleSearchGeometry geometry) {
    this.geometry = geometry;
    return this;
  }

  /**
   * Get geometry
   * @return geometry
  **/
  @NotNull

  @Valid

  public GoogleSearchGeometry getGeometry() {
    return geometry;
  }

  public void setGeometry(GoogleSearchGeometry geometry) {
    this.geometry = geometry;
  }

  public GoogleDetailsResult icon(String icon) {
    this.icon = icon;
    return this;
  }

  /**
   * Get icon
   * @return icon
  **/
  @NotNull


  public String getIcon() {
    return icon;
  }

  public void setIcon(String icon) {
    this.icon = icon;
  }

  public GoogleDetailsResult id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @NotNull


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public GoogleDetailsResult name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @NotNull


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GoogleDetailsResult photos(List<GoogleDetailsResultPhotos> photos) {
    this.photos = photos;
    return this;
  }

  public GoogleDetailsResult addPhotosItem(GoogleDetailsResultPhotos photosItem) {
    this.photos.add(photosItem);
    return this;
  }

  /**
   * Get photos
   * @return photos
  **/
  @NotNull

  @Valid

  public List<GoogleDetailsResultPhotos> getPhotos() {
    return photos;
  }

  public void setPhotos(List<GoogleDetailsResultPhotos> photos) {
    this.photos = photos;
  }

  public GoogleDetailsResult placeId(String placeId) {
    this.placeId = placeId;
    return this;
  }

  /**
   * Get placeId
   * @return placeId
  **/
  @NotNull


  public String getPlaceId() {
    return placeId;
  }

  public void setPlaceId(String placeId) {
    this.placeId = placeId;
  }

  public GoogleDetailsResult reference(String reference) {
    this.reference = reference;
    return this;
  }

  /**
   * Get reference
   * @return reference
  **/
  @NotNull


  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  public GoogleDetailsResult scope(String scope) {
    this.scope = scope;
    return this;
  }

  /**
   * Get scope
   * @return scope
  **/
  @NotNull


  public String getScope() {
    return scope;
  }

  public void setScope(String scope) {
    this.scope = scope;
  }

  public GoogleDetailsResult types(List<String> types) {
    this.types = types;
    return this;
  }

  public GoogleDetailsResult addTypesItem(String typesItem) {
    this.types.add(typesItem);
    return this;
  }

  /**
   * Get types
   * @return types
  **/
  @NotNull


  public List<String> getTypes() {
    return types;
  }

  public void setTypes(List<String> types) {
    this.types = types;
  }

  public GoogleDetailsResult url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Get url
   * @return url
  **/
  @NotNull


  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public GoogleDetailsResult utcOffset(BigDecimal utcOffset) {
    this.utcOffset = utcOffset;
    return this;
  }

  /**
   * Get utcOffset
   * @return utcOffset
  **/
  @NotNull

  @Valid

  public BigDecimal getUtcOffset() {
    return utcOffset;
  }

  public void setUtcOffset(BigDecimal utcOffset) {
    this.utcOffset = utcOffset;
  }

  public GoogleDetailsResult vicinity(String vicinity) {
    this.vicinity = vicinity;
    return this;
  }

  /**
   * Get vicinity
   * @return vicinity
  **/
  @NotNull


  public String getVicinity() {
    return vicinity;
  }

  public void setVicinity(String vicinity) {
    this.vicinity = vicinity;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleDetailsResult googleDetailsResult = (GoogleDetailsResult) o;
    return Objects.equals(this.addressComponents, googleDetailsResult.addressComponents) &&
        Objects.equals(this.adrAddress, googleDetailsResult.adrAddress) &&
        Objects.equals(this.formattedAddress, googleDetailsResult.formattedAddress) &&
        Objects.equals(this.geometry, googleDetailsResult.geometry) &&
        Objects.equals(this.icon, googleDetailsResult.icon) &&
        Objects.equals(this.id, googleDetailsResult.id) &&
        Objects.equals(this.name, googleDetailsResult.name) &&
        Objects.equals(this.photos, googleDetailsResult.photos) &&
        Objects.equals(this.placeId, googleDetailsResult.placeId) &&
        Objects.equals(this.reference, googleDetailsResult.reference) &&
        Objects.equals(this.scope, googleDetailsResult.scope) &&
        Objects.equals(this.types, googleDetailsResult.types) &&
        Objects.equals(this.url, googleDetailsResult.url) &&
        Objects.equals(this.utcOffset, googleDetailsResult.utcOffset) &&
        Objects.equals(this.vicinity, googleDetailsResult.vicinity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressComponents, adrAddress, formattedAddress, geometry, icon, id, name, photos, placeId, reference, scope, types, url, utcOffset, vicinity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleDetailsResult {\n");
    
    sb.append("    addressComponents: ").append(toIndentedString(addressComponents)).append("\n");
    sb.append("    adrAddress: ").append(toIndentedString(adrAddress)).append("\n");
    sb.append("    formattedAddress: ").append(toIndentedString(formattedAddress)).append("\n");
    sb.append("    geometry: ").append(toIndentedString(geometry)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    photos: ").append(toIndentedString(photos)).append("\n");
    sb.append("    placeId: ").append(toIndentedString(placeId)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    types: ").append(toIndentedString(types)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    utcOffset: ").append(toIndentedString(utcOffset)).append("\n");
    sb.append("    vicinity: ").append(toIndentedString(vicinity)).append("\n");
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

