package com.Azio.Mod_AZI.blocks;

import com.Azio.Mod_AZI.init.ModBlocks;
import com.Azio.Mod_AZI.init.ModItems;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;

/**
 * Created by Azio on 2018-07-22.
 */
public class CreatorBlock extends BlockBase {

    public CreatorBlock(String name, Material material) {

        super(name, material);
        setSoundType(SoundType.METAL);
        setHardness(4.0F);
        setResistance(1000F);
        setHarvestLevel("pickaxe", 3);
        setLightLevel(20.0F);

    }
}
















