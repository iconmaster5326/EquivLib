package com.iconmaster.eqlib;

import cpw.mods.fml.common.Mod;

/**
 *
 * @author iconmaster
 */
@Mod(modid = EquivLib.MODID, version = EquivLib.VERSION)
public class EquivLib {

	public static final String MODID = "EquivLib";
	public static final String VERSION = "@VERSION@";

	@Mod.Instance("EquivLib")
	public static EquivLib instance = new EquivLib();
}
