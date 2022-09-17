package Lista3;
import java.util.Scanner;
public class questao15 {
	public static void Complementação(int vetor[],int vetor2[]) {
	/* Sua função deverá receber dois vetores de números
	inteiros positivos e negativos. Ela deverá produzir um terceiro vetor em que
	cada índice desse vetor tenha um número que somado com elementos do
	mesmo índice dos vetores anteriores tenha a soma sempre igual a 10. */
     int vetorc[]=new int[vetor.length];
     int a=0;
     int i;
     int resultado;
     for(i=0;i<vetor.length;i++){
         resultado=10-(vetor[i]+vetor2[i]);
         vetorc[a]=resultado;
         a+=1;
     }
     for(i= 0;i<vetor.length;i++){
         System.out.print("[" +vetorc[i]+"] ");
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
		int vetor2[]= new int [t];
		for(int i=0;i<t;i++) {
			System.out.println("Escreva o elemento: " + i + " do segundo vetor");
			vetor2[i]= leitor.nextInt();
		}
		Complementação(vetor,vetor2);
		leitor.close();    
	}
}
