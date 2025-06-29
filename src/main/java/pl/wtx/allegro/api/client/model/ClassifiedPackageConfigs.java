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
import pl.wtx.allegro.api.client.model.ClassifiedPackageConfig;

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
 * ClassifiedPackageConfigs
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.13.0")
public class ClassifiedPackageConfigs {
  public static final String SERIALIZED_NAME_PACKAGES = "packages";
  @SerializedName(SERIALIZED_NAME_PACKAGES)
  @javax.annotation.Nonnull
  private List<ClassifiedPackageConfig> packages = new ArrayList<>();

  public ClassifiedPackageConfigs() {
  }

  public ClassifiedPackageConfigs packages(@javax.annotation.Nonnull List<ClassifiedPackageConfig> packages) {
    this.packages = packages;
    return this;
  }

  public ClassifiedPackageConfigs addPackagesItem(ClassifiedPackageConfig packagesItem) {
    if (this.packages == null) {
      this.packages = new ArrayList<>();
    }
    this.packages.add(packagesItem);
    return this;
  }

  /**
   * Get packages
   * @return packages
   */
  @javax.annotation.Nonnull
  public List<ClassifiedPackageConfig> getPackages() {
    return packages;
  }

  public void setPackages(@javax.annotation.Nonnull List<ClassifiedPackageConfig> packages) {
    this.packages = packages;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClassifiedPackageConfigs classifiedPackageConfigs = (ClassifiedPackageConfigs) o;
    return Objects.equals(this.packages, classifiedPackageConfigs.packages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(packages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClassifiedPackageConfigs {\n");
    sb.append("    packages: ").append(toIndentedString(packages)).append("\n");
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
    openapiFields.add("packages");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("packages");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ClassifiedPackageConfigs
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ClassifiedPackageConfigs.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ClassifiedPackageConfigs is not found in the empty JSON string", ClassifiedPackageConfigs.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ClassifiedPackageConfigs.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ClassifiedPackageConfigs` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ClassifiedPackageConfigs.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("packages").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `packages` to be an array in the JSON string but got `%s`", jsonObj.get("packages").toString()));
      }

      JsonArray jsonArraypackages = jsonObj.getAsJsonArray("packages");
      // validate the required field `packages` (array)
      for (int i = 0; i < jsonArraypackages.size(); i++) {
        ClassifiedPackageConfig.validateJsonElement(jsonArraypackages.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ClassifiedPackageConfigs.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ClassifiedPackageConfigs' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ClassifiedPackageConfigs> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ClassifiedPackageConfigs.class));

       return (TypeAdapter<T>) new TypeAdapter<ClassifiedPackageConfigs>() {
           @Override
           public void write(JsonWriter out, ClassifiedPackageConfigs value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ClassifiedPackageConfigs read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ClassifiedPackageConfigs given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ClassifiedPackageConfigs
   * @throws IOException if the JSON string is invalid with respect to ClassifiedPackageConfigs
   */
  public static ClassifiedPackageConfigs fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ClassifiedPackageConfigs.class);
  }

  /**
   * Convert an instance of ClassifiedPackageConfigs to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

