package com.company;

import java.util.Scanner;

public class SecondsToTime {

    public static void main(String[] args) {

        int[] time = new int[3];
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Number of Seconds: ");
        int seconds = scanner.nextInt();

        time[0] = seconds / (60 * 60);

        seconds = seconds - (time[0] * (60 * 60));

        time[1] = seconds / 60;
        seconds = seconds - (time[1] * 60);

        time[2] = seconds % (60);


        System.out.println(time[0] + ":" + time[1] + ":" + time[2]);
    }
}
