package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        double price1 = 0;
        double price2 = 0;
        double price3 = 0;
        double price4 = 0;
        double price5 = 0;

        System.out.println("What type of customer are you? (Employee, regular, or member)");
        Scanner in1 = new Scanner(System.in);
        String typ = in1.next();

        if (typ.equalsIgnoreCase("employee") || typ.equalsIgnoreCase("regular"))
        {
            System.out.println("Would you like to buy a membership?");
            Scanner in2 = new Scanner(System.in);
            String membership = in1.next();
            if (membership.equalsIgnoreCase("yes"))
            {
                System.out.println("How many months would you like to pay for?");
                Scanner in3 = new Scanner(System.in);
                int month = in3.nextInt();
                Customer memberOffer = new Customer();
                price1 = memberOffer.getMembershipPrice(typ, month);
                System.out.println("A membership for you is $" + price1 + "\n");
            }
        }

        System.out.println("Would you like to attend any classes?");
        Scanner in4 = new Scanner(System.in);
        String classes = in4.next();

        if (classes.equalsIgnoreCase("yes"))
        {
            System.out.println("How many classes?");
            Scanner in5 = new Scanner(System.in);
            int classNum = in5.nextInt();
            Customer classOffer = new Customer();
            price2 = classOffer.getClassPrice(typ,classNum);
            System.out.println("Your total class price is $" + price2 + "\n");
        }

        System.out.println("Would you like to buy anything from our retail store?");
        Scanner in6 = new Scanner(System.in);
        String items = in6.next();

        if (items.equalsIgnoreCase("yes"))
        {
            System.out.println("");
            System.out.println("Shirt: $20" + "\nWater Bottle: $13" + "\nProtein Bar: $2");
            System.out.println("");
            System.out.println("What would you like to buy?");
            System.out.println("");
            Scanner in7 = new Scanner(System.in);
            String itemChoice = in7.nextLine();
            Customer retailOffer = new Customer();

            if (itemChoice.equalsIgnoreCase("Shirt"))
            {
                price3 = retailOffer.getRetailPrice(typ,20);
                System.out.println("Your retail order is $" + price3 + "\n");
            }
            else if ((itemChoice.equalsIgnoreCase("Water bottle")) || (itemChoice.equalsIgnoreCase("waterbottle")))
            {
                price3 = retailOffer.getRetailPrice(typ,13);
                System.out.println("Your retail order is $" + price3 + "\n");
            }
            else if (itemChoice.equalsIgnoreCase("protein bar") || itemChoice.equalsIgnoreCase("proteinbar"))
            {
                price3 = retailOffer.getRetailPrice(typ,2);
                System.out.println("Your retail order is $" + price3);
            }


        }

        if (typ.equalsIgnoreCase("employee") || typ.equalsIgnoreCase("member"))
        {
            System.out.println("Would you like to go into the pool?");

            Scanner in8 = new Scanner(System.in);
            String pool = in8.next();

            if (pool.equalsIgnoreCase("yes"))
            {
                Customer poolOffer = new Customer();
                price4 = poolOffer.poolPrice(typ);
                System.out.println("The price to enter the pool is $" + price4 + "\n");
            }
        }

        System.out.println("Would you like to hire a private trainer?");
        Scanner in9 = new Scanner(System.in);
        String privTrain = in9.next();

        if (privTrain.equalsIgnoreCase("yes"))
        {
            System.out.println("How many hours?");
            Scanner in10 = new Scanner(System.in);
            int hour = in10.nextInt();
            Customer trainerOffer = new Customer();

            price5 = trainerOffer.privateTrainer(typ,hour);
            System.out.println("The total price for a private trainer is $" + price5 + "\n");
        }

        double totalPrice = price1 + price2 + price3 + price4 + price5;
        System.out.println("");
        System.out.println("Your total is $" + totalPrice);



    }
}
