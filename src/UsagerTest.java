import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UsagerTest {
    Controleur controleur;

    @Before
    public void setUp()
    {
        controleur = new Controleur();
        controleur.runControleur();
    }

    // ------------------------Test unitaire sur l'Usager

    @Test
    public void testUsager() {
        System.out.println("\n-> usager effectue appel au 2eme l'etage\n");
        assertEquals(controleur.usager0.getEtage(), 2);
        System.out.println("1-- L' " + controleur.usager0.toString() + " est au 2eme etage sa direction et vers le haut");


        // Attendre ouverture de la porte (1/1 delai)...
        try { Thread.sleep(5000); }
        catch(InterruptedException e) { System.out.print("Erreur dans Thread.sleep\n"); }

        assertEquals(controleur.ascenseur.etage, 3);
        System.out.println("Usager bien arrivee");



    }
}
