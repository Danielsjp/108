package n1exercici7;

import java.util.Arrays;
import java.util.List;

public class Principal {

	public static void main(String[] args) {

		String[] months = {"January","Februyyyyyyyyary","March","April","May","June","July","August","September","October","December"};
		Arrays.sort(months,(String a, String b) -> b.length() - a.length());
		System.out.println(Arrays.toString(months));
	}
	}
