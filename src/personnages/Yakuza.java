package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int reputation;
	
	public Yakuza(String clan, String nom, int argent) {
		super(nom, "whisky", argent);
		this.clan = clan;
		this.reputation = 0;
	}
	
	public String getClan() {
		return clan;
	}
	
	public int getReputation() {
		return reputation;
	}
	
	public void extorquer(Commercant victime) {
		super.parler("Tiens, Tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		super.parler(victime.getNom() + " si tu tiens à la vie donne moi ta bourse");
		int gain = victime.seFaireExtorquer();
		super.gagnerArgent(gain);
		super.parler("haha j'ai gagné " + gain + " sous " + " maintenant j'ai " + super.getArgent());
		reputation++;
	}
	
	public int perdre() {
		int argentPerdu = super.getArgent();
		super.perdreArgent(argentPerdu);
		reputation++;
		super.parler("j'ai perdu mon duel et mes " + argentPerdu + " sous, snif... J'ai déshonoré " + getClan());
		return argentPerdu;
	}
	
	public void gagner(int gain) {
		super.gagnerArgent(gain);
		reputation++;
		super.parler("ce Ronin pensait vraiment battre " + super.getNom() + " du " + getClan() + " ? Je l'ai dépouillé de ses " + gain + " sous");
	}
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		super.parler("Mon clan est celui de " + getClan());
	}
}
