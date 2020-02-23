package address;

public abstract class AddrLabel implements AddrLabelInterface{
    
    private final String emptyAttn = " ";
    private final String emptyTitle = " ";
    private final String emptySuffix = " ";
    private final String emptyPSuffix = " ";
    private final String emptySuite = " ";
    /*private final String emptyStr = " ";
    private final String emptyCity = " ";
    private final String emptySt = " ";
    private final String emptyZip = " "; */
    
    
    public String getAttnName(){
        return emptyAttn;
    }
    public String getTitle(){
        return emptyTitle;
    }
    public String getNameSuffix(){
        return emptySuffix;
    }
    public String getProfessionalSuffix(){
        return emptyPSuffix;
    } 
    public String getSuiteNum(){
        return emptySuite;
    }
    public abstract String getStreet();
    public abstract String getCity();
    public abstract String getState();
    public abstract String getZip();
    public abstract String getName();
}