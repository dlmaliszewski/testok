package kino;

public class Film {
    private String tytul;
    private String gatunek;
    private int czasTrwania;

    public Film(String tytul, String gatunek, int czasTrwania) {
        this.tytul = tytul;
    }
    public String getTytul() {
        return tytul;
    }
    public void setTytul(String tytul) {
        this.tytul = tytul;
    }
    public String getGatunek() {
        return gatunek;
    }
    public void setGatunek(String gatunek) {
        this.gatunek = gatunek;
    }
    public int getCzasTrwania() {
        return czasTrwania;
    }
    public void setCzasTrwania(int czasTrwania) {
        this.czasTrwania = czasTrwania;
    }
    public String toString() {
        return tytul + "\t" + gatunek + "\t" + czasTrwania;
    }
}