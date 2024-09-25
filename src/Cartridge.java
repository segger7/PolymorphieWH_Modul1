public class Cartridge extends Medium{

    private boolean vollst�ndigesSet;
    private String entwicklerstudio;
    private Konsolentyp konsole;

    public Cartridge(String titel, double wert, String standort, boolean vollst�ndigesSet, String entwicklerstudio, Konsolentyp konsole) {
        super(titel, wert, standort);
        this.vollst�ndigesSet = vollst�ndigesSet;
        this.entwicklerstudio = entwicklerstudio;
        this.konsole = konsole;
    }

    public boolean isVollst�ndigesSet() {
        return vollst�ndigesSet;
    }

    public void setVollst�ndigesSet(boolean vollst�ndigesSet) {
        this.vollst�ndigesSet = vollst�ndigesSet;
    }

    public String getEntwicklerstudio() {
        return entwicklerstudio;
    }

    public void setEntwicklerstudio(String entwicklerstudio) {
        this.entwicklerstudio = entwicklerstudio;
    }

    public Konsolentyp getKonsole() {
        return konsole;
    }

    public void setKonsole(Konsolentyp konsole) {
        this.konsole = konsole;
    }

    public void anzeigen() {
        super.anzeigen();
        System.out.println("[Cartridge] Ist das Set vollst�ndig? -> " + this.isVollst�ndigesSet() + " Entwicklerstudio -> " + this.getEntwicklerstudio() + " Konsolentyp -> " + this.getKonsole());
    }
}
