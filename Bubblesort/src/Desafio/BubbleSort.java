package Desafio;

import java.util.Random;

public class BubbleSort {

	public static void main(String[] args) {
		Random gerador = new Random();
		int[] lista = new int [100];
		
		for(int i = 0; i < 100; i++) {
			lista[i] = gerador.nextInt(300);	
		}
		
		int auxiliar; 
		
		for(int i = 0; i < lista.length; i++) {
			for(int j = i; j < lista.length; j++) {
				if(lista[i] > lista[j]) {
					auxiliar = lista[i];
					lista[i] = lista[j];
					lista[j ] = auxiliar;
				}
			}
		}
		
		for(int i = 0; i < lista.length; i++) {
			System.out.println(lista[i]);
		}

	}

}


