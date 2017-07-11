package com.z0ltan.functional.nim;

import java.util.stream.IntStream;

import com.z0ltan.functional.nim.collectors.BoardCollector;

/**
 * No global state allowed!
 * 
 * @author z0ltan
 *
 */
public class Nim {
	// get the next player
	public static int next(int player) {
		return player == 1 ? 2 : 1;
	}

	// check if the game is finished
	public static boolean finished(Board board) {
		return board.stream().allMatch((n) -> n == 0);
	}

	// is this a valid move?
	public static boolean valid(Board board, int row, int num) {
		return board.get(row - 1) >= num;
	}

	// a move in the game
	public static Board move(Board board, int row, int num) {
		return IntStream.rangeClosed(1, board.size()).mapToObj((idx) -> {
			if (idx == row) {
				return board.get(idx - 1) - num;
			} else {
				return board.get(idx - 1);
			}
		}).collect(BoardCollector.toBoard());
	}

	// display a row of the board
	public static void putRow(int row, int num) {
		System.out.printf("%d: ", row);

		IntStream.rangeClosed(1, num).forEach((n) -> System.out.print("* "));
		System.out.println();
	}

	// display the whole board
	public static void putBoard(Board board) {
		IntStream.rangeClosed(1, board.size()).forEach((idx) -> putRow(idx, board.get(idx - 1)));
	}

	// get a digit from stdin
	public static int getDigit(final Scanner in, final String prompt) {
		System.out.print(prompt);
		System.out.flush();
		
		String c = in.nextLine();
		// System.out.println():
		if (isDigit(c)) {
			return digitToInt(c);
		} else {
			System.err.printf("ERROR: not a digit - %s", c);
			return getDigit(in, prompt);
		}
	}

	// these helper functions are strictly not required,
	// but they are used to maintain the Functional spirit!
	private static boolean isDigit(String s) {
		if (s.length() == 1) {
			return s.charAt(0) - '0' >= 0 && s.charAt(0) - '0' <= 9;
		} else {
			return false;
		}
	}

	private static int digitToInt(String s) {
		return Integer.parseInt(s);
	}

	// the main game loop
	public static void play(final Scanner in, Board board, int player) {
		putBoard(board);

		if (finished(board)) {
			System.out.printf("Player %d wins\n", next(player));
		} else {

			System.out.printf("Player %d ", player);
			int row = getDigit(in, "Enter a row number: ");
			int num = getDigit(in, "Enter the number of stars to remove: ");

			if (valid(board, row, num)) {
				play(in, move(board, row, num), next(player));
			} else {
				System.err.printf("ERROR: invalid move!\n");
				play(in, board, player);
			}
		}
	}
}
