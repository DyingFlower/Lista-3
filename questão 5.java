package Lista3;
import java.util.Scanner;
public class questao5 {
	public static void junçaodevetor(int vetor[], int vetor2[], int t, int j) {
		/* Sua função deverá receber dois vetores de qualquer
		tamanho e retornar apenas um vetor que contenha os dois vetores. O
		primeiro vetor deverá ficar nas primeiras posições e o segundo vetor nas
		últimas posições. */
		int vetorreceptor[]=new int [t+j];
		int i=0;
		for( i=0;i <vetor.length;i++) {
				vetorreceptor[i] = vetor[i];
			}
		int k;
		for(i=0; i < vetor2.length; i++) {
			k=i+t;
			vetorreceptor[k]=vetor2[i];
		}
		for( i=0; i<vetorreceptor.length; i++) {
			System.out.print("[" +vetorreceptor[i] + "]");
		}
	}
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Diga quantos elementos tem seu vetor");
		int t = leitor.nextInt();
		int vetor[]= new int [t];
		for(int i=0;i<t;i++) {
			System.out.println("Escreva o elemento: " + i);
			vetor[i]= leitor.nextInt();
		}
		System.out.println(" Diga quantos elementos tem o segundo vetor");
		int j = leitor.nextInt();
		int vetor2[]= new int [j];
		for(int i=0;i<j;i++) {
			System.out.println("Escreva o elemento: " + i);
			vetor2[i]= leitor.nextInt();
		}
		junçaodevetor(vetor,vetor2,t,j);
		leitor.close();

	}

}
