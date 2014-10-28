package xbony2.IndustrialEx.crossmod.tf.recipes;

import thermalfoundation.item.TFItems;
import xbony2.IndustrialEx.crossmod.tf.ThermalFoundation;
import xbony2.IndustrialEx.registery.IEConfig;
import cpw.mods.fml.common.registry.GameRegistry;

public class FurnaceRecipes {
	/**
	 * Adds all the furnace recipes for TE crossmod stuff
	 */
	public static void addRecipes(){
		if(IEConfig.ferrousDusts) GameRegistry.addSmelting(ThermalFoundation.crushedFerrousOre, TFItems.ingotNickel, 0.7F);
		if(IEConfig.shinyDusts) GameRegistry.addSmelting(ThermalFoundation.crushedShinyOre, TFItems.ingotPlatinum, 0.7F);
		if(IEConfig.manaDusts) GameRegistry.addSmelting(ThermalFoundation.crushedManaOre, TFItems.ingotMithril, 1.0F);
		if(IEConfig.ferrousDusts) GameRegistry.addSmelting(ThermalFoundation.purifiedCrushedFerrousOre, TFItems.ingotNickel, 0.7F);
		if(IEConfig.shinyDusts) GameRegistry.addSmelting(ThermalFoundation.purifiedCrushedShinyOre, TFItems.ingotPlatinum, 0.7F);
		if(IEConfig.manaDusts) GameRegistry.addSmelting(ThermalFoundation.purifiedCrushedManaOre, TFItems.ingotMithril, 1.0F);
	}
}
