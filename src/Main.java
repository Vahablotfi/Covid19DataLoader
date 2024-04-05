import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

        DataHandler dataLoader = new DataHandler();
        ArrayList<Covid19Data> dataList;
        dataList = dataLoader.LoadData();


        for (Covid19Data item : dataList) {
            System.out.println("Region " + item.getRegion());
            System.out.println("aldresgruppe " + item.getAldresGruppe());
            System.out.println("Bekræftede tilfælde i alt " + item.getBekræftedeTilfældeIAlt());
            System.out.println("Indlagte på intensiv " + item.getIndlagtePåICU());
            System.out.println("Indlagte " + item.getIndlagte());
            System.out.println("Dato " + item.getDato());
            System.out.println("");
        }

    }


}