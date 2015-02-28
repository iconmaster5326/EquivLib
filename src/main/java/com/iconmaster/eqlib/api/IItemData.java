package com.iconmaster.eqlib.api;

/**
 *
 * @author iconmaster
 */
public interface IItemData {
	public String getName();
	public int getMeta();
	public boolean getFluid();
	
	public void setName(String name);
	public void setMeta(int meta);
	public void setFluid(boolean fluid);
}
