package n1exercici3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Principal {

	private static final double numero = 0;
	public static void main(String[] args) {

		List<String> meses = Arrays.asList("Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio");
		// meses.forEach(System.out::println);
		System.out.println("Lambda forEach:");
		meses.forEach(l -> System.out.println(l)); // it works
	
		
	}
	

}
