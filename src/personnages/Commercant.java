package personnages;

public class Commercant extends Humain{
	
	public Commercant(String nom, String boissonFav, int argent) {
		super(nom, boissonFav, argent);
	}

	
	public int seFaireExtorquer() {
		int argent = getArgent();
		perdreArgent(argent);
		parler("J'ai tout perdu ! Le mode est trop injuste...");
		return argent;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
