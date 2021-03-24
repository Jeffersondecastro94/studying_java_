package jad;

public class Camisa extends Roupas{

	private String tipoDaCamisa;
	
	//construtor de camisa (serve para atribuir valor inicial as variaveis)	
		public Camisa (String codigo,String tamanho,String cor,int preco,String tipoDaCamisa) {
		super(codigo,tamanho,cor,preco);
			this.tipoDaCamisa=tipoDaCamisa;
			
		}

		public String getTipoDaCamisa() {
			return tipoDaCamisa;
		}

		public void setTipoDaCamisa(String tipoDaCamisa) {
			this.tipoDaCamisa = tipoDaCamisa;
		}

		public String toString(){
			//return "CODIGO: "+getCodigo()+", Preço R$: "+getPreco()+", Tamanho: "+getTamanho()+", Cor: "+getCor()+", Tipo:"+getTipoDaCamisa()+" //";
			return (super.toString()+", Tecido:"+getTipoDaCamisa()+"//");
	
		}
}


