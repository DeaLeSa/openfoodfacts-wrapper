package fr.dlesaout.openfoodfactswrapper.util;

import lombok.Getter;

@Getter
public enum Attributes {

    PRODUCTS("products"),
    COUNT("count"),
    PAGE("page"),
    PAGE_COUNT("page_count"),
    PAGE_SIZE("page_size"),
    NUTRITION_GRADES_TAGS("nutrition_grades_tags"),
    CATEGORIES_TAGS("categories_tags"),
    BRANDS_TAGS("brands_tags"),
    FIELDS("fields");

    private final String attribute;

    Attributes(String attribute) {
        this.attribute = attribute;
    }

}