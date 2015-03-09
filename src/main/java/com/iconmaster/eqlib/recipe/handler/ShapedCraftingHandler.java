package com.iconmaster.eqlib.recipe.handler;

import com.iconmaster.eqlib.recipe.ItemDataStack;
import com.iconmaster.eqlib.recipe.RecipeHandler;
import com.iconmaster.eqlib.recipe.RecipeLink;
import com.iconmaster.eqlib.recipe.RecipeRegistry;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.ShapedRecipes;

/**
 *
 * @author iconmaster
 */
public class ShapedCraftingHandler implements RecipeHandler {

	@Override
	public List<RecipeLink> getRecipes() {
		List<RecipeLink> a = new ArrayList<RecipeLink>();
		
		for (Object obj : RecipeRegistry.vanillaCrafting.get(ShapedRecipes.class)) {
			ShapedRecipes recipe = (ShapedRecipes) obj;
			RecipeLink link = new RecipeLink(new ArrayList(), new ArrayList());
			
			for (ItemStack stack : recipe.recipeItems) {
				link.inputs.add(new ItemDataStack(stack));
			}
			
			link.outputs.add(new ItemDataStack(recipe.getRecipeOutput()));
			
			a.add(link);
		}
		
		return a;
	}
	
}
