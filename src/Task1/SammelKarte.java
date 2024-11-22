public class SammelKarte {
    private Seltenheit seltenheit;
    private String titel;

    SammelKarte(Seltenheit s, String t)
    {
        seltenheit = s;
        titel = t;
    }

    public Seltenheit getSeltenheit() {
        return seltenheit;
    }

    public String getTitel() {
        return titel;
    }

    public String toString()
    {
        return "Titel: " + getTitel() + ", Seltenheit: " + getSeltenheit();
    }
}
