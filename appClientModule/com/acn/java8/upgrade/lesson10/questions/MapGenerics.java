package com.acn.java8.upgrade.lesson10.questions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapGenerics {
	public static void main(String[] args) {
		Map<String, List<String>> map = new HashMap<>();
		map.put("key", new ArrayList<>());
		List<String> value = map.get("key"); // How to correct it?
	}
}
