import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Menu menu = new Menu();
		
		System.out.println("Bem vindo ao sistema de TodoList");
		
		List<String> categorias = new ArrayList<String>();
		
	
		
		boolean continua = true;
		while(continua) {
			menu.imprimeMenu();
			String valorDecisao = menu.decisaoUsuario();
			
			switch (valorDecisao) {
			case"1": {
				System.out.println("Digite o nome da gategoria sem espaços ");
		
			    Scanner scanNomeCategoria= new Scanner(System.in);
				String nomeCategoria = scanNomeCategoria.nextLine();
				
				categorias.add(nomeCategoria);
				
				break;
			}
			case "2":{
				for (String nome: categorias) {
					System.out.println("nome da categoria: " + nome);
					
				}
				break;
				}
			case "3":{
				int i;
			    System.out.println("Escolha a categoria a ser excluida: " + categorias);
			    int n = categorias.size();
			    
			    for (i =0; i <n; i++) {
			    	System.out.printf("Categoria %d- %s\n", i, categorias.get(i));
			    }
			    
			    System.out.println("\nInforme o numero da categoria a ser excluida: ");
			    Scanner ler= new Scanner(System.in);
			    i = ler.nextInt();
			    try {
			    	categorias.remove(i);
			    	System.out.printf("%d - %s Excluido com sucesso", i, categorias.get(i));
			    }
			    catch (IndexOutOfBoundsException e) {
			    	System.out.printf("\nErro: posição inválida (%s).",
			    	          e.getMessage());
			    }
				
				break;
			}
			case "0":{
				System.exit(0);
			}
			default: {
				System.out.println("opção invalida");			
				break;
			}
			}	
		}
		
	}

	 
	
}
