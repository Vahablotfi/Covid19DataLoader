import java.util.ArrayList;
import java.util.Scanner;

public class UI {
    DataHandler dataLoader = new DataHandler();
    ArrayList<Covid19Data> dataList = dataLoader.LoadData();

    Scanner sc = new Scanner(System.in);

    public void userSortRequest(){
        System.out.println("Type Region to show data ordered by Region " +
                "or Type Age to show data ordered by age : ");

        String requestedSort = sc.nextLine();
        if (requestedSort.equalsIgnoreCase("Region")){
            sortRegion();
        } else if (requestedSort.equalsIgnoreCase("Age")) {
            sortAgeGroup();
        }

        showData();
    }

    public void sortRegion(){
        dataList.sort(new RegionComparator());

    }

    public void sortAgeGroup(){
        dataList.sort(new AgeGroupComparator());
    }



    public void showData() {
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
