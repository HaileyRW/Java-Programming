/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package address;

/**
 *
 * @author haileywilson
 */
public class CompanyAddrLabel extends AddrLabel {

   private String attnName;
   private String title;
   private String companyName;
   private String street;
   private String state;
   private String zip;
  
   // Constructor
   public CompanyAddrLabel(String attnName1, String title1, String coName, String str, String st,String zip1) {
       super();
       this.attnName = attnName1;
       this.title = title1;
       this.companyName = coName;
       this.street = str;
       this.state = st;
       this.zip = zip1;
   }

   public String getAttnName() {
       return attnName;
   }

   public String getTitle() {
       return title;
   }

   public String getCompanyName() {
       return companyName;
   }

   public void setState(String state) {
       this.state = state;
   }

   @Override
   public String getStreet() {
      
       return street;
   }

   @Override
   public String getCity() {
      
       return null;
   }

   @Override
   public String getState() {
       return state;
   }

   @Override
   public String getZip() {
       return zip;
   }

   @Override
   public String toString() {
       return "CompanyAddrLabel "+"ATTN: " + attnName + " " + title + " " + companyName
               + " " + street + ", " + state + ", " + zip;
   }

    @Override
    public String getName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
}
