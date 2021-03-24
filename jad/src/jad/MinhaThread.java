package jad;

public class MinhaThread extends Thread{
	private String aviso;
	
	public MinhaThread(String aviso) {
		this.aviso=aviso;
	}
	
	
	
	public void run() {
		
		try {
			for (int i=1; i<11;i++) {
				System.out.println( aviso + "INICIANDO O PROGRAMA AGUARDE..."+ i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//System.out.println("executando o aviso");
	}
}
