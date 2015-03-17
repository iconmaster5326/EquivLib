package com.iconmaster.eqlib.examples;

import com.iconmaster.eqlib.config.ConfigHandler;

/**
 *
 * @author iconmaster
 */
public class ExampleConfig extends ConfigHandler<Double> {

	public ExampleConfig() {
		super("example");
	}

	@Override
	public String toString(Double item) {
		return item.toString();
	}

	@Override
	public Double fromString(String item) {
		return Double.parseDouble(item);
	}
	
}
