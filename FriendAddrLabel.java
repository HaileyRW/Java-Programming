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
public class FriendAddrLabel extends AddrLabel{
    private String name;
    private String street;
    private String city;
    private String zip;
    private String state;
    
    //Constructor
    public FriendAddrLabel(String name1, String street1, String city1, String zip1, String state1){
        
        this.name=name1;
        this.street=street1;
        this.city=city1;
        this.zip=zip1;
        this.state=state1;
    }
    public String getName(){
        return name;
    }
    public String getStreet(){
        return street;
    }
    public String getCity(){
        return city;
    }
    public String getZip(){
        return zip;
    }
    public String getState(){
        return state;
    }
}
