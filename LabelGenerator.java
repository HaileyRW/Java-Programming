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
public class LabelGenerator {

   public static String[] getLabelLines(AddrLabelInterface addr) {
     
       String addLines[] = {addr.getAttnName()};      
       return addLines;     
      
   }
  
   public static void main(String[] args) {
       
       AddrLabelInterface add[] = new AddrLabelInterface[5];
       add[0] = new FriendAddrLabel("Hailey Wilson", "123 Osler Dr", "Towson", "MD", "21252");
       add[1] = new CompanyAddrLabel("Mario Wilson", "Math and Science Department", "7800 York Rd", "Towson", "MD", "21254");
       add[2] = new ProfessionalAddrLabel("Monica Wilson", "Ph.D", "Towsontown Blvd", "Suite 100", "Towson", "MD", "21239");
      
       for(int i=0;i<3;i++) {
           System.out.println(add[i].toString());
       }
    }
}
