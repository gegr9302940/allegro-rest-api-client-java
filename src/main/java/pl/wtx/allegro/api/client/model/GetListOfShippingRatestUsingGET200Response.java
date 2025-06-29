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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import pl.wtx.allegro.api.client.model.GetListOfShippingRatestUsingGET200ResponseShippingRatesInner;

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
 * GetListOfShippingRatestUsingGET200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.13.0")
public class GetListOfShippingRatestUsingGET200Response {
  public static final String SERIALIZED_NAME_SHIPPING_RATES = "shippingRates";
  @SerializedName(SERIALIZED_NAME_SHIPPING_RATES)
  @javax.annotation.Nullable
  private List<GetListOfShippingRatestUsingGET200ResponseShippingRatesInner> shippingRates = new ArrayList<>();

  public GetListOfShippingRatestUsingGET200Response() {
  }

  public GetListOfShippingRatestUsingGET200Response shippingRates(@javax.annotation.Nullable List<GetListOfShippingRatestUsingGET200ResponseShippingRatesInner> shippingRates) {
    this.shippingRates = shippingRates;
    return this;
  }

  public GetListOfShippingRatestUsingGET200Response addShippingRatesItem(GetListOfShippingRatestUsingGET200ResponseShippingRatesInner shippingRatesItem) {
    if (this.shippingRates == null) {
      this.shippingRates = new ArrayList<>();
    }
    this.shippingRates.add(shippingRatesItem);
    return this;
  }

  /**
   * Get shippingRates
   * @return shippingRates
   */
  @javax.annotation.Nullable
  public List<GetListOfShippingRatestUsingGET200ResponseShippingRatesInner> getShippingRates() {
    return shippingRates;
  }

  public void setShippingRates(@javax.annotation.Nullable List<GetListOfShippingRatestUsingGET200ResponseShippingRatesInner> shippingRates) {
    this.shippingRates = shippingRates;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetListOfShippingRatestUsingGET200Response getListOfShippingRatestUsingGET200Response = (GetListOfShippingRatestUsingGET200Response) o;
    return Objects.equals(this.shippingRates, getListOfShippingRatestUsingGET200Response.shippingRates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shippingRates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetListOfShippingRatestUsingGET200Response {\n");
    sb.append("    shippingRates: ").append(toIndentedString(shippingRates)).append("\n");
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
    openapiFields.add("shippingRates");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetListOfShippingRatestUsingGET200Response
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetListOfShippingRatestUsingGET200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetListOfShippingRatestUsingGET200Response is not found in the empty JSON string", GetListOfShippingRatestUsingGET200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetListOfShippingRatestUsingGET200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetListOfShippingRatestUsingGET200Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("shippingRates") != null && !jsonObj.get("shippingRates").isJsonNull()) {
        JsonArray jsonArrayshippingRates = jsonObj.getAsJsonArray("shippingRates");
        if (jsonArrayshippingRates != null) {
          // ensure the json data is an array
          if (!jsonObj.get("shippingRates").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `shippingRates` to be an array in the JSON string but got `%s`", jsonObj.get("shippingRates").toString()));
          }

          // validate the optional field `shippingRates` (array)
          for (int i = 0; i < jsonArrayshippingRates.size(); i++) {
            GetListOfShippingRatestUsingGET200ResponseShippingRatesInner.validateJsonElement(jsonArrayshippingRates.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetListOfShippingRatestUsingGET200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetListOfShippingRatestUsingGET200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetListOfShippingRatestUsingGET200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetListOfShippingRatestUsingGET200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<GetListOfShippingRatestUsingGET200Response>() {
           @Override
           public void write(JsonWriter out, GetListOfShippingRatestUsingGET200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetListOfShippingRatestUsingGET200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetListOfShippingRatestUsingGET200Response given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetListOfShippingRatestUsingGET200Response
   * @throws IOException if the JSON string is invalid with respect to GetListOfShippingRatestUsingGET200Response
   */
  public static GetListOfShippingRatestUsingGET200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetListOfShippingRatestUsingGET200Response.class);
  }

  /**
   * Convert an instance of GetListOfShippingRatestUsingGET200Response to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

