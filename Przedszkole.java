package obiektowosc.zadanie.przeczkole;

import java.util.ArrayList;
import java.util.List;

public class Przedszkole {
    private String nazwe;
    private String adres;

    private List<Sala>listaSal = new ArrayList<>();

    public Przedszkole(String nazwe, String adres) {
        this.nazwe = nazwe;
        this.adres = adres;

    }

    public String getNazwe() {
        return nazwe;
    }

    public void setNazwe(String nazwe) {
        this.nazwe = nazwe;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public List<Sala> getListaSal() {
        return listaSal;
    }

    public void setListaSal(List<Sala> listaSal) {
        this.listaSal = listaSal;
    }

    @Override
    public String toString() {
        return "Przedszkole{" +
                "nazwe='" + nazwe + '\'' +
                ", adres='" + adres + '\'' +
                ", listaSal=" + listaSal +
                '}';
    }
}
