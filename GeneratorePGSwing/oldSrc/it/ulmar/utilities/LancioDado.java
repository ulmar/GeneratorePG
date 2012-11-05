package it.ulmar.utilities;

import java.util.ArrayList;
import java.util.Random;

public class LancioDado {
	
	private static int simulaLancioDado(int facceDado){
		int result = 0;
		
		ArrayList<Integer> lanci = new ArrayList<Integer>();
		
		for (int i = 0; i < 1000; i++) {
			lanci.add(new Random().nextInt(facceDado) + 1);
		}
		
		result = lanci.get(new Random().nextInt(lanci.size()));
		
		return result;
	}
	
	public static int numeroLanciDado(int facceDado, int numeroLanci){
		int result = 0;
		
		for (int i = 0; i < numeroLanci; i++) {
			result = result + simulaLancioDado(facceDado);
		}
		
		return result;
	}

}
