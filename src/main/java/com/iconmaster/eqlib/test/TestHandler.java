package com.iconmaster.eqlib.test;

import com.iconmaster.eqlib.recipe.EquivHandler;
import com.iconmaster.eqlib.recipe.ItemData;
import com.iconmaster.eqlib.recipe.ItemNode;
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
	public Map<ItemData, Double> getAcceptedValues() {
		HashMap<ItemData, Double> map = new HashMap<ItemData, Double>();
		map.put(new ItemData(new ItemStack(Blocks.log)), 4d);
		return map;
	}

	@Override
	public List<Double> calculateValues(ItemNode<Double> node) {
		return null;
	}

	@Override
	public Double getCorrectValue(ItemNode<Double> node) {
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
