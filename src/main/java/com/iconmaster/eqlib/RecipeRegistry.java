package com.iconmaster.eqlib;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author iconmaster
 */
public class RecipeRegistry {

	private static List<RecipeLink> recipes;

	public static List<RecipeLink> getRecipes() {
		if (recipes == null) {
			recipes = generateRecipesList();
		}
		return recipes;
	}

	public static List<RecipeLink> generateRecipesList() {
		return new ArrayList<RecipeLink>();
	}
}
