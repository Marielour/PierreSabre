package personnages;

public class Humain {
	private String nom;
	private String boissonFav;
	private int argent;
	
	public Humain(String nom, String boissonFav, int argent) {
		this.argent = argent;
		this.boissonFav = boissonFav;
		this.nom = nom;
	}
	
	public String getNom() {
		return nom;
	}
	
	public int getArgent() {
		return argent;
	}
	
	public void parler(String texte) {
		System.out.println(texte);
	}
	
	public void direBonjour() {
		parler("Bonjour ! Je m'appelle " + nom
				+ " et j'aime boire du " + boissonFav + ".");
	}
	
	public void boire() {
		parler("Mmmm, un bon verre de " + boissonFav
				+ " ! GLOUPS !");	
	}
	
	public void gagnerArgent(int gain) {
		argent+=gain;
	}
	
	public void perdreArgent(int perte) {
		argent-=perte;
	}
	
	public void acheter(String bien, int prix) {
		if (prix <= argent) {
			parler("J'ai " + argent + " sous en poche."
					+ "Je vais pouvoir m'offir " + bien 
					+ " à " + prix + " sous.");
			perdreArgent(prix);
		}
		else parler("Je n'ai que " + " sous en poche"
					 + "Je ne peux même pas m'offrir un "
					 + bien + " à " + prix + " sous");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
