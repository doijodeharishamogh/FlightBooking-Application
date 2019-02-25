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
public class Fleet {
    private String fNumber;
    private String fModel;
    private int maxOccupancy;
    private Schedule schedule;
    ArrayList<Integer> window;
    ArrayList<Integer> isle;
    ArrayList<Integer> middle;

    public ArrayList<Integer> getWindow() {
        return window;
    }

    public void setWindow(ArrayList<Integer> window) {
        this.window = window;
    }

    public ArrayList<Integer> getIsle() {
        return isle;
    }

    public void setIsle(ArrayList<Integer> isle) {
        this.isle = isle;
    }

    public ArrayList<Integer> getMiddle() {
        return middle;
    }

    public void setMiddle(ArrayList<Integer> middle) {
        this.middle = middle;
    }
    
    public Fleet()
    {   window=new ArrayList<Integer>();
        isle=new ArrayList<Integer>();
        middle=new ArrayList<Integer>();
        
        int counter=1;
        schedule=new Schedule();
        for(int i=1;i<=25;i++)
        {
            for(int j=1;j<=6;j++)
            {
                if(j==1 || j==6)
                {
                    window.add(counter);
                }
                if(j==2 || j==5)
                {
                    middle.add(counter);
                }
                if(j==3 || j==4)
                {
                    isle.add(counter);
                }
                counter=counter+1;
            }
        }
    }

    public String getfNumber() {
        return fNumber;
    }

    public void setfNumber(String fNumber) {
        this.fNumber = fNumber;
    }

    public String getfModel() {
        return fModel;
    }

    public void setfModel(String fModel) {
        this.fModel = fModel;
    }

    public int getMaxOccupancy() {
        return maxOccupancy;
    }

    public void setMaxOccupancy(int maxOccupancy) {
        this.maxOccupancy = maxOccupancy;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }
    
    public void deletewindow(Object obj)
    {
       window.remove(obj);
    }
    public void deleteisle(Object obj)
    {
        isle.remove(obj);
    }
    public void deletemiddle(Object obj)
    {
        middle.remove(obj);
    }
    @Override
    public String toString()
    {
        return this.getfNumber();
    }
    
}
