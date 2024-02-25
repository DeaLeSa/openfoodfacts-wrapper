package fr.dlesaout.openfoodfactswrapper.model;

import com.fasterxml.jackson.annotation.*;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@Getter
@Setter
@NoArgsConstructor
@JsonTypeName("Product")
@Schema(name = "Product", description = "Represents a product with detailed information.")
public class ProductItem {

    @Schema(description = "Image of the product")
    private Image image;

    @Schema(description = "List of ingredients in the product")
    private List<Ingredient> ingredients;

    @Schema(description = "List of nutriments in the product")
    private Nutriment nutriments;

    @JsonProperty("languagesCodes")
    @Schema(description = "Language codes available for the product")
    private LanguageCode languageCode;

    @JsonProperty("nutrientLevels")
    @Schema(description = "Nutrient levels of the product")
    private NutrientLevel nutrientLevels;

    @Schema(description = "Nutritional information of the product")
    private List<Nutriment> nutriment;

    @JsonProperty("selectedImages")
    @Schema(description = "Selected images of the product")
    private SelectedImage selectedImages;

    @Schema(description = "Sources of the product information")
    private Source[] sources;

    @JsonProperty("additives")
    @Schema(description = "Additives")
    private Additive additive;

    @JsonIgnore
    @Schema(description = "Number of additives")
    private int additivesN;

    @JsonIgnore
    @Schema(description = "Old number of additives")
    private int additivesOldN;

    @JsonIgnore
    @Schema(description = "Original tags for additives")
    private String[] additivesOriginalTags;

    @JsonIgnore
    @Schema(description = "Old tags for additives")
    private String[] additivesOldTags;

    @JsonIgnore
    @Schema(description = "Previous original tags for additives")
    private String[] additivesPrevOriginalTags;

    @JsonIgnore
    @Schema(description = "Debug tags for additives")
    private String[] additivesDebugTags;

    @JsonIgnore
    @Schema(description = "Tags for additives")
    private String[] additivesTags;

    @JsonProperty("allergenicSubstances")
    @Schema(description = "Allergens present in the product")
    private Allergen allergen;

    @JsonIgnore
    @Schema(description = "Allergens present in the product")
    private String allergens;

    @JsonIgnore
    @Schema(description = "Allergens from ingredients")
    private String allergensFromIngredients;

    @JsonIgnore
    @Schema(description = "Allergens reported by the user")
    private String allergensFromUser;

    @JsonIgnore
    @Schema(description = "Hierarchy of allergens")
    private String[] allergensHierarchy;

    @JsonIgnore
    @Schema(description = "Language code for allergens information")
    private String allergensLc;

    @JsonIgnore
    @Schema(description = "Tags for allergens")
    private String[] allergensTags;

    @JsonProperty("countries")
    @Schema(description = "Countries where the product is available")
    private String countries;

    @JsonProperty("countriesHierarchy")
    @Schema(description = "Hierarchy of countries for the product")
    private String[] countriesHierarchy;

    @JsonProperty("countriesLc")
    @Schema(description = "Language code for countries information")
    private String countriesLc;

    @JsonProperty("countriesTags")
    @Schema(description = "Tags for countries")
    private String[] countriesTags;

    @JsonProperty("createdT")
    @Schema(description = "Timestamp of product creation")
    private long createdT;

    @JsonProperty("creator")
    @Schema(description = "Creator of the product entry")
    private String creator;

    @JsonProperty("embCodes")
    @Schema(description = "Emb codes of the product")
    private String embCodes;

    @JsonProperty("embCodesOrig")
    @Schema(description = "Original emb codes of the product")
    private String embCodesOrig;

    @JsonProperty("embCodesTags")
    @Schema(description = "Tags for the emb codes")
    private String[] embCodesTags;

    @JsonProperty("expirationDate")
    @Schema(description = "Expiration date of the product")
    private String expirationDate;

    @JsonProperty("fruitsVegetablesNuts100GEstimate")
    @Schema(description = "Estimate of fruits, vegetables, and nuts per 100g")
    private int fruitsVegetablesNuts100GEstimate;

    @JsonProperty("genericName")
    @Schema(description = "Generic name of the product")
    private String genericName;

    @JsonProperty("id")
    @Schema(description = "Unique identifier for the product")
    private String id;

    @JsonProperty("altId")
    @Schema(description = "Alternate unique identifier for the product")
    private String _id;

    @JsonProperty("ingredientsFromOrThatMayBeFromPalmOilN")
    @Schema(description = "Number of ingredients that are or may be from palm oil")
    private int ingredientsFromOrThatMayBeFromPalmOilN;

