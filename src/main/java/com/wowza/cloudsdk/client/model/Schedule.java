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
import java.time.LocalDate;
import java.time.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value ="com.wowza.cloudsdk.JavaCreate", date = "2019-03-02T10:45:24.077Z")
public class Schedule {
  /**
   * The type of action that the schedule should trigger on the transcoder. The default is &lt;strong&gt;start&lt;/strong&gt;.
   */
  @JsonAdapter(ActionTypeEnum.Adapter.class)
  public enum ActionTypeEnum {
    START("start"),
    
    STOP("stop"),
    
    START_STOP("start_stop");

    private String value;

    ActionTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ActionTypeEnum fromValue(String text) {
      for (ActionTypeEnum b : ActionTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ActionTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ActionTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ActionTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ActionTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("action_type")
  private ActionTypeEnum actionType = null;

  @SerializedName("created_at")
  private OffsetDateTime createdAt = null;

  @SerializedName("end_repeat")
  private LocalDate endRepeat = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  /**
   * The day or days of the week that a recurring schedule should run.
   */
  @JsonAdapter(RecurrenceDataEnum.Adapter.class)
  public enum RecurrenceDataEnum {
    SUNDAY("sunday"),
    
    MONDAY("monday"),
    
    TUESDAY("tuesday"),
    
    WEDNESDAY("wednesday"),
    
    THURSDAY("thursday"),
    
    FRIDAY("friday"),
    
    SATURDAY("saturday");

    private String value;

    RecurrenceDataEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RecurrenceDataEnum fromValue(String text) {
      for (RecurrenceDataEnum b : RecurrenceDataEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<RecurrenceDataEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RecurrenceDataEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RecurrenceDataEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return RecurrenceDataEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("recurrence_data")
  private String recurrenceData = null;

  /**
   * A schedule can run one time only (&lt;strong&gt;once&lt;/strong&gt;) or repeat (&lt;strong&gt;recur&lt;/strong&gt;) until a specified &lt;em&gt;end_repeat&lt;/em&gt; date. The default is &lt;strong&gt;once&lt;/strong&gt;.
   */
  @JsonAdapter(RecurrenceTypeEnum.Adapter.class)
  public enum RecurrenceTypeEnum {
    ONCE("once"),
    
    RECUR("recur");

    private String value;

    RecurrenceTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RecurrenceTypeEnum fromValue(String text) {
      for (RecurrenceTypeEnum b : RecurrenceTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<RecurrenceTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RecurrenceTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RecurrenceTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return RecurrenceTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("recurrence_type")
  private RecurrenceTypeEnum recurrenceType = null;

  @SerializedName("start_repeat")
  private LocalDate startRepeat = null;

  @SerializedName("start_transcoder")
  private OffsetDateTime startTranscoder = null;

  /**
   * A schedule must be &lt;strong&gt;enabled&lt;/strong&gt; to run. Specify &lt;strong&gt;enabled&lt;/strong&gt; to run the schedule or &lt;strong&gt;disabled&lt;/strong&gt; to turn off the schedule so that it doesn&#39;t run.
   */
  @JsonAdapter(StateEnum.Adapter.class)
  public enum StateEnum {
    ENABLED("enabled"),
    
    DISABLED("disabled"),
    
    EXPIRED("expired");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StateEnum fromValue(String text) {
      for (StateEnum b : StateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StateEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StateEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("state")
  private StateEnum state = null;

  @SerializedName("stop_transcoder")
  private OffsetDateTime stopTranscoder = null;

  @SerializedName("transcoder_id")
  private String transcoderId = null;

  @SerializedName("transcoder_name")
  private String transcoderName = null;

  @SerializedName("updated_at")
  private OffsetDateTime updatedAt = null;

  @SerializedName("begins_at")
  private OffsetDateTime beginsAt = null;

  @SerializedName("ends_at")
  private OffsetDateTime endsAt = null;

  public Schedule actionType(ActionTypeEnum actionType) {
    this.actionType = actionType;
    return this;
  }

   /**
   * The type of action that the schedule should trigger on the transcoder. The default is &lt;strong&gt;start&lt;/strong&gt;.
   * @return actionType
  **/
  @ApiModelProperty(example = "start_stop", value = "The type of action that the schedule should trigger on the transcoder. The default is <strong>start</strong>.")
  public ActionTypeEnum getActionType() {
    return actionType;
  }

  public void setActionType(ActionTypeEnum actionType) {
    this.actionType = actionType;
  }

  public Schedule createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The date and time that the schedule was created.
   * @return createdAt
  **/
  @ApiModelProperty(example = "2019-01-27 17:32:17 UTC", value = "The date and time that the schedule was created.")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public Schedule endRepeat(LocalDate endRepeat) {
    this.endRepeat = endRepeat;
    return this;
  }

   /**
   * The month, day, and year that a recurring schedule should stop running. Specify &lt;strong&gt;YYYY-MM-DD&lt;/strong&gt;.
   * @return endRepeat
  **/
  @ApiModelProperty(example = "2019-02-28", value = "The month, day, and year that a recurring schedule should stop running. Specify <strong>YYYY-MM-DD</strong>.")
  public LocalDate getEndRepeat() {
    return endRepeat;
  }

  public void setEndRepeat(LocalDate endRepeat) {
    this.endRepeat = endRepeat;
  }

  public Schedule id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The unique alphanumeric string that identifies the schedule.
   * @return id
  **/
  @ApiModelProperty(example = "C0t0MW3r", value = "The unique alphanumeric string that identifies the schedule.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Schedule name(String name) {
    this.name = name;
    return this;
  }

   /**
   * A descriptive name for the schedule. Maximum 255 characters.
   * @return name
  **/
  @ApiModelProperty(example = "Scheduled start for my camera", value = "A descriptive name for the schedule. Maximum 255 characters.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Schedule recurrenceData(String recurrenceData) {
    this.recurrenceData = recurrenceData;
    return this;
  }

   /**
   * The day or days of the week that a recurring schedule should run.
   * @return recurrenceData
  **/
  @ApiModelProperty(example = "monday,tuesday,wednesday,thursday,friday", value = "The day or days of the week that a recurring schedule should run.")
  public String getRecurrenceData() {
    return recurrenceData;
  }

  public void setRecurrenceData(String recurrenceData) {
    this.recurrenceData = recurrenceData;
  }

  public Schedule recurrenceType(RecurrenceTypeEnum recurrenceType) {
    this.recurrenceType = recurrenceType;
    return this;
  }

   /**
   * A schedule can run one time only (&lt;strong&gt;once&lt;/strong&gt;) or repeat (&lt;strong&gt;recur&lt;/strong&gt;) until a specified &lt;em&gt;end_repeat&lt;/em&gt; date. The default is &lt;strong&gt;once&lt;/strong&gt;.
   * @return recurrenceType
  **/
  @ApiModelProperty(example = "recur", value = "A schedule can run one time only (<strong>once</strong>) or repeat (<strong>recur</strong>) until a specified <em>end_repeat</em> date. The default is <strong>once</strong>.")
  public RecurrenceTypeEnum getRecurrenceType() {
    return recurrenceType;
  }

  public void setRecurrenceType(RecurrenceTypeEnum recurrenceType) {
    this.recurrenceType = recurrenceType;
  }

  public Schedule startRepeat(LocalDate startRepeat) {
    this.startRepeat = startRepeat;
    return this;
  }

   /**
   * The month, day, and year that the recurring schedule should go into effect. Specify &lt;strong&gt;YYYY-MM-DD&lt;/strong&gt;.
   * @return startRepeat
  **/
  @ApiModelProperty(example = "2019-01-30", value = "The month, day, and year that the recurring schedule should go into effect. Specify <strong>YYYY-MM-DD</strong>.")
  public LocalDate getStartRepeat() {
    return startRepeat;
  }

  public void setStartRepeat(LocalDate startRepeat) {
    this.startRepeat = startRepeat;
  }

  public Schedule startTranscoder(OffsetDateTime startTranscoder) {
    this.startTranscoder = startTranscoder;
    return this;
  }

   /**
   * The month, day, year, and time of day that the &lt;em&gt;action_type&lt;/em&gt; &lt;strong&gt;start&lt;/strong&gt; should occur. Specify &lt;strong&gt;YYYY-MM-DD HH:MM:SS&lt;/strong&gt; where &lt;strong&gt;HH&lt;/strong&gt; is a 24-hour clock in UTC.
   * @return startTranscoder
  **/
  @ApiModelProperty(example = "2019-01-30 00:00:00 UTC", value = "The month, day, year, and time of day that the <em>action_type</em> <strong>start</strong> should occur. Specify <strong>YYYY-MM-DD HH:MM:SS</strong> where <strong>HH</strong> is a 24-hour clock in UTC.")
  public OffsetDateTime getStartTranscoder() {
    return startTranscoder;
  }

  public void setStartTranscoder(OffsetDateTime startTranscoder) {
    this.startTranscoder = startTranscoder;
  }

  public Schedule state(StateEnum state) {
    this.state = state;
    return this;
  }

   /**
   * A schedule must be &lt;strong&gt;enabled&lt;/strong&gt; to run. Specify &lt;strong&gt;enabled&lt;/strong&gt; to run the schedule or &lt;strong&gt;disabled&lt;/strong&gt; to turn off the schedule so that it doesn&#39;t run.
   * @return state
  **/
  @ApiModelProperty(example = "enabled", value = "A schedule must be <strong>enabled</strong> to run. Specify <strong>enabled</strong> to run the schedule or <strong>disabled</strong> to turn off the schedule so that it doesn't run.")
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }

  public Schedule stopTranscoder(OffsetDateTime stopTranscoder) {
    this.stopTranscoder = stopTranscoder;
    return this;
  }

   /**
   * The month, day, year, and time of day that the &lt;em&gt;action_type&lt;/em&gt; &lt;strong&gt;stop&lt;/strong&gt; should occur. Specify &lt;strong&gt;YYYY-MM-DD HH:MM:SS&lt;/strong&gt; where &lt;strong&gt;HH&lt;/strong&gt; is a 24-hour clock in UTC.
   * @return stopTranscoder
  **/
  @ApiModelProperty(example = "2019-02-28 23:59:59 UTC", value = "The month, day, year, and time of day that the <em>action_type</em> <strong>stop</strong> should occur. Specify <strong>YYYY-MM-DD HH:MM:SS</strong> where <strong>HH</strong> is a 24-hour clock in UTC.")
  public OffsetDateTime getStopTranscoder() {
    return stopTranscoder;
  }

  public void setStopTranscoder(OffsetDateTime stopTranscoder) {
    this.stopTranscoder = stopTranscoder;
  }

  public Schedule transcoderId(String transcoderId) {
    this.transcoderId = transcoderId;
    return this;
  }

   /**
   * The unique alphanumeric string that identifies the transcoder being scheduled.
   * @return transcoderId
  **/
  @ApiModelProperty(example = "KhbF2XPv", value = "The unique alphanumeric string that identifies the transcoder being scheduled.")
  public String getTranscoderId() {
    return transcoderId;
  }

  public void setTranscoderId(String transcoderId) {
    this.transcoderId = transcoderId;
  }

  public Schedule transcoderName(String transcoderName) {
    this.transcoderName = transcoderName;
    return this;
  }

   /**
   * The name of the transcoder being scheduled.
   * @return transcoderName
  **/
  @ApiModelProperty(example = "My Camera", value = "The name of the transcoder being scheduled.")
  public String getTranscoderName() {
    return transcoderName;
  }

  public void setTranscoderName(String transcoderName) {
    this.transcoderName = transcoderName;
  }

  public Schedule updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  public Schedule beginsAt(OffsetDateTime beginsAt) {
    this.beginsAt = beginsAt;
    return this;
  }

  public Schedule endsAt(OffsetDateTime endsAt) {
    this.endsAt = endsAt;
    return this;
  }

   /**
   * The date and time that the schedule was updated.
   * @return updatedAt
  **/
  @ApiModelProperty(example = "2019-01-28 17:49:37 UTC", value = "The date and time that the schedule was updated.")
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setBeginsAt(OffsetDateTime beginsAt) {
    this.beginsAt = beginsAt;
  }

  public OffsetDateTime getBeginsAt() {
    return beginsAt;
  }

  public void setEndsAt(OffsetDateTime endsAt) {
    this.endsAt = endsAt;
  }

  public OffsetDateTime getEndsAt() {
    return endsAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Schedule schedule = (Schedule) o;
    return Objects.equals(this.actionType, schedule.actionType) &&
        Objects.equals(this.createdAt, schedule.createdAt) &&
        Objects.equals(this.endRepeat, schedule.endRepeat) &&
        Objects.equals(this.id, schedule.id) &&
        Objects.equals(this.name, schedule.name) &&
        Objects.equals(this.recurrenceData, schedule.recurrenceData) &&
        Objects.equals(this.recurrenceType, schedule.recurrenceType) &&
        Objects.equals(this.startRepeat, schedule.startRepeat) &&
        Objects.equals(this.startTranscoder, schedule.startTranscoder) &&
        Objects.equals(this.state, schedule.state) &&
        Objects.equals(this.stopTranscoder, schedule.stopTranscoder) &&
        Objects.equals(this.transcoderId, schedule.transcoderId) &&
        Objects.equals(this.transcoderName, schedule.transcoderName) &&
        Objects.equals(this.updatedAt, schedule.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionType, createdAt, endRepeat, id, name, recurrenceData, recurrenceType, startRepeat, startTranscoder, state, stopTranscoder, transcoderId, transcoderName, updatedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Schedule {\n");
    
    sb.append("    actionType: ").append(toIndentedString(actionType)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    endRepeat: ").append(toIndentedString(endRepeat)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    recurrenceData: ").append(toIndentedString(recurrenceData)).append("\n");
    sb.append("    recurrenceType: ").append(toIndentedString(recurrenceType)).append("\n");
    sb.append("    startRepeat: ").append(toIndentedString(startRepeat)).append("\n");
    sb.append("    startTranscoder: ").append(toIndentedString(startTranscoder)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    stopTranscoder: ").append(toIndentedString(stopTranscoder)).append("\n");
    sb.append("    transcoderId: ").append(toIndentedString(transcoderId)).append("\n");
    sb.append("    transcoderName: ").append(toIndentedString(transcoderName)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

