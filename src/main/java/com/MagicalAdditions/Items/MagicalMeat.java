package com.MagicalAdditions.Items;

import com.MagicalAdditions.Magic.Main;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

public class MagicalMeat extends ItemFood {

    public static void mainRegistry() {
        initializeItem();
    }

    public static Item MagicalMeat;

    public  int itemUseDuration;

    @Override
    public int getMaxItemUseDuration(ItemStack p_77626_1_)
    {
        return itemUseDuration;
    }

    public MagicalMeat(int Efficiency, int lvl , boolean c, String texture, String name, int maxStackSize) {
        super(Efficiency,c);
        this.itemUseDuration = lvl;
        this.setCreativeTab(Main.tabMagicalThings);
        this.setTextureName(Main.MODID + ":" + texture);
        this.setUnlocalizedName(name);
        this.maxStackSize = maxStackSize;
        GameRegistry.registerItem(this, name);
    }

    public static void initializeItem() {
        MagicalMeat = new MagicalMeat(3, 32, false, "meat", "meat", 64);
    }
}

