package JavaConcepts;

/**
 * Created by pling on 03/12/2016.
 */
public class Agency {
    public String AgencyName;
    public String Country;
     public String GetAgencyInfo()
     {
         String message = ( AgencyName + " established in Country : " + Country);
         return message;
     }
}
