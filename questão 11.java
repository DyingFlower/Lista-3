package Lista3;
import java.util.Scanner;
public class questao11 {
	public static void descompactaçao(String vetor[]) {
		    int i;
	        int j;
	        int a=0;
	        int convertido;
	        String num;
	        int vetornovo[] =new int[100];

	        for(i=0;i<vetor.length;i++){
	            num = vetor[i];
	            if(num.charAt(0)=='0'){
	               convertido = Character.getNumericValue(num.charAt(1));

	               for (j=0;j<convertido;j++){
	                   vetornovo[a]=0;
	                   a+=1;
	               }

	            }
	            else {
	               convertido = Character.getNumericValue(num.charAt(1));

	               for (j=0;j<convertido;j++){
	                   vetornovo[a]=1;
	                   a+=1;
	               }
	            }
	        }

	        for(i=0;i<a;i++){
	            System.out.print(vetornovo[i]);
	        }
	}
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Diga quantas sequências de 0 e 1 terá seu vetor:");
		int t = leitor.nextInt();
		String vetor[]= new String [t];
		for(int i=0;i<t;i++) {
			System.out.println("Escreva o elemento: " + i);
			vetor[i]= leitor.next();
		}
		descompactaçao(vetor);
		leitor.close();
	}
}
