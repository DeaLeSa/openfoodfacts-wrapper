package fr.dlesaout.openfoodfactswrapper.model.deserializer;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import fr.dlesaout.openfoodfactswrapper.model.*;
import fr.dlesaout.openfoodfactswrapper.util.JsonKeys;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ProductItemDeserializer extends StdDeserializer<ProductItem> {

    protected ProductItemDeserializer() {
        super(ProductItem.class);
    }

    @Override
    public ProductItem deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
        JsonNode node = p.getCodec().readTree(p);

        ProductItem productItem = new ProductItem();
        parseImage(productItem, node);

        productItem.setProductName(getStringValue(node, JsonKeys.PRODUCT_NAME));

        productItem.setIngredients(parseIngredients(node.get(JsonKeys.INGREDIENTS)));
        productItem.setAdditives(parseAdditive(node));
        productItem.setAllergenicSubstances(parseAllergen(node));
        productItem.setNutrients(parseNutrient(node.get(JsonKeys.NUTRIENTS)));
        productItem.setCountries(parseCountry(node));

        return productItem;
    }

    private String getStringValue(JsonNode parentNode, String key) {
        return parentNode.has(key) ? parentNode.get(key).asText() : null;
    }

    private List<String> asStringList(JsonNode arrayNode) {
        List<String> strings = new ArrayList<>();
        if (arrayNode.isArray()) {
            arrayNode.forEach(item -> strings.add(item.asText()));
        }
        return strings;
    }

    private void parseImage(ProductItem productItem, JsonNode node) {
        if (node.has(JsonKeys.SELECTED_IMAGES)) {
            JsonNode selectedImages = node.get(JsonKeys.SELECTED_IMAGES);
            if (selectedImages.has(JsonKeys.FRONT)) {
                JsonNode front = selectedImages.get(JsonKeys.FRONT);
                if (front.has(JsonKeys.DISPLAY)) {
                    JsonNode display = front.get(JsonKeys.DISPLAY);
                    if (display.has(JsonKeys.FR)) {
                        String imageUrl = display.get(JsonKeys.FR).asText();
                        productItem.setImageUrl(imageUrl);
                    }
                }
            }
        }
    }

    private List<Ingredient> parseIngredients(JsonNode ingredientsNode) {
        List<Ingredient> ingredientsList = new ArrayList<>();

        if (ingredientsNode.isArray()) {
            for (JsonNode ingredientNode : ingredientsNode) {
                ingredientsList.add(parseIngredient(ingredientNode));
            }
        }
        return ingredientsList;
    }

    private Ingredient parseIngredient(JsonNode node) {
        Ingredient ingredient = new Ingredient();

        ingredient.setId(node.path("id").asText(null));
        ingredient.setCiqualProxyFoodScore(node.path("ciqual_proxy_food_code").asText(null));
        ingredient.setFromPalmOil(node.path("from_palm_oil").asText(null));
        ingredient.setOrigin(node.path("origin").asText(null));
        ingredient.setPercent(node.path("percent").asDouble(0));
        ingredient.setPercentEstimate(node.path("percent_estimate").asDouble(0));
        ingredient.setPercentMax(node.path("percent_max").asDouble(0));
        ingredient.setPercentMin(node.path("percent_min").asDouble(0));
        ingredient.setText(node.path("text").asText(null));
        ingredient.setVegan(node.path("vegan").asText(null));
        ingredient.setVegetarian(node.path("vegetarian").asText(null));

        if (node.has("ingredients")) {
            ingredient.setIngredients(parseIngredients(node.get("ingredients")));
        }

        return ingredient;
    }

    private Additive parseAdditive(JsonNode additivesNode) {
        Additive additives = new Additive();

        setIfPresent(additivesNode, JsonKeys.ADDITIVES_N, value -> additives.setAdditivesN(value.asInt()));
        setIfPresent(additivesNode, JsonKeys.NEW_ADDITIVES_N, value -> additives.setAdditivesNewN(value.asInt()));
        setIfPresent(additivesNode, JsonKeys.ADDITIVES_OLD_N, value -> additives.setAdditivesOldN(value.asInt()));
        setIfPresent(additivesNode, JsonKeys.ADDITIVES_ORIGINAL_TAGS, value -> additives.setAdditivesOriginalTags(asStringList(value)));
        setIfPresent(additivesNode, JsonKeys.ADDITIVES_OLD_TAGS, value -> additives.setAdditivesOldTags(asStringList(value)));
        setIfPresent(additivesNode, JsonKeys.ADDITIVES_PREV_ORIGINAL_TAGS, value -> additives.setAdditivesPrevOriginalTags(asStringList(value)));
        setIfPresent(additivesNode, JsonKeys.ADDITIVES_DEBUG_TAGS, value -> additives.setAdditivesDebugTags(asStringList(value)));
        setIfPresent(additivesNode, JsonKeys.ADDITIVES_TAGS, value -> additives.setAdditivesTags(asStringList(value)));

        return additives;
    }

    private Allergen parseAllergen(JsonNode allergensNode) {
        Allergen allergens = new Allergen();

        setIfPresent(allergensNode, JsonKeys.TRACES, value -> allergens.setTraces(value.asText()));
        setIfPresent(allergensNode, JsonKeys.ALLERGENS, value -> allergens.setAllergens(value.asText()));
        setIfPresent(allergensNode, JsonKeys.ALLERGENS_FROM_INGREDIENTS, value -> allergens.setAllergensFromIngredients(value.asText()));
        setIfPresent(allergensNode, JsonKeys.ALLERGENS_HIERARCHY, value -> allergens.setAllergensHierarchy(asStringList(value)));
        setIfPresent(allergensNode, JsonKeys.ALLERGENS_LC, value -> allergens.setAllergensLc(value.asText()));
        setIfPresent(allergensNode, JsonKeys.ALLERGENS_TAGS, value -> allergens.setAllergensTags(asStringList(value)));
        return allergens;
    }

    private Nutrient parseNutrient(JsonNode nutrientsNode) {
        Nutrient nutrients = new Nutrient();

        setIfPresent(nutrientsNode, JsonKeys.ALCOHOL, value -> nutrients.setAlcohol(value.asDouble()));
        setIfPresent(nutrientsNode, JsonKeys.ALCOHOL_VALUE, value -> nutrients.setAlcoholValue(value.asDouble()));
        setIfPresent(nutrientsNode, JsonKeys.ALCOHOL_100G, value -> nutrients.setAlcohol100G(value.asDouble()));
        setIfPresent(nutrientsNode, JsonKeys.ALCOHOL_SERVING, value -> nutrients.setAlcoholServing(value.asDouble()));
        setIfPresent(nutrientsNode, JsonKeys.ALCOHOL_UNIT, value -> nutrients.setAlcoholUnit(value.asText()));

        setIfPresent(nutrientsNode, JsonKeys.CARBOHYDRATES, value -> nutrients.setCarbohydrates(value.asDouble()));
        setIfPresent(nutrientsNode, JsonKeys.CARBOHYDRATES_VALUE, value -> nutrients.setCarbohydratesValue(value.asDouble()));
        setIfPresent(nutrientsNode, JsonKeys.CARBOHYDRATES_100G, value -> nutrients.setCarbohydrates100G(value.asDouble()));
        setIfPresent(nutrientsNode, JsonKeys.CARBOHYDRATES_SERVING, value -> nutrients.setCarbohydratesServing(value.asDouble()));
        setIfPresent(nutrientsNode, JsonKeys.CARBOHYDRATES_UNIT, value -> nutrients.setCarbohydratesUnit(value.asText()));

        setIfPresent(nutrientsNode, JsonKeys.ENERGY, value -> nutrients.setEnergy(value.asInt()));
        setIfPresent(nutrientsNode, JsonKeys.ENERGY_KCAL, value -> nutrients.setEnergyKcal(value.asInt()));
        setIfPresent(nutrientsNode, JsonKeys.ENERGY_KCAL_100G, value -> nutrients.setEnergyKcal100g(value.asInt()));
        setIfPresent(nutrientsNode, JsonKeys.ENERGY_KCAL_SERVING, value -> nutrients.setEnergyKcalServing(value.asInt()));
        setIfPresent(nutrientsNode, JsonKeys.ENERGY_KCAL_UNIT, value -> nutrients.setEnergyKcalUnit(value.asText()));
        setIfPresent(nutrientsNode, JsonKeys.ENERGY_KCAL_VALUE, value -> nutrients.setEnergyKcalValue(value.asInt()));
        setIfPresent(nutrientsNode, JsonKeys.ENERGY_KCAL_VALUE_COMPUTED, value -> nutrients.setEnergyKcalValueComputed(value.asDouble()));
        setIfPresent(nutrientsNode, JsonKeys.ENERGY_KJ, value -> nutrients.setEnergyKj(value.asInt()));
        setIfPresent(nutrientsNode, JsonKeys.ENERGY_KJ_100G, value -> nutrients.setEnergyKj100g(value.asInt()));
        setIfPresent(nutrientsNode, JsonKeys.ENERGY_KJ_SERVING, value -> nutrients.setEnergyKjServing(value.asInt()));
        setIfPresent(nutrientsNode, JsonKeys.ENERGY_KJ_UNIT, value -> nutrients.setEnergyKjUnit(value.asText()));
        setIfPresent(nutrientsNode, JsonKeys.ENERGY_KJ_VALUE, value -> nutrients.setEnergyKjValue(value.asInt()));
        setIfPresent(nutrientsNode, JsonKeys.ENERGY_KJ_VALUE_COMPUTED, value -> nutrients.setEnergyKjValueComputed(value.asDouble()));

        setIfPresent(nutrientsNode, JsonKeys.FAT, value -> nutrients.setFat(value.asDouble()));
        setIfPresent(nutrientsNode, JsonKeys.FAT_100G, value -> nutrients.setFat100g(value.asDouble()));
        setIfPresent(nutrientsNode, JsonKeys.FAT_SERVING, value -> nutrients.setFatServing(value.asDouble()));
        setIfPresent(nutrientsNode, JsonKeys.FAT_UNIT, value -> nutrients.setFatUnit(value.asText()));
        setIfPresent(nutrientsNode, JsonKeys.FAT_VALUE, value -> nutrients.setFatValue(value.asDouble()));

        setIfPresent(nutrientsNode, JsonKeys.SATURATED_FAT, value -> nutrients.setSaturatedFat(value.asDouble()));
        setIfPresent(nutrientsNode, JsonKeys.SATURATED_FAT_100G, value -> nutrients.setSaturatedFat100g(value.asDouble()));
        setIfPresent(nutrientsNode, JsonKeys.SATURATED_FAT_SERVING, value -> nutrients.setSaturatedFatServing(value.asDouble()));
        setIfPresent(nutrientsNode, JsonKeys.SATURATED_FAT_UNIT, value -> nutrients.setSaturatedFatUnit(value.asText()));
        setIfPresent(nutrientsNode, JsonKeys.SATURATED_FAT_VALUE, value -> nutrients.setSaturatedFatValue(value.asDouble()));

        setIfPresent(nutrientsNode, JsonKeys.PROTEINS, value -> nutrients.setProteins(value.asDouble()));
        setIfPresent(nutrientsNode, JsonKeys.PROTEINS_100G, value -> nutrients.setProteins100g(value.asDouble()));
        setIfPresent(nutrientsNode, JsonKeys.PROTEINS_SERVING, value -> nutrients.setProteinsServing(value.asDouble()));
        setIfPresent(nutrientsNode, JsonKeys.PROTEINS_UNIT, value -> nutrients.setProteinsUnit(value.asText()));
        setIfPresent(nutrientsNode, JsonKeys.PROTEINS_VALUE, value -> nutrients.setProteinsValue(value.asDouble()));

        setIfPresent(nutrientsNode, JsonKeys.SALT, value -> nutrients.setSalt(value.asDouble()));
        setIfPresent(nutrientsNode, JsonKeys.SALT_100G, value -> nutrients.setSalt100g(value.asDouble()));
        setIfPresent(nutrientsNode, JsonKeys.SALT_SERVING, value -> nutrients.setSaltServing(value.asDouble()));
        setIfPresent(nutrientsNode, JsonKeys.SALT_UNIT, value -> nutrients.setSaltUnit(value.asText()));
        setIfPresent(nutrientsNode, JsonKeys.SALT_VALUE, value -> nutrients.setSaltValue(value.asDouble()));

        setIfPresent(nutrientsNode, JsonKeys.SODIUM, value -> nutrients.setSodium(value.asDouble()));
        setIfPresent(nutrientsNode, JsonKeys.SODIUM_100G, value -> nutrients.setSodium100g(value.asDouble()));
        setIfPresent(nutrientsNode, JsonKeys.SODIUM_SERVING, value -> nutrients.setSodiumServing(value.asDouble()));
        setIfPresent(nutrientsNode, JsonKeys.SODIUM_UNIT, value -> nutrients.setSodiumUnit(value.asText()));
        setIfPresent(nutrientsNode, JsonKeys.SODIUM_VALUE, value -> nutrients.setSodiumValue(value.asDouble()));

        setIfPresent(nutrientsNode, JsonKeys.SUGARS, value -> nutrients.setSugars(value.asDouble()));
        setIfPresent(nutrientsNode, JsonKeys.SUGARS_100G, value -> nutrients.setSugars100g(value.asDouble()));
        setIfPresent(nutrientsNode, JsonKeys.SUGARS_SERVING, value -> nutrients.setSugarsServing(value.asDouble()));
        setIfPresent(nutrientsNode, JsonKeys.SUGARS_UNIT, value -> nutrients.setSugarsUnit(value.asText()));
        setIfPresent(nutrientsNode, JsonKeys.SUGARS_VALUE, value -> nutrients.setSugarsValue(value.asDouble()));

        setIfPresent(nutrientsNode, JsonKeys.NOVA_GROUP, value -> nutrients.setNovaGroup(value.asInt()));
        setIfPresent(nutrientsNode, JsonKeys.NOVA_GROUP_100G, value -> nutrients.setNovaGroup100g(value.asInt()));
        setIfPresent(nutrientsNode, JsonKeys.NOVA_GROUP_SERVING, value -> nutrients.setNovaGroupServing(value.asInt()));

        setIfPresent(nutrientsNode, JsonKeys.NUTRITION_SCORE_FR, value -> nutrients.setNutritionScoreFr(value.asInt()));
        setIfPresent(nutrientsNode, JsonKeys.NUTRITION_SCORE_FR_100G, value -> nutrients.setNutritionScoreFr100g(value.asInt()));

        setIfPresent(nutrientsNode, JsonKeys.FIBER, value -> nutrients.setFiber(value.asDouble()));
        setIfPresent(nutrientsNode, JsonKeys.FIBER_100G, value -> nutrients.setFiber100g(value.asDouble()));
        setIfPresent(nutrientsNode, JsonKeys.FIBER_SERVING, value -> nutrients.setFiberServing(value.asDouble()));
        setIfPresent(nutrientsNode, JsonKeys.FIBER_UNIT, value -> nutrients.setFiberUnit(value.asText()));
        setIfPresent(nutrientsNode, JsonKeys.FIBER_VALUE, value -> nutrients.setFiberValue(value.asDouble()));

        return nutrients;
    }

    private Country parseCountry(JsonNode countriesNode) {
        Country country = new Country();

        setIfPresent(countriesNode, JsonKeys.COUNTRIES, value -> country.setCountries(value.asText()));
        setIfPresent(countriesNode, JsonKeys.COUNTRIES_BEFORE_SCANBOT, value -> country.setCountriesBeforeScanbot(value.asText()));
        setIfPresent(countriesNode, JsonKeys.COUNTRIES_HIERARCHY, value -> country.setCountriesHierarchy(asStringList(value)));
        setIfPresent(countriesNode, JsonKeys.COUNTRIES_LC, value -> country.setCountriesLanguageCode(value.asText()));
        setIfPresent(countriesNode, JsonKeys.COUNTRIES_TAGS, value -> country.setCountriesTags(asStringList(value)));

        return country;
    }

    private void setIfPresent(JsonNode parentNode, String key, Consumer<JsonNode> action) {
        if (parentNode.has(key)) {
            action.accept(parentNode.get(key));
        }
    }


}

