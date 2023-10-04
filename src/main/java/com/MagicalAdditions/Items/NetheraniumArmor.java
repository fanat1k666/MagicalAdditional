package com.MagicalAdditions.Items;

import com.MagicalAdditions.Magic.MagicalArmor;
import com.MagicalAdditions.Magic.Main;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;


public class NetheraniumArmor extends ItemArmor {
    public NetheraniumArmor (ArmorMaterial x, int y, int z){
        super(x,y,z);
    }

    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {

        if (stack.getItem() == MagicalArmor.NetheraniumHelmet || stack.getItem() == MagicalArmor.NetheraniumChestplate || stack.getItem() == MagicalArmor.NetheraniumBoots) {
            return Main.MODID + ":textures/model/armor/netheranium_layer_1.png";
        } else if (stack.getItem() == MagicalArmor.NetheraniumBoots || stack.getItem() == MagicalArmor.NetheraniumLeggings) {
            return Main.MODID + ":textures/model/armor/netheranium_layer_2.png";
        } else {
            return null;
        }
    }

    public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {

        if (this.armorType == 0) {
            ItemStack body = player.getCurrentArmor(2);
            ItemStack legs = player.getCurrentArmor(1);
            ItemStack feet = player.getCurrentArmor(0);
            if (legs != null && legs.getItem() == MagicalArmor.NetheraniumLeggings && feet != null && feet.getItem() == MagicalArmor.NetheraniumBoots && body != null && body.getItem() == MagicalArmor.NetheraniumChestplate) {
                player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 20));
            }
        }
    }
}

