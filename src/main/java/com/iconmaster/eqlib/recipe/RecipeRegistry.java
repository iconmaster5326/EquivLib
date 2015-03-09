package com.iconmaster.eqlib.recipe;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author iconmaster
 */
public class RecipeRegistry {

	private static List<RecipeLink> recipes;
	public static List<RecipeHandler> handlers = new ArrayList<RecipeHandler>();

	public static List<RecipeLink> getRecipes() {
		if (recipes == null) {
			recipes = generateRecipesList();
		}
		return recipes;
	}

	public static List<RecipeLink> generateRecipesList() {
		ArrayList<RecipeLink> a = new ArrayList<RecipeLink>();
		for (RecipeHandler handler : handlers) {
			a.addAll(handler.getRecipes());
		}
		return a;
	}
}
