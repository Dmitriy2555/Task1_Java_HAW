import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Menge <T> implements Kontainer<T>{
    private Object [] Elemente;
    static private int AnzahlElementen;

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
            Elemente[AnzahlElementen] = el;
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
            if(e.hashCode() == el.hashCode() || e.equals(el))
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

        Object [] arrayCopy = Arrays.copyOf(Elemente, Elemente.length);

        int delIndex = 0;
        for(int i = 0; i < arrayCopy.length; i++)
        {
            if(arrayCopy[i].equals(el))
            {
                delIndex = i;
            }
        }
        for(int i = delIndex; i < arrayCopy.length - 1; i++)
        {
            arrayCopy[i] = arrayCopy[i + 1];
        }
        arrayCopy[arrayCopy.length - 1] = 0;
        Elemente = arrayCopy;
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
        return "";
    }
}
