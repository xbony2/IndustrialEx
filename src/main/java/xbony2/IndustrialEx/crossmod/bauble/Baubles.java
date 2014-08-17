package xbony2.IndustrialEx.crossmod.bauble;

import cpw.mods.fml.common.registry.GameRegistry;
import xbony2.IndustrialEx.IndustrialExpansion;
import xbony2.IndustrialEx.crossmod.bauble.items.NanoRing;
import xbony2.IndustrialEx.crossmod.bauble.recipes.ShapedRecipes;
import net.minecraft.item.Item;

public class Baubles {

	public static Item ChargedNanoRing;
	public static Item UnChargedNanoRing;
	
	public static void init(){
		ChargedNanoRing = new NanoRing("nanoringc", true);
		UnChargedNanoRing = new NanoRing("nanoringu", false).setCreativeTab(IndustrialExpansion.IndustrialExTab);
		
		GameRegistry.registerItem(ChargedNanoRing, "ChargedNanoRing");
		GameRegistry.registerItem(UnChargedNanoRing, "UnChargedNanoRing");
		
		ShapedRecipes.addRecipes();
	}
}
