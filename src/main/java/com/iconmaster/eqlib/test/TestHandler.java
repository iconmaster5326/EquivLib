package com.iconmaster.eqlib.test;

import com.iconmaster.eqlib.recipe.EquivHandler;
import com.iconmaster.eqlib.recipe.ItemData;
import com.iconmaster.eqlib.recipe.ItemDataStack;
import com.iconmaster.eqlib.recipe.ItemNode;
import com.iconmaster.eqlib.recipe.RecipeLink;
import com.iconmaster.eqlib.recipe.RecipeMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

/**
 *
 * @author iconmaster
 */
public class TestHandler implements EquivHandler<Double> {

	@Override
	public Map<ItemData, Double> getAcceptedValues(RecipeMap<Double> map) {
		HashMap<ItemData, Double> amap = new HashMap<ItemData, Double>();
		amap.put(new ItemData(new ItemStack(Blocks.log)), 4d);
		return amap;
	}

	@Override
	public List<Double> calculateValues(RecipeMap<Double> map, ItemNode<Double> node) {
		ArrayList<Double> a = new ArrayList<Double>();
		for (RecipeLink link : node.usedAsOutput) {
			double sum = 0;
			boolean failed = true;
			for (ItemDataStack stack : link.inputs) {
				failed = false;
				ItemNode<Double> node2 = map.findNode(stack.item);
				double d = getCorrectValue(map, node2);
				if (d==0d) {
					failed = true;
					break;
				} else {
					sum += d;
				}
			}
			
			if (!failed) {
				a.add(sum);
			}
		}
		return a;
	}

	@Override
	public Double getCorrectValue(RecipeMap<Double> map, ItemNode<Double> node) {
		if (node.acceptedValue!=null) {
			return node.acceptedValue;
		}
		
		Double lowest = Double.MAX_VALUE;
		for (Double d : node.calculatedValues) {
			lowest = Math.min(lowest, d);
		}
		return lowest==Double.MAX_VALUE ? 0 : lowest;
	}

}
