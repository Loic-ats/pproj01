package junit01.diginamic.pproj01;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringUtilsTest {

	private StringUtils testUtils;

	@Test//Ce type de test est un test classique d'application, il test de fonctionnement de l'application.
	public void testLevenshteinDistance() {
		int value = StringUtils.levenshteinDistance("chat", "chats");

		assertEquals(1, value);

	}

	@Test//(expected = NullPointerException.class) //Permet de passer outre le fait que les deux parrametre sont à null.
	//Cependant le code est pas propre il faut faire un try/catch pour que ca soit propre
	// On appel ce type de test des test de robustesses.
	public void testLevenshteinDistanceNull() {
		/**
		 * Cas 1
		 */
		int value = StringUtils.levenshteinDistance(null, null);
		assertEquals(-1, value);
		/**
		 * Cas 2
		 */
		value = StringUtils.levenshteinDistance(null, "");
		assertEquals(-1, value);
		/**
		 * Cas 3
		 */
		value =StringUtils.levenshteinDistance("", null);
		assertEquals(-1, value);
	}
	
	public void monTestRobustesse () {
		int value = StringUtils.levenshteinDistance("", null);
		if (value == -1) fail ("Erreur Null");
	}
	


}
