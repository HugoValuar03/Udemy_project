package classe;

public class Equals {

	public static void main(String[] args) {
		Usuario u1 = new Usuario();
		u1.nome = "Hugo Valuar";
		u1.email = "hugovaluar@hotmail.com";

		Usuario u2 = new Usuario();
		u2.nome = "Hugo Valuar";
		u2.email = "hugovaluar@hotmail.com";
		
		System.out.println(u1 == u2);
		System.out.println(u1.equals(u2));
		System.out.println(u2.equals(u1));
	}
}
