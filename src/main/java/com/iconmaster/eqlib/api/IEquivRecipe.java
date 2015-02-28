package com.iconmaster.eqlib.api;

import java.util.List;

/**
 *
 * @author iconmaster
 */
public interface IEquivRecipe {
	public List<IItemData> inputs();
	public List<IItemData> outputs();
}
