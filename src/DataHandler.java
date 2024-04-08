import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class DataHandler {
    File covidData = new File("11_noegletal_pr_region_pr_aldersgruppe_edited.csv");
    ArrayList<Covid19Data> DataArr = new ArrayList<>();
    Scanner sc = null;

    public ArrayList<Covid19Data> LoadData() {
        try {
            sc = new Scanner(covidData);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] attributes = line.split(";");
            String region = attributes[0];
            String aldresGruppe = attributes[1].contains("Oct/19") ? "10-19" : attributes[1];
            int bekræftedeTilfældeIAlt = Integer.parseInt(attributes[2]);
            int indlagtePåICU = Integer.parseInt(attributes[3]);
            int indlagte = Integer.parseInt(attributes[4]);
            String dato = attributes[5];


            Covid19Data covidObject = new Covid19Data(region, aldresGruppe, bekræftedeTilfældeIAlt, indlagtePåICU, indlagte, dato);

            DataArr.add(covidObject);
        }

        sc.close();
        return DataArr;

    }


}
