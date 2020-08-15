/**
 * 
 */
package br.com.Dayanaferrer.git;
import java.util.Scanner;
/**
 * 	Faça um programa que solicite que o usuário informe o nome de uma disciplina,
 	e depois 2 notas para calcular a média da primeira unidade. Depois informe 
	mais 2 notas para calcular a média da segunda unidade. E depois exiba na 
	tela a seguinte mensagem:
	 
				Disciplina : XXX Média Final: XX
 */
public class Exercicio3Aula2 {

	public static void main(String[] args) {

		java.util.Scanner nota = new Scanner(System.in);

			String disciplina;
			double n1, n2, n3, n4, media1, media2, mediaFinal;

			System.out.println("Informe a disciplina: ");
			disciplina = nota.nextLine();
			
			System.out.println("Entre com as duas notas da Primeira Unidade: ");
			 n1 = nota.nextDouble();
			 n2 = nota.nextDouble();
			 
			 media1 = (n1+n2)/2;
			 
			System.out.print("Entre com as duas notas da Segunda Unidade: ");
			 n3 = nota.nextDouble();
			 n4 = nota.nextDouble();

			media2 = (n3+n4)/2;
			
			mediaFinal = (n1+n2+n3+n4)/4;

			System.out.println("Disciplina: " + disciplina );
			System.out.println("A media final é de: " + mediaFinal + " pontos.");

	}

}
