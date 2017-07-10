package com.z0ltan.functional.nim;

import java.util.List;
import java.util.stream.Stream;

/**
 * This represents the Nim Board. Java doesn't
 * have type aliases, so define a new class that
 * wraps the Integer list representing the board.
 * 
 * @author z0ltan
 *
 */
public class Board {
	private List<Integer> board;

	public Board() {
	}

	public Board(List<Integer> boardState) {
		this.board = boardState;
	}

	public List<Integer> board() {
		return this.board();
	}

	public int get(int idx) {
		return this.board.get(idx);
	}

	public int size() {
		return this.board.size();
	}

	public Stream<Integer> stream() {
		return this.board.stream();
	}
}
