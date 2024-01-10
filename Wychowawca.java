package obiektowosc.zadanie.przeczkole;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Wychowawca extends Osoba {
    private double pensja; // mozna odrazu ustalic pensje
    private WychowawcaPodzial wychowawcaPodzial;

    private List<Grupa> listaGrup = new ArrayList<>();

    public Wychowawca(String imie, String nazwisko, LocalDate dataUrodzenia, WychowawcaPodzial wychowawcaPodzial) {
        super(imie, nazwisko, dataUrodzenia);
        this.pensja = pensja;
        this.wychowawcaPodzial = wychowawcaPodzial;
    }

    // napisz metode ktora zwroci wychowawcow kwalifikowanych z pensja wieksza niz podany parametr
    public static Wychowawca pensjaWychowawcyWiekszaNizParametr(List<Wychowawca> list, double parametr) {
        Wychowawca zmienna = list.get(0);
        for (Wychowawca wychowawca : list) {
            if (wychowawca.pensjaWychowawcyKwalifikowany() > parametr) { // wykorzystuje metode ponizej
                zmienna = wychowawca;
            }
        }
        return zmienna;
    }

    public double pensjaWychowawcyKwalifikowany() {
        int liczbaGodzin = 160;
        double stawkaNaGodzine = WychowawcaPodzial.KWALIFIKOWANY.getStawkaZaGodz();
        return pensja = liczbaGodzin * stawkaNaGodzine;
    }

    public double pensjaWychowawcyTymczasowy() {
        int liczbaGodzin = 160;
        double stawkaNaGodzine = WychowawcaPodzial.TYMCZASOWY.getStawkaZaGodz();
        return pensja = liczbaGodzin * stawkaNaGodzine;
    }


    public double getPensja() {
        return pensja;
    }

    public void setPensja(double pensja) {
        this.pensja = pensja;
    }

    public WychowawcaPodzial getWychowawcaPodzial() {
        return wychowawcaPodzial;
    }

    public void setWychowawcaPodzial(WychowawcaPodzial wychowawcaPodzial) {
        this.wychowawcaPodzial = wychowawcaPodzial;
    }

    public List<Grupa> getListaGrup() {
        return listaGrup;
    }

    public void setListaGrup(List<Grupa> listaGrup) {
        this.listaGrup = listaGrup;
    }

    @Override
    public String toString() {
        return "Wychowawca{" +
                "pensja=" + pensja +
                ", wychowawcaPodzial=" + wychowawcaPodzial +
                ", listaGrup=" + listaGrup +
                "} " + super.toString();
    }
}


