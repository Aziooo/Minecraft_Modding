package com.Azio.Mod_AZI.blocks;

import com.Azio.Mod_AZI.Main;
import com.Azio.Mod_AZI.init.ModBlocks;
import com.Azio.Mod_AZI.init.ModItems;
import com.Azio.Mod_AZI.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

/**
 * Created by Azio on 2018-07-22.
 */
public class BlockBase extends Block implements IHasModel{
    public BlockBase(String name, Material material) {
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        ModBlocks.BLOCKS.add(this);
        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));



    }

    @Override
    public void registerModels(){
        Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
    }
}
