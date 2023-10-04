package com.MagicalAdditions.Magic;

import com.MagicalAdditions.Items.*;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

@Mod(modid = Main.MODID, name = Main.MODNAME, version = Main.VERSION)

public class Main {

    @SidedProxy(clientSide = Main.CLIENTSIDE, serverSide = Main.SERVERSIDE)
    public static ServerProxy proxy;

    public static final CreativeTabs tabMagicalThings = new CreativeTabs("magicaladditions") {
        public Item getTabIconItem() {
            return MagicalCompass;
        }
    };

    public static final String MODID = "magicaladditions";
    public static final String MODNAME = "Magical Additions";
    public static final String VERSION = "1.0";
    public static final String CLIENTSIDE = "com.MagicalAdditions.Magic.ClientProxy";
    public static final String SERVERSIDE = "com.MagicalAdditions.Magic.ServerProxy";

    public static WorldGen WorldGen = new WorldGen();

    public static Block AtiumOre;
    public static Block NetheraniumOre;
    public static Block QuadiumOre;
    public static Block Animationpic;
    public static Block MagicRubyOre;
    public static Block DilithiumOre;

    public static Item Atium;
    public static Item Netheranium;
    public static Item Quadium;
    public static Item MagicalCompass;
    public static Item MagicRuby;
    public static Item Dilithium;

    public static Item Rune1;
    public static Item Rune2;
    public static Item Rune3;
    public static Item Rune4;
    public static Item Rune5;
    public static Item Rune6;
    public static Item Rune7;
    public static Item Rune8;
    public static Item Rune9;
    public static Item Rune10;
    public static Item Alchemyore;
    public static Item Alchemystone;

    @Mod.EventHandler
    public void preLoad(FMLPreInitializationEvent event) {

        proxy.registerRenderInfo();
        Rune1 = new MagicalItem("rune1", "rune1", 1);
        Rune2 = new MagicalItem("rune2", "rune2", 1);
        Rune3 = new MagicalItem("rune3", "rune3", 1);
        Rune4 = new MagicalItem("rune4", "rune4", 1);
        Rune5 = new MagicalItem("rune5", "rune5", 1);
        Rune6 = new MagicalItem("rune6", "rune6", 1);
        Rune7 = new MagicalItem("rune7", "rune7", 1);
        Rune8 = new MagicalItem("rune8", "rune8", 1);
        Rune9 = new MagicalItem("rune9", "rune9", 1);
        Rune10 = new MagicalItem("rune10", "rune10", 1);
        Alchemyore = new MagicalItem("alchemyore", "alchemyore", 1);
        Alchemystone = new MagicalItem("alchemystone", "alchemystone", 1).setMaxDamage(13000);
        NetheraniumOre = new MagicalBlock(Material.rock, "netheraniumore", "netheraniumore");
        QuadiumOre = new MagicalBlock(Material.rock, "quadiumore", "quadiumore");
        AtiumOre = new MagicalBlock(Material.rock, "atiumore", "atiumore");
        DilithiumOre = new MagicalBlock(Material.rock, "dilithiumore", "dilithiumore");
        MagicRubyOre = new MagicalBlock(Material.rock,"rubyore","rubyore");
        Atium = new MagicalItem("atium", "atium", 64);
        Netheranium = new MagicalItem("netheranium", "netheranium", 64);
        Quadium = new MagicalItem("quadium", "quadium", 64);
        Animationpic = new MagicalBlock(Material.wood, "Flex",  "animation");
        MagicalCompass = new MagicalItem("magicalcompass", "compass", 1);
        MagicRuby = new MagicalItem("ruby","ruby",64);
        Dilithium = new MagicalItem("dilithium","dilithium",64);

        MagicalTools.mainRegistry();
        MagicalArmor.mainRegistry();
        MagicalMeat.mainRegistry();
        HotMagicalMeat.mainRegistry();
        AerMagicalMeat.mainRegistry();
        AquaMagicalMeat.mainRegistry();
        OrdoMagicalMeat.mainRegistry();
        IgnisMagicalMeat.mainRegistry();
        TerraMagicalMeat.mainRegistry();
        PerditioMagicalMeat.mainRegistry();

    }


    @Mod.EventHandler
    public void Init(FMLPostInitializationEvent event) {
        Recipes.addRecipes();
    }
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        GameRegistry.registerWorldGenerator(WorldGen, 0);
    }

}
