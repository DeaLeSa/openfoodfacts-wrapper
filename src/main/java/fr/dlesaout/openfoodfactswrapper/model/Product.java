package fr.dlesaout.openfoodfactswrapper.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@NoArgsConstructor
@JsonTypeName("Product")
@Schema(name = "Product", description = "Represents a product with detailed information.")
public class Product {

    @Schema(description = "Image of the product")
    private Image image;

    @Schema(description = "List of ingredients in the product")
    private Ingredient[] ingredients;

    @JsonProperty("languages_codes")
    @Schema(description = "Language codes available for the product")
    private LanguageCode languageCode;

    @JsonProperty("nutrient_levels")
    @Schema(description = "Nutrient levels of the product")
    private NutrientLevel nutrientLevels;

    @Schema(description = "Nutritional information of the product")
    private Nutriment nutriment;

    @JsonProperty("selected_images")
    @Schema(description = "Selected images of the product")
    private SelectedImage selectedImages;

    @Schema(description = "Sources of the product information")
    private Source[] sources;

    @JsonProperty("additives_n")
    @Schema(description = "Number of additives")
    private int additivesN;

    @JsonProperty("additives_old_n")
    @Schema(description = "Old number of additives")
    private int additivesOldN;

    @JsonProperty("additives_original_tags")
    @Schema(description = "Original tags for additives")
    private String[] additivesOriginalTags;

    @JsonProperty("additives_old_tags")
    @Schema(description = "Old tags for additives")
    private String[] additivesOldTags;

    @JsonProperty("additives_prev_original_tags")
    @Schema(description = "Previous original tags for additives")
    private String[] additivesPrevOriginalTags;

    @JsonProperty("additives_debug_tags")
    @Schema(description = "Debug tags for additives")
    private String[] additivesDebugTags;

    @JsonProperty("additives_tags")
    @Schema(description = "Tags for additives")
    private String[] additivesTags;

    @JsonProperty("allergens")
    @Schema(description = "Allergens present in the product")
    private String allergens;

    @JsonProperty("allergens_from_ingredients")
    @Schema(description = "Allergens from ingredients")
    private String allergensFromIngredients;

    @JsonProperty("allergens_from_user")
    @Schema(description = "Allergens reported by the user")
    private String allergensFromUser;

    @JsonProperty("allergens_hierarchy")
    @Schema(description = "Hierarchy of allergens")
    private String[] allergensHierarchy;

    @JsonProperty("allergens_lc")
    @Schema(description = "Language code for allergens information")
    private String allergensLc;

    @JsonProperty("allergens_tags")
    @Schema(description = "Tags for allergens")
    private String[] allergensTags;

    @JsonProperty("countries")
    @Schema(description = "Countries where the product is available")
    private String countries;

    @JsonProperty("countries_hierarchy")
    @Schema(description = "Hierarchy of countries for the product")
    private String[] countriesHierarchy;

    @JsonProperty("countries_lc")
    @Schema(description = "Language code for countries information")
    private String countriesLc;

    @JsonProperty("countries_debug_tags")
    @Schema(description = "Debug tags related to countries")
    private String[] countriesDebugTags;

    @JsonProperty("countries_tags")
    @Schema(description = "Tags for countries")
    private String[] countriesTags;

    @JsonProperty("correctors_tags")
    @Schema(description = "Tags for users who corrected the product information")
    private String[] correctorsTags;

    @JsonProperty("created_t")
    @Schema(description = "Timestamp of product creation")
    private long createdT;

    @Schema(description = "Creator of the product entry")
    private String creator;

    @JsonProperty("data_quality_bugs_tags")
    @Schema(description = "Tags related to data quality bugs")
    private String[] dataQualityBugsTags;

    @JsonProperty("data_quality_errors_tags")
    @Schema(description = "Tags related to data quality errors")
    private String[] dataQualityErrorsTags;

    @JsonProperty("data_quality_info_tags")
    @Schema(description = "Tags related to data quality information")
    private String[] dataQualityInfoTags;

    @JsonProperty("data_quality_tags")
    @Schema(description = "Tags for overall data quality")
    private String[] dataQualityTags;

    @JsonProperty("data_quality_warnings_tags")
    @Schema(description = "Tags related to data quality warnings")
    private String[] dataQualityWarningsTags;

    @JsonProperty("data_sources")
    @Schema(description = "Sources of the data")
    private String dataSources;

    @JsonProperty("data_sources_tags")
    @Schema(description = "Tags for the data sources")
    private String[] dataSourcesTags;

    @JsonProperty("debug_param_sorted_langs")
    @Schema(description = "Debug information for sorted languages")
    private String[] debugParamSortedLangs;

