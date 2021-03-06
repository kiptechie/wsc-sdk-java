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
import java.io.IOException;

/**
 * 
 */
@ApiModel(description = "")
public class ConfiguredBytesOutRateMetric {
  @SerializedName("status")
  private String status = null;

  @SerializedName("text")
  private String text = null;

  @SerializedName("units")
  private String units = null;

  @SerializedName("value")
  private Integer value = null;

  public ConfiguredBytesOutRateMetric status(String status) {
    this.status = status;
    return this;
  }

   /**
   * The status of the current key. Possible values are &lt;strong&gt;normal&lt;/strong&gt; (everything is fine), &lt;strong&gt;warning&lt;/strong&gt; (something may be misconfigured), and &lt;strong&gt;no_data&lt;/strong&gt; (no data was returned, perhaps because the instance isn&#39;t running).
   * @return status
  **/
  @ApiModelProperty(example = "warning", value = "The status of the current key. Possible values are <strong>normal</strong> (everything is fine), <strong>warning</strong> (something may be misconfigured), and <strong>no_data</strong> (no data was returned, perhaps because the instance isn't running).")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public ConfiguredBytesOutRateMetric text(String text) {
    this.text = text;
    return this;
  }

   /**
   * A message related to the value and status of the current key. Usually blank unless there&#39;s a warning status.
   * @return text
  **/
  @ApiModelProperty(example = "Outbound bitrate is lower than the configured bitrate. There might be a problem with the stream targets.", value = "A message related to the value and status of the current key. Usually blank unless there's a warning status.")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public ConfiguredBytesOutRateMetric units(String units) {
    this.units = units;
    return this;
  }

   /**
   * The unit of the returned value, such as &lt;strong&gt;Kbps&lt;/strong&gt;, &lt;strong&gt;bps&lt;/strong&gt;, &lt;strong&gt;%&lt;/strong&gt;, &lt;strong&gt;FPS&lt;/strong&gt;, or &lt;strong&gt;GOP&lt;/strong&gt;.
   * @return units
  **/
  @ApiModelProperty(example = "Kbps", value = "The unit of the returned value, such as <strong>Kbps</strong>, <strong>bps</strong>, <strong>%</strong>, <strong>FPS</strong>, or <strong>GOP</strong>.")
  public String getUnits() {
    return units;
  }

  public void setUnits(String units) {
    this.units = units;
  }

  public ConfiguredBytesOutRateMetric value(Integer value) {
    this.value = value;
    return this;
  }

   /**
   * The value of the associated key.
   * @return value
  **/
  @ApiModelProperty(example = "8192", value = "The value of the associated key.")
  public Integer getValue() {
    return value;
  }

  public void setValue(Integer value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfiguredBytesOutRateMetric configuredBytesOutRateMetric = (ConfiguredBytesOutRateMetric) o;
    return Objects.equals(this.status, configuredBytesOutRateMetric.status) &&
        Objects.equals(this.text, configuredBytesOutRateMetric.text) &&
        Objects.equals(this.units, configuredBytesOutRateMetric.units) &&
        Objects.equals(this.value, configuredBytesOutRateMetric.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, text, units, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfiguredBytesOutRateMetric {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    units: ").append(toIndentedString(units)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

