package com.ironproject.tutorialmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab TUTORIAL_TAB = new CreativeModeTab("tutorialtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.ZIRCON.get());
        }
    };    public static final CreativeModeTab OWPOW_TAB = new CreativeModeTab("owpowtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.OWPOW_GEMS.get());
        }
    };
}
