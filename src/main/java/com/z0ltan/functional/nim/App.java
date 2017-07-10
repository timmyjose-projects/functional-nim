package com.z0ltan.functional.nim;

import java.util.Arrays;

public class App {
	public static void main(String[] args) {
		Board initial = new Board(Arrays.asList(5, 4, 3, 2, 1));

		Nim.play(initial, 1);
	}
}
