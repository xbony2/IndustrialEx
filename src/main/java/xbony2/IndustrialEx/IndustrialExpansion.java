package xbony2.IndustrialEx;

import ic2.api.item.IC2Items;
import xbony2.IndustrialEx.blocks.IEBlock;
import xbony2.IndustrialEx.items.IEItem;
import xbony2.IndustrialEx.recipes.ShapelessRecipes;
import xbony2.IndustrialEx.registery.RegBlocks;
import xbony2.IndustrialEx.registery.RegItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@Mod(modid = "industrialEx", name = "IndustrialEx", version = "1.0.0a", dependencies = "required-after:IC2") 
public class IndustrialExpansion {

	@Instance("industrialEx")
	public static IndustrialExpansion instance;
	
	public static CreativeTabs IndustrialExTab;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		FMLLog.info("Industrial Expansion is in preInit!");
		
		IndustrialExTab = new CreativeTabs("IndustrialExTab"){
			@Override 
			@SideOnly(Side.CLIENT)
			public Item getTabIconItem() {
				return RegItems.darkSteelIngot; 
			}
		};

		RegItems.registerItems();
		
		RegBlocks.registerBlocks();
		
		OreDictionary.registerOre("ingotDarkSteel", RegItems.darkSteelIngot);
		OreDictionary.registerOre("ingotDarkSteel", RegItems.darkSteelNugget);
		OreDictionary.registerOre("ingotDarkSteel", RegItems.steelNugget);
		OreDictionary.registerOre("blockDarkSteel", RegBlocks.darkSteelBlock);
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event){
		FMLLog.info("Industrial Expansion is in init!");
		
		ShapelessRecipes.addRecipes();
		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event){
		FMLLog.info("Industrial Expansion is in postInit!");
	}
}
