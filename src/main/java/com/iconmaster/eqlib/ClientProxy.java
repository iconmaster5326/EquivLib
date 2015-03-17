package com.iconmaster.eqlib;

import com.iconmaster.eqlib.examples.TooltipTest;
import net.minecraftforge.common.MinecraftForge;

/**
 *
 * @author iconmaster
 */
public class ClientProxy extends CommonProxy {
	@Override
	public void registerEvents() {
		MinecraftForge.EVENT_BUS.register(new TooltipTest()); //for testing
	}
}
