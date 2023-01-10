package net.domakingo.stellarwilderness.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab STELLAR_TAB = new CreativeModeTab("stellartab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.INSTRUCTIONS_LENS.get());
        }
    };
}
