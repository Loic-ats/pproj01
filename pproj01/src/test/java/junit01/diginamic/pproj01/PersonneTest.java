package junit01.diginamic.pproj01;

import static org.junit.Assert.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.junit.Test;

public class PersonneTest {

	private Personne maPersonne;
	private static final Logger LOGGER = LoggerFactory.getLogger (PersonneTest.class);
	
	@Test
	public void testPersonne() {
		
		
		this.maPersonne = new Personne();
		assertNotNull(maPersonne); //Vérifier que l'objet maPersonne est bien un objet Personne
		assertEquals("-", maPersonne.toString()); //Vérifie le fait que les attributs de personnes sont séparé par un "-"
		LOGGER.warn("Le test est ok");
		
		
		
	}

	@Test
	public void testPersonneStringString() {
		this.maPersonne = new Personne("Bob", "Eponge");
		assertNotNull(maPersonne); //On vérifie que la nouvelle instance et bien un objet
		assertEquals("Bob-Eponge", maPersonne.toString()); // On vérifie que ses attribut son bien des String.
		LOGGER.error("Le test est ok");
	}

	@Test
	public void testToString() {
		
	}

}
