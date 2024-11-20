package com.hlag.cargoitem;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.hlag.cargoitem.dto.Cargoitem;

public class cargo {

	public static void main(String[] args) {

		StreamActions action = () -> {
			System.out.println("find performance");
		};
		action.getPerformance();
		System.out.println(" get value of" + action.getPerformance());
	}

	@FunctionalInterface
	interface StreamActions {

		public void findPerformance();

		List<Cargoitem> cargos = Arrays.asList(
				new Cargoitem(55, 3456, "ss"),
				new Cargoitem(345, 987, "mm"),
				new Cargoitem(95, 56, "aa"),
				new Cargoitem(76, 876, "dd"));

		public default List<Cargoitem> getPerformance() {
			return cargos.stream()
					.filter(e -> e.getWeight() > 50 && (e.getWeight() == 9))
					.sorted((a, b) -> Double.compare(a.getWeight(), b.getWeight()))
					.collect(Collectors.toList());

		}

	}
}
