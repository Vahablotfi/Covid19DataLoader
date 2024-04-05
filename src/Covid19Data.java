public class Covid19Data {
    private String region;
    private String aldresGruppe;
    private int bekræftedeTilfældeIAlt;
    private int indlagtePåICU;
    private int indlagte;
    private String dato;

    public Covid19Data(String region, String aldresGruppe, int BekræftedeTilfældeIAlt, int indlagtePåICU, int indlagte, String dato) {

        this.region = region;
        this.aldresGruppe = aldresGruppe;
        this.bekræftedeTilfældeIAlt = BekræftedeTilfældeIAlt;
        this.indlagtePåICU = indlagtePåICU;
        this.indlagte = indlagte;
        this.dato = dato;
    }

    public String getRegion() {
        return region;
    }


    public String getAldresGruppe() {
        return aldresGruppe;
    }


    public int getBekræftedeTilfældeIAlt() {
        return bekræftedeTilfældeIAlt;
    }


    public int getIndlagtePåICU() {
        return indlagtePåICU;
    }


    public int getIndlagte() {
        return indlagte;
    }


    public String getDato() {
        return dato;
    }


}
