package Lista3;
import java.util.Scanner;

public class questao1 {
	public static void pesquisa(int vetor[],int n) {
		/* Sua função deverá receber um vetor e retornar se um dado
		elemento está dentro do vetor informado. Caso o elemento esteja no vetor
		retornar a posição do elemento no vetor, caso não esteja retornar -100; */
		int i;
		int x=0;
		for(i=0;i<vetor.length;i++) {
			if(vetor[i]==n) {
				System.out.println("O número está contido no vetor ");
				System.out.println(i+ "  é a posição do numero dentro do vetor");
				x+=1;
			}
		
		}
		if(x==0) {
			System.out.println(-100);
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
		System.out.println("Escreva o número que representará o objetivo da função:");
		int n= leitor.nextInt();
		pesquisa(vetor, n);
	}
	

}
