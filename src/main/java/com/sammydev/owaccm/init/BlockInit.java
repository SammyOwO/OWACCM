package com.sammydev.owaccm.init;

import com.sammydev.owaccm.objects.blocks.BlockBase;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import java.util.ArrayList;
import java.util.List;

public class BlockInit
{
    public static final List<Block> BLOCKS = new ArrayList<Block>();

    public static final Block TEST_BLOCK = new BlockBase("test_block", Material.ROCK);
}
