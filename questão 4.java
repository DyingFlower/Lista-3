package Lista3;
import java.util.Scanner;
public class questao4 {
	public static void Somatorio(int vetor[]) {
		/*Sua função deverá receber um vetor e retorna a soma de todos
		elementos do vetor;*/
		int i, somador=0;
		for(i=0;i<vetor.length;i++) {
			somador=somador+vetor[i];
			
		}
		 System.out.println(somador);
	}
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Diga quantos elementos tem seu vetor");
		int t = leitor.nextInt();
		int vetor[]= new int [t];
		System.out.println("Se for usar a função de compactação ou descompactação digite apenas 0 ou 1");
		for(int i=0;i<t;i++) {
			System.out.println("Escreva o elemento: " + i);
			vetor[i]= leitor.nextInt();
		}
		Somatorio(vetor);
		leitor.close();

	}

}
