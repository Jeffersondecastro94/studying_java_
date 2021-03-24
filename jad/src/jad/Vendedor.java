package jad;

public class Vendedor extends CadastroUsuario {
	private String rzSocial;
	private String contato;
	
	
	//construtor de cadastro produto(serve para atribuir valor inicial as variaveis)	
		public Vendedor(String nome,String identificacao,String rzSocial,String contato) {
			super(nome,identificacao);
			this.rzSocial=rzSocial;
			this.contato=contato;
			
		}
	public void setRzsocial(String rz) {
		rzSocial = rz;
	}
	
	public String getRzsocial() {
		return rzSocial;
	}
	
	public void setContato(String contato) {
		this.contato = contato;
	}
	
	public String getContato() {
		return contato;
	}
	//sobrescrita de toString da classe cadastro
	public String toString() {
		return (super.toString()+"-- Razao Social:"+rzSocial+"--- Contato: "+contato);
		}


};