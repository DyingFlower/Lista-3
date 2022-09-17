package Lista3;
import java.util.Scanner;
import java.util.Random;
public class questão16 {
	public static void Polarizaçao(int vetor[]) {
		/*Sua função deverá receber um vetor com números aleatórios.
	Os números ímpares devem ficar nas posições iniciais do vetor e os números
	pares nas posições finais. */
	        int vetor2[]=new int[vetor.length];// considerei 0 sendo par.
	        int a=0;
	        int i;
	        for(i=0;i<vetor.length;i++){
	            if (vetor[i]%2!=0){
	                vetor2[a]=vetor[i];
	                a+=1;
	            }
	        }
	        for(i=0;i<vetor.length;i++){
	            if (vetor[i]%2==0||vetor[i]==0){
	                vetor2[a]=vetor[i];
	                a+=1;
	            }
	        }
	        for(i= 0;i<vetor2.length;i++){
	            System.out.print("[" +vetor2[i]+"] ");
	        }
	}
	public static void main(String[] args) {
		Scanner leitor= new Scanner(System.in);
		Random random = new Random();
		System.out.println("Diga quantos elementos tem seu vetor");
		int t = leitor.nextInt();
		int vetor[]= new int [t];
		for(int i=0;i<t;i++) {
			vetor[i]= random.nextInt(10);
		}
		Polarizaçao(vetor);
		leitor.close();
	}

}
