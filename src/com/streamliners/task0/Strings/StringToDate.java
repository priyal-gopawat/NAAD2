package com.streamliners.task0.Strings;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class StringToDate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       String str = "2021-02-10";
        LocalDate date = LocalDate.parse(str, DateTimeFormatter.ISO_DATE);
        System.out.println(date);
    }
}
