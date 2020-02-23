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
public interface AddrLabelInterface {
    String getAttnName();
    String getTitle();   // Mr., Mrs., etc.
    String getName();
    String getNameSuffix();   // e.g., Jr., III
    String getProfessionalSuffix();  // O.D.     (doctor of optometry)
    String getStreet();
    String getSuiteNum();
    String getCity();
    String getState();
    String getZip();

}
