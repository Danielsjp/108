package pivalue;

import java.util.function.Function;

public class Principal {

	public static void main(String[] args) {
		Function<Double, String> getPiValue = a -> "N�mero Pi: " + a ;
	    System.out.println(getPiValue.apply(Math.PI));
	}
}
