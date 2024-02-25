package fr.dlesaout.openfoodfactswrapper.util;

public enum ApiUrls {

    BASE("https://fr.openfoodfacts.net/api/v2"),
    BASE_SEARCH("https://fr.openfoodfacts.net/api/v2/search?"),
    PRODUCT_BY_CODE("https://fr.openfoodfacts.net/api/v2/product/%s.json");

    public final String url;

    ApiUrls(String url) {
        this.url = url;
    }

    public String format(Object... args) {
        return String.format(this.url, args);
    }
}