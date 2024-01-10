package obiektowosc.zadanie.przeczkole;

public enum WychowawcaPodzial {
    KWALIFIKOWANY(30.0, "do nauczania" ),
    TYMCZASOWY( 20.0, null) ;

    private Double stawkaZaGodz;

    private String kwalifikacje;

    WychowawcaPodzial(Double stawkaZaGodz, String kwalifikacje) {
        this.stawkaZaGodz = stawkaZaGodz;
        this.kwalifikacje = kwalifikacje;
    }

    public Double getStawkaZaGodz() {
        return stawkaZaGodz;
    }

    public void setStawkaZaGodz(Double stawkaZaGodz) {
        this.stawkaZaGodz = stawkaZaGodz;
    }

    public String getKwalifikacje() {
        return kwalifikacje;
    }

    public void setKwalifikacje(String kwalifikacje) {
        this.kwalifikacje = kwalifikacje;
    }

    @Override
    public String toString() {
        return "WychowawcaPodzial{" +
                "stawkaZaGodz=" + stawkaZaGodz +
                "} " + super.toString();
    }
}
