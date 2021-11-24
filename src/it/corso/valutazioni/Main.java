package it.corso.valutazioni;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		Random numeroRandom=new Random();
		int percentualeAssenze,id;
		float mediaVoti; 
		boolean promosso;
		CalcolaValutazione[] calcolaValutazione= new CalcolaValutazione[20];
		
		 for(int i=0;i<calcolaValutazione.length;i++) {
			 id=i+1;
			 percentualeAssenze=numeroRandom.nextInt(101); 
			 mediaVoti=numeroRandom.nextFloat()*5;
			 calcolaValutazione[i]=new CalcolaValutazione(id,percentualeAssenze,mediaVoti);
			 promosso=calcolaValutazione[i].esitoValutazione();
			 if(promosso) {
				 System.out.println("lo studente numero "+id+ " è stato promosso");
			 }else {
				 System.out.println("lo studente numero "+id+ " è stato bocciato");
			 }
		 }

	}

}
