package com.streamliners.task3_3;

import java.util.ArrayList;
import java.util.List;

public class TouristPlace {
     String name;
     String workingHour;
     int entryTicketPrice;
     int  noOfRatings;
     float starRating;
     List<String> famousFor;

    //Parametrized constructor
    TouristPlace(String name,String workingHour,int entryTicketPrice){
        this.name = name;
        this.workingHour = workingHour;
        this.entryTicketPrice = entryTicketPrice;
        noOfRatings=0;
        starRating=0;
        famousFor = new ArrayList<>();
    }
    void rate(int stars){
        starRating = starRating*noOfRatings + stars;
        noOfRatings++;
        starRating/=noOfRatings;

    }
      TouristPlace addFamousFor(String s){
        this.famousFor.add(s);
        return this;
    }
    boolean isPlaceOpen(){
        return true;
    }

}
