package xbony2.IndustrialEx.crossmod.te.recipes;

import thermalfoundation.item.TFItems;
import xbony2.IndustrialEx.crossmod.te.ThermalExpansion4;
import xbony2.IndustrialEx.registery.IEConfig;
import cpw.mods.fml.common.registry.GameRegistry;

public class FurnaceRecipes {
	/**
	 * Adds all the furnace recipes for TE crossmod stuff
	 */
	public static void addRecipes(){
		if(IEConfig.ferrousDusts) GameRegistry.addSmelting(ThermalExpansion4.crushedFerrousOre, TFItems.ingotNickel, 0.7F);
		if(IEConfig.shinyDusts) GameRegistry.addSmelting(ThermalExpansion4.crushedShinyOre, TFItems.ingotPlatinum, 0.7F);
		if(IEConfig.manaDusts) GameRegistry.addSmelting(ThermalExpansion4.crushedManaOre, TFItems.ingotMithril, 1.0F);
		if(IEConfig.ferrousDusts) GameRegistry.addSmelting(ThermalExpansion4.purifiedCrushedFerrousOre, TFItems.ingotNickel, 0.7F);
		if(IEConfig.shinyDusts) GameRegistry.addSmelting(ThermalExpansion4.purifiedCrushedShinyOre, TFItems.ingotPlatinum, 0.7F);
		if(IEConfig.manaDusts) GameRegistry.addSmelting(ThermalExpansion4.purifiedCrushedManaOre, TFItems.ingotMithril, 1.0F);
	}
}
