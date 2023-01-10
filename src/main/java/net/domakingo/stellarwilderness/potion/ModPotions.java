package net.domakingo.stellarwilderness.potion;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static net.domakingo.stellarwilderness.StellarWilderness.MODID;

public class ModPotions {
    public static final DeferredRegister<Potion> POTIONS
            = DeferredRegister.create(ForgeRegistries.POTIONS, MODID);


    // per crearne di nuove
    public static final RegistryObject<Potion> POZIONE_NEBULOSA = POTIONS.register("pozione_nebulosa",
            () -> new Potion(new MobEffectInstance(MobEffects.CONFUSION, 200, 0)));

    public static void register(IEventBus eventBus) {
        POTIONS.register(eventBus);
    }
}
