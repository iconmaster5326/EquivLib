package com.iconmaster.eqlib.recipe;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.minecraft.item.crafting.CraftingManager;

/**
 *
 * @author iconmaster
 */
public class RecipeRegistry {

	private static List<RecipeLink> recipes;
	public static List<RecipeHandler> handlers = new ArrayList<RecipeHandler>();
	public static Map<Class, List> vanillaCrafting;

	public static List<RecipeLink> getRecipes() {
		if (recipes == null) {
			generateRecipesList();
		}
		return recipes;
	}

	public static void generateRecipesList() {
		vanillaCrafting = new HashMap();
		for (Object recipe : CraftingManager.getInstance().getRecipeList()) {
			if (!vanillaCrafting.containsKey(recipe.getClass())) {
				vanillaCrafting.put(recipe.getClass(), new ArrayList());
			}
			vanillaCrafting.get(recipe.getClass()).add(recipe);
		}
		
		recipes = new ArrayList<RecipeLink>();
		for (RecipeHandler handler : handlers) {
			recipes.addAll(handler.getRecipes());
		}
	}
}
