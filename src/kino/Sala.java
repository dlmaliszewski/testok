package kino;

public class Sala {
    private int numerSali;
    private int liczbaMiejsc;
    private int dostepneMiejsca;

    public Sala(int numerSali, int liczbaMiejsc) {
        this.numerSali = numerSali;
        this.liczbaMiejsc = liczbaMiejsc;
        this.dostepneMiejsca = liczbaMiejsc; // Początkowo wszystkie miejsca są dostępne
    }

    public int getNumerSali() {
        return numerSali;
    }

    public int getLiczbaMiejsc() {
        return liczbaMiejsc;
    }

    public int getDostepneMiejsca() {
        return dostepneMiejsca;
    }

    public void zarezerwujMiejsca(int liczbaMiejsc) {
        if (liczbaMiejsc <= 0) {
            throw new IllegalArgumentException("Liczba miejsc do rezerwacji musi być większa niż zero.");
        }
        if (liczbaMiejsc > dostepneMiejsca) {
            throw new IllegalArgumentException("Nie można zarezerwować więcej miejsc niż dostępnych.");
        }
        dostepneMiejsca -= liczbaMiejsc;
    }

    @Override
    public String toString() {
        return "Sala{" + "numerSali=" + numerSali + ", liczbaMiejsc=" + liczbaMiejsc + ", dostepneMiejsca=" + dostepneMiejsca + '}';
    }

}
