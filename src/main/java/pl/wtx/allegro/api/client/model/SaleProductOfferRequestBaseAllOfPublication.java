/*
 * Allegro REST API
 * https://developer.allegro.pl/about  Documentation is generated from [this OpenAPI 3.0 specification file](https://developer.allegro.pl/swagger.yaml). To start working with our API, you can also check our [official Allegro REST API public collection](https://www.postman.com/allegro-rest-api/allegro-rest-api/collection/4puh6ls/allegro-rest-api) in Postman.
 *
 * The version of the OpenAPI document: latest
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package pl.wtx.allegro.api.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.Arrays;
import pl.wtx.allegro.api.client.model.OfferStatus;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import pl.wtx.allegro.api.client.invoker.JSON;

/**
 * SaleProductOfferRequestBaseAllOfPublication
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.13.0")
public class SaleProductOfferRequestBaseAllOfPublication {
  public static final String SERIALIZED_NAME_DURATION = "duration";
  @SerializedName(SERIALIZED_NAME_DURATION)
  @javax.annotation.Nullable
  private String duration;

  public static final String SERIALIZED_NAME_STARTING_AT = "startingAt";
  @SerializedName(SERIALIZED_NAME_STARTING_AT)
  @javax.annotation.Nullable
  private OffsetDateTime startingAt;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  @javax.annotation.Nullable
  private OfferStatus status;

  public SaleProductOfferRequestBaseAllOfPublication() {
  }

  public SaleProductOfferRequestBaseAllOfPublication duration(@javax.annotation.Nullable String duration) {
    this.duration = duration;
    return this;
  }

  /**
   * This field must be set to one of the following:&lt;br/&gt; - for auctions: 1 day, 3 days, 5 days, 7 days, 10 days&lt;br/&gt; - for buy-now offers: 3 days, 5 days, 7 days, 10 days, 20 days, 30 days&lt;br/&gt; - for advertisements: 10 days, 20 days, 30 days.&lt;br/&gt; The value is in ISO 8601 format (example: PT24H, PT72H).
   * @return duration
   */
  @javax.annotation.Nullable
  public String getDuration() {
    return duration;
  }

  public void setDuration(@javax.annotation.Nullable String duration) {
    this.duration = duration;
  }


  public SaleProductOfferRequestBaseAllOfPublication startingAt(@javax.annotation.Nullable OffsetDateTime startingAt) {
    this.startingAt = startingAt;
    return this;
  }

  /**
   * Publication starting date: Format (ISO 8601) - yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ. Cannot be modified after activation or ending of the offer.
   * @return startingAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getStartingAt() {
    return startingAt;
  }

  public void setStartingAt(@javax.annotation.Nullable OffsetDateTime startingAt) {
    this.startingAt = startingAt;
  }


  public SaleProductOfferRequestBaseAllOfPublication status(@javax.annotation.Nullable OfferStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @javax.annotation.Nullable
  public OfferStatus getStatus() {
    return status;
  }

  public void setStatus(@javax.annotation.Nullable OfferStatus status) {
    this.status = status;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SaleProductOfferRequestBaseAllOfPublication saleProductOfferRequestBaseAllOfPublication = (SaleProductOfferRequestBaseAllOfPublication) o;
    return Objects.equals(this.duration, saleProductOfferRequestBaseAllOfPublication.duration) &&
        Objects.equals(this.startingAt, saleProductOfferRequestBaseAllOfPublication.startingAt) &&
        Objects.equals(this.status, saleProductOfferRequestBaseAllOfPublication.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(duration, startingAt, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SaleProductOfferRequestBaseAllOfPublication {\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    startingAt: ").append(toIndentedString(startingAt)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("duration");
    openapiFields.add("startingAt");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SaleProductOfferRequestBaseAllOfPublication
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SaleProductOfferRequestBaseAllOfPublication.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SaleProductOfferRequestBaseAllOfPublication is not found in the empty JSON string", SaleProductOfferRequestBaseAllOfPublication.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SaleProductOfferRequestBaseAllOfPublication.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SaleProductOfferRequestBaseAllOfPublication` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("duration") != null && !jsonObj.get("duration").isJsonNull()) && !jsonObj.get("duration").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `duration` to be a primitive type in the JSON string but got `%s`", jsonObj.get("duration").toString()));
      }
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        OfferStatus.validateJsonElement(jsonObj.get("status"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SaleProductOfferRequestBaseAllOfPublication.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SaleProductOfferRequestBaseAllOfPublication' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SaleProductOfferRequestBaseAllOfPublication> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SaleProductOfferRequestBaseAllOfPublication.class));

       return (TypeAdapter<T>) new TypeAdapter<SaleProductOfferRequestBaseAllOfPublication>() {
           @Override
           public void write(JsonWriter out, SaleProductOfferRequestBaseAllOfPublication value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SaleProductOfferRequestBaseAllOfPublication read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of SaleProductOfferRequestBaseAllOfPublication given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SaleProductOfferRequestBaseAllOfPublication
   * @throws IOException if the JSON string is invalid with respect to SaleProductOfferRequestBaseAllOfPublication
   */
  public static SaleProductOfferRequestBaseAllOfPublication fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SaleProductOfferRequestBaseAllOfPublication.class);
  }

  /**
   * Convert an instance of SaleProductOfferRequestBaseAllOfPublication to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

