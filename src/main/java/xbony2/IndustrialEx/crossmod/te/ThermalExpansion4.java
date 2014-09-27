package xbony2.IndustrialEx.crossmod.te;

import cpw.mods.fml.common.registry.GameRegistry;
import xbony2.IndustrialEx.items.IEItem;
import xbony2.IndustrialEx.registery.IEConfig;
import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;

public class ThermalExpansion4 {

	public static Item crushedFerrousOre;
	public static Item purifiedCrushedFerrousOre;
	public static Item tinyPileFerrousDust;
	public static Item crushedShinyOre;
	public static Item purifiedCrushedShinyOre;
	public static Item tinyPileShinyDust;
	public static Item crushedManaOre;
	public static Item purifiedCrushedManaOre;
	public static Item tinyPileManaDust;
	
	public static void init(){
		if(IEConfig.ferrousDusts){
			crushedFerrousOre = new IEItem("crushedFerrousOre");
			purifiedCrushedFerrousOre = new IEItem("purifiedCrushedFerrousOre");
			tinyPileFerrousDust = new IEItem("tinyPileFerrousDust");
			
			GameRegistry.registerItem(crushedFerrousOre, "crushedFerrousOre");
			GameRegistry.registerItem(purifiedCrushedFerrousOre, "purifiedCrushedFerrousOre");
			GameRegistry.registerItem(tinyPileFerrousDust, "tinyPileFerrousDust");
			
			OreDictionary.registerOre("crushedNickel", crushedFerrousOre);
			OreDictionary.registerOre("crushedPurifiedNickel", purifiedCrushedFerrousOre);
			OreDictionary.registerOre("dustTinyNickel", tinyPileFerrousDust);
		}
		
		if(IEConfig.shinyDusts){
			crushedShinyOre = new IEItem("crushedShinyOre");
			purifiedCrushedShinyOre = new IEItem("purifiedCrushedShinyOre");
			tinyPileShinyDust = new IEItem("tinyPileShinyDust");
			
			GameRegistry.registerItem(crushedShinyOre, "crushedShinyOre");
			GameRegistry.registerItem(purifiedCrushedShinyOre, "purifiedCrushedShinyOre");
			GameRegistry.registerItem(tinyPileShinyDust, "tinyPileShinyDust");
			
			OreDictionary.registerOre("crushedPlatinum", crushedShinyOre);
			OreDictionary.registerOre("crushedPurifiedPlatinum", purifiedCrushedShinyOre);
			OreDictionary.registerOre("dustTinyPlatinum", tinyPileShinyDust);
		}
		
		if(IEConfig.manaDusts){
			crushedManaOre = new IEItem("crushedManaOre");
			purifiedCrushedManaOre = new IEItem("purifiedCrushedManaOre");
			tinyPileManaDust = new IEItem("tinyPileManaDust");
			
			GameRegistry.registerItem(crushedManaOre, "crushedManaOre");
			GameRegistry.registerItem(purifiedCrushedManaOre, "purifiedCrushedManaOre");
			GameRegistry.registerItem(tinyPileManaDust, "tinyPileManaDust");
			
			OreDictionary.registerOre("crushedMithril", crushedManaOre);
			OreDictionary.registerOre("crushedPurifiedMithril", purifiedCrushedManaOre);
			OreDictionary.registerOre("dustTinyMithril", tinyPileManaDust);
		}
		Ic2Recipes.addRecipes();
	}
}
