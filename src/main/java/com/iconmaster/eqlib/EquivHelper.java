package com.iconmaster.eqlib;

import com.iconmaster.eqlib.api.IEquivHelper;
import com.iconmaster.eqlib.api.IEquivRecipe;
import com.iconmaster.eqlib.api.IItemData;
import java.util.List;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidStack;

/**
 *
 * @author iconmaster
 */
public class EquivHelper implements IEquivHelper {

	@Override
	public IItemData itemData(ItemStack stack) {
		return new ItemData(stack);
	}

	@Override
	public IItemData itemData(FluidStack stack) {
		return new ItemData(stack);
	}

	@Override
	public IItemData itemData(String name) {
		return new ItemData(name);
	}

	@Override
	public IItemData itemData(String name, int meta) {
		return new ItemData(name, meta);
	}

	@Override
	public List<IEquivRecipe> recipes() {
		return null;
	}
	
}
