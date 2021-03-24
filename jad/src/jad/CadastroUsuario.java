package jad;

public abstract class CadastroUsuario {
	private String nome;
	private String identificacao;
	
	
	
	//construtor de cadastro
	public CadastroUsuario(String nome, String identificacao) {
			this.nome=nome;
			this.identificacao=identificacao;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getIdentificacao() {
		return identificacao;
	}
	public void setIdentificacao(String identificacao) {
		this.identificacao = identificacao;
	}

	//metodo que vai ser sobrescrito nas outras classes
	public String toString(){
		return " " +getNome() +"__ID:"+getIdentificacao();
		}

}