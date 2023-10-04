package com.MagicalAdditions.Magic;

import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

import java.util.Random;

public class WorldGen implements IWorldGenerator {

    @Override
    public void generate(Random rand, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
        generateOverworld(rand, chunkX, chunkZ, world);
        generateNether(rand, chunkX, chunkZ, world);
    }

    private void generateOverworld(Random rand, int chunkX, int chunkZ, World world) {
        generateOverworld(world, rand, chunkX * 16, chunkZ * 16);
    }

    private void generateNether(Random rand, int chunkX, int chunkZ, World world) {
        generateNether(world, rand, chunkX * 16, chunkZ * 16);
    }

    public void generateOverworld(World world, Random rand, int blockXPos, int blockZPos) {
        addOreSpawn(Main.MagicRubyOre, Blocks.stone, world, rand,blockXPos, blockZPos, 16,16,1,3,1,2,50,5,25);
        addOreSpawn(Main.AtiumOre, Blocks.stone, world, rand, blockXPos, blockZPos, 16, 16, 2, 4, 1, 4, 50, 5, 20);
        addOreSpawn(Main.DilithiumOre, Blocks.stone, world, rand, blockXPos, blockZPos, 16, 16, 4, 8, 6, 6, 100, 5, 250);
    }

    public void generateNether(World world, Random rand, int blockXPos, int blockZPos) {
        addOreSpawn(Main.NetheraniumOre, Blocks.netherrack, world, rand, blockXPos, blockZPos, 16, 16, 2, 3, 1, 2, 25, 60, 125);
        addOreSpawn(Main.QuadiumOre, Blocks.netherrack, world, rand, blockXPos, blockZPos, 16, 16, 2, 3, 1, 2, 25, 5, 60);
    }

    public static void addOreSpawn(Block ore, Block replace, World world, Random rand, int blockXPos, int blockZPos, int maxX, int maxZ,
                                   int minVeinSize, int maxVeinSize, int minVeinsPerChunk, int maxVeinsPerChunk, int chanceToSpawn, int minY, int maxY) {
        if (rand.nextInt(101) < (100 - chanceToSpawn)) return;
        int veins = rand.nextInt(maxVeinsPerChunk - minVeinsPerChunk + 1) + minVeinsPerChunk;
        for (int i = 0; i < veins; i++) {
            int posX = blockXPos + rand.nextInt(maxX);
            int posY = minY + rand.nextInt(maxY - minY);
            int posZ = blockZPos + rand.nextInt(maxZ);
            (new WorldGenMinable(ore, minVeinSize + rand.nextInt(maxVeinSize - minVeinSize + 1),
                    replace)).generate(world, rand, posX, posY, posZ);
        }
    }
}