public class RegionComparator implements java.util.Comparator<Covid19Data> {
    @Override
    public int compare(Covid19Data o1, Covid19Data o2) {
        int result = o2.getRegion().compareTo(o1.getRegion());
        return result !=0 ? result : o2.getAldresGruppe().compareTo(o1.getAldresGruppe()) ;
    }

}
