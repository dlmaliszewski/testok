package kino;


import java.util.ArrayList;
import java.util.List;

public class Kino {
    private List<Film> filmy;
    private List<Sala> sale;
    private List<Rezerwacja> rezerwacje;
    private int licznikRezerwacji;

    public Kino() {
        filmy = new ArrayList<>();
        sale = new ArrayList<>();
        rezerwacje = new ArrayList<>();
        licznikRezerwacji = 1; // licznik do generowania unikalnych numerów rezerwacji
    }

    public void dodajFilm(Film film) {
        filmy.add(film); // dodaje film bez sprawdzania unikalności (test tego wymaga)
    }

    public void dodajSale(Sala sala) {
        sale.add(sala); // dodaje salę bez sprawdzania unikalności
    }

    public Rezerwacja dokonajRezerwacji(Film film, Sala sala, int liczbaMiejsc) {
        // Walidacje przed dokonaniem rezerwacji
        if (!filmy.contains(film)) {
            throw new IllegalArgumentException("Film nie jest dostępny w kinie.");
        }
        if (!sale.contains(sala)) {
            throw new IllegalArgumentException("Sala nie jest dostępna w kinie.");
        }
        if (liczbaMiejsc <= 0) {
            throw new IllegalArgumentException("Liczba miejsc do rezerwacji musi być większa niż zero.");
        }
        if (liczbaMiejsc > sala.getDostepneMiejsca()) {
            throw new IllegalArgumentException("Nie można zarezerwować więcej miejsc niż dostępnych.");
        }

        // Zmniejsz liczbę dostępnych miejsc w sali
        sala.zarezerwujMiejsca(liczbaMiejsc);

        // Tworzy nową rezerwację z unikalnym numerem
        Rezerwacja rezerwacja = new Rezerwacja(licznikRezerwacji++, film, sala, liczbaMiejsc);
        rezerwacje.add(rezerwacja);
        return rezerwacja;
    }

    // Metody get do pobierania filmów, sal i rezerwacji
    public List<Film> getFilmy() {
        return filmy;
    }

    public List<Sala> getSale() {
        return sale;
    }

    public List<Rezerwacja> getRezerwacje() {
        return rezerwacje;
    }
}