    @JsonProperty("ingredientsFromPalmOilTags")
    @Schema(description = "Tags for ingredients from palm oil")
    private String[] ingredientsFromPalmOilTags;

    @JsonProperty("ingredientsFromPalmOilN")
    @Schema(description = "Number of ingredients from palm oil")
    private int ingredientsFromPalmOilN;

    @JsonProperty("ingredientsHierarchy")
    @Schema(description = "Hierarchy of ingredients")
    private String[] ingredientsHierarchy;

    @JsonProperty("ingredientsN")
    @Schema(description = "Number of ingredients")
    private int ingredientsN;

    @JsonProperty("ingredientsNTags")
    @Schema(description = "Tags related to the number of ingredients")
    private String[] ingredientsNTags;

    @JsonProperty("ingredients_original_tags")
    @Schema(description = "Original tags for ingredients")
    private String[] ingredientsOriginalTags;

    @JsonProperty("ingredientsTags")
    @Schema(description = "Tags for ingredients")
    private String[] ingredientsTags;

    @JsonProperty("ingredientsText")
    @Schema(description = "Debug text for ingredients")
    private String ingredientsTextDebug;

    @JsonProperty("ingredientsThatMayBeFromPalmOilN")
    @Schema(description = "Number of ingredients that may be from palm oil")
    private int ingredientsThatMayBeFromPalmOilN;

    @JsonProperty("ingredientsThatMayBeFromPalmOilTags")
    @Schema(description = "Tags for ingredients that may be from palm oil")
    private String[] ingredientsThatMayBeFromPalmOilTags;

    @JsonProperty("keywords")
    @Schema(description = "Keywords associated with the product")
    private String[] keywords;

    @JsonProperty("knownIngredientsN")
    @Schema(description = "Number of known ingredients in the product")
    private int knownIngredientsN;

    @JsonProperty("labels")
    @Schema(description = "Labels of the product")
    private String labels;

    @JsonProperty("labelsHierarchy")
    @Schema(description = "Hierarchy of labels associated with the product")
    private String[] labelsHierarchy;

    @JsonProperty("labelsLc")
    @Schema(description = "Language code for labels")
    private String labelsLc;

    @JsonProperty("labelsPrevHierarchy")
    @Schema(description = "Previous hierarchy of labels associated with the product")
    private String[] labelsPrevHierarchy;

    @JsonProperty("labelsPrevTags")
    @Schema(description = "Previous tags of labels associated with the product")
    private String[] labelsPrevTags;

    @JsonProperty("labelsTags")
    @Schema(description = "Tags of labels associated with the product")
    private String[] labelsTags;

    @JsonProperty("languages")
    @Schema(description = "Language of the product")
    private String lang;

    @JsonProperty("languagesHierarchy")
    @Schema(description = "Hierarchy of languages available for the product")
    private String[] languagesHierarchy;

    @JsonProperty("languagesTags")
    @Schema(description = "Tags for languages available for the product")
    private String[] languagesTags;

    @JsonProperty("lastEditDatesTags")
    @Schema(description = "Tags for the last edit dates")
    private String[] lastEditDatesTags;

    @JsonProperty("lastImageDatesTags")
    @Schema(description = "Tags for the dates of the last images uploaded")
    private String[] lastImageDatesTags;

    @JsonProperty("lastImageT")
    @Schema(description = "Timestamp for the last image uploaded")
    private long lastImageT;

    @JsonProperty("languageCode")
    @Schema(description = "Language code")
    private String lc;

    @JsonProperty("link")
    @Schema(description = "Link to the product page")
    private String link;

    @JsonProperty("linkDebugTags")
    @Schema(description = "Debug tags for link")
    private String[] linkDebugTags;

    @JsonProperty("manufacturingPlaces")
    @Schema(description = "Places where the product was manufactured")
    private String manufacturingPlaces;

    @JsonProperty("manufacturingPlacesDebugTags")
    @Schema(description = "Debug tags for manufacturing places")
    private String[] manufacturingPlacesDebugTags;

    @JsonProperty("manufacturingPlacesTags")
    @Schema(description = "Tags for manufacturing places")
    private String[] manufacturingPlacesTags;

    @JsonProperty("maxImgid")
    @Schema(description = "Maximum image ID of the product")
    private String maxImgid;

    @JsonProperty("mineralsPrevTags")
    @Schema(description = "Previous tags for minerals")
    private String[] mineralsPrevTags;

