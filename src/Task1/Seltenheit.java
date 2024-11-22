public enum Seltenheit {
    HAEUFIG("Haüfig"), SELTEN("Selten"), NORMAL("Normal");

    private final String bedeutung;

    Seltenheit(String bedeutung)
    {
        this.bedeutung = bedeutung;
    }

    public String toString()
    {
        return bedeutung;
    }
}
