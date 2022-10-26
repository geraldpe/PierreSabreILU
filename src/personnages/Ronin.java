package personnages;

public class Ronin extends Humain {
	private int honneur;
	
	public Ronin(String nom, int argent) {
		super(nom, "sochu", argent);
		this.honneur = 1;
	}
	
	private int calculer_dix_pourcent_monney() {
		return getArgent()*10/100;
	}
	
	public void donner(Commercant beneficiaire) {
		int a_donner = calculer_dix_pourcent_monney();
		super.parler(beneficiaire.getNom() + " prend ces " + a_donner + " sous");
		beneficiaire.recevoir(a_donner);
	}
	
}
