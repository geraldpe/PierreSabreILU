package personnages;

public class Humain {
	private String nom;
	private String boisson_favorite;
	private int argent;
	
	public Humain(String nom, String boisson_favorite, int argent) {
		super();
		this.nom = nom;
		this.boisson_favorite = boisson_favorite;
		this.argent = argent;
	}
	
	public int getArgent() {
		return argent;
	}
	public String getNom() {
		return nom;
	}
	public String getBoisson_favorite() {
		return boisson_favorite;
	}
	
	public void parler(String phrase) {
		System.out.println(phrase);
	}
	
	public void direBonjour() {
		parler("Bonjour, Je m'appelle " + nom + " et j'aime boire du " + boisson_favorite);
	}
	
	public void boire() {
		parler("mmmmm, un bon verre de " + boisson_favorite + " GLOUPS");
		
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
}
