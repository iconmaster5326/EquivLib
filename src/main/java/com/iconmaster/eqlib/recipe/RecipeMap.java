package com.iconmaster.eqlib.recipe;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author iconmaster
 */
public class RecipeMap<T extends EquivEntry> {

	public List<ItemNode<T>> nodes;
	public EquivHandler<T> handler;

	public RecipeMap(EquivHandler handler) {
		this.handler = handler;
	}

	public RecipeMap generateNodes() {
		nodes = new ArrayList<ItemNode<T>>();
		for (RecipeLink link : RecipeRegistry.getRecipes()) {
			for (Object why_java_why : link.inputs) {
				ItemDataStack stack = (ItemDataStack) why_java_why;
				ItemNode node = new ItemNode(stack.item);
				if (nodes.contains(node)) {
					nodes.get(nodes.indexOf(node)).usedAsInput.add(link);
				} else {
					node.usedAsInput.add(link);
					nodes.add(node);
				}
			}
			
			for (Object why_java_why : link.outputs) {
				ItemDataStack stack = (ItemDataStack) why_java_why;
				ItemNode node = new ItemNode(stack.item);
				if (nodes.contains(node)) {
					nodes.get(nodes.indexOf(node)).usedAsOutput.add(link);
				} else {
					node.usedAsOutput.add(link);
					nodes.add(node);
				}
			}
		}
		
		return this;
	}
}
