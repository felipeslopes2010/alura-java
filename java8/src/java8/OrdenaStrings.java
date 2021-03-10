package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class OrdenaStrings {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<String>();
		palavras.add("Alura Online");
		palavras.add("Editora casa do códígo");
		palavras.add("Caelum");

		// Lambda com parenteses, pois tem mais de um argumento
		//palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
		
		palavras.sort(Comparator.comparing(s -> s.length()));
		palavras.sort(Comparator.comparing(String::length));
		
		Function<String, Integer> funcao = String::length;
		Function<String, Integer> funcao2 = s -> s.length();
		
		Comparator<String> comparador = Comparator.comparing(funcao);
		palavras.sort(comparador);
		
		System.out.println(palavras);

		Consumer<String> impressor = System.out::println;
		palavras.forEach(impressor);
		
		// Java 8 Lambda forEach
		palavras.forEach(System.out::println);

	}
}