    @JsonProperty("editors_tags")
    @Schema(description = "Tags for the editors of the product")
    private String[] editorsTags;

    @JsonProperty("emb_codes")
    @Schema(description = "Emb codes of the product")
    private String embCodes;

    @JsonProperty("emb_codes_debug_tags")
    @Schema(description = "Debug tags related to emb codes")
    private String[] embCodesDebugTags;

    @JsonProperty("emb_codes_orig")
    @Schema(description = "Original emb codes of the product")
    private String embCodesOrig;

    @JsonProperty("emb_codes_tags")
    @Schema(description = "Tags for the emb codes")
    private String[] embCodesTags;

    @JsonProperty("entry_dates_tags")
    @Schema(description = "Entry dates tags for the product")
    private String[] entryDatesTags;

    @JsonProperty("expiration_date")
    @Schema(description = "Expiration date of the product")
    private String expirationDate;

    @JsonProperty("expiration_date_debug_tags")
    @Schema(description = "Debug tags for expiration date")
    private String[] expirationDateDebugTags;

    @JsonProperty("fruits-vegetables-nuts_100g_estimate")
    @Schema(description = "Estimate of fruits, vegetables, and nuts per 100g")
    private int fruitsVegetablesNuts100GEstimate;

    @JsonProperty("generic_name")
    @Schema(description = "Generic name of the product")
    private String genericName;

    @Schema(description = "Unique identifier for the product")
    private String id;

    @JsonProperty("_id")
    @Schema(description = "Alternate unique identifier for the product")
    private String _id;

    @JsonProperty("image_front_small_url")
    @Schema(description = "URL for the small front image of the product")
    private String imageFrontSmallUrl;

    @JsonProperty("image_front_thumb_url")
    @Schema(description = "URL for the thumbnail front image of the product")
    private String imageFrontThumbUrl;

    @JsonProperty("image_front_url")
    @Schema(description = "URL for the front image of the product")
    private String imageFrontUrl;

    @JsonProperty("image_ingredients_url")
    @Schema(description = "URL for the ingredients image of the product")
    private String imageIngredientsUrl;

    @JsonProperty("image_ingredients_small_url")
    @Schema(description = "URL for the small ingredients image of the product")
    private String imageIngredientsSmallUrl;

    @JsonProperty("image_ingredients_thumb_url")
    @Schema(description = "URL for the thumbnail ingredients image of the product")
    private String imageIngredientsThumbUrl;

    @JsonProperty("image_nutrition_small_url")
    @Schema(description = "URL for the small nutrition image of the product")
    private String imageNutritionSmallUrl;

    @JsonProperty("image_nutrition_thumb_url")
    @Schema(description = "URL for the thumbnail nutrition image of the product")
    private String imageNutritionThumbUrl;

    @JsonProperty("image_nutrition_url")
    @Schema(description = "URL for the nutrition image of the product")
    private String imageNutritionUrl;

    @JsonProperty("image_small_url")
    @Schema(description = "URL for the small image of the product")
    private String imageSmallUrl;

    @JsonProperty("image_thumb_url")
    @Schema(description = "URL for the thumbnail image of the product")
    private String imageThumbUrl;

    @JsonProperty("image_url")
    @Schema(description = "URL for the image of the product")
    private String imageUrl;

    @JsonProperty("informers_tags")
    @Schema(description = "Tags for the informers of the product")
    private String[] informersTags;

    @JsonProperty("ingredients_analysis_tags")
    @Schema(description = "Tags for the analysis of the ingredients")
    private String[] ingredientsAnalysisTags;

    @JsonProperty("ingredients_debug")
    @Schema(description = "Debug information for ingredients")
    private String[] ingredientsDebug;

    @JsonProperty("ingredients_from_or_that_may_be_from_palm_oil_n")
    @Schema(description = "Number of ingredients that are or may be from palm oil")
    private int ingredientsFromOrThatMayBeFromPalmOilN;

    @JsonProperty("ingredients_from_palm_oil_tags")
    @Schema(description = "Tags for ingredients from palm oil")
    private String[] ingredientsFromPalmOilTags;

    @JsonProperty("ingredients_from_palm_oil_n")
    @Schema(description = "Number of ingredients from palm oil")
    private int ingredientsFromPalmOilN;

    @JsonProperty("ingredients_hierarchy")
    @Schema(description = "Hierarchy of ingredients")
    private String[] ingredientsHierarchy;

    @JsonProperty("ingredients_ids_debug")
    @Schema(description = "Debug IDs for ingredients")
    private String[] ingredientsIdsDebug;

