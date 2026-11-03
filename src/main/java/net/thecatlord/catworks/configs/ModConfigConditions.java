package net.thecatlord.catworks.configs;

import com.mojang.serialization.MapCodec;
import net.neoforged.neoforge.common.conditions.ICondition;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.thecatlord.catworks.Catworks;

import java.util.function.Supplier;

public class ModConfigConditions {
    public static final DeferredRegister<MapCodec<? extends ICondition>>
            CONDITION_CODECS = DeferredRegister.create(
            NeoForgeRegistries.Keys.CONDITION_CODECS,
            Catworks.MODID
    );

    public static final Supplier<MapCodec<BlazeBurnerConfig>> BLAZE_BURNER =
            CONDITION_CODECS.register(
                    "blaze_burner",
                    () -> BlazeBurnerConfig.CODEC
            );
    public static final Supplier<MapCodec<PrecisionMechanismConfig>> PRECISION_MECHANISM =
            CONDITION_CODECS.register(
                    "precision_mechanism",
                    () -> PrecisionMechanismConfig.CODEC
            );
}