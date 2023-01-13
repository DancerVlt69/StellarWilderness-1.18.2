package net.domakingo.stellarwilderness.potion;

import net.domakingo.stellarwilderness.StellarWilderness;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModPotions {
    public static final DeferredRegister<Potion> POTIONS
            = DeferredRegister.create(ForgeRegistries.POTIONS, StellarWilderness.MODID);


    // per crearne di nuove
    public static final RegistryObject<Potion> NEBULOSA_POTION = POTIONS.register("sw_potion",
            () -> new Potion(new MobEffectInstance(MobEffects.CONFUSION, 1200, 0, false, true)));


    public static void register(IEventBus eventBus) {

        POTIONS.register(eventBus);
    }
}