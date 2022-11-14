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
	
	private int calculerDixPercentMonney() {
		return getArgent()*10/100;
	}
	
	public void donner(Commercant beneficiaire) {
		int aDonner = calculerDixPercentMonney();
		super.parler(beneficiaire.getNom() + " prend ces " + aDonner + " sous");
		beneficiaire.recevoir(aDonner);
	}
	
	public void provoquer(Yakuza adversaire) {
		int force = getHonneur()*2;
		super.parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
		if (force >= adversaire.getReputation()) {
			super.parler("Je t'ai eu petit Yakuza !");
			int argentGagne = adversaire.perdre();
			honneur++;
			super.gagnerArgent(argentGagne);	
		} else {
			super.parler("J'ai perdu contre ce Yakuza, mon honneur et ma bourse en ont pris un coup.");
			int argentPerdu = super.getArgent();
			adversaire.gagner(argentPerdu);
			honneur--;
		}
	}
	
}
