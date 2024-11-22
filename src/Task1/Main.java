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
        menge1.hinzufuegen("Alex");
        menge1.hinzufuegen("Roma");
        System.out.println("Hinzufügen des Elements " + menge1.hinzufuegen("Nikita"));
        System.out.println("Entfernen des Elements " + menge1.entfernen("Alex"));
        System.out.println("Random Element: " + menge1.LiefernRandom());
        System.out.println("Anzahl der Elementen: " + menge1.getAnzahlElementen());
        System.out.println(menge1.toString());
    }
}