    @JsonProperty("mineralsTags")
    @Schema(description = "Tags for minerals")
    private String[] mineralsTags;

    @JsonProperty("miscTags")
    @Schema(description = "Miscellaneous tags")
    private String[] miscTags;

    @JsonProperty("netWeightUnit")
    @Schema(description = "Unit of the net weight")
    private String netWeightUnit;

    @JsonProperty("netWeightValue")
    @Schema(description = "Value of the net weight")
    private String netWeightValue;

    @JsonProperty("nutritionDataPer")
    @Schema(description = "Basis of the nutrition data (e.g., 'per serving', 'per 100g')")
    private String nutritionDataPer;

    @JsonProperty("nutritionScoreWarningNoFruitsVegetablesNuts")
    @Schema(description = "Nutrition score warning regarding the absence of fruits, vegetables, and nuts")
    private int nutritionScoreWarningNoFruitsVegetablesNuts;

    @JsonProperty("noNutritionData")
    @Schema(description = "Indicator if there is no nutrition data")
    private String noNutritionData;

    @JsonProperty("novaGroup")
    @Schema(description = "NOVA group for the product")
    private String novaGroup;

    @JsonProperty("novaGroups")
    @Schema(description = "NOVA groups for the product")
    private String novaGroups;

    @JsonProperty("novaGroupDebug")
    @Schema(description = "Debug information for NOVA group")
    private String novaGroupDebug;

    @JsonProperty("novaGroupTags")
    @Schema(description = "Tags for NOVA group")
    private String[] novaGroupTags;

    @JsonProperty("novaGroupsTags")
    @Schema(description = "Tags for NOVA groups")
    private String[] novaGroupsTags;

    @JsonProperty("nucleotidesPrevTags")
    @Schema(description = "Previous tags for nucleotides")
    private String[] nucleotidesPrevTags;

    @JsonProperty("nucleotidesTags")
    @Schema(description = "Tags for nucleotides")
    private String[] nucleotidesTags;

    @JsonProperty("nutrientLevelsTags")
    @Schema(description = "Tags for nutrient levels")
    private String[] nutrientLevelsTags;

    @JsonProperty("nutritionData")
    @Schema(description = "Nutrition data for the product")
    private String nutritionData;

    @JsonProperty("nutritionDataPerDebugTags")
    @Schema(description = "Debug tags for nutrition data per unit")
    private String[] nutritionDataPerDebugTags;

    @JsonProperty("nutritionDataPrepared")
    @Schema(description = "Nutrition data for the prepared product")
    private String nutritionDataPrepared;

    @JsonProperty("nutritionDataPreparedPer")
    @Schema(description = "Basis of the prepared nutrition data")
    private String nutritionDataPreparedPer;

    @JsonProperty("nutritionGrades")
    @Schema(description = "Nutrition grades for the product")
    private String nutritionGrades;

    @JsonProperty("nutritionScoreBeverage")
    @Schema(description = "Nutrition score for beverages")
    private int nutritionScoreBeverage;

    @JsonProperty("nutritionScoreDebug")
    @Schema(description = "Debug information for nutrition score")
    private String nutritionScoreDebug;

    @JsonProperty("nutritionScoreWarningNoFiber")
    @Schema(description = "Nutrition score warning for no fiber")
    private int nutritionScoreWarningNoFiber;

    @JsonProperty("nutritionGradesTags")
    @Schema(description = "Tags for nutrition grades")
    private String[] nutritionGradesTags;

    @JsonProperty("origins")
    @Schema(description = "Origins of the product")
    private String origins;

    @JsonProperty("originsDebugTags")
    @Schema(description = "Debug tags for origins")
    private String[] originsDebugTags;

    @JsonProperty("originsTags")
    @Schema(description = "Tags for origins")
    private String[] originsTags;

    @JsonProperty("otherInformation")
    @Schema(description = "Other information about the product")
    private String otherInformation;

    @JsonProperty("otherNutritionalSubstancesTags")
    @Schema(description = "Tags for other nutritional substances")
    private String[] otherNutritionalSubstancesTags;

    @JsonProperty("packaging")
    @Schema(description = "Packaging of the product")
    private String packaging;

    @JsonProperty("popularityKey")
    @Schema(description = "Key indicating the product's popularity")
    private long popularityKey;

    @JsonProperty("producerVersionId")
    @Schema(description = "ID of the producer version")
    private String producerVersionId;

    @JsonProperty("productName")
    @Schema(description = "Name of the product")
    private String productName;

