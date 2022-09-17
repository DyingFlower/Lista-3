package Lista3;
import java.util.Scanner;
public class questao12 {
	public static void Criptografia(String vetor[]) {
		String vetornovo[]= new String[vetor.length];
		String letras = "abcdefghijlmnopqrstuvxz";
		String simbolos = "%*(-+@#123456789{}!&$?:";
		String nome;
		int i;
		int j;
		int a=0;
		for(i=0;i<vetor.length;i++){
			nome = vetor[i];
		    for (j=0;j<23;j++){
		    	nome = nome.replace(letras.charAt(j),simbolos.charAt(j));
		    }
		    vetornovo[a]=nome;
		    a+=1;
		}
		for(i= 0;i<vetornovo.length;i++){
			System.out.print(vetornovo[i]+"\n");
		}
		    
		
	}
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Diga quantos elementos tem seu vetor que será criptografado:");
		int t = leitor.nextInt();
		String vetor[]= new String [t];
		for(int i=0;i<t;i++) {
			System.out.println("Escreva o elemento: " + i);
			vetor[i]= leitor.next();
		}
		Criptografia(vetor);
		leitor.close();

	}

}
