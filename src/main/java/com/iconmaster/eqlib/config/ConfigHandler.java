package com.iconmaster.eqlib.config;

import java.io.File;
import net.minecraftforge.common.config.Configuration;

/**
 *
 * @author iconmaster
 */
public abstract class ConfigHandler<T> {
	public String modName;
	
	public boolean useCache = true;

	public ConfigHandler(String modName) {
		this.modName = modName;
	}
	
	public abstract String toString(T item);
	public abstract T fromString(String item);
	
	public void loadSettings(File file) {
		Configuration cfg = new Configuration(file);
		cfg.load();
		cfg.setCategoryComment("general", "The equivalence settings for "+modName+".");
		useCache = cfg.getBoolean("useCache", "general", useCache, "Set to false to disable caching. Just delete cache.eqlib to regenerate it once.");
		cfg.save();
	}
}
