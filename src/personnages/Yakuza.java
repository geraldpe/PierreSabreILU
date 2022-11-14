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
	
	public String getClan() {
		return clan;
	}
	
	public void extorquer(Commercant victime) {
		super.parler("Tiens, Tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		super.parler(victime.getNom() + " si tu tiens à la vie donne moi ta bourse");
		int gain = victime.seFaireExtorquer();
		super.gagnerArgent(gain);
		super.parler("haha j'ai gagné " + gain + " sous " + " maintenant j'ai " + super.getArgent());
		addReputation();
	}
	
	public int perdre() {
		int argent_perdu = super.getArgent();
		super.perdreArgent(argent_perdu);
		reputation -= 1;
		super.parler("j'ai perdu mon duel et mes " + argent_perdu + " sous, snif... J'ai déshonoré " + getClan());
		return argent_perdu;
	}
	
	public void gagner(int gain) {
		super.gagnerArgent(gain);
		reputation += 1;
		super.parler("ce Ronin pensait vraiment battre " + super.getNom() + " du " + getClan() + " ? Je l'ai dépouillé de ses " + gain + " sous");
	}
}
