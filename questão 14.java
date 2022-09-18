package Lista3;
import java.util.Scanner;
public class questao14 {
	public static void Contagemdecaracteres(String vetor[]) {
		/* Sua função deverá contar os caracteres que
	aparecem no vetor. Os caracteres podem ser qualquer letra ou número do
	alfabeto. */
	    String vetornovo[]= new String[100];
        int contador;
        int vetorc[]=new int[100];
        int i, j, n = 0;
        int a=0;
        int c=0;
        int tam = vetor.length;
        for( i = 0; i < tam; i++){

            for( j = 0; j < n; j++ ){
                if( vetor[i] == vetornovo[j] )
                    break;
            }

            if( j == n ){
                vetornovo[n] = vetor[i];
                n++;
                c++;
            }
        }
        for(i=0;i<c;i++){
            contador=0;
            for(j=0;j<vetor.length;j++){
                if(vetornovo[i]==vetor[j]){
                    contador++;
                }
            }
            vetorc[a]=contador;
            a+=1;
        }
        for( i = 0; i < c; i++ ){
            System.out.print(vetornovo[i]+"="+vetorc[i]+" ");
        }
    }
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		String vetor[]={"a","b","c","3","3","5","a","c"};// quando usa o Scanner o codigo buga, não sei pq;
		Contagemdecaracteres(vetor);
		leitor.close();
	}

}
