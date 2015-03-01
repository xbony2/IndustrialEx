package xbony2.industrialex.crossmod.natura;

import xbony2.industrialex.crossmod.natura.recipes.NaturaIC2Recipes;

public class Natura {
	public static void preInit(){
		CropHandler.registerCrops();
		CropHandler.registerSeeds();
	}

	public static void init(){
		NaturaIC2Recipes.addRecipes();
	}
}
