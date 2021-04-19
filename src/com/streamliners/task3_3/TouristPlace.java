package com.streamliners.task3_3;

import java.util.ArrayList;
import java.util.List;

public class TouristPlace {
     String name;
     String workingHour;
     int entryTicketPrice;
     int noOfRatings;
     float starRating;
     List<String> famousFor;

     //default constructor
    TouristPlace(){
        noOfRatings=0;
        starRating=0;
    }
    //Parametrized constructor
    TouristPlace(String name,String workingHour,int entryTicketPrice){
        this.name=name;
        this.workingHour=workingHour;
        this.entryTicketPrice=entryTicketPrice;
        famousFor = new ArrayList<>();
    }
    void rate (int stars){
        
    }

}
