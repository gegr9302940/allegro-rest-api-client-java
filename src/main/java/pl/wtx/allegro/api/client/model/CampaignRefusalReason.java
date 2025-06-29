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
import pl.wtx.allegro.api.client.model.RefusalMessage;

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
 * CampaignRefusalReason
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.13.0")
public class CampaignRefusalReason {
  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  @javax.annotation.Nonnull
  private String code;

  public static final String SERIALIZED_NAME_MESSAGES = "messages";
  @SerializedName(SERIALIZED_NAME_MESSAGES)
  @javax.annotation.Nonnull
  private List<RefusalMessage> messages = new ArrayList<>();

  public CampaignRefusalReason() {
  }

  public CampaignRefusalReason code(@javax.annotation.Nonnull String code) {
    this.code = code;
    return this;
  }

  /**
   * Code corresponding to the message. For more information visit the list of available codes: &lt;a href&#x3D;\&quot;../../tutorials/jak-przypisac-oferte-kampanii-GRaj0q6Gwuy#bledy-i-powody-odrzucenia\&quot; target&#x3D;\&quot;_blank\&quot;&gt;PL&lt;/a&gt; / &lt;a href&#x3D;\&quot;../../tutorials/how-to-submit-offers-to-campaigns-AgGjd6EmyH4#errors-and-reasons-for-rejection\&quot; target&#x3D;\&quot;_blank\&quot;&gt;EN&lt;/a&gt;.
   * @return code
   */
  @javax.annotation.Nonnull
  public String getCode() {
    return code;
  }

  public void setCode(@javax.annotation.Nonnull String code) {
    this.code = code;
  }


  public CampaignRefusalReason messages(@javax.annotation.Nonnull List<RefusalMessage> messages) {
    this.messages = messages;
    return this;
  }

  public CampaignRefusalReason addMessagesItem(RefusalMessage messagesItem) {
    if (this.messages == null) {
      this.messages = new ArrayList<>();
    }
    this.messages.add(messagesItem);
    return this;
  }

  /**
   * List of refusal messages.
   * @return messages
   */
  @javax.annotation.Nonnull
  public List<RefusalMessage> getMessages() {
    return messages;
  }

  public void setMessages(@javax.annotation.Nonnull List<RefusalMessage> messages) {
    this.messages = messages;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignRefusalReason campaignRefusalReason = (CampaignRefusalReason) o;
    return Objects.equals(this.code, campaignRefusalReason.code) &&
        Objects.equals(this.messages, campaignRefusalReason.messages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, messages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignRefusalReason {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
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
    openapiFields.add("code");
    openapiFields.add("messages");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("code");
    openapiRequiredFields.add("messages");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CampaignRefusalReason
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CampaignRefusalReason.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CampaignRefusalReason is not found in the empty JSON string", CampaignRefusalReason.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CampaignRefusalReason.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CampaignRefusalReason` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CampaignRefusalReason.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("code").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("messages").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `messages` to be an array in the JSON string but got `%s`", jsonObj.get("messages").toString()));
      }

      JsonArray jsonArraymessages = jsonObj.getAsJsonArray("messages");
      // validate the required field `messages` (array)
      for (int i = 0; i < jsonArraymessages.size(); i++) {
        RefusalMessage.validateJsonElement(jsonArraymessages.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CampaignRefusalReason.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CampaignRefusalReason' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CampaignRefusalReason> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CampaignRefusalReason.class));

       return (TypeAdapter<T>) new TypeAdapter<CampaignRefusalReason>() {
           @Override
           public void write(JsonWriter out, CampaignRefusalReason value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CampaignRefusalReason read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CampaignRefusalReason given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CampaignRefusalReason
   * @throws IOException if the JSON string is invalid with respect to CampaignRefusalReason
   */
  public static CampaignRefusalReason fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CampaignRefusalReason.class);
  }

  /**
   * Convert an instance of CampaignRefusalReason to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

