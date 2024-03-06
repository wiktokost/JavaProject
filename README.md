# IpStackUpdater

## Opis projektu

Projekt IpStackUpdater jest aplikacją służącą do aktualizacji danych geolokalizacyjnych na podstawie adresu IP za pomocą API IpStack. Aplikacja pobiera dane z serwisu IpStack, a następnie aktualizuje lokalną bazę danych z informacjami geograficznymi.

## Struktura projektu

Projekt składa się z kilku modułów i klas Java, które obsługują różne funkcjonalności aplikacji. Oto krótka lista najważniejszych elementów:

* ipstack-client: Moduł zawierający klienta do komunikacji z API IpStack.
* ipstack-data: Moduł zawierający modele danych oraz repozytoria do obsługi bazy danych.
* ipstack-updater: Moduł zawierający usługi do aktualizacji danych geolokalizacyjnych.
* ipstack-web-api: Moduł zawierający interfejs API webowego oraz kontrolery do obsługi żądań HTTP.
* resources: Zawiera pliki konfiguracyjne, takie jak plik properties z kluczami API, plik konfiguracyjny dla log4j2 oraz plik application.properties dla Spring Boot.

## Opis klas

* IpStackClient: Klasa obsługująca komunikację z API IpStack. Pobiera dane geolokalizacyjne na podstawie adresu IP.
* IpGeolocationService: Serwis obsługujący zapytania HTTP związane z danymi geolokalizacyjnymi. Udostępnia funkcje do pobierania danych geolokalizacyjnych oraz dodawania nowych wpisów do bazy danych.
* GeolocationUpdater: Klasa odpowiedzialna za aktualizację danych geolokalizacyjnych w bazie danych lokalnej na podstawie adresu IP.
* IpGeolocationController: Kontroler obsługujący żądania HTTP związane z danymi geolokalizacyjnymi. Udostępnia punkty końcowe do pobierania danych, dodawania nowych wpisów oraz usuwania istniejących wpisów.

## Wykorzystywane technologie

Java

Spring Boot

Spring Data JPA

MySQL

RESTful API

Jackson (do przetwarzania formatu JSON)

Lombok (do generowania getterów, setterów i innych metod)
