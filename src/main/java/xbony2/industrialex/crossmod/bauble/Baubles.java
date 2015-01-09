package xbony2.industrialex.crossmod.bauble;

import net.minecraft.item.Item;
import xbony2.industrialex.crossmod.bauble.items.*;
import xbony2.industrialex.crossmod.bauble.recipes.BaubleShapedRecipes;
import xbony2.industrialex.IndustrialExpansion;
import cpw.mods.fml.common.registry.GameRegistry;

public class Baubles {

	public static Item chargedNanoRing;
	public static Item unChargedNanoRing;
	public static Item chargedNanoBelt;
	public static Item unChargedNanoBelt;
	public static Item chargedNanoAmulet;
	public static Item unChargedNanoAmulet;
	
	public static void init(){
		chargedNanoRing = new NanoRing("nanoringc", true);
		unChargedNanoRing = new NanoRing("nanoringu", false).setCreativeTab(IndustrialExpansion.IndustrialExTab);
		chargedNanoBelt = new NanoBelt("nanobeltc", true);
		unChargedNanoBelt = new NanoBelt("nanobeltu", false).setCreativeTab(IndustrialExpansion.IndustrialExTab);
		chargedNanoAmulet = new NanoAmulet("nanoamuletc", true);
		unChargedNanoAmulet = new NanoAmulet("nanoamuletu", false).setCreativeTab(IndustrialExpansion.IndustrialExTab);
		
		GameRegistry.registerItem(chargedNanoRing, "ChargedNanoRing");
		GameRegistry.registerItem(unChargedNanoRing, "UnChargedNanoRing");
		GameRegistry.registerItem(chargedNanoBelt, "ChargedNanoBelt");
		GameRegistry.registerItem(unChargedNanoBelt, "UnChargedNanoBelt");
		GameRegistry.registerItem(chargedNanoAmulet, "ChargedNanoAmulet");
		GameRegistry.registerItem(unChargedNanoAmulet, "UnChargedNanoAmulet");
		
		BaubleShapedRecipes.addRecipes();
	}
}
