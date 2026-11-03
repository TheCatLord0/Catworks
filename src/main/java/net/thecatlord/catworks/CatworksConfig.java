package net.thecatlord.catworks;

import net.neoforged.neoforge.common.ModConfigSpec;

public class CatworksConfig {
    private static final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();

    public static final ModConfigSpec.BooleanValue blazeBurnerRecipe = BUILDER
            .translation("Blaze Burner Recipe")
            .comment("Should Blaze Burner duplication be enabled?")
            .define("blaze_burner_recipe", true);
    public static final ModConfigSpec.BooleanValue precisionMechanismRecipe = BUILDER
            .translation("Replace Precision Mechanism Recipe")
            .comment("Should the base Precision Mechanism recipe be replaced?")
            .define("precision_mechanism_replace", false);


    static final ModConfigSpec SPEC = BUILDER.build();
}
