package com.iconmaster.eqlib.recipe;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author iconmaster
 */
public abstract class SimpleEquivHandler<T> implements EquivHandler<T> {
	public abstract T addValues(List<T> input);
	public abstract Map<ItemData, T> getBaseValues();
	public abstract T getBestValue(List<T> input);
	
	public File configFolder;

	public SimpleEquivHandler(File configFolder) {
		this.configFolder = configFolder;
	}

	@Override
	public List<T> calculateValues(RecipeMap<T> map, ItemNode<T> node) {
		return null;
	}

	@Override
	public Map<ItemData, T> getAcceptedValues(RecipeMap<T> map) {
		File values = new File(configFolder, "values/");
		File defaults = new File(values, "default.eqlib");
		HashMap<ItemData, T> amap = new HashMap<ItemData, T>();
		if (!defaults.exists()) {
			try {
				defaults.createNewFile();
				PrintWriter pw = new PrintWriter(defaults);
				//save defaults here
				pw.flush();
				pw.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		for (File f : values.listFiles()) {
			try {
				Scanner in = new Scanner(f);
				//load file here
			} catch (FileNotFoundException ex) {
				ex.printStackTrace();
			}
		}
		return amap;
	}

	@Override
	public T getCorrectValue(RecipeMap<T> map, ItemNode<T> node) {
		return null;
	}
}
