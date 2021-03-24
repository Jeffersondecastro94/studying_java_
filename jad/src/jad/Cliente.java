package jad;

public class Cliente extends CadastroUsuario {
	private String telefone;
	private String cidade;
	
	//CONSTRUTOR recebe o parametro no main , atraves do costrutor do oobjeto usuario
	//assim atribuindo valores iniciais aos atributos de usuario
	
	//SOBRECARGA DE  CONSTRUTORES
	public Cliente(String nome,String identificacao,String telefone) {
		super(nome,identificacao);
		this.telefone=telefone;
		
	}
	public Cliente (String nome,String identificacao,String telefone,String cidade) {
		super(nome,identificacao);
		this.telefone=telefone;
		this.cidade=cidade;
	}
	//sobrescrita do metodo toString da classe cadastro
	public String toString() {
		return (super.toString()+"__ telefone: "+telefone+"__ Cidade: "+ cidade);
		}
	//serve para retorna o valor do atributo funcao para fora desta classe
	public String getTelefone() {
		return telefone;
	}
	//serve para setar um novo valor ao atributo funcao
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
}