package Telefone;

public class Contato {
	public String nome;
	public String numero;
	
	 public Contato(String nome, String numero) {
	        this.nome = nome;
	        this.numero = numero;
	    }
	 public String getNome() {
	        return nome;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	    public String getNumero() {
	        return numero;
	    }

	    public void setNumero(String numeroTelefone) {
	        this.numero = numeroTelefone;
	    }
}
