package xbony2.industrialex.crossmod.thermalfoundation;

import cpw.mods.fml.common.registry.GameRegistry;
import xbony2.industrialex.common.IEConfig;
import xbony2.industrialex.crossmod.thermalfoundation.recipes.*;
import xbony2.industrialex.items.IEItem;
import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;

public class ThermalFoundation {

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
			crushedFerrousOre = new IEItem("crushedFerrous");
			purifiedCrushedFerrousOre = new IEItem("crushedPurifiedFerrous");
			tinyPileFerrousDust = new IEItem("dustTinyFerrous");
		}
		
		if(IEConfig.shinyDusts){
			crushedShinyOre = new IEItem("crushedShiny");
			purifiedCrushedShinyOre = new IEItem("crushedPurifiedShiny");
			tinyPileShinyDust = new IEItem("dustTinyShiny");
		}
		
		if(IEConfig.manaDusts){
			crushedManaOre = new IEItem("crushedMana");
			purifiedCrushedManaOre = new IEItem("crushedPurifiedMana");
			tinyPileManaDust = new IEItem("dustTinyMana");
		}
		TFIC2Recipes.addRecipes();
		TFShapedRecipes.addRecipes();
		FurnaceRecipes.addRecipes();
	}
}
