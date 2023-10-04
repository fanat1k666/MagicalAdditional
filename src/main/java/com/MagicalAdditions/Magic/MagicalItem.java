package com.MagicalAdditions.Magic;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class MagicalItem extends Item {

    boolean mode = false;

    public MagicalItem(String name, String texture, int maxStackSize) {
        this.canRepair = false;
        this.setUnlocalizedName(name);
        this.setTextureName(Main.MODID + ":" + texture);
        this.setCreativeTab(Main.tabMagicalThings);
        this.maxStackSize = maxStackSize;
        GameRegistry.registerItem(this, name);
    }
}