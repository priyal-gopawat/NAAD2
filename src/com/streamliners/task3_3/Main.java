package com.streamliners.task3_3;

public class Main {
    public static void main(String[] args) {


        TouristPlace jodhpur = new TouristPlace("Jodhpur", "10:00AM to 5:00PM", 200);
        jodhpur.addFamousFor("BlueCity");
        jodhpur.rate(5);
        jodhpur.rate(3);
        System.out.println(jodhpur.starRating);

    }

}
