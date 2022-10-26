package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int reputation;
	
	public Yakuza(String clan, String nom, int argent) {
		super(nom, "whisky", argent);
		this.clan = clan;
		this.reputation = 0;
	}
	
	private void addReputation() {
		reputation++;
	}
	
	public void extorquer(Commercant victime) {
		super.parler("Tiens, Tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		super.parler(victime.getNom() + " si tu tiens à la vie donne moi ta bourse");
		int gain = victime.seFaireExtorquer();
		super.gagnerArgent(gain);
		super.parler("haha j'ai gagné " + gain + " sous " + " maintenant j'ai " + super.getArgent());
		addReputation();
	}
}
