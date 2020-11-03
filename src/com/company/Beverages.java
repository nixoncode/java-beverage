package com.company;

import java.util.Scanner;

public class Beverages {

    public static void main(String[] args) {

        String[] beverage = {"Fanta", "Johnnie Walker"};
        int[] price = {60, 300};

        String[] type = {"Softdrink", "Alcoholic"};


        String drinks = "";
        for (int i = 0; i < beverage.length; i++) {
            drinks += (i + 1) + ". " + beverage[i] + "\n";
        }

        System.out.println("Choose a Beverage\n" + drinks);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int chosenBeverage = Integer.parseInt(scanner.nextLine()) - 1;

        System.out.print("Enter Quantity: ");
        int chosenQty = Integer.parseInt(scanner.nextLine());

        String name = beverage[chosenBeverage];
        int cost = price[chosenBeverage];
        int total = cost * chosenQty;
        System.out.println(name + " is a soft drink, and costs Kshs. " + cost + ". Thus 3 bottles of Fanta would cost Kshs. " + total);


    }
}
