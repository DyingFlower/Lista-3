package Lista3;
import java.util.Scanner;
public class questao8 {
	public static void priorizaçao(int vetor[], int t) {
		/* Sua função deverá receber um vetor e pegar os elementos do
	vetor e colocar em um segundo vetor. Os novos elementos devem ser
	colocados no segundo vetor apenas quando eles contribuam para a média
	dos segundo vetor aumentar. */
		int i=0, somador=0,h;
		int vetor2[]= new int[vetor.length];
		for( i=0;i<vetor.length;i++) {// usei o codigo da questão 18 para os números ficarem em ordem crescente, ajudando no calculo da media;
			for(int j=0;j<vetor.length;j++) {
				if(vetor[i]<=vetor[j]) {
					h=vetor[j];
					vetor[j]=vetor[i];
					vetor[i]=h;
				}
			}
		}
		float media1;
	    float media2;
		for(i=0;i<vetor.length;i++) {
			somador=somador+vetor[i];
		}
		media1=somador;
		somador=0;
		int j=0;
		int cont=0;
		for(j=0;j<vetor.length;j++) {
			media2=media1-vetor[j];
			media1=media1-vetor[j];
			media2=media2/(vetor.length-j);
			if(media2>(media1/vetor.length)) {
				for(;j<vetor.length;cont++) {
					vetor2[cont]=vetor[j];
					j++;
				}
			}
			media2=0;
		}
		System.out.println("os elementos que deixam a media maior estão a seguir:");
		for(i=0;i<cont;i++) {
			System.out.print("["+ vetor2[i] + "] ");
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
		priorizaçao(vetor,t);
		leitor.close();
	}

}
