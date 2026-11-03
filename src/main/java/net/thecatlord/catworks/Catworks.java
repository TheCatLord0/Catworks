package net.thecatlord.catworks;

import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.ModContainer;

@Mod(Catworks.MODID)
public class Catworks {
    public static final String MODID = "catworks";
    public static final Logger LOGGER = LogUtils.getLogger();

    public Catworks(IEventBus modEventBus, ModContainer modContainer) {
    }
}
