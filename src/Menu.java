import java.util.Scanner;

public class Menu {
	public void imprimeMenu( ) {
		System.out.println("Digite o numero do que deseja fazer");
		
		System.out.println("1 - Adicionar categoria");
		System.out.println("2 - Listar todas categorias");
		System.out.println("3 - Deletar categoria");
		System.out.println("0 - sair do programa");
	}
	public String decisaoUsuario() {

		Scanner decisaoUsuario = new Scanner(System.in);
		
		String valorDecisao = decisaoUsuario.next();
		
		return valorDecisao;
		
	}


}
