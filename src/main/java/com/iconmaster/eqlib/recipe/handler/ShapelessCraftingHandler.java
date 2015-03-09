package com.iconmaster.eqlib.recipe.handler;

import com.iconmaster.eqlib.recipe.ItemDataStack;
import com.iconmaster.eqlib.recipe.RecipeHandler;
import com.iconmaster.eqlib.recipe.RecipeLink;
import com.iconmaster.eqlib.recipe.RecipeRegistry;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.ShapelessRecipes;

/**
 *
 * @author iconmaster
 */
public class ShapelessCraftingHandler implements RecipeHandler {

	@Override
	public List<RecipeLink> getRecipes() {
		List<RecipeLink> a = new ArrayList<RecipeLink>();
		
		for (Object obj : RecipeRegistry.vanillaCrafting.get(ShapelessRecipes.class)) {
			ShapelessRecipes recipe = (ShapelessRecipes) obj;
			RecipeLink link = new RecipeLink(new ArrayList(), new ArrayList());
			
			for (Object stack : recipe.recipeItems) {
				if (stack!=null) {
					link.inputs.add(new ItemDataStack((ItemStack) stack));
				}
			}
			
			link.outputs.add(new ItemDataStack(recipe.getRecipeOutput()));
			
			a.add(link);
		}
		
		return a;
	}
	
}
