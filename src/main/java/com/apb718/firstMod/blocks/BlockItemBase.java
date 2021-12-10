package com.apb718.firstMod.blocks;

import com.apb718.firstMod.Tutorial;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class BlockItemBase extends BlockItem {
    public BlockItemBase(Block block) {
        super(block, new Item.Properties().group(Tutorial.TAB));
    }
}
