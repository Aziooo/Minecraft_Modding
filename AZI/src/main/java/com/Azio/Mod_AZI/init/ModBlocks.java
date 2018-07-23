package com.Azio.Mod_AZI.init;
import java.util.ArrayList;
import java.util.List;

import com.Azio.Mod_AZI.blocks.BlockBase;
import com.Azio.Mod_AZI.blocks.CreatorBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 * Created by Azio on 2018-07-22.
 */
public class ModBlocks {
    public static final List<Block> BLOCKS = new ArrayList<Block>();
    public static final Block CREATOR_BLOCK = new CreatorBlock("creator_block", Material.IRON);
}
