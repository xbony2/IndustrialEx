package xbony2.industrialex.world;

import xbony2.industrialex.common.IEConfig;

import java.util.Random;

import xbony2.industrialex.common.RegBlocks;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

/**
 * I copied most of the code from <a href="https://github.com/ModForgery/Tesla/blob/master/src/main/java/me/modforgery/tesla/worldgen/WorldGenerator.java">here</a>
 *
 */
public class IEWorldGenerator implements IWorldGenerator{

	@Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider){
        switch(world.provider.dimensionId){
            case -1: generateNether(world, random, chunkX * 16, chunkZ * 16);
            case 0: generateSurface(world, random, chunkX * 16, chunkZ * 16);
            case 1: generateEnd(world, random, chunkX * 16, chunkZ * 16);
        }
    }
	
	private void generateSurface(World world, Random random, int x, int z){
		
    }
	
	private void generateNether(World world, Random random, int x, int z){
		if(IEConfig.generateNyt) this.addNetherOreSpawn(RegBlocks.nytOre, world, random, x, z, 16, 16, 16, 4, 5, 120);
		if(IEConfig.generateVice) this.addNetherOreSpawn(RegBlocks.viceOre, world, random, x, z, 16, 16, 5, 7, 5, 120);
		if(IEConfig.generateInfusedGold) this.addNetherOreSpawn(RegBlocks.infusedGoldOre, world, random, x, z, 16, 16, 11, 1, 5, 120);
    }

	private void generateEnd(World world, Random random, int x, int z){
		
    }
	
	public void addOreSpawn(Block block, World world, Random random, int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize, int chancesToSpawn, int minY, int maxY){
        int maxPossY = minY + (maxY - 1);
        assert maxY > minY: "The maximum Y must be greater than the Minimum Y";
        assert maxX > 0 && maxX <= 16: "addOreSpawn: The Maximum X must be greater than 0 and less than 16";
        assert minY > 0: "addOreSpawn: The Minimum Y must be greater than 0";
        assert maxY < 256 && maxY > 0: "addOreSpawn: The Maximum Y must be less than 256 but greater than 0";
        assert maxZ > 0 && maxZ <= 16: "addOreSpawn: The Maximum Z must be greater than 0 and less than 16";

        int diffBtwnMinMaxY = maxY - minY;
        for(int x = 0; x < chancesToSpawn; x++){
            int posX = blockXPos + random.nextInt(maxX);
            int posY = minY + random.nextInt(diffBtwnMinMaxY);
            int posZ = blockZPos + random.nextInt(maxZ);
            (new WorldGenMinable(block, maxVeinSize, Blocks.stone)).generate(world, random, posX, posY, posZ);
        }
    }

    public void addEndOreSpawn(Block block, World world, Random random, int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize, int chancesToSpawn, int minY, int maxY){
        int maxPossY = minY + (maxY - 1);
        assert maxY > minY: "The maximum Y must be greater than the Minimum Y";
        assert maxX > 0 && maxX <= 16: "addOreSpawn: The Maximum X must be greater than 0 and less than 16";
        assert minY > 0: "addOreSpawn: The Minimum Y must be greater than 0";
        assert maxY < 256 && maxY > 0: "addOreSpawn: The Maximum Y must be less than 256 but greater than 0";
        assert maxZ > 0 && maxZ <= 16: "addOreSpawn: The Maximum Z must be greater than 0 and less than 16";

        int diffBtwnMinMaxY = maxY - minY;
        for(int x = 0; x < chancesToSpawn; x++){
            int posX = blockXPos + random.nextInt(maxX);
            int posY = minY + random.nextInt(diffBtwnMinMaxY);
            int posZ = blockZPos + random.nextInt(maxZ);
            (new WorldGenMinable(block, maxVeinSize, Blocks.end_stone)).generate(world, random, posX, posY, posZ);
        }
    }

    public void addNetherOreSpawn(Block block, World world, Random random, int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize, int chancesToSpawn, int minY, int maxY){
        int maxPossY = minY + (maxY - 1);
        assert maxY > minY: "The maximum Y must be greater than the Minimum Y";
        assert maxX > 0 && maxX <= 16: "addOreSpawn: The Maximum X must be greater than 0 and less than 16";
        assert minY > 0: "addOreSpawn: The Minimum Y must be greater than 0";
        assert maxY < 256 && maxY > 0: "addOreSpawn: The Maximum Y must be less than 256 but greater than 0";
        assert maxZ > 0 && maxZ <= 16: "addOreSpawn: The Maximum Z must be greater than 0 and less than 16";

        int diffBtwnMinMaxY = maxY - minY;
        for(int x = 0; x < chancesToSpawn; x++){
            int posX = blockXPos + random.nextInt(maxX);
            int posY = minY + random.nextInt(diffBtwnMinMaxY);
            int posZ = blockZPos + random.nextInt(maxZ);
            (new WorldGenMinable(block, maxVeinSize, Blocks.netherrack)).generate(world, random, posX, posY, posZ);
        }
    }
    public void addCustomOreSpawn(Block block, Block custom, World world, Random random, int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize, int chancesToSpawn, int minY, int maxY){
        int maxPossY = minY + (maxY - 1);
        assert maxY > minY: "The maximum Y must be greater than the Minimum Y";
        assert maxX > 0 && maxX <= 16: "addOreSpawn: The Maximum X must be greater than 0 and less than 16";
        assert minY > 0: "addOreSpawn: The Minimum Y must be greater than 0";
        assert maxY < 256 && maxY > 0: "addOreSpawn: The Maximum Y must be less than 256 but greater than 0";
        assert maxZ > 0 && maxZ <= 16: "addOreSpawn: The Maximum Z must be greater than 0 and less than 16";

        int diffBtwnMinMaxY = maxY - minY;
        for(int x = 0; x < chancesToSpawn; x++){
            int posX = blockXPos + random.nextInt(maxX);
            int posY = minY + random.nextInt(diffBtwnMinMaxY);
            int posZ = blockZPos + random.nextInt(maxZ);
            (new WorldGenMinable(block, maxVeinSize, custom)).generate(world, random, posX, posY, posZ);
        }
    }
}
