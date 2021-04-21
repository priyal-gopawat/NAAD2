package com.streamliners.task3_3;

import java.util.ArrayList;
import java.util.List;


public class City {
    String name;
    String state;
    List<TouristPlace> touristPlaces;

    //Parametrized constructor
    City(String name,String state){
        this.name=name;
        this.state=state;
        touristPlaces = new ArrayList<>();

    }
}
