public interface Kontainer <T>{
    boolean hinzufuegen(T el);
    boolean entfernen(T el);
    int getAnzahlElementen();
}
