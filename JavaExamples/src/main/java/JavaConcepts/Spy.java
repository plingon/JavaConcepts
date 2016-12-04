package JavaConcepts;
/**
 * Created by pling on 03/12/2016.
 */
public class Spy {private String day;

    public void setDay(String day) {
        this.day = day;
    }

    public String getDay() {
        return day;
    }

    public String CodeName ;
    public Agency SpyAgency;
     public void DisplaySpyInfo()
     {
         String AgencyDetails = SpyAgency.GetAgencyInfo();
         String AgentDetails= ("Agent Code name is : "+ CodeName +" From Agency : "+AgencyDetails);

         System.out.println(AgentDetails);
     }
}
