package xbony2.IndustrialEx;

import ic2.api.item.IC2Items;
import xbony2.IndustrialEx.api.util.IELog;
import xbony2.IndustrialEx.crossmod.CrossMod;
import xbony2.IndustrialEx.items.IEItem;
import xbony2.IndustrialEx.recipes.Ic2Recipes;
import xbony2.IndustrialEx.recipes.ShapedRecipes;
import xbony2.IndustrialEx.recipes.ShapelessRecipes;
import xbony2.IndustrialEx.recipes.SmeltingRecipes;
import xbony2.IndustrialEx.registery.IEConfig;
import xbony2.IndustrialEx.registery.RegBlocks;
import xbony2.IndustrialEx.registery.RegItems;
import xbony2.IndustrialEx.world.IEWorldGenerator;
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

@Mod(modid = "industrialEx", name = "IndustrialEx", version = "1.0.0a", acceptedMinecraftVersions = "[1.7.10]", dependencies = "required-after:IC2") 
public class IndustrialExpansion {

	@Instance("industrialEx")
	public static IndustrialExpansion instance;
	
	public static CreativeTabs IndustrialExTab;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		IELog.log("We are in preinit!");
		
		IEConfig.init(event.getSuggestedConfigurationFile());
		
		IndustrialExTab = new CreativeTabs("IndustrialExTab"){
			@Override 
			@SideOnly(Side.CLIENT)
			public Item getTabIconItem() {
				return RegItems.darkSteelIngot; 
			}
		};

		RegItems.registerItems();
		
		RegBlocks.registerBlocks();
		
		CrossMod.preinit();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event){
		IELog.log("We are in init!");
		
		GameRegistry.registerWorldGenerator(new IEWorldGenerator(), 1);
		
		ShapelessRecipes.addRecipes();
		
		ShapedRecipes.addRecipes();
		
		SmeltingRecipes.addRecipes();
		
		Ic2Recipes.addRecipes();
		
		CrossMod.init();
		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event){
		IELog.log("We are in postinit!");
		
		CrossMod.postInit();
	}
}
