package com.iconmaster.eqlib.recipe;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author iconmaster
 */
public class RecipeMap {

	public Set<ItemNode> nodes;

	public RecipeMap generateNodes() {
		nodes = new HashSet<ItemNode>();
		for (RecipeLink link : RecipeRegistry.getRecipes()) {
			for (Object why_java_why : link.inputs) {
				ItemDataStack stack = (ItemDataStack) why_java_why;
				nodes.add(new ItemNode(stack.item));
			}
		}
		return this;
	}
}
