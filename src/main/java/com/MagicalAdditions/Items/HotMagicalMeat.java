package com.MagicalAdditions.Items;

import com.MagicalAdditions.Magic.Main;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class HotMagicalMeat extends ItemFood {

    public static void mainRegistry() {
        initializeItem();
    }

    public static Item HotMagicalMeat;

    public  int itemUseDuration;

    @Override
    public int getMaxItemUseDuration(ItemStack p_77626_1_)
    {
        return itemUseDuration;
    }

    public HotMagicalMeat(int Efficiency, int lvl , boolean c, String texture, String name, int maxStackSize) {
        super(Efficiency,c);
        this.itemUseDuration = lvl;
        this.setCreativeTab(Main.tabMagicalThings);
        this.setTextureName(Main.MODID + ":" + texture);
        this.setUnlocalizedName(name);
        this.maxStackSize = maxStackSize;
        GameRegistry.registerItem(this, name);
    }

    public static void initializeItem() {
        HotMagicalMeat = new HotMagicalMeat(6, 24, false, "hotmeat", "hotmeat", 64);
    }

}

