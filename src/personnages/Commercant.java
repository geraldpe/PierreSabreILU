package personnages;

public class Commercant extends Humain {
	
	public Commercant(String nom, int argent) {
		super(nom, "thé", argent);
	}
	
	public int seFaireExtorquer() {
		int to_take = getArgent();
		super.perdreArgent(to_take);
		super.parler("je viens de me faire extorquer qu'est ce que le monde est injuste !!!");
		return to_take;
	}
	
	public void recevoir(int argent) {
		super.parler("je vous remercie 1000 fois pour ces " + argent + " sous !!!");
		super.gagnerArgent(argent);
	}
}
