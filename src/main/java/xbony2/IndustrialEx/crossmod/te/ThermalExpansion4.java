package xbony2.IndustrialEx.crossmod.te;

import cpw.mods.fml.common.registry.GameRegistry;
import xbony2.IndustrialEx.crossmod.te.recipes.CraftingRecipes;
import xbony2.IndustrialEx.crossmod.te.recipes.FurnaceRecipes;
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
		}
		
		if(IEConfig.shinyDusts){
			crushedShinyOre = new IEItem("crushedShinyOre");
			purifiedCrushedShinyOre = new IEItem("purifiedCrushedShinyOre");
			tinyPileShinyDust = new IEItem("tinyPileShinyDust");
		}
		
		if(IEConfig.manaDusts){
			crushedManaOre = new IEItem("crushedManaOre");
			purifiedCrushedManaOre = new IEItem("purifiedCrushedManaOre");
			tinyPileManaDust = new IEItem("tinyPileManaDust");
		}
		Ic2Recipes.addRecipes();
		CraftingRecipes.addRecipes();
		FurnaceRecipes.addRecipes();
	}
}
