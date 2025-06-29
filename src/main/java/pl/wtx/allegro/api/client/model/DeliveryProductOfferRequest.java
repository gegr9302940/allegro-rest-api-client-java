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
import java.util.Arrays;
import pl.wtx.allegro.api.client.model.DeliveryProductOfferRequestShippingRates;

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
 * DeliveryProductOfferRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.13.0")
public class DeliveryProductOfferRequest {
  public static final String SERIALIZED_NAME_HANDLING_TIME = "handlingTime";
  @SerializedName(SERIALIZED_NAME_HANDLING_TIME)
  @javax.annotation.Nullable
  private String handlingTime;

  public static final String SERIALIZED_NAME_SHIPPING_RATES = "shippingRates";
  @SerializedName(SERIALIZED_NAME_SHIPPING_RATES)
  @javax.annotation.Nullable
  private DeliveryProductOfferRequestShippingRates shippingRates;

  public static final String SERIALIZED_NAME_ADDITIONAL_INFO = "additionalInfo";
  @Deprecated
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_INFO)
  @javax.annotation.Nullable
  private String additionalInfo;

  public DeliveryProductOfferRequest() {
  }

  public DeliveryProductOfferRequest handlingTime(@javax.annotation.Nullable String handlingTime) {
    this.handlingTime = handlingTime;
    return this;
  }

  /**
   * Handling time, ISO 8601 duration format. This field must be set to one of the following: PT0S for immediately, PT24H, P2D, P3D, P4D, P5D, P7D, P10D, P14D, P21D, P30D, P60D.
   * @return handlingTime
   */
  @javax.annotation.Nullable
  public String getHandlingTime() {
    return handlingTime;
  }

  public void setHandlingTime(@javax.annotation.Nullable String handlingTime) {
    this.handlingTime = handlingTime;
  }


  public DeliveryProductOfferRequest shippingRates(@javax.annotation.Nullable DeliveryProductOfferRequestShippingRates shippingRates) {
    this.shippingRates = shippingRates;
    return this;
  }

  /**
   * Get shippingRates
   * @return shippingRates
   */
  @javax.annotation.Nullable
  public DeliveryProductOfferRequestShippingRates getShippingRates() {
    return shippingRates;
  }

  public void setShippingRates(@javax.annotation.Nullable DeliveryProductOfferRequestShippingRates shippingRates) {
    this.shippingRates = shippingRates;
  }


  @Deprecated
  public DeliveryProductOfferRequest additionalInfo(@javax.annotation.Nullable String additionalInfo) {
    this.additionalInfo = additionalInfo;
    return this;
  }

  /**
   * Additional information about delivery. Parameter is deprecated and will be removed in the future. Additional information is only visible on marketplace &#x60;allegro-pl&#x60;.
   * @return additionalInfo
   * @deprecated
   */
  @Deprecated
  @javax.annotation.Nullable
  public String getAdditionalInfo() {
    return additionalInfo;
  }

  @Deprecated
  public void setAdditionalInfo(@javax.annotation.Nullable String additionalInfo) {
    this.additionalInfo = additionalInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeliveryProductOfferRequest deliveryProductOfferRequest = (DeliveryProductOfferRequest) o;
    return Objects.equals(this.handlingTime, deliveryProductOfferRequest.handlingTime) &&
        Objects.equals(this.shippingRates, deliveryProductOfferRequest.shippingRates) &&
        Objects.equals(this.additionalInfo, deliveryProductOfferRequest.additionalInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(handlingTime, shippingRates, additionalInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeliveryProductOfferRequest {\n");
    sb.append("    handlingTime: ").append(toIndentedString(handlingTime)).append("\n");
    sb.append("    shippingRates: ").append(toIndentedString(shippingRates)).append("\n");
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
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
    openapiFields.add("handlingTime");
    openapiFields.add("shippingRates");
    openapiFields.add("additionalInfo");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DeliveryProductOfferRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DeliveryProductOfferRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DeliveryProductOfferRequest is not found in the empty JSON string", DeliveryProductOfferRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DeliveryProductOfferRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DeliveryProductOfferRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("handlingTime") != null && !jsonObj.get("handlingTime").isJsonNull()) && !jsonObj.get("handlingTime").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `handlingTime` to be a primitive type in the JSON string but got `%s`", jsonObj.get("handlingTime").toString()));
      }
      // validate the optional field `shippingRates`
      if (jsonObj.get("shippingRates") != null && !jsonObj.get("shippingRates").isJsonNull()) {
        DeliveryProductOfferRequestShippingRates.validateJsonElement(jsonObj.get("shippingRates"));
      }
      if ((jsonObj.get("additionalInfo") != null && !jsonObj.get("additionalInfo").isJsonNull()) && !jsonObj.get("additionalInfo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `additionalInfo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("additionalInfo").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DeliveryProductOfferRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DeliveryProductOfferRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DeliveryProductOfferRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DeliveryProductOfferRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<DeliveryProductOfferRequest>() {
           @Override
           public void write(JsonWriter out, DeliveryProductOfferRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DeliveryProductOfferRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DeliveryProductOfferRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DeliveryProductOfferRequest
   * @throws IOException if the JSON string is invalid with respect to DeliveryProductOfferRequest
   */
  public static DeliveryProductOfferRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DeliveryProductOfferRequest.class);
  }

  /**
   * Convert an instance of DeliveryProductOfferRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

