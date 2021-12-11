package com.apb718.firstMod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class QuarterBlock extends Block {
    public QuarterBlock() {
        super(Block.Properties.create(Material.IRON)
                .hardnessAndResistance(3.0f,6.0f)
                .sound(SoundType.ANVIL)
                .harvestLevel(0) // -1 - unbreakable, 0 - wood, 1- stone/gold, 2-iron, 3 - diamond
                .harvestTool(ToolType.PICKAXE));
    }
}
