package fr.dlesaout.openfoodfactswrapper.model.deserializer;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import fr.dlesaout.openfoodfactswrapper.model.*;
import fr.dlesaout.openfoodfactswrapper.model.ecoscore.*;
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
        parseGeneralInformation(productItem, node);

        productItem.setIngredients(parseIngredients(node.get(JsonKeys.INGREDIENTS)));
        productItem.setAdditives(parseAdditive(node));
        productItem.setAllergenicSubstances(parseAllergen(node));
        productItem.setNutrients(parseNutrient(node.get(JsonKeys.NUTRIENTS)));
        productItem.setCountries(parseCountry(node));
        productItem.setEcoScore(parseEcoScore(node, node.get(JsonKeys.ECOSCORE)));

        return productItem;
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

    private void parseGeneralInformation(ProductItem productItem, JsonNode generalInformationNode) {
        setIfPresent(generalInformationNode, JsonKeys.PRODUCT_NAME, value -> productItem.setProductName(value.asText()));
        setIfPresent(generalInformationNode, JsonKeys.BRANDS, value -> productItem.setBrands(value.asText()));
        setIfPresent(generalInformationNode, JsonKeys.BRANDS_TAGS, value -> productItem.setBrandsTags(asStringList(value)));
        setIfPresent(generalInformationNode, JsonKeys.NUTRISCORE, value -> productItem.setNutriscore(value.asText()));
        setIfPresent(generalInformationNode, JsonKeys.STORES, value -> productItem.setStores(value.asText()));
        setIfPresent(generalInformationNode, JsonKeys.STORES_TAGS, value -> productItem.setStoresTags(asStringList(value)));
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

        ingredient.setId(node.path(JsonKeys.ID).asText(null));
        ingredient.setCiqualProxyFoodScore(node.path(JsonKeys.CIQUAL_PROXY_FOOD_CODE).asText(null));
        ingredient.setFromPalmOil(node.path(JsonKeys.FROM_PALM_OIL).asText(null));
        ingredient.setOrigin(node.path(JsonKeys.ORIGIN).asText(null));
        ingredient.setPercent(node.path(JsonKeys.PERCENT).asDouble(0));
        ingredient.setPercentEstimate(node.path(JsonKeys.PERCENT_ESTIMATE).asDouble(0));
        ingredient.setPercentMax(node.path(JsonKeys.PERCENT_MAX).asDouble(0));
        ingredient.setPercentMin(node.path(JsonKeys.PERCENT_MIN).asDouble(0));
        ingredient.setText(node.path(JsonKeys.TEXT).asText(null));
        ingredient.setVegan(node.path(JsonKeys.VEGAN).asText(null));
        ingredient.setVegetarian(node.path(JsonKeys.VEGETARIAN).asText(null));

        if (node.has(JsonKeys.INGREDIENTS)) {
            ingredient.setIngredients(parseIngredients(node.get(JsonKeys.INGREDIENTS)));
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

    private EcoScore parseEcoScore(JsonNode productItemNode, JsonNode ecoScoreNode) {
        EcoScore ecoScoreData = new EcoScore();
        Adjustment adjustments = new Adjustment();

        setIfPresent(productItemNode, JsonKeys.ECOSCORE_NOT_APPLICABLE_FOR_CATEGORY, value -> ecoScoreData.setEcoScoreNotApplicableForCategory(value.asText()));
        setIfPresent(productItemNode, JsonKeys.ECOSCORE_GRADE, value -> ecoScoreData.setEcoScoreGrade(value.asText()));
        setIfPresent(productItemNode, JsonKeys.ECOSCORE_SCORE, value -> ecoScoreData.setEcoScoreScore(value.asInt()));
        setIfPresent(productItemNode, JsonKeys.ECOSCORE_TAGS, value -> ecoScoreData.setEcoScoreTags(asStringList(value)));

        JsonNode adjustmentsNode = ecoScoreNode.path(JsonKeys.ADJUSTMENTS);

        setIfPresent(adjustmentsNode, JsonKeys.ORIGINS_OF_INGREDIENTS, originsNode -> {
            OriginIngredient origins = new OriginIngredient();
            setIfPresent(originsNode, JsonKeys.EPI_SCORE, value -> origins.setEpiScore(value.asInt()));
            setIfPresent(originsNode, JsonKeys.EPI_VALUE, value -> origins.setEpiValue(value.asInt()));
            setIfPresent(originsNode, JsonKeys.TRANSPORTATION_SCORE, value -> origins.setTransportationScore(value.asInt()));
            setIfPresent(originsNode, JsonKeys.VALUE, value -> origins.setValue(value.asInt()));

            if (originsNode.has(JsonKeys.AGGREGATED_ORIGINS)) {
                List<AggregatedOrigin> aggregatedOrigins = new ArrayList<>();
                originsNode.path(JsonKeys.AGGREGATED_ORIGINS).forEach(itemNode -> {
                    AggregatedOrigin origin = new AggregatedOrigin();
                    setIfPresent(itemNode, JsonKeys.EPI_SCORE, node -> origin.setEpiScore(node.asText()));
                    setIfPresent(itemNode, JsonKeys.ORIGIN, node -> origin.setOrigin(node.asText()));
                    setIfPresent(itemNode, JsonKeys.PERCENT, node -> origin.setPercent(node.asInt()));
                    setIfPresent(itemNode, JsonKeys.TRANSPORTATION_SCORE, node -> origin.setTransportationScore(node.asText()));
                    aggregatedOrigins.add(origin);
                });
                origins.setAggregatedOrigins(aggregatedOrigins);
            }

            adjustments.setOriginsOfIngredients(origins);
        });

        setIfPresent(adjustmentsNode, JsonKeys.PACKAGING, packagingNode -> {
            Packaging packaging = new Packaging();
            setIfPresent(packagingNode, JsonKeys.SCORE, value -> packaging.setPackagingScore(value.asInt()));
            setIfPresent(packagingNode, JsonKeys.VALUE, value -> packaging.setPackagingValue(value.asInt()));
            setIfPresent(packagingNode, JsonKeys.NON_RECYCLABLE_AND_NON_BIODEGRADABLE_MATERIALS, value -> packaging.setNonRecyclableAndNonBiodegradableMaterials(value.asInt()));
            setIfPresent(packagingNode, JsonKeys.WARNING, value -> packaging.setPackagingWarning(value.asText()));

            if (packagingNode.has(JsonKeys.PACKAGINGS)) {
                List<PackagingItem> packagingItems = new ArrayList<>();
                packagingNode.path(JsonKeys.PACKAGINGS).forEach(packagingItemNode -> {
                    PackagingItem item = new PackagingItem();
                    setIfPresent(packagingItemNode, JsonKeys.MATERIAL, value -> item.setMaterial(value.asText()));
                    setIfPresent(packagingItemNode, JsonKeys.ECOSCORE_MATERIAL_SCORE, value -> item.setEcoscoreMaterialScore(value.asInt()));
                    setIfPresent(packagingItemNode, JsonKeys.ECOSCORE_SHAPE_RATIO, value -> item.setEcoscoreShapeRatio(value.asDouble()));
                    setIfPresent(packagingItemNode, JsonKeys.NUMBER_OF_UNITS, value -> item.setNumberOfUnits(value.asInt()));
                    setIfPresent(packagingItemNode, JsonKeys.QUANTITY_PER_UNIT, value -> item.setQuantityPerUnit(value.asText()));
                    setIfPresent(packagingItemNode, JsonKeys.SHAPE, value -> item.setShape(value.asText()));
                    setIfPresent(packagingItemNode, JsonKeys.WEIGHT_MEASURED, value -> item.setWeightMeasured(value.asDouble()));
                    packagingItems.add(item);
                });
                packaging.setPackagings(packagingItems);
            }

            adjustments.setPackaging(packaging);
        });

        setIfPresent(adjustmentsNode, JsonKeys.PRODUCTION_SYSTEM, productionSystemNode -> {
            ProductionSystem productionSystem = new ProductionSystem();
            setIfPresent(productionSystemNode, JsonKeys.LABELS, value -> productionSystem.setLabels(asStringList(value)));
            setIfPresent(productionSystemNode, JsonKeys.VALUE, value -> productionSystem.setValue(value.asInt()));
            setIfPresent(productionSystemNode, JsonKeys.WARNING, value -> productionSystem.setWarning(value.asText()));

            adjustments.setProductionSystem(productionSystem);
        });

        setIfPresent(adjustmentsNode, JsonKeys.THREATENED_SPECIES, threatenedSpecyNode -> {
            ThreatenedSpecy threatenedSpecy = new ThreatenedSpecy();
            setIfPresent(threatenedSpecyNode, JsonKeys.INGREDIENT, value -> threatenedSpecy.setIngredient(value.asText()));
            setIfPresent(threatenedSpecyNode, JsonKeys.VALUE, value -> threatenedSpecy.setValue(value.asInt()));

            adjustments.setThreatenedSpecies(threatenedSpecy);
        });

        ecoScoreData.setAdjustments(adjustments);

        JsonNode agribalyseNode = ecoScoreNode.path(JsonKeys.AGRIBALYSE);

        Agribalyse agribalyse = new Agribalyse();

        setIfPresent(agribalyseNode, JsonKeys.AGRIBALYSE_PROXY_FOOD_CODE, value -> agribalyse.setAgribalyseProxyFoodCode(value.asText()));
        setIfPresent(agribalyseNode, JsonKeys.CO2_AGRICULTURE, value -> agribalyse.setCo2Agriculture(value.asDouble()));
        setIfPresent(agribalyseNode, JsonKeys.CO2_CONSUMPTION, value -> agribalyse.setCo2Consumption(value.asDouble()));
        setIfPresent(agribalyseNode, JsonKeys.CO2_DISTRIBUTION, value -> agribalyse.setCo2Distribution(value.asDouble()));
        setIfPresent(agribalyseNode, JsonKeys.CO2_PACKAGING, value -> agribalyse.setCo2Packaging(value.asDouble()));
        setIfPresent(agribalyseNode, JsonKeys.CO2_PROCESSING, value -> agribalyse.setCo2Processing(value.asDouble()));
        setIfPresent(agribalyseNode, JsonKeys.CO2_TOTAL, value -> agribalyse.setCo2Total(value.asDouble()));
        setIfPresent(agribalyseNode, JsonKeys.CO2_TRANSPORTATION, value -> agribalyse.setCo2Transportation(value.asDouble()));
        setIfPresent(agribalyseNode, JsonKeys.CODE, value -> agribalyse.setCode(value.asText()));
        setIfPresent(agribalyseNode, JsonKeys.DQR, value -> agribalyse.setDqr(value.asText()));
        setIfPresent(agribalyseNode, JsonKeys.EF_AGRICULTURE, value -> agribalyse.setEfAgriculture(value.asDouble()));
        setIfPresent(agribalyseNode, JsonKeys.EF_CONSUMPTION, value -> agribalyse.setEfConsumption(value.asDouble()));
        setIfPresent(agribalyseNode, JsonKeys.EF_DISTRIBUTION, value -> agribalyse.setEfDistribution(value.asDouble()));
        setIfPresent(agribalyseNode, JsonKeys.EF_PACKAGING, value -> agribalyse.setEfPackaging(value.asDouble()));
        setIfPresent(agribalyseNode, JsonKeys.EF_PROCESSING, value -> agribalyse.setEfProcessing(value.asDouble()));
        setIfPresent(agribalyseNode, JsonKeys.EF_TOTAL, value -> agribalyse.setEfTotal(value.asDouble()));
        setIfPresent(agribalyseNode, JsonKeys.EF_TRANSPORTATION, value -> agribalyse.setEfTransportation(value.asDouble()));
        setIfPresent(agribalyseNode, JsonKeys.IS_BEVERAGE, value -> agribalyse.setIsBeverage(value.asInt()));
        setIfPresent(agribalyseNode, JsonKeys.NAME_EN, value -> agribalyse.setNameEn(value.asText()));
        setIfPresent(agribalyseNode, JsonKeys.NAME_FR, value -> agribalyse.setNameFr(value.asText()));
        setIfPresent(agribalyseNode, JsonKeys.SCORE, value -> agribalyse.setScore(value.asInt()));
        setIfPresent(agribalyseNode, JsonKeys.VERSION, value -> agribalyse.setVersion(value.asText()));

        ecoScoreData.setAgribalyse(agribalyse);

        return ecoScoreData;
    }

    private void setIfPresent(JsonNode parentNode, String key, Consumer<JsonNode> action) {
        if (parentNode != null && parentNode.has(key)) {
            action.accept(parentNode.get(key));
        }
    }

    private List<String> asStringList(JsonNode arrayNode) {
        List<String> strings = new ArrayList<>();
        if (arrayNode.isArray()) {
            arrayNode.forEach(item -> strings.add(item.asText()));
        }
        return strings;
    }


}

