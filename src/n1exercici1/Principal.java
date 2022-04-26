package n1exercici1;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(checkIfStringsHaveSubStrings("abcxde", "xyz"));
		System.out.println(checkIfStringsHaveSubStrings("abcde", "xyz"));

	}

	public static String checkIfStringsHaveSubStrings(String s1, String s2) {
		return s1.chars().filter(c -> s2.contains((char) c + "")) .findFirst().isEmpty() ? "La cadena: "+s1+" no contiene la letra "+s2 : s1;
		
	}

}
