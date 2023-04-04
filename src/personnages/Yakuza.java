package personnages;

public class Yakuza extends Humain{
	private int reputation = 4;
	private String clan;
	
	public Yakuza(String nom, String boissonFav, int argent, String clan) {
		super(nom, boissonFav, argent);
		this.clan = clan;
	}
	
	public int getReputation() {
		return reputation;
	}

	
	public void extorquer(Commercant victime) {
		parler(victime.getNom() + " si tu tiens à ta vie donne"
				+ " moi ta bourse !");
		int gain = victime.seFaireExtorquer();
		gagnerArgent(gain);
		parler("J'ai piqué " + gain + " sous à " + victime.getNom() 
				 + ", ce qui me fait " + getArgent() + " sous dans "
				 + "ma poche. Hi! Hi!");
	}
	
	public int perdre() {
		int perte = getArgent();
		perdreArgent(perte);
		reputation --;
		parler("J'ai perdu mon duel et mes " + perte + " sous, snif..."
				+ " J'ai déshonoré le clan de " + clan + ".");
		return perte;
		
	}
	
	public void gagner(int gain) {
		gagnerArgent(gain);
		reputation ++;
		parler("Ce ronin pensait vraiment battre " + getNom() +
				" du clan " + clan + " ? Je l'ai dépouillé de ses "
				+ gain + " sous.");
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
