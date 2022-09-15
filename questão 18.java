package Lista3;
import java.util.Scanner;
public class questão18 {
	public static void Organizaçao(int vetor[]) {
		/* Sua função deverá receber um vetor e organizar os
		elementos a fim de que os elementos iguais fiquem próximos.*/
		int h;
		for(int i=0;i<vetor.length;i++) {
			for(int j=0;j<vetor.length;j++) {
				if(vetor[i]<=vetor[j]) {
					h=vetor[j];
					vetor[j]=vetor[i];
					vetor[i]=h;
				}
			}
		}
		for(int i=0;i<vetor.length;i++) {
			System.out.print("[" + vetor[i]+ "] ");
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
		Organizaçao(vetor);
		leitor.close();
	}

}
