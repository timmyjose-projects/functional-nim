package com.z0ltan.functional.nim.collectors;

import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

import com.z0ltan.functional.nim.Board;

public class BoardCollector {
	public static Collector<Integer, List<Integer>, Board> toBoard() {
		return new BoardCollectorImpl();
	}

	static class BoardCollectorImpl implements Collector<Integer, List<Integer>, Board> {
		@Override
		public Supplier<List<Integer>> supplier() {
			return ArrayList::new;
		}

		@Override
		public BiConsumer<List<Integer>, Integer> accumulator() {
			return List::add;
		}

		@Override
		public BinaryOperator<List<Integer>> combiner() {
			return (acc, n) -> {
				acc.addAll(n);
				return acc;
			};
		}

		@Override
		public Function<List<Integer>, Board> finisher() {
			return (boardState -> new Board(boardState));
		}

		@Override
		public Set<java.util.stream.Collector.Characteristics> characteristics() {
			return Collections.unmodifiableSet(EnumSet.of(Collector.Characteristics.CONCURRENT));
		}
	}
}
