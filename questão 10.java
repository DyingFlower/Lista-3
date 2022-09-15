package Lista3;
import java.util.Scanner;
public class questão10 {
	public static void compactaçao(int vetor[]) {
		/* Sua função deverá receber um vetor composto com uma
	sequência de zeros e uns e gerar um novo vetor compactado
	A quantidade dos elementos repetidos devem ser contados e o número de
	ocorrências deve ser colocado logo após o elemento. */
		String valor;
		String vetork[] = new String[100];
		String vetorj[] = new String[100];
		String vetord[] = new String[100];
		int d=0;
		int c=0;
		int b=0;
		int a=0;
		int k;
		int i=0;
		int f=0;
		while ( i < vetor.length){
		    k=0;
		    while (vetor[i] == 0){
		        k += 1;
		        i += 1;
		        if (i == vetor.length){
		        break;
		        }
		    }
		    if (k>0){
		        valor = "0" +  Integer.toString(k);
		        vetork[a]=valor;
		        b++;
		        a+=1;
		    }
		    i+=1;
		}
		k=0;
		i=0;
		a=0;
		while ( i < vetor.length){
		    k=0;
		    while (vetor[i] == 1){
		        k += 1;
		        i += 1;
		        if (i == vetor.length){
		        break;
		        }
		    }
		    if (k>0){
		        valor = "1" +  Integer.toString(k);
		        vetorj[a]=valor;
		        c++;
		        a+=1;
		    }
		    i+=1;
		}
		if(vetor[0]==0) {
			if(b==c) {
				for(i=0;i<b;i++) {
					vetord[d]=vetork[i];
					d++;
					f++;
					vetord[d]=vetorj[i];
					d++;
					f++;
				}
			}
			if(b>c) {
				for(i=0;i<b;i++) {
					vetord[d]=vetork[i];
					d++;
					f++;
					if(i==b-1) {
						break;
					}
					vetord[d]=vetorj[i];
					d++;
					f++;
				}
			}
		}
		if(vetor[0]==1) {
			if(b==c) {
				for(i=0;i<b;i++) {
					vetord[d]=vetorj[i];
					d++;
					f++;
					vetord[d]=vetork[i];
					d++;
					f++;
				}
			}
			if(b<c) {
				for(i=0;i<c;i++) {
					vetord[d]=vetorj[i];
					d++;
					f++;
					if(i==c-1) {
						break;
					}
					vetord[d]=vetork[i];
					d++;
					f++;
				}
			}
		}
		for(i=0;i<f;i++) {
			System.out.print(" [" +vetord[i]+ "]");
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
		compactaçao(vetor);
		leitor.close();

	}
}
