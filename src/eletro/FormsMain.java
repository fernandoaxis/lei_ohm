package eletro;

import java.util.Scanner;
import eletrodominio.Forms;
public class FormsMain {
	public static void main(String[] args) {
		System.out.println("     V\r\n"
				+ "     |\r\n"
				+ "    / \\\r\n"
				+ "   /   \\ \r\n"
				+ "I ----- R\n");
		System.out.println("Informe o tipo de calculo que"
				+ " deseja realizar nesse script\n "
				+ "01 - Tensão | "
				+ "02 - Corrente | "
				+ "03 - Resistenia  ");
		
		Forms forms = new Forms();
		Scanner scanner = new Scanner(System.in);
		System.out.println("->");
		String entrada = scanner.nextLine();
		
		if(entrada.equals("01")) {
			System.out.println("Calculo de tensao\n "
					+ "Digite o valor de corrente e resistencia");
			System.out.print("->");
			int corrente = scanner.nextInt();
			System.out.print("->");
			int resistencia = scanner.nextInt();
			forms.tensaoCalculo(corrente, resistencia);
			
		}else if(entrada.equals("02")){
			System.out.println("Calculo de corrente\n "
					+ "Digite o valor de tensao e resistencia");
			System.out.print("->");
			int tensao = scanner.nextInt();
			System.out.print("->");
			int resistencia = scanner.nextInt();
			forms.correnteCalculo(tensao, resistencia);
			
		}else if(entrada.equals("03")) {
			System.out.println("Calculo de resistencia\n "
					+ "Digite o valor de tensao e corrente");
			System.out.print("->");
			int tensao = scanner.nextInt();
			System.out.print("->");
			int corrente = scanner.nextInt();
			forms.resistenciaCalculo(tensao, corrente);
		}else{
			System.out.println("Digite um dos valores acima");
		}
		
		scanner.close();
		
		
		
		
		
		
		
		
	}
}
