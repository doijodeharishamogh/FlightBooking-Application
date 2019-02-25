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
public class Airliner {
    private String aName;
    private ArrayList<Fleet> fArrayList;
    
    public Fleet addFlght()
    {
        Fleet fl= new Fleet();
        fArrayList.add(fl);
        return fl;
    }
    public void deletefleet(Fleet fleet)
    {
       fArrayList.remove(fleet);
    }
    
    public Airliner()
    {
        fArrayList=new ArrayList<Fleet>();
    }
            

    public String getaName() {
        return aName;
    }

    public void setaName(String aName) {
        this.aName = aName;
    }

    public ArrayList<Fleet> getfArrayList() {
        return fArrayList;
    }

    public void setfArrayList(ArrayList<Fleet> fArrayList) {
        this.fArrayList = fArrayList;
    }
    
    @Override
    public String toString()
    {
        return this.getaName();
    }
    
}
