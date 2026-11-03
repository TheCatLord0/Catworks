package net.thecatlord.catworks;

import com.mojang.logging.LogUtils;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.thecatlord.catworks.configs.ModConfigConditions;
import org.slf4j.Logger;

@Mod(Catworks.MODID)
public class Catworks {
    public static final String MODID = "catworks";
    public static final Logger LOGGER = LogUtils.getLogger();

    public Catworks(IEventBus modEventBus, ModContainer modContainer) {
        modContainer.registerConfig(ModConfig.Type.COMMON, CatworksConfig.SPEC);
        ModConfigConditions.CONDITION_CODECS.register(modEventBus);
    }
}
