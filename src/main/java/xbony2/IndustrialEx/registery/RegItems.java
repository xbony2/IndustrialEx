package xbony2.IndustrialEx.registery;

import cpw.mods.fml.common.registry.GameRegistry;
import xbony2.IndustrialEx.items.IEItem;
import net.minecraft.item.Item;

public class RegItems {

	public static Item darkSteelIngot;
	public static Item darkSteelNugget;
	public static Item steelNugget;
	
	/**
	 * Registers all of the items.
	 * 
	 * @author xbony2
	 */
	public static void registerItems(){
		darkSteelIngot = new IEItem("darkSteelIngot");
		darkSteelNugget = new IEItem("darkSteelNugget");
		steelNugget = new IEItem("steelNugget");
		
		GameRegistry.registerItem(darkSteelIngot, "darkSteelIngot");
		GameRegistry.registerItem(darkSteelNugget, "darkSteelNugget");
		GameRegistry.registerItem(steelNugget, "steelNugget");
	}
}
