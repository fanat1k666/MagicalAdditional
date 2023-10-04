package com.MagicalAdditions.Magic;

import com.MagicalAdditions.Items.AtiumArmor;
import com.MagicalAdditions.Items.NetheraniumArmor;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

public class MagicalArmor {
    public static void mainRegistry() {
        initializeItem();
        regestryItem();
    }

    public static ItemArmor.ArmorMaterial atiumA= EnumHelper.addArmorMaterial("atiumA", 2500, new int []{5,7,6,4},30);
    public static ItemArmor.ArmorMaterial netheraniumA= EnumHelper.addArmorMaterial("netheraniumA", 1500, new int []{4,6,5,3},22);

    public static Item AtiumHelmet;
    public static Item AtiumChestplate;
    public static Item AtiumLeggings;
    public static Item AtiumBoots;

    public static Item NetheraniumHelmet;
    public static Item NetheraniumChestplate;
    public static Item NetheraniumLeggings;
    public static Item NetheraniumBoots;

    public static void initializeItem (){

        AtiumHelmet = new AtiumArmor(atiumA, Main.proxy.addArmor("atiumhelmet"),0).setUnlocalizedName("atiumhelmet").setCreativeTab(Main.tabMagicalThings).setTextureName(Main.MODID + ":atium_helmet");
        AtiumChestplate = new  AtiumArmor(atiumA, Main.proxy.addArmor("atiumchestplate"),1).setUnlocalizedName("atiumchestplate").setCreativeTab(Main.tabMagicalThings).setTextureName(Main.MODID + ":atium_сhestplate");
        AtiumLeggings = new  AtiumArmor(atiumA, Main.proxy.addArmor("atiumleggings"),2).setUnlocalizedName("atiumleggings").setCreativeTab(Main.tabMagicalThings).setTextureName(Main.MODID + ":atium_leggings");
        AtiumBoots = new  AtiumArmor(atiumA, Main.proxy.addArmor("atiumboots"),3).setUnlocalizedName("atiumboots").setCreativeTab(Main.tabMagicalThings).setTextureName(Main.MODID + ":atium_boots");

        NetheraniumHelmet = new NetheraniumArmor(netheraniumA, Main.proxy.addArmor("netheraniumhelmet"),0).setUnlocalizedName("netheraniumhelmet").setCreativeTab(Main.tabMagicalThings).setTextureName(Main.MODID + ":netheraniumhelmet");
        NetheraniumChestplate = new NetheraniumArmor(netheraniumA, Main.proxy.addArmor("netheraniumChestplate"),1).setUnlocalizedName("netheraniumChestplate").setCreativeTab(Main.tabMagicalThings).setTextureName(Main.MODID + ":netheraniumChestplate");
        NetheraniumLeggings = new NetheraniumArmor(netheraniumA, Main.proxy.addArmor("netheraniumLeggings"),2).setUnlocalizedName("netheraniumLeggings").setCreativeTab(Main.tabMagicalThings).setTextureName(Main.MODID + ":netheraniumLeggings");
        NetheraniumBoots = new NetheraniumArmor(netheraniumA, Main.proxy.addArmor("netheraniumboots"),3).setUnlocalizedName("netheraniumboots").setCreativeTab(Main.tabMagicalThings).setTextureName(Main.MODID + ":netheraniumboots");
    }
    public static void regestryItem(){

        GameRegistry.registerItem(AtiumHelmet, AtiumHelmet.getUnlocalizedName());
        GameRegistry.registerItem(AtiumChestplate, AtiumChestplate.getUnlocalizedName());
        GameRegistry.registerItem(AtiumLeggings, AtiumLeggings.getUnlocalizedName());
        GameRegistry.registerItem(AtiumBoots, AtiumBoots.getUnlocalizedName());
        GameRegistry.registerItem(NetheraniumHelmet, NetheraniumHelmet.getUnlocalizedName());
        GameRegistry.registerItem(NetheraniumChestplate, NetheraniumChestplate.getUnlocalizedName());
        GameRegistry.registerItem(NetheraniumLeggings, NetheraniumLeggings.getUnlocalizedName());
        GameRegistry.registerItem(NetheraniumBoots, NetheraniumBoots.getUnlocalizedName());

    }


}
