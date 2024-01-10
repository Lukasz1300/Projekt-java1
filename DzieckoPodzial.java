//package obiektowosc.zadanie.przeczkole;
//
//public enum DzieckoPodzial {
//    POSLUSZNE("zlota"), NIEPOSLUSZNE( "uwaga") ;
//
//    private String odznaka;
//    private String przewinienia;
//
//       DzieckoPodzial(String odznaka) {
//        this.odznaka = odznaka;
//
//        if (odznaka.equals("zlota")) {
//            this.przewinienia = "brak";
//        } else if (odznaka.equals("uwaga")) {
//            this.przewinienia = "zle zachowanie";
//        }
//    }
//
//    public String getOdznaka() {
//        return odznaka;
//    }
//
//    public void setOdznaka(String odznaka) {
//        this.odznaka = odznaka;
//    }
//
//    public String getPrzewinienia() {
//        return przewinienia;
//    }
//
//    public void setPrzewinienia(String przewinienia) {
//        this.przewinienia = przewinienia;
//    }
//
//    @Override
//    public String toString() {
//        return "DzieckoPodzial{" +
//                "odznaka='" + odznaka + '\'' +
//                ", przewinienia='" + przewinienia + '\'' +
//                "} " + super.toString();
//    }
//}
