package fr.dlesaout.openfoodfactswrapper.util;

public class JsonKeys {

    private JsonKeys() {
    }

    // General
    public static final String CODE = "code";
    public static final String PRODUCTS = "products";
    public static final String COUNT = "count";
    public static final String PAGE = "page";
    public static final String PAGE_COUNT = "page_count";
    public static final String PAGE_SIZE = "page_size";
    public static final String NUTRITION_GRADES_TAGS = "nutrition_grades_tags";
    public static final String CATEGORIES_TAGS = "categories_tags";
    public static final String BRANDS_TAGS = "brands_tags";

    // Images
    public static final String SELECTED_IMAGES = "selected_images";
    public static final String FRONT = "front";
    public static final String DISPLAY = "display";
    public static final String FR = "fr";

    // Product Info
    public static final String PRODUCT_NAME = "product_name";
    public static final String BRANDS = "brands";
    public static final String NUTRISCORE = "nutriscore_grade";
    public static final String STORES = "stores";
    public static final String STORES_TAGS = "stores_tags";

    // Ingredients
    public static final String INGREDIENTS = "ingredients";
    public static final String ID = "id";
    public static final String CIQUAL_PROXY_FOOD_CODE = "ciqual_proxy_food_code";
    public static final String FROM_PALM_OIL = "from_palm_oil";
    public static final String ORIGIN = "origin";
    public static final String PERCENT = "percent";
    public static final String PERCENT_ESTIMATE = "percent_estimate";
    public static final String PERCENT_MAX = "percent_max";
    public static final String PERCENT_MIN = "percent_min";
    public static final String TEXT = "text";
    public static final String VEGAN = "vegan";
    public static final String VEGETARIAN = "vegetarian";

    // Additives
    public static final String ADDITIVES_N = "additives_n";
    public static final String NEW_ADDITIVES_N = "new_additives_n";
    public static final String ADDITIVES_OLD_N = "additives_old_n";
    public static final String ADDITIVES_ORIGINAL_TAGS = "additives_original_tags";
    public static final String ADDITIVES_OLD_TAGS = "additives_old_tags";
    public static final String ADDITIVES_PREV_ORIGINAL_TAGS = "additives_prev_original_tags";
    public static final String ADDITIVES_DEBUG_TAGS = "additives_debug_tags";
    public static final String ADDITIVES_TAGS = "additives_tags";

    // Allergens
    public static final String TRACES = "traces";
    public static final String ALLERGENS = "allergens";
    public static final String ALLERGENS_FROM_INGREDIENTS = "allergens_from_ingredients";
    public static final String ALLERGENS_HIERARCHY = "allergens_hierarchy";
    public static final String ALLERGENS_LC = "allergens_lc";
    public static final String ALLERGENS_TAGS = "allergens_tags";

    // Nutrients
    public static final String NUTRIENTS = "nutriments";
    public static final String ALCOHOL = "alcohol";
    public static final String ALCOHOL_VALUE = "alcohol_value";
    public static final String ALCOHOL_100G = "alcohol_100g";
    public static final String ALCOHOL_SERVING = "alcohol_serving";
    public static final String ALCOHOL_UNIT = "alcohol_unit";
    public static final String CARBOHYDRATES = "carbohydrates";
    public static final String CARBOHYDRATES_VALUE = "carbohydrates_value";
    public static final String CARBOHYDRATES_100G = "carbohydrates_100g";
    public static final String CARBOHYDRATES_SERVING = "carbohydrates_serving";
    public static final String CARBOHYDRATES_UNIT = "carbohydrates_unit";
    public static final String ENERGY = "energy";
    public static final String ENERGY_KCAL = "energy-kcal";
    public static final String ENERGY_KCAL_100G = "energy-kcal_100g";
    public static final String ENERGY_KCAL_SERVING = "energy-kcal_serving";
    public static final String ENERGY_KCAL_UNIT = "energy-kcal_unit";
    public static final String ENERGY_KCAL_VALUE = "energy-kcal_value";
    public static final String ENERGY_KCAL_VALUE_COMPUTED = "energy-kcal_value_computed";
    public static final String ENERGY_KJ = "energy-kj";
    public static final String ENERGY_KJ_100G = "energy-kj_100g";
    public static final String ENERGY_KJ_SERVING = "energy-kj_serving";
    public static final String ENERGY_KJ_UNIT = "energy-kj_unit";
    public static final String ENERGY_KJ_VALUE = "energy-kj_value";
    public static final String ENERGY_KJ_VALUE_COMPUTED = "energy-kj_value_computed";
    public static final String FAT = "fat";
    public static final String FAT_100G = "fat_100g";
    public static final String FAT_PREPARED_UNIT = "fat_prepared_unit";
    public static final String FAT_SERVING = "fat_serving";
    public static final String FAT_UNIT = "fat_unit";
    public static final String FAT_VALUE = "fat_value";
    public static final String SATURATED_FAT = "saturated-fat";
    public static final String SATURATED_FAT_100G = "saturated-fat_100g";
    public static final String SATURATED_FAT_SERVING = "saturated-fat_serving";
    public static final String SATURATED_FAT_UNIT = "saturated-fat_unit";
    public static final String SATURATED_FAT_VALUE = "saturated-fat_value";

