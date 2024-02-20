package fr.dlesaout.openfoodfactswrapper.util;

public enum ApiUrls {

    BASE_URL("https://fr.openfoodfacts.net/api/v2"),
    PRODUCT_BY_CODE_URL(BASE_URL.url + "/product/%s.json"),
    PRODUCTS_LIST_URL(BASE_URL.url + "/search?nutrition_grades_tags=%s&categories_tags=%s&brands_tags=%s&page=%d&json=true");

    public final String url;

    ApiUrls(String url) {
        this.url = url;
    }

    public String format(Object... args) {
        return String.format(this.url, args);
    }
}