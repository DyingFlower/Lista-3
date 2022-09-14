package Lista3;
import java.util.Scanner;
public class questao6 {
	public static void inversaodeordem(int vetor[]) {
		/* Sua função deverá retornar um vetor de ordem inversa.
	Desta forma, o primeiro elemento passa ser o último elemento do vetor, o
	segundo elemento passa ser o penúltimo, assim, sucessivamente; */
		int i;
		int k=vetor.length;
		int vetornovo[]= new int [vetor.length];
		for(i=0;i<vetor.length;i++) {
			k--;
			vetornovo[k]=vetor[i];
			
		}
		for(i=0;i<vetornovo.length; i++) {
			System.out.print("["+ vetornovo[i] +"]");
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
		inversaodeordem(vetor);
		leitor.close();

	}

}
