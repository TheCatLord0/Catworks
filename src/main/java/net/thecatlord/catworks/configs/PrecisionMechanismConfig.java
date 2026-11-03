package net.thecatlord.catworks.configs;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.neoforged.neoforge.common.conditions.ICondition;
import net.thecatlord.catworks.CatworksConfig;

public record PrecisionMechanismConfig(boolean enabled) implements ICondition {
    public static final MapCodec<PrecisionMechanismConfig> CODEC =
            RecordCodecBuilder.mapCodec(instance ->
                    instance.group(
                            Codec.BOOL.fieldOf("enabled")
                                    .forGetter(PrecisionMechanismConfig::enabled)
                    ).apply(instance, PrecisionMechanismConfig::new)
            );

    @Override
    public boolean test(IContext context) {
        return CatworksConfig.precisionMechanismRecipe.get() == enabled;
    }

    @Override
    public MapCodec<? extends ICondition> codec() {
        return CODEC;
    }
}
