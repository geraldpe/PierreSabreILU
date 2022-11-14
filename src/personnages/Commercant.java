package personnages;

public class Commercant extends Humain {
	
	public Commercant(String nom, int argent) {
		super(nom, "thé", argent);
	}
	
	public int seFaireExtorquer() {
		int toTake = getArgent();
		super.perdreArgent(toTake);
		super.parler("je viens de me faire extorquer qu'est ce que le monde est injuste !!!");
		return toTake;
	}
	
	public void recevoir(int argent) {
		super.parler("je vous remercie 1000 fois pour ces " + argent + " sous !!!");
		super.gagnerArgent(argent);
	}
}
