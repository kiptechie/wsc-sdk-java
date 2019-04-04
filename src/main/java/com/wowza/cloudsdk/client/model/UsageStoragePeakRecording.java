/*
 * This code and all components © 2015 - 2019 Wowza Media Systems, LLC. All rights reserved.
 * This code is licensed pursuant to the BSD 3-Clause License.
 * 
 * Wowza Streaming Cloud REST API Reference Documentation
 *
 * OpenAPI spec version: v1.3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.wowza.cloudsdk.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.wowza.cloudsdk.client.model.PeakRecording;
import java.io.IOException;

/**
 * 
 */
@ApiModel(description = "")
public class UsageStoragePeakRecording {
  @SerializedName("peak_recording")
  private PeakRecording peakRecording = null;

  public UsageStoragePeakRecording peakRecording(PeakRecording peakRecording) {
    this.peakRecording = peakRecording;
    return this;
  }

   /**
   * Get peakRecording
   * @return peakRecording
  **/
  @ApiModelProperty(value = "")
  public PeakRecording getPeakRecording() {
    return peakRecording;
  }

  public void setPeakRecording(PeakRecording peakRecording) {
    this.peakRecording = peakRecording;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsageStoragePeakRecording usageStoragePeakRecording = (UsageStoragePeakRecording) o;
    return Objects.equals(this.peakRecording, usageStoragePeakRecording.peakRecording);
  }

  @Override
  public int hashCode() {
    return Objects.hash(peakRecording);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageStoragePeakRecording {\n");
    
    sb.append("    peakRecording: ").append(toIndentedString(peakRecording)).append("\n");
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
