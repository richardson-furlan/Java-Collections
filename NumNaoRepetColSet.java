package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class NumNaoRepetColSet {

	public static void main(String[] args) {

		Set<Integer> set = new HashSet<Integer>();
		Scanner ler = new Scanner(System.in);
		int num;
		
		for(int x = 0; x < 10; x++) {
			System.out.println("\nEntre com o "+(x+1)+"º número: ");
			num = ler.nextInt();
			set.add(num);
		}
		
		Iterator<Integer> iSet = set.iterator();
		System.out.println("\nListar dados do Set: ");
		
		while(iSet.hasNext()){
			System.out.println(iSet.next());
		}
		

	}

}
