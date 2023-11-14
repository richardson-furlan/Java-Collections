package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class OrdemCoresColList {

	public static void main(String[] args) {
		
		String cor;
		Scanner ler = new Scanner(System.in);
		List<String> cores = new ArrayList<String>();
		
		System.out.println("Olá");
		
		for(int x = 0; x < 5; x++ ) {
			System.out.println("\nEntre com a "+(x+1)+"ª cor: ");
			cor = ler.next();
			cores.add(cor);
		}
						
		System.out.println("\nListar todas as cores: ");
		
		for(String listaElementos:cores) {
			System.out.println(listaElementos);	
		}
		
		Collections.sort(cores);
		
		System.out.println("\nOrdenar as cores: ");
		
		for(String listaElementos:cores) {
			System.out.println(listaElementos);	
		}
	}

}
