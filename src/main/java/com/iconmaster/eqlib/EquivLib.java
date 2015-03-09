package com.iconmaster.eqlib;

import com.iconmaster.eqlib.recipe.EquivRegistry;
import com.iconmaster.eqlib.recipe.RecipeMap;
import com.iconmaster.eqlib.test.TestHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;

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
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		RecipeMap map = new RecipeMap(new TestHandler());
		map.generateNodes();
		System.out.println(map.nodes);
		EquivRegistry<Double> registry = new EquivRegistry<Double>(map.getMap());
		System.out.println(registry.map);
	}
}
