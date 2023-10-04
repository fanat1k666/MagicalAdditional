package com.MagicalAdditions.Magic;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class MagicalBlock extends Block {

    protected MagicalBlock(Material p_i45394_1_, String name, String texture) {
        super(p_i45394_1_);
        this.setBlockName(name);
        this.setLightLevel(0F);//освещение
        this.setLightOpacity(10);//прозрачность
        this.setHardness(5.0F);//Прочность блока
        this.setCreativeTab(Main.tabMagicalThings);//вкладка в гм
        this.setResistance(1000.0F);//Взрывоустойчивость
        this.setHarvestLevel("pickaxe", 3);//Добыча блока инструментом
        this.setStepSound(soundTypeStone);//звук хотьбы по блоку
        this.setBlockTextureName(Main.MODID+":"+texture);
        GameRegistry.registerBlock(this, name);
    }

}
