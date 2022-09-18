package Lista3;
import java.util.Scanner;
public class questao14{
	public static void Contagemdecaracteres(String vetor[]){
		 String vetorigual[]= new String[vetor.length];
	        int vetorc[]= new int[100];
	        int a=0;
	        int i,j;
	        int contador;
	        int n = vetor.length;

	        for(i=0;i<vetor.length;i++){
	            vetorigual[i]=vetor[i];
	        }
	        for (i=0;i<n;i++){
	            int k=i+1;
	            int removidos=0;
	            for(j=i+1;j<n;j++){
	                if(vetor[j].charAt(0)==vetor[i].charAt(0)){
	                    removidos++;
	                }
	                else{
	                    vetor[k++]=vetor[j];

	                }
	            }
	            n=n-removidos;
	        }
	        for(i=0;i<n;i++){
	            contador=0;
	            for(j=0;j<vetorigual.length;j++){
	                if(vetor[i].charAt(0)==vetorigual[j].charAt(0)){
	                    contador++;
	                }
	            }
	            vetorc[a]=contador;
	            a+=1;
	        }

	        for(i=0;i<n;i++){
	            System.out.print(vetor[i]+"="+vetorc[i]+" ");
	        }
	}
	    public static void main(String[] args) {
	        Scanner leitor = new Scanner(System.in);
	        System.out.println("Diga quantos elementos tem seu vetor");
	        int t = leitor.nextInt();
	        String vetor[]= new String [t];
	        for(int i=0;i<t;i++) {
	            System.out.println("Escreva o elemento: " + i);
	            vetor[i]= leitor.next();
	        }
	        Contagemdecaracteres(vetor);
	        leitor.close();
	    }
	}


