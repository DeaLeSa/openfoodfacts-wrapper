package fr.dlesaout.openfoodfactswrapper.util;

import lombok.Getter;

@Getter
public enum Attributes {

    // General
    PRODUCTS("products"),
    COUNT("count"),
    PAGE("page"),
    PAGE_COUNT("page_count"),
    PAGE_SIZE("page_size"),
    NUTRITION_GRADES_TAGS("nutrition_grades_tags"),
    CATEGORIES_TAGS("categories_tags"),
    BRANDS_TAGS("brands_tags"),
    FIELDS("fields"),

    // Additives
    ADDITIVES_N("additives_n"),
    NEW_ADDITIVES_N("new_additives_n"),
    ADDITIVES_OLD_N("additives_old_n"),
    ADDITIVES_ORIGINAL_TAGS("additives_original_tags"),
    ADDITIVES_OLD_TAGS("additives_old_tags"),
    ADDITIVES_PREV_ORIGINAL_TAGS("additives_prev_original_tags"),
    ADDITIVES_DEBUG_TAGS("additives_debug_tags"),
    ADDITIVES_TAGS("additives_tags"),

    // Allergens
    TRACES("traces"),
    ALLERGENS("allergens"),
    ALLERGENS_FROM_INGREDIENTS("allergens_from_ingredients"),
    ALLERGENS_HIERARCHY("allergens_hierarchy"),
    ALLERGENS_LC("allergens_lc"),
    ALLERGENS_TAGS("allergens_tags");

    private final String attribute;

    Attributes(String attribute) {
        this.attribute = attribute;
    }

}