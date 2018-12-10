package fundamentos;

public class NotacaoPonto {

	public static void main(String[] args) {
		// String s;
		// s = "Bom dia ?";
		// s = s.toUpperCase();
		// s = s.replace("?", "Robson");
		// s = s.concat("!");

		String s = "Bom dia ?".toUpperCase().replace("?", "Robson").concat("!");
		System.out.println(s);
	}
}
