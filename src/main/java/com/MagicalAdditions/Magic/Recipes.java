package com.MagicalAdditions.Magic;

import com.MagicalAdditions.Items.*;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;

public class Recipes {

    public static void addRecipes() {

        GameRegistry.addSmelting(Main.AtiumOre, new ItemStack(Main.Atium), 0.75F);
        GameRegistry.addSmelting(Main.NetheraniumOre, new ItemStack(Main.Netheranium), 0.75F);
        GameRegistry.addSmelting(Main.QuadiumOre, new ItemStack(Main.Quadium), 0.75F);
        GameRegistry.addSmelting(MagicalMeat.MagicalMeat, new ItemStack(HotMagicalMeat.HotMagicalMeat), 0.25F);

    }
}
