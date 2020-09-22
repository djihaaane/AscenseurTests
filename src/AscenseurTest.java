import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AscenseurTest {

    Controleur controleur;

    @Before
    public void setUp()
    {
        controleur = new Controleur();
        controleur.runControleur();
    }

    /** Test unitaire sur l'ascenseur. */
    @Test
    public void testChoisirDirection()
    {
        System.out.println("\n->  choisir Direction\n");
        controleur.appels[1] =Direction.UP;
        System.out.println("(a) L'"+controleur.ascenseur.toString()+" est au 1er etage");

        // Valider le comportement :
        assertEquals(controleur.ascenseur.choisirDirection(), Direction.UP);

        System.out.println("(b) La direction choisie est bien UP");

        try { Thread.sleep(1000); }
        catch(InterruptedException e) { System.out.print("Erreur dans Thread.sleep\n"); }

        System.out.println("\n->  choisir Direction  22222222\n");
        controleur.appels[2] =Direction.UP;
        System.out.println("(a) L'"+controleur.ascenseur.toString()+" est au 2eme etage");

        // Valider le comportement :
        assertEquals(controleur.ascenseur.choisirDirection(), Direction.UP);

        System.out.println("(b) La direction choisie est bien UP");


        try { Thread.sleep(3000); }
        catch(InterruptedException e) { System.out.print("Erreur dans Thread.sleep\n"); }

        System.out.println("\n->  choisir Direction  3333333\n");
        controleur.appels[1] =Direction.DOWN;
        System.out.println("(a) L'"+controleur.ascenseur.toString()+" est au 3eme etage");

        // Valider le comportement :
        assertEquals(controleur.ascenseur.choisirDirection(), Direction.DOWN);

        System.out.println("(b) La direction choisie est bien DOWN");

    }

}