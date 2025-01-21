package kino;



public class Rezerwacja {
    private int numerRezerwacji;
    private Film film;
    private Sala sala;
    private int liczbaMiejsc;

    // Poprawiony konstruktor, przypisujący wszystkie wartości
    public Rezerwacja(int numerRezerwacji, Film film, Sala sala, int liczbaMiejsc) {
        this.numerRezerwacji = numerRezerwacji;
        this.film = film;
        this.sala = sala;
        this.liczbaMiejsc = liczbaMiejsc;
    }

    // Usuwamy dodatkowe, niekompletne konstruktory

    public int getNumerRezerwacji() {
        return numerRezerwacji;
    }

    public Film getFilm() {
        return film;
    }

    public Sala getSala() {
        return sala;
    }

    public int getLiczbaMiejsc() {
        return liczbaMiejsc;
    }

    @Override
    public String toString() {
        return "Rezerwacja{" +
                "numerRezerwacji=" + numerRezerwacji +
                ", film=" + film +
                ", sala=" + sala +
                ", liczbaMiejsc=" + liczbaMiejsc +
                '}';
    }
}