    @JsonProperty("ingredients_n")
    @Schema(description = "Number of ingredients")
    private int ingredientsN;

    @JsonProperty("ingredients_n_tags")
    @Schema(description = "Tags related to the number of ingredients")
    private String[] ingredientsNTags;

    @JsonProperty("ingredients_original_tags")
    @Schema(description = "Original tags for ingredients")
    private String[] ingredientsOriginalTags;

    @JsonProperty("ingredients_tags")
    @Schema(description = "Tags for ingredients")
    private String[] ingredientsTags;

    @JsonProperty("ingredients_text")
    @Schema(description = "Text description of ingredients")
    private String ingredientsText;

    @JsonProperty("ingredients_text_debug")
    @Schema(description = "Debug text for ingredients")
    private String ingredientsTextDebug;

    @JsonProperty("ingredients_text_with_allergens")
    @Schema(description = "Ingredients text including allergens")
    private String ingredientsTextWithAllergens;

    @JsonProperty("ingredients_that_may_be_from_palm_oil_n")
    @Schema(description = "Number of ingredients that may be from palm oil")
    private int ingredientsThatMayBeFromPalmOilN;

    @JsonProperty("ingredients_that_may_be_from_palm_oil_tags")
    @Schema(description = "Tags for ingredients that may be from palm oil")
    private String[] ingredientsThatMayBeFromPalmOilTags;

    @JsonProperty("interface_version_created")
    @Schema(description = "The interface version when the product was created")
    private String interfaceVersionCreated;

    @JsonProperty("interface_version_modified")
    @Schema(description = "The interface version when the product was last modified")
    private String interfaceVersionModified;

    @JsonProperty("_keywords")
    @Schema(description = "Keywords associated with the product")
    private String[] keywords;

    @JsonProperty("known_ingredients_n")
    @Schema(description = "Number of known ingredients in the product")
    private int knownIngredientsN;

    @Schema(description = "Labels of the product")
    private String labels;

    @JsonProperty("labels_hierarchy")
    @Schema(description = "Hierarchy of labels associated with the product")
    private String[] labelsHierarchy;

    @JsonProperty("labels_lc")
    @Schema(description = "Language code for labels")
    private String labelsLc;

    @JsonProperty("labels_prev_hierarchy")
    @Schema(description = "Previous hierarchy of labels associated with the product")
    private String[] labelsPrevHierarchy;

    @JsonProperty("labels_prev_tags")
    @Schema(description = "Previous tags of labels associated with the product")
    private String[] labelsPrevTags;

    @JsonProperty("labels_tags")
    @Schema(description = "Tags of labels associated with the product")
    private String[] labelsTags;

    @JsonProperty("labels_debug_tags")
    @Schema(description = "Debug tags for labels")
    private String[] labelsDebugTags;

    @Schema(description = "Language of the product")
    private String lang;

    @JsonProperty("lang_debug_tags")
    @Schema(description = "Debug tags for language")
    private String[] langDebugTags;

    @JsonProperty("languages_hierarchy")
    @Schema(description = "Hierarchy of languages available for the product")
    private String[] languagesHierarchy;

    @JsonProperty("languages_tags")
    @Schema(description = "Tags for languages available for the product")
    private String[] languagesTags;

    @JsonProperty("last_edit_dates_tags")
    @Schema(description = "Tags for the last edit dates")
    private String[] lastEditDatesTags;

    @JsonProperty("last_editor")
    @Schema(description = "The last editor of the product")
    private String lastEditor;

    @JsonProperty("last_image_dates_tags")
    @Schema(description = "Tags for the dates of the last images uploaded")
    private String[] lastImageDatesTags;

    @JsonProperty("last_image_t")
    @Schema(description = "Timestamp for the last image uploaded")
    private long lastImageT;

    @JsonProperty("last_modified_by")
    @Schema(description = "The user who last modified the product")
    private String lastModifiedBy;

    @JsonProperty("last_modified_t")
    @Schema(description = "Timestamp for the last modification of the product")
    private long lastModifiedT;

    @Schema(description = "Language code")
    private String lc;

    @Schema(description = "Link to the product page")
    private String link;

    @JsonProperty("link_debug_tags")
    @Schema(description = "Debug tags for link")
    private String[] linkDebugTags;

    @JsonProperty("manufacturing_places")
    @Schema(description = "Places where the product was manufactured")
    private String manufacturingPlaces;

    @JsonProperty("manufacturing_places_debug_tags")
    @Schema(description = "Debug tags for manufacturing places")
    private String[] manufacturingPlacesDebugTags;

