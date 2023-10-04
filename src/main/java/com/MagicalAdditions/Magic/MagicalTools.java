package com.MagicalAdditions.Magic;

import com.MagicalAdditions.Items.*;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

public class MagicalTools {

    public static void mainRegistry() {
        initializeItem();
        RegestryItem();
    }

    public static Item.ToolMaterial atiumSword = EnumHelper.addToolMaterial("atium", 3,1500,2.0F,8.0F,30);
    public static Item.ToolMaterial atium = EnumHelper.addToolMaterial("atium", 3,2500,12.0F, 2.0F,30);

    public static Item AtiumSworld;
    public static Item AtiumPick;
    public static Item AtiumAxe;
    public static Item AtiumSpade;
    public static Item AtiumHoe;

    public static void initializeItem() {

        AtiumSworld = new AtiumSworld(atiumSword).setUnlocalizedName("atiumsworld").setCreativeTab(Main.tabMagicalThings).setTextureName(Main.MODID + ":" + "zabuzasword");
        AtiumPick = new AtiumPick(atium).setUnlocalizedName("atiumpick").setCreativeTab(Main.tabMagicalThings).setTextureName(Main.MODID + ":" + "atiumpick");
        AtiumAxe = new AtiumAxe(atium).setUnlocalizedName("atiumaxe").setCreativeTab(Main.tabMagicalThings).setTextureName(Main.MODID + ":" + "atiumaxe");
        AtiumSpade = new AtiumSpade(atium).setUnlocalizedName("atiumdpade").setCreativeTab(Main.tabMagicalThings).setTextureName(Main.MODID + ":" + "atiumspade");
        AtiumHoe = new AtiumHoe(atium).setUnlocalizedName("atiumhoe").setCreativeTab(Main.tabMagicalThings).setTextureName(Main.MODID + ":" + "atiumhoe");
        }

    public static void RegestryItem(){

        GameRegistry.registerItem(AtiumSworld, AtiumSworld.getUnlocalizedName());
        GameRegistry.registerItem(AtiumPick, AtiumPick.getUnlocalizedName());
        GameRegistry.registerItem(AtiumAxe, AtiumAxe.getUnlocalizedName());
        GameRegistry.registerItem(AtiumSpade, AtiumSpade.getUnlocalizedName());
        GameRegistry.registerItem(AtiumHoe, AtiumHoe.getUnlocalizedName());

    }
}
