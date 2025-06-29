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
import org.openapitools.jackson.nullable.JsonNullable;

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
 * The way the offer price should be changed. One of three ways is possible: new price, increase/decrease price, percentage change and only one can be chosen at once.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.13.0")
public class PriceModification {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  @javax.annotation.Nonnull
  protected String type;

  public static final String SERIALIZED_NAME_MARKETPLACE_ID = "marketplaceId";
  @SerializedName(SERIALIZED_NAME_MARKETPLACE_ID)
  @javax.annotation.Nullable
  private String marketplaceId;

  public PriceModification() {
    this.type = this.getClass().getSimpleName();
  }

  public PriceModification type(@javax.annotation.Nonnull String type) {
    this.type = type;
    return this;
  }

  /**
   * Type of the modification.
   * @return type
   */
  @javax.annotation.Nonnull
  public String getType() {
    return type;
  }

  public void setType(@javax.annotation.Nonnull String type) {
    this.type = type;
  }


  public PriceModification marketplaceId(@javax.annotation.Nullable String marketplaceId) {
    this.marketplaceId = marketplaceId;
    return this;
  }

  /**
   * The marketplace on which the price of the offer should be changed. If omitted, the price will be changed on the base marketplace of the offer.
   * @return marketplaceId
   */
  @javax.annotation.Nullable
  public String getMarketplaceId() {
    return marketplaceId;
  }

  public void setMarketplaceId(@javax.annotation.Nullable String marketplaceId) {
    this.marketplaceId = marketplaceId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PriceModification priceModification = (PriceModification) o;
    return Objects.equals(this.type, priceModification.type) &&
        Objects.equals(this.marketplaceId, priceModification.marketplaceId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, marketplaceId);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PriceModification {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    marketplaceId: ").append(toIndentedString(marketplaceId)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("marketplaceId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PriceModification
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PriceModification.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PriceModification is not found in the empty JSON string", PriceModification.openapiRequiredFields.toString()));
        }
      }

      String discriminatorValue = jsonElement.getAsJsonObject().get("type").getAsString();
      switch (discriminatorValue) {
        case "DECREASE_PERCENTAGE":
          PriceModificationPercentageChangeDecrease.validateJsonElement(jsonElement);
          break;
        case "DECREASE_PRICE":
          PriceModificationValueChangeDecrease.validateJsonElement(jsonElement);
          break;
        case "FIXED_PRICE":
          PriceModificationFixedPrice.validateJsonElement(jsonElement);
          break;
        case "INCREASE_PERCENTAGE":
          PriceModificationPercentageChangeIncrease.validateJsonElement(jsonElement);
          break;
        case "INCREASE_PRICE":
          PriceModificationValueChangeIncrease.validateJsonElement(jsonElement);
          break;
        default:
          throw new IllegalArgumentException(String.format("The value of the `type` field `%s` does not match any key defined in the discriminator's mapping.", discriminatorValue));
      }
  }


  /**
   * Create an instance of PriceModification given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PriceModification
   * @throws IOException if the JSON string is invalid with respect to PriceModification
   */
  public static PriceModification fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PriceModification.class);
  }

  /**
   * Convert an instance of PriceModification to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

