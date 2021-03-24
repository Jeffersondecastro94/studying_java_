package jad;

public class Roupas {
	private String codigo;
	private String tamanho;
	private String cor;
	private int preco;


	//construtor de cadastro
		public Roupas (String codigo, String tamanho, String cor,int preco) {
				this.codigo=codigo;
				this.tamanho=tamanho;
				this.cor=cor;
				this.preco=preco;
		}

		public String getCor() {
			return cor;
		}

		public void setCor(String cor) {
			this.cor = cor;
		}

		public String getTamanho() {
			return tamanho;
		}

		public void setTamanho(String tamanho) {
			this.tamanho = tamanho;
		}

		public String getCodigo() {
			return codigo;
		}

		public void setCodigo(String codigo) {
			this.codigo = codigo;
		}

		public int getPreco() {
			return preco;
		}

		public void setPreco(int preco) {
			this.preco = preco;
		}
		
		public String toString(){
			return "Cod: "+getCodigo()+" Preço R$: "+getPreco()+" Tamanho: "+getTamanho()+" Cor: "+getCor();
			}
}
