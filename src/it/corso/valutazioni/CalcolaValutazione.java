package it.corso.valutazioni;

public class CalcolaValutazione {
	int id;
	int percentualeAssenze;
	float mediaVoti;
	
	 CalcolaValutazione(int id, int percentualeAssenze,float mediaVoti) {
		this.id=id;
		this.percentualeAssenze=percentualeAssenze;
		this.mediaVoti=mediaVoti;
	}
	 
	 boolean esitoValutazione() {
		 	boolean promosso=false;
			if(percentualeAssenze>=50) {
				promosso=false;
			}else if(percentualeAssenze>=25 && percentualeAssenze<50 && mediaVoti>2) {
				promosso=true;
			}else if(percentualeAssenze<25 && mediaVoti>=2) {
				promosso=true;
				}
			return promosso;
		}
}
