package jad;

public class Meia extends Roupas {
	private String altura;
	
		//construtor de Meia (serve para atribuir valor inicial as variaveis)	
			public Meia (String codigo,String tamanho,String cor, int preco,String altura) {
			super(codigo,tamanho,cor,preco);
				this.altura=altura;
				
			}

			public String getAltura() {
				return altura;
			}

			public void setAltura(String altura) {
				this.altura = altura;
			}
			
			//toString para exibir as informaçoes no JOption da lista de array em consultar produto
			public String toString(){
				return "CODIGO: "+getCodigo()+", Preço R$: "+getPreco()+", Tamanho: "+getTamanho()+", Cor: "+getCor()+", Altura:"+getAltura()+" //-//";
				}
	}

