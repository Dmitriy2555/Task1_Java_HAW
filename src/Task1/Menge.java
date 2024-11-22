import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Menge <T> implements Kontainer<T>{
    private Object [] Elemente;
    private int AnzahlElementen;

    Menge()
    {
        Elemente = new Object[10];
        AnzahlElementen = 0;
    }

    @Override
    public boolean hinzufuegen(T el)
    {
        if(el == null || beinhaltet(el))
        {
            return false;
        }
        if(Elemente.length == AnzahlElementen)
        {
            Object [] arCopy = Arrays.copyOf(Elemente, Elemente.length);
            Elemente = new Object[arCopy.length*2];
            System.arraycopy(arCopy, 0, Elemente, 0, arCopy.length);
            AnzahlElementen++;
        }
        Elemente[AnzahlElementen] = el;
        AnzahlElementen++;
        return true;
    }

    public boolean beinhaltet(T el)
    {
        for(Object e: Elemente)
        {
            if(e != null && (e.hashCode() == el.hashCode() || e.equals(el)))
            {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean entfernen(T el)
    {
        if(el == null || !beinhaltet(el))
        {
            return false;
        }

        int delIndex = -1;
        for (int i = 0; i < AnzahlElementen; i++) {
            if (Elemente[i].equals(el)) {
                delIndex = i;
                break;
            }
        }

        if (delIndex == -1) return false;

        for(int i = delIndex; i < AnzahlElementen; i++)
        {
            Elemente[i] = Elemente[i + 1];
        }
        Elemente[AnzahlElementen - 1] = null;
        AnzahlElementen--;
        return true;
    }

    public Object LiefernRandom()
    {
        if(AnzahlElementen == 0)
        {
            System.out.println("Der Aufruf ist nicht möglich");
            return null;
        }
        int randomIndex = (int) (Math.random() * AnzahlElementen);
        return Elemente[randomIndex];
    }

    @Override
    public int getAnzahlElementen()
    {
        return AnzahlElementen;
    }

    //???
    @Override
    public String toString()
    {
        String resultat = "";
        for(int i = 0; i < AnzahlElementen; i++)
        {
            if(i == AnzahlElementen - 1)
            {
                resultat = resultat + Elemente[i] + ".";
                break;
            }
            resultat = resultat + Elemente[i] + ", ";
        }
        return "Menge: " + resultat;
    }
}
