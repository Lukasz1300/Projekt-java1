package obiektowosc.zadanie.przeczkole;

public enum DzieckoPodzial2 {
    ZACHOWANIE_WZOROWE("zlota"), ZACHOWANIE_DOBRE("zielona"), ZACHOWANIE_NAGANNE("czerwona");

    private String odznaka;


    DzieckoPodzial2(String odznaka) {
        this.odznaka = odznaka;
    }

    public String getOdznaka() {
        return odznaka;
    }

    public void setOdznaka(String odznaka) {
        this.odznaka = odznaka;
    }

    @Override
    public String toString() {
        return "DzieckoPodzial2{" +
                "odznaka='" + odznaka + '\'' +
                "} " + super.toString();
    }
}
