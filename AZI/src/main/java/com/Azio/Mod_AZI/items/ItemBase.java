package com.Azio.Mod_AZI.items;

import com.Azio.Mod_AZI.Main;
import com.Azio.Mod_AZI.init.ModItems;
import com.Azio.Mod_AZI.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by Azio on 2018-07-21.
 */
public class ItemBase extends Item implements IHasModel{

    public ItemBase(String name) {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.MATERIALS);
        ModItems.ITEMS.add(this);

        System.out.println("====================================================================================================================================");
        System.out.println(this.getRegistryName());
        System.out.println(this.getUnlocalizedName());
        System.out.println("====================================================================================================================================");

    }
    @Override
    public void registerModels(){
        Main.proxy.registerItemRenderer(this, 0, "inventory");
    }

}























