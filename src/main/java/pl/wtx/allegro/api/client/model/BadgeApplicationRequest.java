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
import pl.wtx.allegro.api.client.model.BadgeApplicationCampaign;
import pl.wtx.allegro.api.client.model.BadgeApplicationOffer;
import pl.wtx.allegro.api.client.model.BadgeApplicationPrices;
import pl.wtx.allegro.api.client.model.BadgeApplicationPurchaseConstraints;

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
 * BadgeApplicationRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.13.0")
public class BadgeApplicationRequest {
  public static final String SERIALIZED_NAME_CAMPAIGN = "campaign";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN)
  @javax.annotation.Nonnull
  private BadgeApplicationCampaign campaign;

  public static final String SERIALIZED_NAME_OFFER = "offer";
  @SerializedName(SERIALIZED_NAME_OFFER)
  @javax.annotation.Nonnull
  private BadgeApplicationOffer offer;

  public static final String SERIALIZED_NAME_PRICES = "prices";
  @SerializedName(SERIALIZED_NAME_PRICES)
  @javax.annotation.Nullable
  private BadgeApplicationPrices prices;

  public static final String SERIALIZED_NAME_PURCHASE_CONSTRAINTS = "purchaseConstraints";
  @SerializedName(SERIALIZED_NAME_PURCHASE_CONSTRAINTS)
  @javax.annotation.Nullable
  private BadgeApplicationPurchaseConstraints purchaseConstraints;

  public BadgeApplicationRequest() {
  }

  public BadgeApplicationRequest campaign(@javax.annotation.Nonnull BadgeApplicationCampaign campaign) {
    this.campaign = campaign;
    return this;
  }

  /**
   * Get campaign
   * @return campaign
   */
  @javax.annotation.Nonnull
  public BadgeApplicationCampaign getCampaign() {
    return campaign;
  }

  public void setCampaign(@javax.annotation.Nonnull BadgeApplicationCampaign campaign) {
    this.campaign = campaign;
  }


  public BadgeApplicationRequest offer(@javax.annotation.Nonnull BadgeApplicationOffer offer) {
    this.offer = offer;
    return this;
  }

  /**
   * Get offer
   * @return offer
   */
  @javax.annotation.Nonnull
  public BadgeApplicationOffer getOffer() {
    return offer;
  }

  public void setOffer(@javax.annotation.Nonnull BadgeApplicationOffer offer) {
    this.offer = offer;
  }


  public BadgeApplicationRequest prices(@javax.annotation.Nullable BadgeApplicationPrices prices) {
    this.prices = prices;
    return this;
  }

  /**
   * Get prices
   * @return prices
   */
  @javax.annotation.Nullable
  public BadgeApplicationPrices getPrices() {
    return prices;
  }

  public void setPrices(@javax.annotation.Nullable BadgeApplicationPrices prices) {
    this.prices = prices;
  }


  public BadgeApplicationRequest purchaseConstraints(@javax.annotation.Nullable BadgeApplicationPurchaseConstraints purchaseConstraints) {
    this.purchaseConstraints = purchaseConstraints;
    return this;
  }

  /**
   * Get purchaseConstraints
   * @return purchaseConstraints
   */
  @javax.annotation.Nullable
  public BadgeApplicationPurchaseConstraints getPurchaseConstraints() {
    return purchaseConstraints;
  }

  public void setPurchaseConstraints(@javax.annotation.Nullable BadgeApplicationPurchaseConstraints purchaseConstraints) {
    this.purchaseConstraints = purchaseConstraints;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BadgeApplicationRequest badgeApplicationRequest = (BadgeApplicationRequest) o;
    return Objects.equals(this.campaign, badgeApplicationRequest.campaign) &&
        Objects.equals(this.offer, badgeApplicationRequest.offer) &&
        Objects.equals(this.prices, badgeApplicationRequest.prices) &&
        Objects.equals(this.purchaseConstraints, badgeApplicationRequest.purchaseConstraints);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaign, offer, prices, purchaseConstraints);
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
    sb.append("class BadgeApplicationRequest {\n");
    sb.append("    campaign: ").append(toIndentedString(campaign)).append("\n");
    sb.append("    offer: ").append(toIndentedString(offer)).append("\n");
    sb.append("    prices: ").append(toIndentedString(prices)).append("\n");
    sb.append("    purchaseConstraints: ").append(toIndentedString(purchaseConstraints)).append("\n");
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
    openapiFields.add("campaign");
    openapiFields.add("offer");
    openapiFields.add("prices");
    openapiFields.add("purchaseConstraints");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("campaign");
    openapiRequiredFields.add("offer");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to BadgeApplicationRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!BadgeApplicationRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BadgeApplicationRequest is not found in the empty JSON string", BadgeApplicationRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!BadgeApplicationRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BadgeApplicationRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : BadgeApplicationRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `campaign`
      BadgeApplicationCampaign.validateJsonElement(jsonObj.get("campaign"));
      // validate the required field `offer`
      BadgeApplicationOffer.validateJsonElement(jsonObj.get("offer"));
      // validate the optional field `prices`
      if (jsonObj.get("prices") != null && !jsonObj.get("prices").isJsonNull()) {
        BadgeApplicationPrices.validateJsonElement(jsonObj.get("prices"));
      }
      // validate the optional field `purchaseConstraints`
      if (jsonObj.get("purchaseConstraints") != null && !jsonObj.get("purchaseConstraints").isJsonNull()) {
        BadgeApplicationPurchaseConstraints.validateJsonElement(jsonObj.get("purchaseConstraints"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BadgeApplicationRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BadgeApplicationRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BadgeApplicationRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BadgeApplicationRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<BadgeApplicationRequest>() {
           @Override
           public void write(JsonWriter out, BadgeApplicationRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BadgeApplicationRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of BadgeApplicationRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of BadgeApplicationRequest
   * @throws IOException if the JSON string is invalid with respect to BadgeApplicationRequest
   */
  public static BadgeApplicationRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BadgeApplicationRequest.class);
  }

  /**
   * Convert an instance of BadgeApplicationRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

