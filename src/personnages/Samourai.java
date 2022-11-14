package personnages;

public class Samourai extends Ronin {
	private String seigneur;
	
	public Samourai(String nom, String seigneur, String boissonFavorite, int argent) {
		super(nom, argent);
		this.seigneur = seigneur;
		super.boissonFavorite = boissonFavorite;
		
	}
	
	private String getSeigneur() {
		return seigneur;
	}
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		super.parler("Je suis fier de servir le seigneur " + getSeigneur());
	}
	
	public void boire(String boisson) {
		super.parler("Qu'est ce que je vais choisir comme boisson ? Tiens je vais prendre du " + boisson);
	}
}
