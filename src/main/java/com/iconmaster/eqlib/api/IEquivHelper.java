package com.iconmaster.eqlib.api;

import java.util.List;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidStack;

/**
 *
 * @author iconmaster
 */
public interface IEquivHelper {
	public IItemData itemData(ItemStack stack);
	public IItemData itemData(FluidStack stack);
	public IItemData itemData(String name);
	public IItemData itemData(String name, int meta);
	
	public List<IEquivRecipe> recipes();
}
