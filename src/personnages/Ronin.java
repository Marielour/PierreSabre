package personnages;

public class Ronin extends Humain{
	private int honneur = 1;

	public Ronin(String nom, String boissonFav, int argent) {
		super(nom, boissonFav, argent);
	}
	
	public void donner(Commercant beneficiaire) {
		int don = getArgent()*10/100;
		parler(beneficiaire.getNom() + " prends ces " + don + 
				" sous.");
		beneficiaire.gagnerArgent(don);
		perdreArgent(don);
		beneficiaire.parler(don + " sous! Je te remercie généreux "
				+ "donateur !");
	}
	
	public void provoquer(Yakuza adversaire) {
		parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu"
				+ " as fait à ce pauvre marchand!");
		if ((honneur*2) >= adversaire.getReputation()) {
			parler("Je t'ai eu petit Yakusa!");
			gagnerArgent(adversaire.perdre());
		}
		else {
			parler("J'ai perdu contre ce yakuza, mon honneur et ma "
					+ "bourse ont en pris un coup.");
			int perte = getArgent();
			perdreArgent(perte);
			adversaire.gagner(perte);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
