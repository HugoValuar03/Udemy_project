package colecoes;

public class Usuario {

	String nome;

	Usuario(String nome){
		this.nome = nome; 
	}
	
	public String toString() {
		return "Meu nome é " + this.nome + ".";
	}
	
	public int hashCode() {
		return 0;
	}

	public boolean equals(Object obj) {
		Usuario outroUsuario = (Usuario) obj;
		return this.nome.equals(outroUsuario.nome);
	}
	
	
}
