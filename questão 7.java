package Lista3;
import java.util.Scanner;
public class questao7 {
	public static void inversaodevetores(int vetor[], int vetor2[]) {
		/*Sua função deverá receber dois vetores. Sendo que
	os dados do primeiro vetor deve ser colocado no segundo vetor e os dados
	segundo vetor devem ser colocados no primeiro vetor.*/
		int receptor[]= new int [vetor.length]; 
		for(int i=0; i<vetor.length;i++) {
			receptor[i]=vetor[i];// infelizmente só funciona para vetores de mesmo tamanho.
			vetor[i]=vetor2[i];
			vetor2[i]=receptor[i];
		}
		System.out.println("Os novos vetores estão sendo representados a seguir respectivamente na ordem: ");
		for(int i=0; i<vetor.length;i++) {
			System.out.print("[" + vetor[i] + "]");
		}
		System.out.println("\n");
		for(int i=0; i<vetor2.length;i++) {
			System.out.print("["+ vetor2[i] + "]");
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
		inversaodevetores(vetor,vetor2);
		leitor.close();
	}

}
