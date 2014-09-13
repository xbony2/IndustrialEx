package xbony2.IndustrialEx.registery;

import net.minecraftforge.oredict.OreDictionary;

public class RegOreDictionary {

	/**
	 * Registers everything in the ore dictionary.
	 * 
	 * @author xbony2
	 */
	public static void registerOreDictionaryStuff(){
		OreDictionary.registerOre("ingotDarkSteel", RegItems.darkSteelIngot);
		OreDictionary.registerOre("nuggetDarkSteel", RegItems.darkSteelNugget);
		OreDictionary.registerOre("nuggetSteel", RegItems.steelNugget);
		OreDictionary.registerOre("blockDarkSteel", RegBlocks.darkSteelBlock);
		OreDictionary.registerOre("plateDarkSteel", RegItems.darkSteelPlate);
		OreDictionary.registerOre("plateDenseDarkSteel", RegItems.darkSteelDensePlate);
		OreDictionary.registerOre("dyeGreen", RegItems.greenDye);
	}
}
