package com.iconmaster.eqlib.recipe;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidStack;

/**
 *
 * @author iconmaster
 */
public class ItemData {

	public static final String FLUID_NAME = "<FLUID>";

	public String name;
	public int meta;
	public boolean fluid;

	public ItemData(String name, int meta, boolean fluid) {
		this.name = name;
		this.meta = meta;
		this.fluid = fluid;
	}

	public ItemData(String name) {
		this(name, 0, false);
	}

	public ItemData(String name, int meta) {
		this(name, meta, false);
	}

	public ItemData(ItemStack stack) {
		this(stack.getItem().delegate.name(), stack.getItemDamage(), false);
	}

	public ItemData(FluidStack stack) {
		this(FLUID_NAME, stack.fluidID, true);
	}

	@Override
	public int hashCode() {
		int hash = 7;
		hash = 59 * hash + (this.name != null ? this.name.hashCode() : 0);
		hash = 59 * hash + this.meta;
		hash = 59 * hash + (this.fluid ? 1 : 0);
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final ItemData other = (ItemData) obj;
		if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
			return false;
		}
		if (this.meta != other.meta) {
			return false;
		}
		return this.fluid == other.fluid;
	}

	@Override
	public String toString() {
		return "ItemData{" + "name=" + name + ", meta=" + meta + ", fluid=" + fluid + '}';
	}
}
