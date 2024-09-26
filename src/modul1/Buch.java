package modul1;

public class Buch extends Medium{

    private String isbn;

    public Buch(String titel, double wert, String standort, String isbn) {
        super(titel, wert, standort);
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void anzeigen() {
        super.anzeigen();
        System.out.println("[modul1.Buch] : ISBN -> " + this.getIsbn());
    }
}
