package junit01.diginamic.pproj01;

import static org.junit.Assert.*;

import org.junit.Test;

public class PersonneTest {

	private Personne maPersonne;
	
	@Test
	public void testPersonne() {
		
		this.maPersonne = new Personne();
		assertNotNull(maPersonne); //Vérifier que l'objet maPersonne est bien un objet Personne
		assertEquals("-", maPersonne.toString()); //Vérifie le fait que les attributs de personnes sont séparé par un "-"
		
	}

	@Test
	public void testPersonneStringString() {
		this.maPersonne = new Personne("Bob", "Eponge");
		assertNotNull(maPersonne); //On vérifie que la nouvelle instance et bien un objet
		assertEquals("Bob-Eponge", maPersonne.toString()); // On vérifie que ses attribut son bien des String.
		
	}

	@Test
	public void testToString() {
		
	}

}
