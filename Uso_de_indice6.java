import java.util.Scanner;
public class Uso_de_indice6 {
public static void main(String[] args) {
	
		Scanner teclado = new Scanner(System.in);
	    double  media, aprov, porcent;
	    int y, alunos;
	    media = 0; aprov = 0;
	    
	    	System.out.println("Insira o numero de salas: ");
	    	y = teclado.nextInt();
	 
	    double[] x = new double[y];
		
	    for(int i=0; i < y; i++) {

	        System.out.print("Insira o numero de alunos na sala " + (i + 1) +": ");
	        alunos = teclado.nextInt();
	        
	        double[] nota = new double[alunos];
	        
	        for(int c=0; c < alunos; c++) {
	        	
	        	System.out.print("Insira a nota do aluno " + (c + 1) +": ");
	        	nota[c] = teclado.nextInt();
	        }
	        for(int c=0; c < alunos; c++) {
	          	
	          	media = media + nota[c];      
	        } 

	        media = media / alunos;

	        for(int c=0; c < alunos; c++) {
	        	if (nota[c] > media) {
	        	  aprov = aprov + 1;
	        	}
	        }
	        for(int c=0; c < alunos; c++) {
	        	System.out.println("A media do aluno " + (c + 1) + " da sala " + (i + 1) + " foi " + nota[c]);
	        }
	        
	        porcent = aprov / alunos * 100;
	        System.out.println("A porcentagem de alunos acima da media da sala é " + String.format("%.3f", porcent) + "%");
	    }
	}
	}
