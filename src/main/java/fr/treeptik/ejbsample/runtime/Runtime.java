package fr.treeptik.ejbsample.runtime;

import fr.treeptik.ejbsample.webservice.Personne;
import fr.treeptik.ejbsample.webservice.PersonneWS;
import fr.treeptik.ejbsample.webservice.PersonneWSService;

public class Runtime {
	public static void main(String[] args) {
		PersonneWSService personneWSService = new PersonneWSService();
		PersonneWS personneWS = personneWSService.getPersonneWSPort();
		
		Personne personne = new Personne();
		
		personne.setNom("Dupont");
		personne.setPrenom("Pierre");
		
		personneWS.saveFromWebService(personne);
	}
}
