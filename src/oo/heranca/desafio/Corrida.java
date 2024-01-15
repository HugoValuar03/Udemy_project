package oo.heranca.desafio;

public class Corrida {

	public static void main(String[] args) {
		Ferrari f = new Ferrari();
		Civic c = new Civic();
		
		f.acelerar();
		f.acelerar();
		c.acelerar();
		c.acelerar();
		f.freiar();
		c.freiar();
		
		System.out.println(f);
		System.out.println(c);
	}
}
