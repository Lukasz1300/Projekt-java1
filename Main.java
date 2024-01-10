package obiektowosc.zadanie.przeczkole;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        /*
         * Stwórz system do zarz¹dzania przedszkolem. W przedszkolu mamy dzieci oraz
         * wychowawcow, dla obu chcemy znac imie, nazwisko oraz date urodzenia. Dzieci
         * dziela sie na posluszne (odznaka) i nieposluszne (przewinienia).
         *
         * Wychowawcy maja pensje (obliczana za pomoca algorytmu) i dziela sie na
         * wychowawcow kwalifikowanych (kwalifikacje) oraz tymczasowych.
         *
         * Wychowacwa odpowiada za grupe (nazwa, max liczba dzieci, obecnie 15).
         * Wychowacwca moze miec wiele grup, grupa ma jednego wychowawce.
         *
         * Kazda grupa ma przypisana sale (nazwa, kolor scian).
         *
         *  -napisz metode która zwraca dziecko ktore ma najwiecej przewinien
         * -napisz metode ktora zwroci wychowawcow kwalifikowanych z pensja wieksza niz podany parametr
         * -zapisz do pliku imiona nazwiska wszystkich dzieci którzy sa w grupie dla wychowawcy podanego jako parametr
         */
        Przedszkole przedszkole1 = new Przedszkole("KUBUS", "krakow");

        Wychowawca wychowawca1 = new Wychowawca("Jan", "Kowalski", LocalDate.of(2000, 03, 03), WychowawcaPodzial.KWALIFIKOWANY);
        Wychowawca wychowawca2 = new Wychowawca("Gienek", "aaaaaa", LocalDate.of(2002, 04, 11), WychowawcaPodzial.TYMCZASOWY);

        Dziecko dziecko1 = new Dziecko("Adam", "Kowalski", LocalDate.of(2015, 03, 01), DzieckoPodzial2.ZACHOWANIE_DOBRE);
        Dziecko dziecko2 = new Dziecko("Jasio", "Batko", LocalDate.of(2016, 10, 01), DzieckoPodzial2.ZACHOWANIE_NAGANNE);
        Dziecko dziecko3 = new Dziecko("Ania", "Nowak", LocalDate.of(2016, 05, 04), DzieckoPodzial2.ZACHOWANIE_WZOROWE);
        Dziecko dziecko4 = new Dziecko("Stasio", "ddddd", LocalDate.of(2016, 11, 20), DzieckoPodzial2.ZACHOWANIE_DOBRE);
        Dziecko dziecko5 = new Dziecko("Tomcio", "jakis", LocalDate.of(2016, 12, 20), DzieckoPodzial2.ZACHOWANIE_NAGANNE);

        Sala sala1 = new Sala(10, przedszkole1, SalaKolory.BIALY);
        Sala sala2 = new Sala(12, przedszkole1, SalaKolory.NIEBIESKI);

        Grupa grupa1 = new Grupa("smoki", wychowawca1, sala1);
        Grupa grupa2 = new Grupa("smerfy", wychowawca2, sala2);

        grupa1.dodanieDzieckaDoGrupy(dziecko1);
        grupa1.dodanieDzieckaDoGrupy(dziecko2);
        grupa2.dodanieDzieckaDoGrupy(dziecko3);
        grupa2.dodanieDzieckaDoGrupy(dziecko4);
        grupa2.dodanieDzieckaDoGrupy(dziecko5);

        System.out.println("Kwalifikowany: " + wychowawca1.pensjaWychowawcyKwalifikowany());
        System.out.println("Tymczasowy: " + wychowawca2.pensjaWychowawcyTymczasowy());
        System.out.println("Dziecko Uwaga Negatywna: " + "\n" + Dziecko.dzieckoZUwagaNegatywna(Dziecko.getListaDzieci()));

        List<Wychowawca> listaWychowawcow = new ArrayList<>();
        listaWychowawcow.add(wychowawca1);
        listaWychowawcow.add(wychowawca2);

        System.out.println("wychowawca pesja wieksza niz parametr:" + "\n" + Wychowawca.pensjaWychowawcyWiekszaNizParametr(listaWychowawcow, 3000));
        Grupa.zapisDzieciDoPliku(Dziecko.getListaDzieci(), wychowawca1);

    }
}
