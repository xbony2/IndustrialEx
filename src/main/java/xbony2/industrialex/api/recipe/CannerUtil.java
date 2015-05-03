package xbony2.industrialex.api.recipe;

import ic2.api.item.IC2Items;
import net.minecraft.item.ItemStack;

/**
 * Contains useful contstants for tined cans.
 * 
 * @author xbony2
 */
public class CannerUtil {
	public final static IC2RecipeInput EMPTY_X1 = new IC2RecipeInput(IC2Items.getItem("tinCan"));
	public final static IC2RecipeInput EMPTY_X3 = new IC2RecipeInput(new ItemStack(IC2Items.getItem("tinCan").getItem(), 3));
	public final static IC2RecipeInput EMPTY_X4 = new IC2RecipeInput(new ItemStack(IC2Items.getItem("tinCan").getItem(), 4));
	public final static IC2RecipeInput EMPTY_X8 = new IC2RecipeInput(new ItemStack(IC2Items.getItem("tinCan").getItem(), 8));
	
	public final static ItemStack FILLED_X1 = IC2Items.getItem("filledTinCan");
	public final static ItemStack FILLED_X3 = new ItemStack(IC2Items.getItem("filledTinCan").getItem(), 3);
	public final static ItemStack FILLED_X4 = new ItemStack(IC2Items.getItem("filledTinCan").getItem(), 4);
	public final static ItemStack FILLED_X8 = new ItemStack(IC2Items.getItem("filledTinCan").getItem(), 8);
}
