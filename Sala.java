package obiektowosc.zadanie.przeczkole;

public class Sala {
    private int numerSali;
    private Przedszkole przedszkole;

    private SalaKolory salaKolory;

    private Grupa grupa;

    public Sala(int numerSali, Przedszkole przeczkole, SalaKolory salaKolory) throws Exception {
        if (przeczkole == null) {
            throw new Exception("Sala musi byæ przypisana do przedszkole");
        }
        this.numerSali = numerSali;
        this.przedszkole = przeczkole;
        this.salaKolory = salaKolory;
        przeczkole.getListaSal().add(this);

    }

    public void setPrzedszkole(Przedszkole przedszkole) {
        this.przedszkole = przedszkole;
    }

    public void setGrupa(Grupa grupa) {
        this.grupa = grupa;
    }

    public Przedszkole getPrzedszkole() {
        return przedszkole;
    }

    public Grupa getGrupa() {
        return grupa;
    }

    public int getNumerSali() {
        return numerSali;
    }

    public void setNumerSali(int numerSali) {
        this.numerSali = numerSali;
    }

    @Override
    public String toString() {
        return "Sala{" +
                "numerSali=" + numerSali +
                '}';
    }
}
