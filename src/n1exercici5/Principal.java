package n1exercici5;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Principal {

	private static final double numero = 0;
	public static void main(String[] args) {

			Function<Double, String> getPiValue = a -> "Número Pi: " + a ;
		    System.out.println(getPiValue.apply(Math.PI));
		
	}

}
