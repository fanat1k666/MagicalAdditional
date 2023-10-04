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

public class OrdoMagicalMeat extends ItemFood {

    public static void mainRegistry() {
        initializeItem();
    }

    public static Item OrdoMagicalMeat;

    public  int itemUseDuration;

    @Override
    public int getMaxItemUseDuration(ItemStack p_77626_1_)
    {
        return itemUseDuration;
    }

    public OrdoMagicalMeat (int Efficiency, int lvl ,boolean c, String texture, String name, int maxStackSize) {
        super(Efficiency,c);
        this.itemUseDuration = lvl;
        this.setCreativeTab(Main.tabMagicalThings);
        this.setTextureName(Main.MODID + ":" + texture);
        this.setUnlocalizedName(name);
        this.maxStackSize = maxStackSize;
        GameRegistry.registerItem(this, name);
    }

    public static void initializeItem() {
        OrdoMagicalMeat = new OrdoMagicalMeat(6, 16, false, "ordomeat", "ordomeat", 64).setAlwaysEdible();
    }
    public ItemStack onEaten(ItemStack is, World world, EntityPlayer player) {
        super.onEaten(is, world, player);
        if (!world.isRemote) {
            player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 1200, 1));
            player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 60, 0));
        }
        return is;
    }
}
