package com.acn.java8.upgrade.lesson10.questions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapGenerics2 {
	public static void main(String[] args) {
		List<Map<String, String>> list = new ArrayList<>();
		list.add(new HashMap<>());
		Map<String,String> map = list.get(0);  // Homework: wildcards ?
		map.put("key", "value"); // How to fix it
	}
}
