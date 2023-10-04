package com.MagicalAdditions.Items;

import com.MagicalAdditions.Magic.MagicalArmor;
import com.MagicalAdditions.Magic.Main;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;


public class AtiumArmor extends ItemArmor {
    public AtiumArmor (ArmorMaterial x, int y, int z){
        super(x,y,z);
    }

    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {

        if (stack.getItem() == MagicalArmor.AtiumHelmet || stack.getItem() == MagicalArmor.AtiumChestplate || stack.getItem() == MagicalArmor.AtiumBoots) {
            return Main.MODID + ":textures/model/armor/atium_layer_1.png";
        } else if (stack.getItem() == MagicalArmor.AtiumBoots || stack.getItem() == MagicalArmor.AtiumLeggings) {
            return Main.MODID + ":textures/model/armor/atium_layer_2.png";
        } else {
            return null;
        }
    }
}
