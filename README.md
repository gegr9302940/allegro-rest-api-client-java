# Klient Allegro REST API dla aplikacji Java
### Allegro REST API Client for Java
***
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
[![Java Version](https://img.shields.io/badge/Java-17%2B-blue)](https://www.java.com)
[![Maven Central](https://img.shields.io/maven-central/v/pl.wtx.allegro/qualtrics-api-client?label=Maven%20Central&logo=apache-maven&color=blue)]

Lekka biblioteka kliencka w języku Java do integracji z Allegro REST API. Stworzona dla programistów Java, którzy potrzebują zintegrować swoje aplikacje z API platformy Allegro. 🚀

Biblioteka Java do łatwej współpracy z [Allegro REST API](https://developer.allegro.pl/).
Klient ułatwia uwierzytelnianie, wysyłanie zapytań i odbieranie odpowiedzi, dzięki czemu możesz szybko korzystać z funkcji Allegro w swojej aplikacji.

## Najważniejsze możliwości, jakie daje klient Allegro REST API:

- Wystawianie i edytowanie wielu ofert jednocześnie, w tym zmiana cen, ilości i opcji promowania  
- Masowe wyróżnianie wielu ofert, aby zwiększyć ich widoczność  
- Pobieranie i filtrowanie listy własnych ofert na Allegro  
- Uzyskiwanie aktualnych danych o sprzedaży i statusach zamówień  
- Zarządzanie przesyłkami w ramach usługi „Wysyłam z Allegro”  
- Pobieranie szczegółowych informacji o sprzedanych produktach oraz kupujących  
- Zarządzanie komunikacją z klientami, w tym obsługa dyskusji i wiadomości  
- Obsługa kampanii promocyjnych i programów marketingowych  
- Monitorowanie i automatyczna zmiana cen ofert  
- Automatyzacja procesów rozliczeniowych i płatniczych  

## ✨ Dlaczego warto wybrać tego klienta?

- 💡 **Typowane interfejsy Java** – w pełni typowane interfejsy dla endpointów Allegro REST API
- 🛡️ **Uwierzytelnianie sesyjne** – bezpieczny dostęp do API Allegro
- 📚 **Przejrzysta dokumentacja** – przykłady integracji w Javie
- 🚀 **Nowoczesne wsparcie Java** – kompatybilność z Java 17 i nowszymi wersjami

## 📦 Informacje o wersji

- **Aktualna wersja**: `1.0.0`
- **Wymagana wersja Java**: Java 17+

## 🔓 Licencja

**Licencja MIT**

Niniejszym udziela się zgody na bezpłatne korzystanie z tego oprogramowania i powiązanych plików dokumentacji ("Oprogramowanie"), do korzystania z Oprogramowania bez ograniczeń, w tym bez ograniczeń praw do używania, kopiowania, modyfikowania, łączenia, publikowania, dystrybuowania, sublicencjonowania i/lub sprzedaży kopii Oprogramowania.

Jedynym wymogiem jest zachowanie oryginalnych informacji o autorze w kodzie źródłowym i dokumentacji.

## 🚀 Szybki start

### 1️⃣ Instalacja

Możesz dodać bibliotekę do swojego projektu, dołączając zależność z Maven Central:

```xml
<dependency>
    <groupId>pl.wtx.allegro</groupId>
    <artifactId>allegro-rest-api-client</artifactId>
    <version>1.0.0</version>
</dependency>
```

Alternatywnie, możesz sklonować i zbudować bibliotekę ze źródeł:

```sh
git clone https://github.com/wtx-labs/allegro-rest-api-client-java.git
cd allegro-rest-api-client-java
mvn clean install
```

Następnie dodaj zbudowany artefakt do swojego projektu:

```xml
<dependency>
    <groupId>pl.wtx.allegro</groupId>
    <artifactId>allegro-rest-api-client</artifactId>
    <version>1.0.0</version>
</dependency>
```

### 2️⃣ Przykład integracji w Javie

Oto jak używać klienta Allegro REST API:

```java
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

```

## 🤝 Współpraca

- ✨ Sprawdź nasze [GitHub Issues](https://github.com/wtx-labs/allegro-rest-api-client-java/issues) po najnowsze aktualizacje

- 💡 Masz sugestie? Otwórz zgłoszenie lub dołącz do projektu

- 🌟 Oznacz to repozytorium gwiazdką, jeśli uważasz je za pomocne

## 📝 Licencja

Ten projekt jest udostępniany na licencji MIT - szczegóły znajdują się w pliku [LICENSE](LICENSE). 
