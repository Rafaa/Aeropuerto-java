package com.aero.models.google.details;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * GoogleDetailsResultAddressComponents
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-07-15T14:12:45.427Z")

public class GoogleDetailsResultAddressComponents   {
  @JsonProperty("long_name")
  private String longName = null;

  @JsonProperty("short_name")
  private String shortName = null;

  @JsonProperty("types")
  @Valid
  private List<String> types = null;

  public GoogleDetailsResultAddressComponents longName(String longName) {
    this.longName = longName;
    return this;
  }

  /**
   * Get longName
   * @return longName
  **/


  public String getLongName() {
    return longName;
  }

  public void setLongName(String longName) {
    this.longName = longName;
  }

  public GoogleDetailsResultAddressComponents shortName(String shortName) {
    this.shortName = shortName;
    return this;
  }

  /**
   * Get shortName
   * @return shortName
  **/


  public String getShortName() {
    return shortName;
  }

  public void setShortName(String shortName) {
    this.shortName = shortName;
  }

  public GoogleDetailsResultAddressComponents types(List<String> types) {
    this.types = types;
    return this;
  }

  public GoogleDetailsResultAddressComponents addTypesItem(String typesItem) {
    if (this.types == null) {
      this.types = new ArrayList<String>();
    }
    this.types.add(typesItem);
    return this;
  }

  /**
   * Get types
   * @return types
  **/


  public List<String> getTypes() {
    return types;
  }

  public void setTypes(List<String> types) {
    this.types = types;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleDetailsResultAddressComponents googleDetailsResultAddressComponents = (GoogleDetailsResultAddressComponents) o;
    return Objects.equals(this.longName, googleDetailsResultAddressComponents.longName) &&
        Objects.equals(this.shortName, googleDetailsResultAddressComponents.shortName) &&
        Objects.equals(this.types, googleDetailsResultAddressComponents.types);
  }

  @Override
  public int hashCode() {
    return Objects.hash(longName, shortName, types);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleDetailsResultAddressComponents {\n");
    
    sb.append("    longName: ").append(toIndentedString(longName)).append("\n");
    sb.append("    shortName: ").append(toIndentedString(shortName)).append("\n");
    sb.append("    types: ").append(toIndentedString(types)).append("\n");
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

