package junit01.diginamic.pproj01;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogTest {

	
	private static final Logger LOGGER = LoggerFactory.getLogger (LogTest.class);
	


	public static void main(String[] args) {

		LOGGER.error("Il n'y a pas d'erreur sur le fonctionnement de l'application");
		LOGGER.warn("Le test est ok avec le warm");

	}



}
