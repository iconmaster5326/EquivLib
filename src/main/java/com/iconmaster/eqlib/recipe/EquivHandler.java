package com.iconmaster.eqlib.recipe;

import java.util.List;
import java.util.Map;

/**
 *
 * @author iconmaster
 */
public interface EquivHandler<T extends EquivEntry> {
	public Map<ItemData, T> getAcceptedValues();
	public List<T> calculateValues(ItemNode node);
	public T getCorrectValue(ItemNode node);
}
