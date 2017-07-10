package com.z0ltan.functional.nim;

import java.util.List;
import java.util.stream.Stream;

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
