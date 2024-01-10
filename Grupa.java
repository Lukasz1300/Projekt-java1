package obiektowosc.zadanie.przeczkole;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Grupa {
    private String nazwa;
    private Wychowawca wychowawca;
    private Sala sala;
    private List<Dziecko> listaDzieci = new ArrayList<>();

    public Grupa(String nazwa, Wychowawca wychowawca, Sala sala) {
        if (wychowawca == null || sala == null) {
            throw new IllegalArgumentException("wychowawca, sala nie moze byc null");
        }
        this.nazwa = nazwa;
        this.wychowawca = wychowawca;
        this.sala = sala;

    }

    public static void zapisDzieciDoPliku(List<Dziecko> lista, Wychowawca wychowawca) throws IOException {
        if (lista == null || wychowawca == null) {
            throw new IllegalArgumentException("Dzieci ani wychowawca nie moga byc puste ani null");
        }
        File file = new File("src/obiektowosc/zadanie/przeczkole/wynik");
        FileWriter fileWriter = new FileWriter(file);
        for (Dziecko dziecko : lista) {
            if (dziecko.getGrupa().getWychowawca().equals(wychowawca)) {
                fileWriter.write(dziecko + "\n");
            }
        }
        fileWriter.close();
    }


    public void dodanieDzieckaDoGrupy(Dziecko dziecko) {
        if (listaDzieci.size() > 15) {
            throw new IllegalArgumentException("grupa nie moze przekraczac 15 dzieci");
        }
        listaDzieci.add(dziecko);
        dziecko.setGrupa(this);
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public Wychowawca getWychowawca() {
        return wychowawca;
    }

    public void setWychowawca(Wychowawca wychowawca) {
        this.wychowawca = wychowawca;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public List<Dziecko> getListaDzieci() {
        return listaDzieci;
    }

    public void setListaDzieci(List<Dziecko> listaDzieci) {
        this.listaDzieci = listaDzieci;
    }

    @Override
    public String toString() {
        return "Grupa{" +
                "nazwa='" + nazwa + '\'' +
                ", wychowawca=" + wychowawca +
                ", sala=" + sala +
                ", listaDzieci=" + listaDzieci +
                '}';
    }
}