    @JsonProperty("productQuantity")
    @Schema(description = "Quantity of the product")
    private String productQuantity;

    @JsonProperty("purchasePlaces")
    @Schema(description = "Places where the product can be purchased")
    private String purchasePlaces;

    @JsonProperty("purchasePlacesDebugTags")
    @Schema(description = "Debug tags for purchase places")
    private String[] purchasePlacesDebugTags;

    @JsonProperty("purchasePlacesTags")
    @Schema(description = "Tags for purchase places")
    private String[] purchasePlacesTags;

    @JsonProperty("qualityTags")
    @Schema(description = "Tags related to the product's quality")
    private String[] qualityTags;

    @JsonProperty("quantity")
    @Schema(description = "Quantity of the product")
    private String quantity;

    @JsonProperty("quantityDebugTags")
    @Schema(description = "Debug tags for the product quantity")
    private String[] quantityDebugTags;

    @JsonProperty("recyclingInstructionsToDiscard")
    @Schema(description = "Instructions for discarding packaging for recycling purposes")
    private String recyclingInstructionsToDiscard;

    @JsonProperty("rev")
    @Schema(description = "Revision number of the product entry")
    private int rev;

    @JsonProperty("servingQuantity")
    @Schema(description = "Quantity per serving of the product")
    private String servingQuantity;

    @JsonProperty("servingSize")
    @Schema(description = "Size of a single serving of the product")
    private String servingSize;

    @JsonProperty("servingSizeDebugTags")
    @Schema(description = "Debug tags for serving size")
    private String[] servingSizeDebugTags;

    @JsonProperty("sortKey")
    @Schema(description = "Sorting key for the product")
    private long sortKey;

    @JsonProperty("states")
    @Schema(description = "States of the product in the production chain")
    private String states;

    @JsonProperty("statesHierarchy")
    @Schema(description = "Hierarchy of states the product goes through")
    private String[] statesHierarchy;

    @JsonProperty("statesTags")
    @Schema(description = "Tags for the product states")
    private String[] statesTags;

    @JsonProperty("stores")
    @Schema(description = "Stores where the product is available")
    private String stores;

    @JsonProperty("storesDebugTags")
    @Schema(description = "Debug tags for stores")
    private String[] storesDebugTags;

    @JsonProperty("storesTags")
    @Schema(description = "Tags for stores selling the product")
    private String[] storesTags;

    @JsonProperty("traces")
    @Schema(description = "Traces of allergens or cross-contamination")
    private String traces;

    @JsonProperty("tracesFromIngredients")
    @Schema(description = "Traces from ingredients potentially causing allergies or intolerances")
    private String tracesFromIngredients;

    @JsonProperty("tracesHierarchy")
    @Schema(description = "Hierarchy of traces")
    private String[] tracesHierarchy;

    @JsonProperty("tracesDebugTags")
    @Schema(description = "Debug tags for traces")
    private String[] tracesDebugTags;

    @JsonProperty("tracesFromUser")
    @Schema(description = "Traces reported by the user")
    private String tracesFromUser;

    @JsonProperty("tracesLc")
    @Schema(description = "Language code for traces")
    private String tracesLc;

    @JsonProperty("tracesTags")
    @Schema(description = "Tags for traces")
    private String[] tracesTags;

    @JsonProperty("unknownIngredientsN")
    @Schema(description = "Number of unknown ingredients")
    private int unknownIngredientsN;

    @JsonProperty("unknownNutrientsTags")
    @Schema(description = "Tags for unknown nutrients")
    private String[] unknownNutrientsTags;

    @JsonProperty("updateKey")
    @Schema(description = "Key for the last update made to the product")
    private String updateKey;

    @JsonProperty("vitaminsPrevTags")
    @Schema(description = "Previous tags for vitamins")
    private String[] vitaminsPrevTags;

    @JsonProperty("vitaminsTags")
    @Schema(description = "Tags for vitamins")
    private String[] vitaminsTags;

    @JsonProperty("additives")
    public void setAdditives(Additive additive) {
        this.additive = new Additive(
                additivesN,
                additivesOldN,
                additivesOriginalTags,
                additivesOldTags,
                additivesPrevOriginalTags,
                additivesDebugTags,
                additivesTags
        );
    }

    @JsonProperty("allergens")
    public void setAllergens(Allergen allergen) {
        this.allergen = new Allergen(
                traces,
                allergens,
                allergensFromIngredients,
                allergensFromUser,
                allergensHierarchy,
                allergensLc,
                allergensTags
        );
    }

}