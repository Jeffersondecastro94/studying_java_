package jad;
import java.security.Principal;
import java.util.Scanner;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;


import javax.swing.JOptionPane;

public class Loja1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//tRY DO EXCEPTION
		try (Scanner input = new Scanner(System.in)) {
		
		//OBJETOS
		MenuVendedor menuV=new MenuVendedor();
		MenuCliente menuC=new MenuCliente();	
		
		Vendedor vendedor = new Vendedor("CODIGO:0101016-9",null,null,null);
		
		//THREAD
		
		MinhaThread thread= new MinhaThread("***");
		MinhaThread thread1= new MinhaThread("***");

		//CLIENTES CADASTRADOS, ACESSO AO SISTEMA / CONSTRUTOR/SOBRECARGA CONSTRUTORES
		
		CadastroUsuario cliente1 = new Cliente("ANA","321","8888-8888","Recife"); //POLIMORFISMO
		CadastroUsuario cliente2 = new Cliente("MOISES","123","9999-9999");//POLIMORFISMO

		
		Camisa camisa1= new Camisa("1000","P","Verde",20,"Manga Longa"); 
		Camisa camisa2= new Camisa("1001","M","Preto",30,"Manga Curta"); 
		Camisa camisa3= new Camisa("1002","G","Azul",50,"Sem Manga"); 
		
		Calca calca1= new Calca("1003", "P","Laranja",70,"Jeans");
		Calca calca2= new Calca("1004", "M","Rosa",100,"Sarja");
		Calca calca3= new Calca("1005", "G","Amarela",40,"Algodão");
		
		Meia meia1=new Meia("1006", "P","Laranja",10,"Cano Curto");
		Meia meia2=new Meia("1007", "M","Laranja",15,"Cano Longo");
		Meia meia3=new Meia("1008", "G","Laranja",8,"Cano Curto");

		//listas para mostrar na consulta de produtos disponiveis
		//add adiciona o objeto  dentro dos () a lista
		List camisas=new ArrayList();
		camisas.add(camisa1);
		camisas.add(camisa2);
		camisas.add(camisa3);
		
		List calcas=new ArrayList();
		calcas.add(calca1);
		calcas.add(calca2);
		calcas.add(calca3);
		
		List meias=new ArrayList();
		meias.add(meia1);
		meias.add(meia2);
		meias.add(meia3);

	

		//Map de camisa para fazer calculos de venda e compra
		//put adiciona a chave e relaciona ela ao objeto 
		Map<String,Camisa>mapaCamisa=new HashMap<>();
		mapaCamisa.put("1000", camisa1);
		mapaCamisa.put("1001", camisa2);
		mapaCamisa.put("1002", camisa3);
		
		Map<String,Calca>mapaCalca=new HashMap<>();
		mapaCalca.put("1003", calca1);
		mapaCalca.put("1004", calca2);
		mapaCalca.put("1005", calca3);
		
		Map<String,Meia>mapaMeia=new HashMap<>();
		mapaMeia.put("1006", meia1);
		mapaMeia.put("1007", meia2);
		mapaMeia.put("1008", meia3);

		//ARRAY 
		String opcoes[] = {"CLIENTE","VENDEDOR","SAIR DO SISTEMA"};
		
		//INICIO PROGRAMA
		//JOptionPane
		
		thread.start();
		
		while(thread.isAlive()) {
			JOptionPane.showMessageDialog(null,"INICIANDO O SISTEMA AGUARDE 10 SEG...");

			
	}
		
	
		JOptionPane.showMessageDialog(null,"BEM VINDO A LOJA 3 PEÇAS ");
		
String sair = "1";		
//loop do sistema, o usuario sai quando clicar e em seguida digitar 0
while(sair != "SAIR DO SISTEMA") {
		String entrada = (String) JOptionPane.showInputDialog(null,"Escolha se você é: ","--------------Bem vindo a loja 3 peças----",
				JOptionPane.QUESTION_MESSAGE,null,opcoes,opcoes[0]);
//fazer a verificaçao do while
 sair=entrada;

		if (entrada.equals("CLIENTE")) {
		
		//AUTENTIFICAÇAO DE MATRICULA
		System.out.println("CLIENTE INFORME SUA MATRICULA");
		String matricula =(String) JOptionPane.showInputDialog(null,"CLIENTE DIGITE SUA MATRICULA: ","Identificação: ");
		
		//DUAS OPÇÕES DE LOGIN,DEVIDO EXISTIR 2 CONSTRUTORES COM SOBRECARGA
		if (matricula.equalsIgnoreCase(cliente2.getIdentificacao())) {
			System.out.println("=========ACESSADO POR: "+ entrada+"=========");
			JOptionPane.showMessageDialog(null,"ACESSADO POR: "+entrada);
			System.out.println("=========BEM VINDO, "+ cliente2.getNome()+ "!. TELEFONE :" +((Cliente) cliente2).getTelefone()); //cast
			JOptionPane.showMessageDialog(null,"BEM VINDO, "+ cliente2.getNome()+ "!__ TELEFONE :" +((Cliente) cliente2).getTelefone());

				}else if (matricula.equalsIgnoreCase(cliente1.getIdentificacao())) {
				System.out.println("=========ACESSADO POR: "+ entrada+"=========");
				JOptionPane.showMessageDialog(null,"ACESSADO POR: "+entrada);

				System.out.println("=========BEM VINDO, "+ cliente1.toString());
				JOptionPane.showMessageDialog(null,"BEM VINDO, "+cliente1.toString());

		}		
		}else if(entrada.equals("VENDEDOR")) {

		System.out.println(vendedor.getNome());
		System.out.println("=========ACESSADO POR: "+ entrada+"=========");
		JOptionPane.showMessageDialog(null, "ACESSADO POR: "+entrada);

		};
		
		System.out.printf("===========BEM VINDO A LOJA DE ROUPAS 3 PEÇAS ===============");
		
		//MENU DO CLIENTE
		if (entrada.equals("CLIENTE")) {
	
			menuC.Menu();
			
			String opcoesCliente[] = {"CONSULTAR PRODUTOS","FAZER COMPRA","VOLTAR AO MENU PRINCIPAL"};
			
			//JOptionPane
			String escolhidoCliente = (String) JOptionPane.showInputDialog(null,"Escolha uma Opção: ","MENU",
					JOptionPane.QUESTION_MESSAGE,null,opcoesCliente,opcoesCliente[0]);
			
			System.out.println("*****************A OPÇÃO DESEJA FOI: "+ escolhidoCliente+"***************");
			
			if (escolhidoCliente.equals("CONSULTAR PRODUTOS")) {
				
				menuV.outdoorCamisa();
						System.out.println(camisas);
						int j=0;
						for(j=0 ; j < camisas.size() ; j++){
							JOptionPane.showMessageDialog(null ,camisas.get(j));
							};
				
				menuV.outdoorCalca();
						System.out.println(calcas);
						int z=0;
						for(z=0 ; z < calcas.size(); z++){

							JOptionPane.showMessageDialog(null ,calcas.get(z));
							};
					
				menuV.outdoorMeia();
				
						System.out.println(meias);
						int x=0;
						for(x=0 ; x < meias.size(); x++){

							JOptionPane.showMessageDialog(null ,meias.get(x));
							};

			};
				if (escolhidoCliente.equals("FAZER COMPRA")) {
					
					//COMPRA DO CLIENTE
					System.out.println("...........................................");
					System.out.println("QUANTOS PRODUTOS DESEJA COMPRAR? ") ;
					String quant =(String) JOptionPane.showInputDialog(null,"DIGITE QUANTOS ITENS DESEJA COMPRAR : ","Opções");
					System.out.println("VOCÊ OPTOU POR COMPRAR "+quant+" PRODUTOS!");
					System.out.println("...........................................");
					System.out.println(" ");

					int quant1 = Integer.parseInt(quant);
					//comando1 = input.nextInt();

					int k=0; 
					int precototal=0;

					
					//AQUI
					
					for(k=0 ; k < quant1 ; k++){
						System.out.println("************************************************");
						System.out.println("DIGITE O CODIGO DO PRODUTO :") ;
						System.out.println("************************************************* ");
							
						String chaveMapaRoupas = (String) JOptionPane.showInputDialog(null,"DIGITE O CODIGO DO ITEM QUE DESEJA COMPRAR : ","Opções");
					
						Camisa precoCamisa1=mapaCamisa.get(chaveMapaRoupas);
						Camisa precoCamisa2=mapaCamisa.get(chaveMapaRoupas);
						Camisa precoCamisa3=mapaCamisa.get(chaveMapaRoupas);
						
						//Calca precoCalca1=mapaCamisa.get(chaveMapaRoupas);
						/*Calca precoCalca2=mapaCalca.get(chaveMapaRoupas);
						Calca precoCalca3=mapaCalca.get(chaveMapaRoupas);
						
						Meia precoMeia1=mapaMeia.get(chaveMapaRoupas);
						Meia precoMeia2=mapaMeia.get(chaveMapaRoupas);
						Meia precoMeia3=mapaMeia.get(chaveMapaRoupas);*/

						
						int preco0=precoCamisa1.getPreco();
						int preco1=precoCamisa2.getPreco();
						int preco2=precoCamisa3.getPreco();
						
						/*int preco3=precoCalca1.getPreco();
						int preco4=precoCalca2.getPreco();
						int preco5=precoCalca3.getPreco();
						
						int preco6=precoMeia1.getPreco();
						int preco7=precoMeia2.getPreco();
						int preco8=precoMeia3.getPreco();*/


						if (chaveMapaRoupas.equals("1000")) {
								precototal=precototal+preco0;
						    };
						if (chaveMapaRoupas.equals("1001")) {
								precototal=precototal+preco1;								
							};
						if (chaveMapaRoupas.equals("1002")) {
								precototal=precototal+preco2;						
						    };
						/*
						 * if (chaveMapaRoupas.equals("1003")) {
								precototal=precototal+preco3;								
							};
						if (chaveMapaRoupas.equals("1004")) {
								precototal=precototal+preco4;									
							};
						if (chaveMapaRoupas.equals("1005")) {
								precototal=precototal+preco5;							
							};
						if (chaveMapaRoupas.equals("1006")) {
								precototal=precototal+preco6;								
							};
						if (chaveMapaRoupas.equals("1007")) {
								precototal=precototal+preco7;									
							};
						if (chaveMapaRoupas.equals("1008")) {
								precototal=precototal+preco8;							
							};*/
								
						System.out.println("	-----------------------------------------");
						System.out.println("	A SOMA DOS VALORES ESTA EM R$: "+precototal);		
						System.out.println("	------------------------------------------");

					};
						System.out.println(" ");
				     	System.out.println("===========================================================");
						System.out.println("VOCÊ COMPROU "+quant1+" ITENS,O VALOR TOTAL É DE R$: "+precototal);
			            JOptionPane.showMessageDialog(null,"VOCE COMPROU R$:"+precototal+"EM PRODUTOS, OBRIGADO!");
						System.out.println("============================================================");
						System.out.println(" ");
					//	thread.start();
						System.out.println("                           OBRIGADO E VOLTE SEMPRE!!! ");
						
								
			};
			if (escolhidoCliente.equals("VOLTAR AO MENU PRINCIPAL")) {
				System.out.println("Voce voltou ao menu principal");
				};
			}

		//MENU DO VENDEDOR
		if (entrada.equals("VENDEDOR")) {
			
			//OBJETO COM METODO DE INTERFACE
			menuV.Menu();
			
			String opcoesVendedor[] = {"CONSULTAR PRODUTOS","FAZER VENDA","MENU INICIAL"};
		String continuar;	
			//JOptionPane
			String escolhidoVend = (String) JOptionPane.showInputDialog(null,"Escolha uma Opção: ","MENU",
					JOptionPane.QUESTION_MESSAGE,null,opcoesVendedor,opcoesVendedor[0]);
			
			System.out.println("*****************A OPÇÃO DESEJA FOI: "+ escolhidoVend+"***************");
			
			if (escolhidoVend.equals("CONSULTAR PRODUTOS")) {
				menuV.outdoorCamisa();
				System.out.println(camisas);
				JOptionPane.showMessageDialog(null,"AS CAMISAS DISPONIVEIS SÃO: ");

				int j=0;
				for(j=0 ; j < camisas.size() ; j++){
					JOptionPane.showMessageDialog(null ,camisas.get(j));
					};
		
				menuV.outdoorCalca();
				System.out.println(calcas);
				JOptionPane.showMessageDialog(null,"AS CALÇAS DISPONIVEIS SÃO: ");
				int z=0;
				for(z=0 ; z < calcas.size(); z++){

					JOptionPane.showMessageDialog(null ,calcas.get(z));
					};

				menuV.outdoorMeia();
				System.out.println(meias);
				JOptionPane.showMessageDialog(null," AS MEIAS DISPONIVEIS SÃO: ");
				int x=0;
				for(x=0 ; x < meias.size(); x++){

					JOptionPane.showMessageDialog(null ,meias.get(x));
					};

			};
			if (escolhidoVend.equals("FAZER VENDA")) {
				//VENDA DO VENDEDOR
				System.out.println("...........................................");
				System.out.println("QUANTOS PRODUTOS DESEJA VENDER? ") ;
				
				String quantv =(String) JOptionPane.showInputDialog(null,"DIGITE QUANTOS ITENS DESEJA VENDER : ","Opções");
				
				
				//EXCEPTION PARA QUANDO A VENDA FOR ZERO
				if (quantv.equals("0")) {
					throw new  CompraZerada("Nao pode ser 0");
				}
				
								
				System.out.println("VOCÊ OPTOU POR COMPRAR "+quantv+" PRODUTOS!");
				System.out.println("...........................................");
				System.out.println(" ");

				int quantvv = Integer.parseInt(quantv);
				int k=0; 
				int precototal=0;

				for(k=0 ; k < quantvv ; k++){
					System.out.println("??????????????????????????????????????????????????");
					System.out.println("DIGITE O CODIGO DO PRODUTO :") ;
					System.out.println("?????????????????????????????????????????????????? ");
						
					String chaveMapaRoupas = (String) JOptionPane.showInputDialog(null,"DIGITE O CODIGO DO ITEM QUE DESEJA VENDER : ","Opções");
				
					Camisa precoCamisa1=mapaCamisa.get(chaveMapaRoupas);
					Camisa precoCamisa2=mapaCamisa.get(chaveMapaRoupas);
					Camisa precoCamisa3=mapaCamisa.get(chaveMapaRoupas);
				
					int preco0=precoCamisa1.getPreco();
					int preco1=precoCamisa2.getPreco();
					int preco2=precoCamisa3.getPreco();

				
					if (chaveMapaRoupas.equals("1000")) {
							precototal=precototal+preco0;
						
					    };
					if (chaveMapaRoupas.equals("1001")) {
							precototal=precototal+preco1;
							
						};
					if (chaveMapaRoupas.equals("1002")) {
							precototal=precototal+preco2;
									
							};
					System.out.println("	-----------------------------------------");
					System.out.println("	A SOMA DOS VALORES ESTA EM R$: "+precototal);		
					System.out.println("	------------------------------------------");

				};
					System.out.println(" ");
			     	System.out.println("===========================================================");
					System.out.println("VOCÊ VENDEU "+quantvv+" ITENS,O VALOR TOTAL É DE R$: "+precototal);
		            JOptionPane.showMessageDialog(null,"VOCE VENDEU R$:"+precototal+"EM PRODUTOS, PARABÉNS!");
					System.out.println("============================================================");
					System.out.println(" ");
					System.out.println("                           PARABÉNS PELA VENDA!!! ");
					
					
					
					};	
					if (escolhidoVend.equals("MENU PRINCIPAL")) {
						System.out.println("");
						String saidaComInputZero =(String) JOptionPane.showInputDialog(null,"VOLTAR AO INICIO: ","Digite 0: ");
						
						JOptionPane.showMessageDialog(null,"***********AGRADECEMOS A SUA VISITA VOLTE SEMPRE!!!*************");
						
					/*System.out.println("****************************************************************");
						System.out.println("***********AGRADECEMOS A SUA VISITA VOLTE SEMPRE!!!*************");
						System.out.println("****************************************************************");
						System.out.println("                          voce saiu"                             );*/

					}
					if (entrada.equals("MENU INICIAL")) {
						System.out.println("voltou");
						
					
					}
		//FIM 2 DO WLHO

								}
		
		if (entrada.equals("SAIR DO SISTEMA")) {
			System.out.println("");
			String saidaComInputZero =(String) JOptionPane.showInputDialog(null,"PARA FECHAR: ","Digite 0: ");
			
			JOptionPane.showMessageDialog(null,"***********AGRADECEMOS A SUA VISITA VOLTE SEMPRE!!!*************");
			
			System.out.println("****************************************************************");
			System.out.println("***********AGRADECEMOS A SUA VISITA VOLTE SEMPRE!!!*************");
			System.out.println("****************************************************************");
			System.out.println("                          voce saiu"                             );
			
			
	
      };
JOptionPane.showMessageDialog(null,"AGUARDE PARA VOLTAR AO MENU PRINCIPAL");

	/*thread1.start();
	
	while(thread.isAlive()) {
		
	}*/
	
	};

  } catch (CompraZerada e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	System.out.println("0 (ZERO) UMA ENTRADA INVALIDA, TENTE NOVAMENTE");
	JOptionPane.showMessageDialog(null,"0 (ZERO) É UMA ENTRADA INVALIDA,TENTE NOVAMENTE");

};

	}
}