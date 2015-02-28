package com.iconmaster.eqlib.api;

import java.util.List;

/**
 *
 * @author iconmaster
 */
public interface IEquivNode<T extends IEquivEntry> {
	public IEquivEntry getAcceptedValue();
	public List<T> getValues();
	public boolean visited();
}
