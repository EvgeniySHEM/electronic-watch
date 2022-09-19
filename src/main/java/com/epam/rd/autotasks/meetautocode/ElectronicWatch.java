package com.epam.rd.autotasks.meetautocode;

import java.util.Scanner;

public class ElectronicWatch {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();
        System.out.println(timeToString(seconds));


    }
    public static String timeToString(int secs) {
        int hour = secs / 3600 % 24,
                min = secs % 3600 / 60,
                sec = secs % 3600 % 60;
        return String.format("%01d:%02d:%02d", hour, min, sec);
    }
}
