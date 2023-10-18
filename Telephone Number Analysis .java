public class TP3B {

	// Fonction pour compter et afficher
	
	static int compteur(String chiffreVoulu, String numeroTel)	{ 
		int compteur = 0;
		for(int i = 0; i < numeroTel.length(); i++) {
			if (chiffreVoulu.equals(String.valueOf(numeroTel.charAt(i)))) {
				compteur++; }
		}
		return compteur;
	}
	
	
	// Fonction pour compter et afficher les chiffres impairs
	
	static void afficherImpairs(String telephone, String nom)
	{
		System.out.printf("\nLes chiffres impairs dans %10s sont : \n", nom);
		for (char c = '1'; c <= '9'; c+=2) {
			if (telephone.indexOf(c) >= 0) {
				System.out.printf(" %c \n", c); }
			}
	}
	
	
	// Fonction pour compter et afficher les chiffres pairs
	
	static void afficherPairs(String telephone, String nom)
	{
		System.out.printf("\nLes chiffres pairs dans %10s sont : \n", nom);
		for (char c = '0'; c <= '8'; c+=2) {
			if (telephone.indexOf(c) >= 0) {
				System.out.printf(" %c \n", c); }
			}
	}
	
	
	// Fonction pour compter le nombre de chiffres impairs
	
	static int compteurImpair(String telephone)
	{
		int compteurImpair = 0;
		String impairs = "13579";
		for (int i = 0; i < telephone.length(); i++) {
			if (impairs.indexOf(telephone.charAt(i)) >= 0) {
				compteurImpair++;
			}
		}
		return compteurImpair; 
	}
	
	
	// Fonction pour compter le nombre de chiffres pairs
	
	static int compteurPair(String telephone)
	{
		int compteurPair = 0;
		String pairs = "02468";
		for (int i = 0; i < telephone.length(); i++) {
			if (pairs.indexOf(telephone.charAt(i)) >= 0) {
				compteurPair++;
			}
		}
		return compteurPair; 
	}
	
	
	// Fonction pour determiner et afficher les chiffres impairs communs des deux numeros de telephone
	
	static void afficherImpairsCommuns(String telUDM, String telJean)
	{
		System.out.printf("\nLes chiffres impairs communs des deux telephones sont : \n");
		for(char c = '1' ; c <= '9'; c+=2) {
			if(telUDM.indexOf(c) >= 0 && telJean.indexOf(c) >= 0) {
				System.out.printf(" %c \n", c); }
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	// 1. Extraire de sous-chaines et afficher
	
		String telUDM = "5143436111";
		String codeRegionUDM = telUDM.substring(0, 3),
				  echangeUDM = telUDM.substring(3, 6), 
				   numeroUDM = telUDM.substring(6);
		System.out.printf("(%s) %s-%s\n", codeRegionUDM, echangeUDM, numeroUDM);
		
		String telJean = "4501897654";
		String codeRegionJean = telJean.substring(0, 3),
				  echangeJean = telJean.substring(3, 6),
				   numeroJean = telJean.substring(6);
		System.out.printf("(%s) %s-%s\n", codeRegionJean, echangeJean, numeroJean);

	// 2. Compter et afficher :
		
		System.out.printf("\nIl y a %d fois le chiffre '3' dans le numero de telephone de l'UdM.\n", compteur("3", telUDM));
		System.out.printf("Il y a %d fois le chiffre '1' dans le numero de telephone de l'UdM.\n", compteur("1", telUDM));
		System.out.printf("Il y a %d fois le chiffre '2' dans le numero de telephone de Jean.\n", compteur("2", telJean));

	// 3. Compter et afficher le nombre de chiffres impairs du telephone de l'UdM et les chiffres pairs du telephone de Jean.
		
		//System.out.printf("Il y a %d chiffres impairs dans le numero de telephone de l'UdM.\n", compteurImpair(telUDM, "ggg"));
		System.out.printf("\nIl y a %d fois des chiffres impairs dans %10s. \n", compteurImpair(telUDM), "le telephone de l'UDM");
		System.out.printf("Il y a %d fois des chiffres pairs dans %10s. \n", compteurPair(telJean), "le telephone de Jean");
		
	// 4. Determiner et afficher les chiffres impairs communs des deux numeros de telephone
		
		afficherImpairsCommuns(telUDM, telJean);
		
	}

}
