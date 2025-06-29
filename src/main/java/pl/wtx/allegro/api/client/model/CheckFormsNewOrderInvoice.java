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
import pl.wtx.allegro.api.client.model.CheckFormsNewOrderInvoiceFile;

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
 * CheckFormsNewOrderInvoice
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.13.0")
public class CheckFormsNewOrderInvoice {
  public static final String SERIALIZED_NAME_FILE = "file";
  @SerializedName(SERIALIZED_NAME_FILE)
  @javax.annotation.Nonnull
  private CheckFormsNewOrderInvoiceFile _file;

  public static final String SERIALIZED_NAME_INVOICE_NUMBER = "invoiceNumber";
  @SerializedName(SERIALIZED_NAME_INVOICE_NUMBER)
  @javax.annotation.Nullable
  private String invoiceNumber;

  public CheckFormsNewOrderInvoice() {
  }

  public CheckFormsNewOrderInvoice _file(@javax.annotation.Nonnull CheckFormsNewOrderInvoiceFile _file) {
    this._file = _file;
    return this;
  }

  /**
   * Get _file
   * @return _file
   */
  @javax.annotation.Nonnull
  public CheckFormsNewOrderInvoiceFile getFile() {
    return _file;
  }

  public void setFile(@javax.annotation.Nonnull CheckFormsNewOrderInvoiceFile _file) {
    this._file = _file;
  }


  public CheckFormsNewOrderInvoice invoiceNumber(@javax.annotation.Nullable String invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
    return this;
  }

  /**
   * Get invoiceNumber
   * @return invoiceNumber
   */
  @javax.annotation.Nullable
  public String getInvoiceNumber() {
    return invoiceNumber;
  }

  public void setInvoiceNumber(@javax.annotation.Nullable String invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckFormsNewOrderInvoice checkFormsNewOrderInvoice = (CheckFormsNewOrderInvoice) o;
    return Objects.equals(this._file, checkFormsNewOrderInvoice._file) &&
        Objects.equals(this.invoiceNumber, checkFormsNewOrderInvoice.invoiceNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_file, invoiceNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckFormsNewOrderInvoice {\n");
    sb.append("    _file: ").append(toIndentedString(_file)).append("\n");
    sb.append("    invoiceNumber: ").append(toIndentedString(invoiceNumber)).append("\n");
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
    openapiFields.add("file");
    openapiFields.add("invoiceNumber");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("file");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CheckFormsNewOrderInvoice
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CheckFormsNewOrderInvoice.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CheckFormsNewOrderInvoice is not found in the empty JSON string", CheckFormsNewOrderInvoice.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CheckFormsNewOrderInvoice.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CheckFormsNewOrderInvoice` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CheckFormsNewOrderInvoice.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `file`
      CheckFormsNewOrderInvoiceFile.validateJsonElement(jsonObj.get("file"));
      if ((jsonObj.get("invoiceNumber") != null && !jsonObj.get("invoiceNumber").isJsonNull()) && !jsonObj.get("invoiceNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `invoiceNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("invoiceNumber").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CheckFormsNewOrderInvoice.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CheckFormsNewOrderInvoice' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CheckFormsNewOrderInvoice> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CheckFormsNewOrderInvoice.class));

       return (TypeAdapter<T>) new TypeAdapter<CheckFormsNewOrderInvoice>() {
           @Override
           public void write(JsonWriter out, CheckFormsNewOrderInvoice value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CheckFormsNewOrderInvoice read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CheckFormsNewOrderInvoice given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CheckFormsNewOrderInvoice
   * @throws IOException if the JSON string is invalid with respect to CheckFormsNewOrderInvoice
   */
  public static CheckFormsNewOrderInvoice fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CheckFormsNewOrderInvoice.class);
  }

  /**
   * Convert an instance of CheckFormsNewOrderInvoice to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

