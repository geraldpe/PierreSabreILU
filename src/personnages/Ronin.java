package personnages;

public class Ronin extends Humain {
	private int honneur;
	
	public Ronin(String nom, int argent) {
		super(nom, "sochu", argent);
		this.honneur = 1;
	}
	
	private int getHonneur() {
		return honneur;
	}
	
	private int calculer_dix_pourcent_monney() {
		return getArgent()*10/100;
	}
	
	public void donner(Commercant beneficiaire) {
		int a_donner = calculer_dix_pourcent_monney();
		super.parler(beneficiaire.getNom() + " prend ces " + a_donner + " sous");
		beneficiaire.recevoir(a_donner);
	}
	
	public void provoquer(Yakuza adversaire) {
		int force = getHonneur()*2;
		super.parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
		if (force >= adversaire.getReputation()) {
			super.parler("Je t'ai eu petit Yakuza !");
			int argent_gagne = adversaire.perdre();
			honneur++;
			super.gagnerArgent(argent_gagne);	
		} else {
			super.parler("J'ai perdu contre ce Yakuza, mon honneur et ma bourse en ont pris un coup.");
			int argent_perdu = super.getArgent();
			adversaire.gagner(argent_perdu);
			honneur--;
		}
	}
	
}
