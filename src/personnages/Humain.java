package personnages;

public class Humain {
	private String nom;
	private String boissonFavorite;
	private int argent;
	protected int nbConnaissance;
	private Humain[] memoire;
	protected int connaissancesMax;
	
	public Humain(String nom, String boissonFavorite, int argent) {
		super();
		this.nom = nom;
		this.boissonFavorite = boissonFavorite;
		this.argent = argent;
		this.nbConnaissance = 0;
		this.connaissancesMax = 3;
		this.memoire = new Humain[connaissancesMax];
	}
	
	public int getArgent() {
		return argent;
	}
	public String getNom() {
		return nom;
	}
	
	private int getNbConnaissance() {
		return nbConnaissance;
	}
	
	public String getBoisson_favorite() {
		return boissonFavorite;
	}
	
	public void parler(String phrase) {
		System.out.println("(" + nom + ") - " + phrase);
	}
	
	public void direBonjour() {
		parler("Bonjour, Je m'appelle " + nom + " et j'aime boire du " + boissonFavorite);
	}
	
	public void boire() {
		parler("mmmmm, un bon verre de " + boissonFavorite + " GLOUPS");
		
	}
	
	public void gagnerArgent(int gain) {
		argent += gain;
	}
	
	public void perdreArgent(int perte) {
		argent -= perte;
	}
	
	public void acheter(String bien, int prix) {
		if (argent > prix){
			parler("j'achete un.e " + bien + " pour " + prix);
			perdreArgent(prix);
			parler("il me reste maintenant " + argent + " sous");
		} else {
			parler("je n'ai malheureusement pas assez d'argent pour acheter un.e " + bien);
		}
		
	}
	
	public void repondre(Humain autreHumain) {
		direBonjour();
		memoriser(autreHumain);
	}
	
	private void memoriser(Humain autreHumain) {
		if (getNbConnaissance() == connaissancesMax) {
			for (int i=1; i < (connaissancesMax); i++) {
				memoire[i-1] = memoire[i];
			}
			memoire[connaissancesMax-1] = autreHumain;
		} else {
			memoire[getNbConnaissance()] = autreHumain;
			nbConnaissance++;
		}
	}
	
	public void faireConnaissanceAvec(Humain autreHumain) {
		direBonjour();
		autreHumain.repondre(this);
		memoriser(autreHumain);
		
	}
	
	public void listerConnaissance() {
		String connaissanceToTell = "";
		for (int i=0; i < getNbConnaissance(); i++) {
			connaissanceToTell += memoire[i].getNom() + ", ";
		}
		parler("Je connais beaucoup de monde dont : " + connaissanceToTell);
	}
}
