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
import pl.wtx.allegro.api.client.model.Cells;
import pl.wtx.allegro.api.client.model.Header;
import pl.wtx.allegro.api.client.model.SizeTableTemplateImageResponse;

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
 * SizeTableTemplateResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.13.0")
public class SizeTableTemplateResponse {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nonnull
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nonnull
  private String name;

  public static final String SERIALIZED_NAME_IMAGE = "image";
  @SerializedName(SERIALIZED_NAME_IMAGE)
  @javax.annotation.Nullable
  private SizeTableTemplateImageResponse image;

  public static final String SERIALIZED_NAME_HEADERS = "headers";
  @SerializedName(SERIALIZED_NAME_HEADERS)
  @javax.annotation.Nonnull
  private List<Header> headers = new ArrayList<>();

  public static final String SERIALIZED_NAME_VALUES = "values";
  @SerializedName(SERIALIZED_NAME_VALUES)
  @javax.annotation.Nonnull
  private List<Cells> values = new ArrayList<>();

  public SizeTableTemplateResponse() {
  }

  public SizeTableTemplateResponse id(@javax.annotation.Nonnull String id) {
    this.id = id;
    return this;
  }

  /**
   * size table template id
   * @return id
   */
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }

  public void setId(@javax.annotation.Nonnull String id) {
    this.id = id;
  }


  public SizeTableTemplateResponse name(@javax.annotation.Nonnull String name) {
    this.name = name;
    return this;
  }

  /**
   * size table template name
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nonnull String name) {
    this.name = name;
  }


  public SizeTableTemplateResponse image(@javax.annotation.Nullable SizeTableTemplateImageResponse image) {
    this.image = image;
    return this;
  }

  /**
   * Get image
   * @return image
   */
  @javax.annotation.Nullable
  public SizeTableTemplateImageResponse getImage() {
    return image;
  }

  public void setImage(@javax.annotation.Nullable SizeTableTemplateImageResponse image) {
    this.image = image;
  }


  public SizeTableTemplateResponse headers(@javax.annotation.Nonnull List<Header> headers) {
    this.headers = headers;
    return this;
  }

  public SizeTableTemplateResponse addHeadersItem(Header headersItem) {
    if (this.headers == null) {
      this.headers = new ArrayList<>();
    }
    this.headers.add(headersItem);
    return this;
  }

  /**
   * size table template headers
   * @return headers
   */
  @javax.annotation.Nonnull
  public List<Header> getHeaders() {
    return headers;
  }

  public void setHeaders(@javax.annotation.Nonnull List<Header> headers) {
    this.headers = headers;
  }


  public SizeTableTemplateResponse values(@javax.annotation.Nonnull List<Cells> values) {
    this.values = values;
    return this;
  }

  public SizeTableTemplateResponse addValuesItem(Cells valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<>();
    }
    this.values.add(valuesItem);
    return this;
  }

  /**
   * size table template cells
   * @return values
   */
  @javax.annotation.Nonnull
  public List<Cells> getValues() {
    return values;
  }

  public void setValues(@javax.annotation.Nonnull List<Cells> values) {
    this.values = values;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SizeTableTemplateResponse sizeTableTemplateResponse = (SizeTableTemplateResponse) o;
    return Objects.equals(this.id, sizeTableTemplateResponse.id) &&
        Objects.equals(this.name, sizeTableTemplateResponse.name) &&
        Objects.equals(this.image, sizeTableTemplateResponse.image) &&
        Objects.equals(this.headers, sizeTableTemplateResponse.headers) &&
        Objects.equals(this.values, sizeTableTemplateResponse.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, image, headers, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SizeTableTemplateResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("name");
    openapiFields.add("image");
    openapiFields.add("headers");
    openapiFields.add("values");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("headers");
    openapiRequiredFields.add("values");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SizeTableTemplateResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SizeTableTemplateResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SizeTableTemplateResponse is not found in the empty JSON string", SizeTableTemplateResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SizeTableTemplateResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SizeTableTemplateResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SizeTableTemplateResponse.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field `image`
      if (jsonObj.get("image") != null && !jsonObj.get("image").isJsonNull()) {
        SizeTableTemplateImageResponse.validateJsonElement(jsonObj.get("image"));
      }
      // ensure the json data is an array
      if (!jsonObj.get("headers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `headers` to be an array in the JSON string but got `%s`", jsonObj.get("headers").toString()));
      }

      JsonArray jsonArrayheaders = jsonObj.getAsJsonArray("headers");
      // validate the required field `headers` (array)
      for (int i = 0; i < jsonArrayheaders.size(); i++) {
        Header.validateJsonElement(jsonArrayheaders.get(i));
      };
      // ensure the json data is an array
      if (!jsonObj.get("values").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `values` to be an array in the JSON string but got `%s`", jsonObj.get("values").toString()));
      }

      JsonArray jsonArrayvalues = jsonObj.getAsJsonArray("values");
      // validate the required field `values` (array)
      for (int i = 0; i < jsonArrayvalues.size(); i++) {
        Cells.validateJsonElement(jsonArrayvalues.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SizeTableTemplateResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SizeTableTemplateResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SizeTableTemplateResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SizeTableTemplateResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<SizeTableTemplateResponse>() {
           @Override
           public void write(JsonWriter out, SizeTableTemplateResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SizeTableTemplateResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of SizeTableTemplateResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SizeTableTemplateResponse
   * @throws IOException if the JSON string is invalid with respect to SizeTableTemplateResponse
   */
  public static SizeTableTemplateResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SizeTableTemplateResponse.class);
  }

  /**
   * Convert an instance of SizeTableTemplateResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

