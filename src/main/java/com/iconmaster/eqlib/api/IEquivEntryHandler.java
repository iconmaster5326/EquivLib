package com.iconmaster.eqlib.api;

import java.util.List;

/**
 *
 * @author iconmaster
 */
public interface IEquivEntryHandler<T extends IEquivEntry> {
	public T fromString(String str);
	public T fromRecipeData(List<IEquivRecipe> recipesThatMakeThis, List<IEquivRecipe> recipesThatUseThis);
}
