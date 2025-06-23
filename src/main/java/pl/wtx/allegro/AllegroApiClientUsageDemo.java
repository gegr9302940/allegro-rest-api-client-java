package pl.wtx.allegro;

import pl.wtx.allegro.api.client.ContactsApi;
import pl.wtx.allegro.api.client.invoker.ApiException;
import pl.wtx.allegro.api.client.model.ContactResponse;
import pl.wtx.allegro.api.client.model.EmailResponse;

/**
 * Allegro REST API Client - Usage Demo.
 * Demonstrates basic usage of AllegroApiClient.
 * 
 * @author WTX Labs
 * @see https://github.com/wtx-labs/allegro-rest-api-client-java
 * @license MIT
 */
public class AllegroApiClientUsageDemo {

    private static final String API_BASE_PATH = "https://api.allegro.pl";

    // TODO: Set your Allegro API credentials!
    private static final String API_CLIENT_ID = "TODO_SET_YOUR_CLIENT_ID";
    private static final String API_CLIENT_SECRET = "TODO_SET_YOUR_CLIENT_SECRET";

    public static void main(String[] args) {

        System.out.println(">>> Start running the AllegroApiClientUsageDemo...");

        AllegroApiClient apiClient = new AllegroApiClient(API_BASE_PATH, API_CLIENT_ID, API_CLIENT_SECRET, false);

        ContactsApi contactsApi = new ContactsApi(apiClient);

        try {

            // Example request for contact with identifier eg. 12345.
            ContactResponse contact = contactsApi.getContactUsingGET("12345");

            // Example contact's name and emails:
            System.out.println("Name: " + contact.getName());
            System.out.println("Emails:");

            for (EmailResponse email : contact.getEmails()) {
                System.out.println("- " + email.getAddress());
            }

        } catch (ApiException exception) {
            System.err.println("Error occurred during API call: " + exception);
        }

        System.out.println("<<< The AllegroApiClientUsageDemo has been finished.");

    }

}
