package Lista3;
import java.util.Scanner;
public class questao3 {
    public static void Separaçãodevalorespositivosevaloresnegativos(int vetor[]) {
		/*Sua função deverá receber um vetor e deverá colocar nesse vetor os números negativos 
		 nas primeiras posições e os números positivos na últimas posições; */
		int i;
		int k=0;
		int separador[]=new int [vetor.length];
		for(i=0; i<vetor.length;i++) {
			if(vetor[i]<0) {
				separador[k]=vetor[i];
				k++;
			}
		}
		for(i=0; i<vetor.length;i++) {
			if(vetor[i]>0) {
				separador[k]=vetor[i];
				k++;
			}
		}
		for(i=0; i<vetor.length;i++) {
			System.out.print("[" + separador[i] + "]");
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
		Separaçãodevalorespositivosevaloresnegativos(vetor);
		leitor.close();
	}

}
