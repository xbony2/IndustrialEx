package xbony2.industrialex.crossmod.bauble;

import net.minecraft.item.Item;
import xbony2.industrialex.crossmod.bauble.items.*;
import xbony2.industrialex.crossmod.bauble.recipes.ShapedRecipes;
import xbony2.industrialex.IndustrialExpansion;
import cpw.mods.fml.common.registry.GameRegistry;

public class Baubles {

	public static Item ChargedNanoRing;
	public static Item UnChargedNanoRing;
	public static Item ChargedNanoBelt;
	public static Item UnChargedNanoBelt;
	public static Item ChargedNanoAmulet;
	public static Item UnChargedNanoAmulet;
	
	public static void init(){
		ChargedNanoRing = new NanoRing("nanoringc", true);
		UnChargedNanoRing = new NanoRing("nanoringu", false).setCreativeTab(IndustrialExpansion.IndustrialExTab);
		ChargedNanoBelt = new NanoBelt("nanobeltc", true);
		UnChargedNanoBelt = new NanoBelt("nanobeltu", false).setCreativeTab(IndustrialExpansion.IndustrialExTab);
		ChargedNanoAmulet = new NanoAmulet("nanoamuletc", true);
		UnChargedNanoAmulet = new NanoAmulet("nanoamuletu", false).setCreativeTab(IndustrialExpansion.IndustrialExTab);
		
		GameRegistry.registerItem(ChargedNanoRing, "ChargedNanoRing");
		GameRegistry.registerItem(UnChargedNanoRing, "UnChargedNanoRing");
		GameRegistry.registerItem(ChargedNanoBelt, "ChargedNanoBelt");
		GameRegistry.registerItem(UnChargedNanoBelt, "UnChargedNanoBelt");
		GameRegistry.registerItem(ChargedNanoAmulet, "ChargedNanoAmulet");
		GameRegistry.registerItem(UnChargedNanoAmulet, "UnChargedNanoAmulet");
		
		ShapedRecipes.addRecipes();
	}
}
