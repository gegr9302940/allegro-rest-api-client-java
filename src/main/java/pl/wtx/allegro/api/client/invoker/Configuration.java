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


package pl.wtx.allegro.api.client.invoker;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.13.0")
public class Configuration {
  public static final String VERSION = "latest";

  private static final AtomicReference<ApiClient> defaultApiClient = new AtomicReference<>();
  private static volatile Supplier<ApiClient> apiClientFactory = ApiClient::new;

  /**
   * Get the default API client, which would be used when creating API instances without providing an API client.
   *
   * @return Default API client
   */
  public static ApiClient getDefaultApiClient() {
    ApiClient client = defaultApiClient.get();
    if (client == null) {
      client = defaultApiClient.updateAndGet(val -> {
        if (val != null) { // changed by another thread
          return val;
        }
        return apiClientFactory.get();
      });
    }
    return client;
  }

  /**
   * Set the default API client, which would be used when creating API instances without providing an API client.
   *
   * @param apiClient API client
   */
  public static void setDefaultApiClient(ApiClient apiClient) {
    defaultApiClient.set(apiClient);
  }

  /**
   * set the callback used to create new ApiClient objects
   */
  public static void setApiClientFactory(Supplier<ApiClient> factory) {
    apiClientFactory = Objects.requireNonNull(factory);
  }

  private Configuration() {
  }
}