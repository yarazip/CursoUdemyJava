package classe;

public class Usuarios {
	String nome;
	String email;
	
	public boolean equals (Object objeto) {
		if (objeto instanceof Usuarios) {
			Usuarios outro = (Usuarios)objeto;
			
			boolean nomeIgual = outro.nome.equals(this.nome);
			boolean emailIgual = outro.email.equals(this.email);
			
			return nomeIgual && emailIgual;
		}else {
			return false;

		}
	}
}
