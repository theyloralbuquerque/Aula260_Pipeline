package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(3, 4, 5, 10, 7); // Criação da Lista list.
		
		Stream<Integer> st1 = list.stream().map(x -> x * 10); // .map() define cada elemento da stream como o elemento * 10.
		System.out.println(Arrays.toString(st1.toArray()));
		
		int sum = list.stream().reduce(0, (x, y) -> x + y); /* .reduce() pega o elemento inicial (0) e soma ao primeiro elemento de list, depois ele é esquecido
															 * e a soma será feita somente entre os elementos da list 'x + y'.
															 */
											
		
		
		
		System.out.println("Sum = " + sum);
		
		List<Integer> newList = list.stream()
				.filter(x -> x % 2 == 0) // .filter() filtra a stream com base em um predicate.
				.map(x -> x * 10)		 // .map() define cada elemento da stream como o elemento * 10.	
				.collect(Collectors.toList());  // .collect(Collectors.toList()) converte a stream (coleção) para Lista.
		System.out.println(Arrays.toString(newList.toArray())); // newList.toArray() converte uma Lista (list) em um array.

	}

}
