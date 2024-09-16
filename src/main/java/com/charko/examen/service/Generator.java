package com.charko.examen.service;

import java.util.ArrayList;
import java.util.Random;
public class Generator {

public static ArrayList<Integer> generador(){
	
	ArrayList<Integer> lista = new ArrayList<>();
	
			for(int i=0;i<5;i++){
				Random rand = new Random();
				lista.add(rand.nextInt(10) + 1);
			}
			return lista;
		}
	
}
