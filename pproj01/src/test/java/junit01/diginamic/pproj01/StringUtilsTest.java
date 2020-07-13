package junit01.diginamic.pproj01;

import static org.junit.Assert.*;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StringUtilsTest {

	private StringUtils testUtils;
	private static final Logger LOGGER = LoggerFactory.getLogger (AppTest.class);
	
	@Test//Ce type de test est un test classique d'application, il test de fonctionnement de l'application.
	public void testLevenshteinDistance() {
		int value = StringUtils.levenshteinDistance("chat", "chats");

		assertEquals(1, value);
		LOGGER.error ("Il n'y a pas d'erreur sur le fonctionnement de l'application");

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
		LOGGER.error ("Il n'y a pas d'erreur sur le fonctionnement de l'application");
	}
	
	public void monTestRobustesse () {
		int value = StringUtils.levenshteinDistance("", null);
		if (value == -1) fail ("Erreur Null");
		LOGGER.error ("Il n'y a pas d'erreur sur le fonctionnement de l'application");
	}
	


}
