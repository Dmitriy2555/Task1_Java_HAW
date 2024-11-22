public class Main {
    public static void main(String[] args) {
        Menge<Integer> menge = new Menge<Integer>();
        System.out.println("Funktionalität der Menge mit Integer");
        menge.hinzufuegen(7);
        menge.hinzufuegen(8);
        menge.hinzufuegen(9);
        System.out.println("Hinzufügen des Elements " + menge.hinzufuegen(10));
        System.out.println("Entfernen des Elements " + menge.entfernen(9));
        System.out.println("Random Element: " + menge.LiefernRandom());
        System.out.println(menge.getAnzahlElementen());
        System.out.println(menge.toString());

        Menge<String> menge1 = new Menge<String>();
        System.out.println("\nFunktionalität der Menge mit String");

        menge1.hinzufuegen("Dima");
        menge1.hinzufuegen("Alexx");
        menge1.hinzufuegen("Roma");
        System.out.println("Hinzufügen des Elements " + menge1.hinzufuegen("Nikita"));
        System.out.println("Entfernen des Elements " + menge1.entfernen("Alex"));
        System.out.println("Random Element: " + menge1.LiefernRandom());
        System.out.println("Anzahl der Elementen: " + menge1.getAnzahlElementen());
        System.out.println(menge1.toString());

        System.out.println("\nFunktionalität der Menge mit Karten");
        Sammlung sammlungVonKarten = new Sammlung();
        SammelKarte karte1 = new SammelKarte(Seltenheit.HAEUFIG, "Karte A");
        SammelKarte karte2 = new SammelKarte(Seltenheit.NORMAL, "Karte B");
        SammelKarte karte3 = new SammelKarte(Seltenheit.SELTEN, "Karte C");

        System.out.println("Karte hinzufügen: " + sammlungVonKarten.hinzufuegen(karte1));
        System.out.println("Karte entfernen: " + sammlungVonKarten.entfernen(karte1));

        sammlungVonKarten.hinzufuegen(karte3);
        System.out.println("Isd die Karte beinhaltet: " + sammlungVonKarten.beinhaltet(karte3));

        sammlungVonKarten.hinzufuegen(karte2);
        sammlungVonKarten.hinzufuegen(karte1);
        System.out.println("[Alle Karte]: " + sammlungVonKarten.toString());

    }
}
