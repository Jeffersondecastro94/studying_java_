package jad;

public class Calca extends Roupas{
	
	private String material;
	
	public Calca (String codigo,String tamanho,String cor,int preco,String material) {
	super(codigo,tamanho,cor,preco);
		this.material=material;
	
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
	
	public String toString(){
		//return (super.toString()+"CODIGO: "+getCodigo()+", Preço R$: "+getPreco()+", Tamanho: "+getTamanho()+", Cor: "+getCor()+", Tecido:"+getMaterial()+"//");
		return (super.toString()+", Tecido:"+getMaterial()+"//");

	}
}