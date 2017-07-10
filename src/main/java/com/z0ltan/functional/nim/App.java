package com.z0ltan.functional.nim;

import java.io.FilterInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Board initial = new Board(Arrays.asList(5, 4, 3, 2, 1));

		Scanner in = new Scanner(new FilterInputStream(System.in) {
			@Override
			public void close() throws IOException {
				// to avoid closing System.in
			}
		});

		Nim.play(in, initial, 1);
	}
}
