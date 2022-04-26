package n1exercici1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Principal {

	public static void main(String[] args) {
	
		/*
		 * ArrayList<String> lista1 = new ArrayList<>(); ArrayList<String> lista2 = new
		 * ArrayList<>(); lista1.add("manzana"); lista1.add("platano");
		 * lista1.add("tomate");
		 */
		
		List<String> lines = Arrays.asList("spring", "node", "mkyong");

        List<String> result = lines.stream()                // convert list to stream
                .filter(line -> line.contains("o") && line.length()>4)     // we dont like mkyong
                .collect(Collectors.toList());              // collect the output and convert streams to a List
        		result.forEach(System.out::println); 
  	
    }
}
