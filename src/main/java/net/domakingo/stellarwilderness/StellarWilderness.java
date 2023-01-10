package net.domakingo.stellarwilderness;

import net.domakingo.stellarwilderness.block.ModBlocks;
import net.domakingo.stellarwilderness.fluid.ModFluids;
import net.domakingo.stellarwilderness.item.ModItems;
import net.domakingo.stellarwilderness.potion.ModPotions;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(StellarWilderness.MODID)
public class StellarWilderness {
    public static final String MODID = "stellarwilderness";
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();


    public StellarWilderness() {

        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(eventBus);
        ModBlocks.register(eventBus);
        ModFluids.register(eventBus);
        ModPotions.register(eventBus);

        eventBus.addListener(this::setup);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
        // some preinit code
        LOGGER.info("HELLO FROM PREINIT");
        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }
}
