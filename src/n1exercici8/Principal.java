package n1exercici8;

public class Principal {

	public static void main(String[] args) {
		ReverseType newText = (testText) -> {
			String tempStr = "";
			for (String part : testText.split(" ")) {
				tempStr += new StringBuilder(part).reverse().toString() + " ";
			} 
			return tempStr;
		};

		System.out.println(newText.reverse("HELLO WORLD"));
	}
}

@FunctionalInterface
interface ReverseType {

	String reverse(String text);

}
