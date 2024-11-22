import java.util.HashSet;
import java.util.Set;

public class Menge <T> implements Kontainer<T>{
    private Set<T> menge;

    Menge()
    {
        menge = new HashSet<>();
    }

    @Override
    public void hinzufuegen(T el)
    {
        menge.add(el);
    }

    @Override
    public void entfernen(T el)
    {
        menge.remove(el);
    }

    @Override
    public int getAnzahlElementen()
    {
        return menge.size();
    }
}
