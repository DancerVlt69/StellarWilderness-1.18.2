package net.domakingo.stellarwilderness.item;

import net.domakingo.stellarwilderness.fluid.ModFluids;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static net.domakingo.stellarwilderness.StellarWilderness.MODID;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MODID);

    // codice per aggiungere un oggetto
    public static final RegistryObject<Item> INSTRUCTIONS_LENS = ITEMS.register("instructions_lens",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.STELLAR_TAB)));

    public static final RegistryObject<Item> NEBULOSA_BUCKET = ITEMS.register("nebulosa_bucket",
            () -> new BucketItem(ModFluids.NEBULOSA_FLUID,
                    new Item.Properties().tab(ModCreativeModeTab.STELLAR_TAB).stacksTo(1)));

    public static final RegistryObject<Item> POZIONE_NEBULOSA = ITEMS.register("pozione_nebulosa",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.STELLAR_TAB).stacksTo(2)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
