package com.aero.models.google.search;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * GoogleSearch
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-07-10T15:26:48.962Z")

public class GoogleSearch   {
  @JsonProperty("candidates")
  @Valid
  private List<GoogleSearchCandidates> candidates = new ArrayList<GoogleSearchCandidates>();

  @JsonProperty("status")
  private String status = null;

  public GoogleSearch candidates(List<GoogleSearchCandidates> candidates) {
    this.candidates = candidates;
    return this;
  }

  public GoogleSearch addCandidatesItem(GoogleSearchCandidates candidatesItem) {
    this.candidates.add(candidatesItem);
    return this;
  }

  /**
   * Get candidates
   * @return candidates
  **/

  @NotNull

  @Valid

  public List<GoogleSearchCandidates> getCandidates() {
    return candidates;
  }

  public void setCandidates(List<GoogleSearchCandidates> candidates) {
    this.candidates = candidates;
  }

  public GoogleSearch status(String status) {
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
    GoogleSearch googleSearch = (GoogleSearch) o;
    return Objects.equals(this.candidates, googleSearch.candidates) &&
        Objects.equals(this.status, googleSearch.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(candidates, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleSearch {\n");
    
    sb.append("    candidates: ").append(toIndentedString(candidates)).append("\n");
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