    @JsonProperty("manufacturing_places_tags")
    @Schema(description = "Tags for manufacturing places")
    private String[] manufacturingPlacesTags;

    @JsonProperty("max_imgid")
    @Schema(description = "Maximum image ID of the product")
    private String maxImgid;

    @JsonProperty("minerals_prev_tags")
    @Schema(description = "Previous tags for minerals")
    private String[] mineralsPrevTags;

    @JsonProperty("minerals_tags")
    @Schema(description = "Tags for minerals")
    private String[] mineralsTags;

    @JsonProperty("misc_tags")
    @Schema(description = "Miscellaneous tags")
    private String[] miscTags;

    @JsonProperty("net_weight_unit")
    @Schema(description = "Unit of the net weight")
    private String netWeightUnit;

    @JsonProperty("net_weight_value")
    @Schema(description = "Value of the net weight")
    private String netWeightValue;

    @JsonProperty("nutrition_data_per")
    @Schema(description = "Basis of the nutrition data (e.g., 'per serving', 'per 100g')")
    private String nutritionDataPer;

    @JsonProperty("nutrition_score_warning_no_fruits_vegetables_nuts")
    @Schema(description = "Nutrition score warning regarding the absence of fruits, vegetables, and nuts")
    private int nutritionScoreWarningNoFruitsVegetablesNuts;

    @JsonProperty("no_nutrition_data")
    @Schema(description = "Indicator if there is no nutrition data")
    private String noNutritionData;

    @JsonProperty("nova_group")
    @Schema(description = "NOVA group for the product")
    private String novaGroup;

    @JsonProperty("nova_groups")
    @Schema(description = "NOVA groups for the product")
    private String novaGroups;

    @JsonProperty("nova_group_debug")
    @Schema(description = "Debug information for NOVA group")
    private String novaGroupDebug;

    @JsonProperty("nova_group_tags")
    @Schema(description = "Tags for NOVA group")
    private String[] novaGroupTags;

    @JsonProperty("nova_groups_tags")
    @Schema(description = "Tags for NOVA groups")
    private String[] novaGroupsTags;

    @JsonProperty("nucleotides_prev_tags")
    @Schema(description = "Previous tags for nucleotides")
    private String[] nucleotidesPrevTags;

    @JsonProperty("nucleotides_tags")
    @Schema(description = "Tags for nucleotides")
    private String[] nucleotidesTags;

    @JsonProperty("nutrient_levels_tags")
    @Schema(description = "Tags for nutrient levels")
    private String[] nutrientLevelsTags;

    @JsonProperty("nutrition_data")
    @Schema(description = "Nutrition data for the product")
    private String nutritionData;

    @JsonProperty("nutrition_data_per_debug_tags")
    @Schema(description = "Debug tags for nutrition data per unit")
    private String[] nutritionDataPerDebugTags;

    @JsonProperty("nutrition_data_prepared")
    @Schema(description = "Nutrition data for the prepared product")
    private String nutritionDataPrepared;

    @JsonProperty("nutrition_data_prepared_per")
    @Schema(description = "Basis of the prepared nutrition data")
    private String nutritionDataPreparedPer;

    @JsonProperty("nutrition_grades")
    @Schema(description = "Nutrition grades for the product")
    private String nutritionGrades;

    @JsonProperty("nutrition_score_beverage")
    @Schema(description = "Nutrition score for beverages")
    private int nutritionScoreBeverage;

    @JsonProperty("nutrition_score_debug")
    @Schema(description = "Debug information for nutrition score")
    private String nutritionScoreDebug;

    @JsonProperty("nutrition_score_warning_no_fiber")
    @Schema(description = "Nutrition score warning for no fiber")
    private int nutritionScoreWarningNoFiber;

    @JsonProperty("nutrition_grades_tags")
    @Schema(description = "Tags for nutrition grades")
    private String[] nutritionGradesTags;

    @Schema(description = "Origins of the product")
    private String origins;

    @JsonProperty("origins_debug_tags")
    @Schema(description = "Debug tags for origins")
    private String[] originsDebugTags;

    @JsonProperty("origins_tags")
    @Schema(description = "Tags for origins")
    private String[] originsTags;

    @JsonProperty("other_information")
    @Schema(description = "Other information about the product")
    private String otherInformation;

    @JsonProperty("other_nutritional_substances_tags")
    @Schema(description = "Tags for other nutritional substances")
    private String[] otherNutritionalSubstancesTags;

    @Schema(description = "Packaging of the product")
    private String packaging;

    @JsonProperty("photographers_tags")
    @Schema(description = "Tags for photographers who contributed product images")
    private String[] photographersTags;

