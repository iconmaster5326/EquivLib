package com.iconmaster.eqlib.recipe;

import java.util.List;
import java.util.Map;

/**
 *
 * @author iconmaster
 */
public interface EquivHandler<T> {
	public Map<ItemData, T> getAcceptedValues();
	public List<T> calculateValues(ItemNode<T> node);
	public T getCorrectValue(ItemNode<T> node);
}
