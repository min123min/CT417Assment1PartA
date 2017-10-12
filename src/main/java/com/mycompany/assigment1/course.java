package com.mycompany.assigment1;

import org.joda.time.DateTime;
import java.util.ArrayList;
public class course {
    private String  CourseName;     
    DateTime startDate = new DateTime();
    DateTime endDate = new DateTime();
    private ArrayList<module> modules;

     

    public course(String Name, DateTime startDate, DateTime endDate ){
        this.CourseName   = Name;
        this.startDate = startDate;
        this.endDate = endDate;
        modules = new ArrayList<module>();
    }
    
    public ArrayList<module> getModules() {
    return modules;
    }
    
    public String getCourseName() {
        return CourseName;
    }
    
    public DateTime getStartDate() {
        return startDate;
    }
    
    public DateTime getEndDate() {
        return endDate;
    }
    
    public void setCourseName(String Name) {
        this.CourseName = Name;
    }
    
    public void setStartDate(DateTime startDate) {
        this.startDate = startDate;
    }
    
    public void getEndDate(DateTime endDate) {
        this.endDate = endDate;
    }
    public void addModules(module module){
        modules.add(module);
    }
}