    @JsonProperty("pnns_groups_1")
    @Schema(description = "Primary PNNS group for the product")
    private String pnnsGroups1;

    @JsonProperty("pnns_groups_2")
    @Schema(description = "Secondary PNNS group for the product")
    private String pnnsGroups2;

    @JsonProperty("pnns_groups_1_tags")
    @Schema(description = "Tags for the primary PNNS group")
    private String[] pnnsGroups1Tags;

    @JsonProperty("pnns_groups_2_tags")
    @Schema(description = "Tags for the secondary PNNS group")
    private String[] pnnsGroups2Tags;

    @JsonProperty("popularity_key")
    @Schema(description = "Key indicating the product's popularity")
    private long popularityKey;

    @JsonProperty("producer_version_id")
    @Schema(description = "ID of the producer version")
    private String producerVersionId;

    @JsonProperty("product_name")
    @Schema(description = "Name of the product")
    private String productName;

    @JsonProperty("product_quantity")
    @Schema(description = "Quantity of the product")
    private String productQuantity;

    @JsonProperty("purchase_places")
    @Schema(description = "Places where the product can be purchased")
    private String purchasePlaces;

    @JsonProperty("purchase_places_debug_tags")
    @Schema(description = "Debug tags for purchase places")
    private String[] purchasePlacesDebugTags;

    @JsonProperty("purchase_places_tags")
    @Schema(description = "Tags for purchase places")
    private String[] purchasePlacesTags;

    @JsonProperty("quality_tags")
    @Schema(description = "Tags related to the product's quality")
    private String[] qualityTags;

    @Schema(description = "Quantity of the product")
    private String quantity;

    @JsonProperty("quantity_debug_tags")
    @Schema(description = "Debug tags for the product quantity")
    private String[] quantityDebugTags;

    @JsonProperty("recycling_instructions_to_discard")
    @Schema(description = "Instructions for discarding packaging for recycling purposes")
    private String recyclingInstructionsToDiscard;

    @Schema(description = "Revision number of the product entry")
    private int rev;

    @JsonProperty("serving_quantity")
    @Schema(description = "Quantity per serving of the product")
    private String servingQuantity;

    @JsonProperty("serving_size")
    @Schema(description = "Size of a single serving of the product")
    private String servingSize;

    @JsonProperty("serving_size_debug_tags")
    @Schema(description = "Debug tags for serving size")
    private String[] servingSizeDebugTags;

    @Schema(description = "Sorting key for the product")
    private long sortkey;

    @Schema(description = "States of the product in the production chain")
    private String states;

    @JsonProperty("states_hierarchy")
    @Schema(description = "Hierarchy of states the product goes through")
    private String[] statesHierarchy;

    @JsonProperty("states_tags")
    @Schema(description = "Tags for the product states")
    private String[] statesTags;

    @Schema(description = "Stores where the product is available")
    private String stores;

    @JsonProperty("stores_debug_tags")
    @Schema(description = "Debug tags for stores")
    private String[] storesDebugTags;

    @JsonProperty("stores_tags")
    @Schema(description = "Tags for stores selling the product")
    private String[] storesTags;

    @Schema(description = "Traces of allergens or cross-contamination")
    private String traces;

    @JsonProperty("traces_from_ingredients")
    @Schema(description = "Traces from ingredients potentially causing allergies or intolerances")
    private String tracesFromIngredients;

    @JsonProperty("traces_hierarchy")
    @Schema(description = "Hierarchy of traces")
    private String[] tracesHierarchy;

    @JsonProperty("traces_debug_tags")
    @Schema(description = "Debug tags for traces")
    private String[] tracesDebugTags;

    @JsonProperty("traces_from_user")
    @Schema(description = "Traces reported by the user")
    private String tracesFromUser;

    @JsonProperty("traces_lc")
    @Schema(description = "Language code for traces")
    private String tracesLc;

    @JsonProperty("traces_tags")
    @Schema(description = "Tags for traces")
    private String[] tracesTags;

    @JsonProperty("unknown_ingredients_n")
    @Schema(description = "Number of unknown ingredients")
    private int unknownIngredientsN;

    @JsonProperty("unknown_nutrients_tags")
    @Schema(description = "Tags for unknown nutrients")
    private String[] unknownNutrientsTags;

    @JsonProperty("update_key")
    @Schema(description = "Key for the last update made to the product")
    private String updateKey;

    @JsonProperty("vitamins_prev_tags")
    @Schema(description = "Previous tags for vitamins")
    private String[] vitaminsPrevTags;

    @JsonProperty("vitamins_tags")
    @Schema(description = "Tags for vitamins")
    private String[] vitaminsTags;

}