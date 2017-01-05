package com.company;

/**
 * Created by Superuser on 1/4/2017.
 */
public class Customer
{
    private int membershipPrice;
    private int classPrice;
    private double retail;
    private int pool;
    private int trainer;

    public int getMembershipPrice(String typeOfCustomer, int months)
    {
        if (typeOfCustomer.equalsIgnoreCase("employee"))
        {
            membershipPrice = 1 * months;
        }
        else
        {
            membershipPrice = 30 * months;
        }
        return membershipPrice;
    }
    public int getClassPrice(String typeOfCustomer, int numClass)
    {
        if (typeOfCustomer.equalsIgnoreCase("employee"))
        {
            classPrice = numClass * 3;
        }
        else if (typeOfCustomer.equalsIgnoreCase("member"))
        {
            classPrice = numClass * 8;
        }
        else
        {
            classPrice = numClass * 10;
        }

        return classPrice;
    }
    public double getRetailPrice(String typeOfCustomer, double itemPrice)
    {
        if (typeOfCustomer.equalsIgnoreCase("employee"))
        {
            retail = itemPrice * 0.9;
        }
        else if (typeOfCustomer.equalsIgnoreCase("member"))
        {
            retail = itemPrice * 0.8;
        }
        else
        {
            retail = itemPrice;
        }

        return retail;
    }
    public int poolPrice(String typeOfCustomer)
    {
        if (typeOfCustomer.equalsIgnoreCase("employee"))
        {
            pool = 7;
        }
        else
        {
            pool = 10;
        }

        return pool;
    }
    public int privateTrainer(String typeOfCustomer, int numHours)
    {
        if (typeOfCustomer.equalsIgnoreCase("employee"))
        {
            trainer = numHours * 15;
        }
        else if (typeOfCustomer.equalsIgnoreCase("member"))
        {
            trainer = numHours * 20;
        }
        else
        {
            trainer = numHours * 25;
        }
        return trainer;
    }
}
