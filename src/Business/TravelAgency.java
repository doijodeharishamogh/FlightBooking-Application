/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class TravelAgency {
    private ArrayList<Airliner> airArrayList;
    private CustomerDirectory cDir;
    private ArrayList<bookinghistory> bhisAL;
   
    public TravelAgency()
    {  
       cDir=new CustomerDirectory();
       airArrayList= new ArrayList<Airliner>();
       bhisAL=new ArrayList<bookinghistory>();
    }

    public ArrayList<bookinghistory> getBhisAL() {
        return bhisAL;
    }

    public void setBhisAL(ArrayList<bookinghistory> bhisAL) {
        this.bhisAL = bhisAL;
    }

    public CustomerDirectory getcDir() {
        return cDir;
    }

    public void setcDir(CustomerDirectory cDir) {
        this.cDir = cDir;
    }
            
    public ArrayList<Airliner> getAirArrayList() {
        return airArrayList;
    }

    public void setAirArrayList(ArrayList<Airliner> airArrayList) {
        this.airArrayList = airArrayList;
    }
    
    public Airliner addAirliner(){
        Airliner AL= new Airliner();
        airArrayList.add(AL);
        return AL;                           
    }
    public void deleteairline(Airliner air)
    {
        airArrayList.remove(air);
    }
    public bookinghistory addbhis()
    {
       bookinghistory bhis=new bookinghistory();
       bhisAL.add(bhis);
       return bhis;
        
    }
    
    
}
