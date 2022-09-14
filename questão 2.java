package Lista3;
import java.util.Scanner;
public class questao2 {
	public static void pesquisaporindice(int vetor[], int n) {
		/* Sua função deverá receber um vetor e retornar o
		elemento do vetor por meio de um índice informado. Seu programa deverá
		tratar os casos em que o índice não existe no vetor. */
		int i;
		for(i=0;i<vetor.length;i++) {
			if(i==n) {
				System.out.println(vetor[i] + " é o elemento nessa posição");
			}
		}
		if(n>vetor.length) {
			System.out.println("Não existe essa posição no vetor.");
		}	
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
		System.out.println("Escreva o número que representará o objetivo da função:");
		int n= leitor.nextInt();
    pesquisaporindice(vetor,n);
		leitor.close();
  }
}
