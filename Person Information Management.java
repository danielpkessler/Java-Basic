package udem;


class Personne {
	
	private String naissance;
	private int nbCafe;
	
	// Premier Constructeur.
	public Personne (String naissance, int nbCafe)
	{
		this.naissance = naissance;
		this.nbCafe = nbCafe;
	}
	
	
	// Deuxième Constructeur.
	public Personne (String naissance)
	{
		this.naissance = naissance;
		nbCafe = 1;
	}
	
	
	// Méthodes d'accès pour la naissance.
	public int RangMois() {
		return Integer.parseInt(naissance.substring(3, 5));
	}
	
	public String getNaissance() {
		return naissance;
	}
	
	public void setNbCafe(int nbCafe) {
		this.nbCafe = nbCafe;
	}
	
	public String getMois() {
		String[] nomMois = {"Janvier", "Fevrier", "Mars", "Avril", "Mai","Juin",
			"Juillet", "Aout", "Septembre", "Octobre", "Novembre", "Decembre"};
		return nomMois [RangMois() - 1];
	}
	
	public int getJour() {
		return Integer.parseInt(naissance.substring(0, 2));
	}
	
	public int getAnnee() {
		return Integer.parseInt(naissance.substring(6));
	}
	
	
	// Méthode d'accès a la consommation de café par jour.
	public int getNbCafe() {
		return nbCafe;
	}

	
	// Fonction pour afficher les informations d'une personne choisie.
	public void affichPersVoulue(String en_tete)
	{
		System.out.printf(en_tete);
		System.out.printf("	Naissance : %d %s %d \n", getJour(), getMois(), getAnnee());
		System.out.printf("	Cafe      : %d tasse(s) par jour\n", getNbCafe());
		System.out.printf("\n");
	}

	// Méthode de modification pour la consommation de café.
	public void setConsoCafe(int nouvCafe) {
		nbCafe = nouvCafe;
	}
		
}
	
public class TestPersonne {
	
	// Fonction pour afficher les tableaux de 5 personnes choisies.
	static void afficher(Personne[] pers, int nbPers, String message) {
		System.out.printf("	Indice	      Tableau pers\n");
		System.out.printf("---------------------------------------------------------------\n");
		
		for(int i = 0; i < nbPers; i++) {
			if(pers[i].getNbCafe() > 1) { 
				System.out.printf("	%3d %20s %15s tasses\n", i, 
					pers[i].getNaissance(), pers[i].getNbCafe()); }
			
			else if(pers[i].getNbCafe() == 1) {
				System.out.printf("	%3d %20s %15s tasse (par défaut)\n", i, 
					pers[i].getNaissance(), pers[i].getNbCafe()); }
			
			else if(pers[i].getNbCafe() == 0) {
				System.out.printf("	%3d %20s %15s tasse\n", i, 
						pers[i].getNaissance(), pers[i].getNbCafe()); }
		}
	}
	
	/* Méthode de modification - réduction de 1 tasse de café 
	par jour pour les personnes qui consomment du café. */
	static void moins(Personne[] personnes) { 
		for(int i = 0; i < personnes.length; i++) {
			if(personnes[i].getNbCafe() > 0) {
				personnes[i].setNbCafe(personnes[i].getNbCafe() - 1); }
		}
	}
	
	// Fonction pour déterminer la consomation maximale de café.
	static Personne consMaxCafe(Personne[] tableau, int nbPers) {
		Personne plusGrand = tableau[0];
		for (int i = 0; i < nbPers; i++) {
			if (tableau[i].getNbCafe() > plusGrand.getNbCafe()) {
				plusGrand = tableau[i];
			}
		}
		return plusGrand;
	}
	
	// Fonction pour trouver le nombre de personnes nées dans un mois choisi.
	static int moisVoulu (Personne[] pers, int nbPers, String moisDonne) {
		int mois = 0;
		for (int i = 0; i < nbPers; i++) {
			if (pers[i].getMois() == moisDonne) {
				mois++; }
		}
		
		return mois;
}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	// Instanciation des trois premières personnes.
		
		Personne pers1 = new Personne ("19/05/1997", 4),
			 pers2 = new Personne ("31/12/1990"), // par defaut 1 tasse de café
			 pers3 = new Personne ("08/05/1994", 2);
		
		
	// 1. Affichage des informations de la deuxième personne.

		pers2.affichPersVoulue("Informations de la deuxième personne :\n");
		
		
	// 2. Tableau des 5 nouvelles personnes.
		
		Personne[] pers = { new Personne("16/05/2001", 2), 
				    new Personne("02/05/1990"),
				    new Personne("23/11/1996", 5), 
				    new Personne("19/02/2000", 0), 
				    new Personne("30/05/1991", 2) };
		int nbPers = pers.length;
		
		System.out.printf("\nAffichage du contenu du tableau pers au début :\n\n");
		afficher(pers, nbPers, "");
		
		
	// 3. Détermination et affichage des informations de la personne qui consomme le plus de café.
		
		consMaxCafe(pers, nbPers).affichPersVoulue("\n\nInformations de la personne qui consomme le plus de cafe :\n");
		
	// 4. Réduire de 1 tasse la consommation de café des personnes en consomment et re-afficher le tableau.
		
		System.out.printf("\nReaffichage du contenu du tableau après la modification.\n");
		System.out.printf("Réduction de 1 tasse de café pour les personnes qui consomment :\n\n");
		moins(pers);
		afficher(pers, nbPers, "");
		
	// 5. Compter et afficher le nombre de personnes nées en mai.
		
		System.out.printf("\n\nIl y a %d personne(s) nées en mai.\n", moisVoulu(pers, nbPers, "Mai"));
		
	}
		
}


 */
