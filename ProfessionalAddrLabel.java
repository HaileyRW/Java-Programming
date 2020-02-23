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
public class ProfessionalAddrLabel extends AddrLabel {

  
   private String name;
   private String professionalSuffix;
   private String street;
   private String suite;
   private String city;
   private String state;
   private String zip;
  
   // Constructor
   public ProfessionalAddrLabel(String name1, String prSuffix, String str, String suite1, String city1,String st, String zip1) {
       super();
       this.name = name1;
       this.professionalSuffix = prSuffix;
       this.street = str;
       this.suite = suite1;
       this.city = city1;
       this.state = st;
       this.zip = zip1;
   }

   public String getName() {
       return name;
   }

   public String getProfessionalSuffix() {
       return professionalSuffix;
   }

   public String getSuite() {
       return suite;
   }

   public String getZip() {
       return zip;
   }

   @Override
   public String getStreet() {
       return street;
   }

   @Override
   public String getCity() {
       return city;
   }

   @Override
   public String getState() {
       return state;
   }

   @Override
   public String toString() {
       return "ProfessionalAddrLabel " + name + ", " + professionalSuffix + " "
               + street + ", " + suite + " " + city + ", " + state + ", " + zip ;
   }

  
}