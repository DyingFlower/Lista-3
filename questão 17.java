package Lista3;
import java.util.Scanner;
public class questão17 {
	public static void Explosao(int vetor[]) {
	/* Sua função deverá receber um vetor e gerar um segundo vetor
	com os dados acrescidos. O número de cada posição do vetor de entrada
	corresponde ao número de elementos que devem ser gerados. */
	        int vetor2[]=new int[100];
	        int i,j,a=0;
	        for(i=0;i<vetor.length;i++){
	            for(j=0;j<vetor[i];j++){
	                vetor2[a]=vetor[i];
	                a+=1;
	            }
	        }
	        for(i= 0;i<a;i++){
	            System.out.print("[" +vetor2[i]+ "] ");
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
		Explosao(vetor);
		leitor.close();

	}

}
