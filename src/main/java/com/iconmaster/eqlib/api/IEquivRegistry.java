package com.iconmaster.eqlib.api;

import java.util.List;

/**
 *
 * @author iconmaster
 */
public interface IEquivRegistry<T extends IEquivEntry> {
	public List<IEquivNode<T>> nodes();
	IEquivEntryHandler<T> handler();
}
