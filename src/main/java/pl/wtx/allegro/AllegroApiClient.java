package pl.wtx.allegro;

import java.util.HashMap;

import pl.wtx.allegro.api.client.config.GsonConfig;
import pl.wtx.allegro.api.client.config.OkHttpClientConfig;
import pl.wtx.allegro.api.client.invoker.ApiClient;
import pl.wtx.allegro.api.client.invoker.JSON;

/**
 * AllegroApiClient is a specialized API client for interacting with the Allegro platform.
 * <p>
 * This client extends the generic {@link ApiClient} and provides default configuration,
 * including custom Gson serialization settings and optional HTTP logging.
 * </p>
 * <p>
 * By default, it ignores unrecognized fields in API responses to improve robustness.
 * </p>
 */
public class AllegroApiClient extends ApiClient {

    /**
     * Constructs a new AllegroApiClient instance with the specified parameters.
     * <p>
     * The client is initialized with a base API path, client credentials, and an option to enable HTTP message logging.
     * It configures JSON serialization to ignore unknown fields and sets a custom User-Agent header.
     * </p>
     *
     * @param basePath               the base URL path of the Allegro API
     * @param clientId               the OAuth2 client ID for authentication
     * @param clientSecret           the OAuth2 client secret for authentication
     * @param enableLoggingApiMessages if {@code true}, enables HTTP client logging for API messages
     */
    public AllegroApiClient(String basePath, String clientId, String clientSecret, boolean enableLoggingApiMessages) {
        
        super(basePath, clientId, clientSecret, new HashMap<String, String>());
        
        JSON.setGson(GsonConfig.createGson());
        setUserAgent("AllegroApiClient (by wtx-labs)");
        
        if (enableLoggingApiMessages) {
            setHttpClient(OkHttpClientConfig.configureClient(getHttpClient()));
        }
        
    }

}
