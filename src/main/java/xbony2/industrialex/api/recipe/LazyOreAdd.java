package xbony2.industrialex.api.recipe;

import ic2.api.item.IC2Items;
import ic2.api.recipe.Recipes;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import cpw.mods.fml.common.registry.GameRegistry;

public class LazyOreAdd {
	private static final String[] BLOCK = new String[]{"XXX", "XXX", "XXX"};
	
	public static void addOreRecipes(ItemStack ore, ItemStack compactblock, ItemStack gemOrIngot, ItemStack nugget, 
			ItemStack itemCasing, ItemStack plate, ItemStack densePlate, ItemStack crushedOre, ItemStack purifiedCrushedOre, 
			ItemStack tinyDust, ItemStack couldBeOutputtedTinyDust, ItemStack pureDust){
		
		NBTTagCompound orewash = new NBTTagCompound();
	    orewash.setInteger("amount", 1000);
	    NBTTagCompound centerf = new NBTTagCompound();
	    centerf.setInteger("minHeat", 1500);
	    
	    IC2RecipeInput input1 = new IC2RecipeInput(ore);
	    Recipes.macerator.addRecipe(input1, null, new ItemStack(crushedOre.getItem(), 2, crushedOre.getItemDamage()));
	    
	    IC2RecipeInput input2 = new IC2RecipeInput(crushedOre);
	    Recipes.oreWashing.addRecipe(input2, orewash, new ItemStack[]{
				purifiedCrushedOre,
				new ItemStack(tinyDust.getItem(), 2, tinyDust.getItemDamage()),
				IC2Items.getItem("stoneDust")});
	    
	    IC2RecipeInput input3 = new IC2RecipeInput(purifiedCrushedOre);
	    Recipes.centrifuge.addRecipe(input3, centerf, new ItemStack[]{
				couldBeOutputtedTinyDust,
				pureDust});
		Recipes.centrifuge.addRecipe(input2, centerf, new ItemStack[]{
				couldBeOutputtedTinyDust,
				pureDust,
				IC2Items.getItem("stoneDust")});
		
		IC2RecipeInput input4 = new IC2RecipeInput(gemOrIngot);
		Recipes.macerator.addRecipe(input4, null, pureDust);
		
		IC2RecipeInput input5 = new IC2RecipeInput(plate);
		Recipes.metalformerRolling.addRecipe(input5, null, new ItemStack(itemCasing.getItem(), 2, itemCasing.getItemDamage()));		
		
		IC2RecipeInput input6 = new IC2RecipeInput(compactblock);
		Recipes.metalformerRolling.addRecipe(input4, null, plate);
		Recipes.blockcutter.addRecipe(input6, null, new ItemStack(plate.getItem(), 9, plate.getItemDamage()));
		
		IC2RecipeInput input7 = new IC2RecipeInput(new ItemStack(plate.getItem(), 9, plate.getItemDamage()));
		Recipes.compressor.addRecipe(input7, null, densePlate);
		
		IC2RecipeInput input8 = new IC2RecipeInput(plate);
		Recipes.macerator.addRecipe(input8, null, new ItemStack(tinyDust.getItem(), 8));
		
		GameRegistry.addRecipe(new ShapedOreRecipe((pureDust), new Object[]{
				BLOCK, 'X', tinyDust}));
		GameRegistry.addRecipe(new ShapedOreRecipe((gemOrIngot), new Object[]{
				BLOCK, 'X', nugget}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(nugget.getItem(), 9, nugget.getItemDamage()), new Object[]{
			gemOrIngot}));
		GameRegistry.addRecipe(new ShapedOreRecipe((compactblock), new Object[]{
				BLOCK, 'x', gemOrIngot}));
		
		GameRegistry.addSmelting(pureDust, gemOrIngot, 1.0F);
		GameRegistry.addSmelting(crushedOre, gemOrIngot, 1.0F);
		GameRegistry.addSmelting(purifiedCrushedOre, gemOrIngot, 1.0F);
	}
}
