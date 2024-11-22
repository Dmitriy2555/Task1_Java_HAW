import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MengeTest {

    private Menge<Integer> menge1;

    @BeforeEach
    void setUp()
    {
        menge1 = new Menge<>();
    }
    @Test
    public void hinzufuegenMitNullTest()
    {
        boolean resultat = menge1.hinzufuegen(null);
        assertEquals(false, resultat);
    }

    @Test
    public void hinzufuegenMitRichtigObject()
    {
        boolean resultat = menge1.hinzufuegen(7);
        assertEquals(true, resultat);
    }

    @Test
    public void anzahlDerElementenBeiHinzufuegen()
    {
        assertEquals(0, menge1.getAnzahlElementen());
        menge1.hinzufuegen(5);
        assertEquals(1, menge1.getAnzahlElementen());
        menge1.hinzufuegen(7);
        assertEquals(2, menge1.getAnzahlElementen());
    }

    @Test
    public void entfernenTest()
    {
        assertEquals(false, menge1.entfernen(5));
        menge1.hinzufuegen(5);
        assertEquals(true, menge1.entfernen(5));
    }

    @Test
    public void anzahlDerElementenBeiEntfernen()
    {
        menge1.hinzufuegen(5);
        menge1.entfernen(5);
        assertEquals(0, menge1.getAnzahlElementen());
        menge1.hinzufuegen(5);
        menge1.hinzufuegen(7);
        menge1.entfernen(7);
        assertEquals(1, menge1.getAnzahlElementen());
    }

    @Test
    public void beinhaltetTest()
    {
        menge1.hinzufuegen(7);
        assertEquals(true, menge1.beinhaltet(7));
        assertEquals(false, menge1.beinhaltet(8));
    }

    @Test
    public void LiefernRandomTest()
    {
        menge1.hinzufuegen(5);
        menge1.hinzufuegen(7);
        menge1.hinzufuegen(8);
        int resultat = (int)menge1.LiefernRandom();
        assertEquals(true, menge1.beinhaltet(resultat));
    }

    @Test
    public void getAnzahlElementenTest()
    {
        menge1.hinzufuegen(5);
        menge1.hinzufuegen(7);
        menge1.hinzufuegen(8);
        assertEquals(3, menge1.getAnzahlElementen());
    }
}