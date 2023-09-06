package com.sammydev.owaccm.world.gen;

import net.minecraft.block.BlockColored;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

public class ConcreteGenerator implements IWorldGenerator
{
    public ConcreteGenerator()
    {

    }


    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {

    }


    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
    // Generate concrete in the world at a specified rate and height range.
        int chanceToGenerate = 15; // Adjust this value to control the generation frequency.
        int minHeight = 32; // Minimum height for concrete generation.
        int maxHeight = 128; // Maximum height for concrete generation.

        if (random.nextInt(100) < chanceToGenerate) {
            int x = chunkX * 16 + random.nextInt(16);
            int y = minHeight + random.nextInt(maxHeight - minHeight);
            int z = chunkZ * 16 + random.nextInt(16);

            // Randomly choose between white and gray concrete.
            if (random.nextBoolean()) {
                generateConcrete(world, x, y, z, Blocks.CONCRETE.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.WHITE));
            } else {
                generateConcrete(world, x, y, z, Blocks.CONCRETE.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.GRAY));
            }
        }
    }

    private void generateConcrete(World world, int x, int y, int z, IBlockState blockState) {
        WorldGenMinable concreteGenerator = new WorldGenMinable(blockState, 48, BlockMatcher.forBlock(Blocks.STONE));
        concreteGenerator.generate(world, new Random(), new BlockPos(x, y, z));
    }
}