    public static final String PROTEINS = "proteins";
    public static final String PROTEINS_100G = "proteins_100g";
    public static final String PROTEINS_PREPARED_UNIT = "proteins_prepared_unit";
    public static final String PROTEINS_SERVING = "proteins_serving";
    public static final String PROTEINS_UNIT = "proteins_unit";
    public static final String PROTEINS_VALUE = "proteins_value";
    public static final String SALT = "salt";
    public static final String SALT_100G = "salt_100g";
    public static final String SALT_PREPARED_UNIT = "salt_prepared_unit";
    public static final String SALT_SERVING = "salt_serving";
    public static final String SALT_UNIT = "salt_unit";
    public static final String SALT_VALUE = "salt_value";
    public static final String SODIUM = "sodium";
    public static final String SODIUM_100G = "sodium_100g";
    public static final String SODIUM_PREPARED_UNIT = "sodium_prepared_unit";
    public static final String SODIUM_SERVING = "sodium_serving";
    public static final String SODIUM_UNIT = "sodium_unit";
    public static final String SODIUM_VALUE = "sodium_value";
    public static final String SUGARS = "sugars";
    public static final String SUGARS_100G = "sugars_100g";
    public static final String SUGARS_PREPARED_UNIT = "sugars_prepared_unit";
    public static final String SUGARS_SERVING = "sugars_serving";
    public static final String SUGARS_UNIT = "sugars_unit";
    public static final String SUGARS_VALUE = "sugars_value";
    public static final String FIBER = "fiber";
    public static final String FIBER_100G = "fiber_100g";
    public static final String FIBER_PREPARED_UNIT = "fiber_prepared_unit";
    public static final String FIBER_SERVING = "fiber_serving";
    public static final String FIBER_UNIT = "fiber_unit";
    public static final String FIBER_VALUE = "fiber_value";
    public static final String NOVA_GROUP = "nova-group";
    public static final String NOVA_GROUP_100G = "nova-group_100g";
    public static final String NOVA_GROUP_SERVING = "nova-group_serving";

    public static final String NUTRITION_SCORE_FR = "nutrition-score-fr";
    public static final String NUTRITION_SCORE_FR_100G = "nutrition-score-fr_100g";

    // Countries
    public static final String COUNTRIES = "countries";
    public static final String COUNTRIES_BEFORE_SCANBOT = "countries_beforescanbot";
    public static final String COUNTRIES_HIERARCHY = "countries_hierarchy";
    public static final String COUNTRIES_LC = "countries_lc";
    public static final String COUNTRIES_TAGS = "countries_tags";

    // EcoScore and Adjustments
    public static final String ECOSCORE = "ecoscore_data";
    public static final String ECOSCORE_GRADE = "ecoscore_grade";
    public static final String ECOSCORE_SCORE = "ecoscore_score";
    public static final String ECOSCORE_TAGS = "ecoscore_tags";
    public static final String ECOSCORE_NOT_APPLICABLE_FOR_CATEGORY = "ecoscore_not_applicable_for_category";
    public static final String ORIGINS_OF_INGREDIENTS = "origins_of_ingredients";
    public static final String EPI_SCORE = "epi_score";
    public static final String EPI_VALUE = "epi_value";
    public static final String TRANSPORTATION_SCORE = "transportation_score";
    public static final String VALUE = "value";
    public static final String AGGREGATED_ORIGINS = "aggregated_origins";
    public static final String ADJUSTMENTS = "adjustments";

    // Packaging
    public static final String PACKAGING = "packaging";
    public static final String SCORE = "score";
    public static final String NON_RECYCLABLE_AND_NON_BIODEGRADABLE_MATERIALS = "non_recyclable_and_non_biodegradable_materials";
    public static final String WARNING = "warning";
    public static final String PACKAGINGS = "packagings";
    public static final String MATERIAL = "material";
    public static final String ECOSCORE_MATERIAL_SCORE = "ecoscore_material_score";
    public static final String ECOSCORE_SHAPE_RATIO = "ecoscore_shape_ratio";
    public static final String NUMBER_OF_UNITS = "number_of_units";
    public static final String QUANTITY_PER_UNIT = "quantity_per_unit";
    public static final String SHAPE = "shape";
    public static final String WEIGHT_MEASURED = "weight_measured";

    // Production system
    public static final String PRODUCTION_SYSTEM = "production_system";
    public static final String LABELS = "labels";

    // Theatened species
    public static final String THREATENED_SPECIES = "threatened_species";
    public static final String INGREDIENT = "ingredient";

    // Agribalyse
    public static final String AGRIBALYSE = "agribalyse";
    public static final String AGRIBALYSE_PROXY_FOOD_CODE = "agribalyse_proxy_food_code";
    public static final String CO2_AGRICULTURE = "co2_agriculture";
    public static final String CO2_CONSUMPTION = "co2_consumption";
    public static final String CO2_DISTRIBUTION = "co2_distribution";
    public static final String CO2_PACKAGING = "co2_packaging";
    public static final String CO2_PROCESSING = "co2_processing";
    public static final String CO2_TOTAL = "co2_total";
    public static final String CO2_TRANSPORTATION = "co2_transportation";
    public static final String DQR = "dqr";
    public static final String EF_AGRICULTURE = "ef_agriculture";
    public static final String EF_CONSUMPTION = "ef_consumption";
    public static final String EF_DISTRIBUTION = "ef_distribution";
    public static final String EF_PACKAGING = "ef_packaging";
    public static final String EF_PROCESSING = "ef_processing";
    public static final String EF_TOTAL = "ef_total";
    public static final String EF_TRANSPORTATION = "ef_transportation";
    public static final String IS_BEVERAGE = "is_beverage";
    public static final String NAME_EN = "name_en";
    public static final String NAME_FR = "name_fr";
    public static final String VERSION = "version";

}
