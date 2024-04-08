import java.util.Comparator;

public class AgeGroupComparator implements Comparator<Covid19Data> {


    @Override
    public int compare(Covid19Data o1, Covid19Data o2) {
        int result = o2.getAldresGruppe().compareTo(o1.getAldresGruppe());
        return result !=0 ? result : o2.getRegion().compareTo(o1.getRegion());
    }
}
