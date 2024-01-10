package obiektowosc.zadanie.przeczkole;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Dziecko extends Osoba {
    private Grupa grupa;
    private DzieckoPodzial2 dzieckoPodzial2;

    private static List<Dziecko> listaDzieci = new ArrayList<>();

    public Dziecko(String imie, String nazwisko, LocalDate dataUrodzenia, DzieckoPodzial2 dzieckoPodzial2) {
        super(imie, nazwisko, dataUrodzenia);
        this.dzieckoPodzial2 = dzieckoPodzial2;
        listaDzieci.add(this);

    }

      public static List<Dziecko> dzieckoZUwagaNegatywna(List<Dziecko> list) {
        List<Dziecko> listaDzieciZUwagaNegatywna = new ArrayList<>();
        for (Dziecko dziecko : list) {
            if (dziecko.getDzieckoPodzial2().equals(DzieckoPodzial2.ZACHOWANIE_NAGANNE)) {
                listaDzieciZUwagaNegatywna.add(dziecko);
            }
        }
        return listaDzieciZUwagaNegatywna;
    }

    public Grupa getGrupa() {
        return grupa;
    }

    public void setGrupa(Grupa grupa) {
        this.grupa = grupa;
    }

    public DzieckoPodzial2 getDzieckoPodzial2() {
        return dzieckoPodzial2;
    }

    public void setDzieckoPodzial2(DzieckoPodzial2 dzieckoPodzial2) {
        this.dzieckoPodzial2 = dzieckoPodzial2;
    }

    public static List<Dziecko> getListaDzieci() {
        return listaDzieci;
    }

    public static void setListaDzieci(List<Dziecko> listaDzieci) {
        Dziecko.listaDzieci = listaDzieci;
    }

    @Override
    public String toString() {
        return "Dziecko{" +

                //       ", dzieckoPodzial2=" + dzieckoPodzial2 +
                "} " + super.toString();

    }
}





