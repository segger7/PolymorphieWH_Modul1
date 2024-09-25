public class VHS extends Medium {

    private int spieldauer;
    private String qualit�t;

    public VHS(String titel, double wert, String standort, int spieldauer, String qualit�t) {
        super(titel, wert, standort);
        this.spieldauer = spieldauer;
        this.qualit�t = qualit�t;
    }

    public int getSpieldauer() {
        return spieldauer;
    }

    public void setSpieldauer(int spieldauer) {
        this.spieldauer = spieldauer;
    }

    public String getQualit�t() {
        return qualit�t;
    }

    public void setQualit�t(String qualit�t) {
        this.qualit�t = qualit�t;
    }

    public void anzeigen() {
        super.anzeigen();
        System.out.println("[VHS] Spieldauer -> " + this.getSpieldauer() + " Qualit�t -> " + this.getQualit�t());
    }
}
