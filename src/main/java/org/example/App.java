/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Colin Mitchell
 */

package org.example;
import java.util.Scanner;
import static java.lang.Integer.parseInt;

public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        System.out.print("What is the order amount? ");
        int amount = parseInt(input.nextLine());

        System.out.print("What state do you live in? ");
        String state  = input.nextLine();

        System.out.print("What county do you live in? ");
        String county  = input.nextLine();

        double tax;
        double total;

        if(state.equals("Wisconsin")) {
            if(county.equals("Eau Claire")) {
                tax = amount * (.05 + 0.005);
                total = amount + tax;
            }
            else if(county.equals("Dunn")) {
                tax = amount * (.05 + 0.004);
                total = amount + tax;
            }
            else {
                tax = amount * (.05);
                total = amount + tax;
            }
        }else if(state.equals("Illinois")) {
            tax = amount * (.08);
            total = amount + tax;
        }else {
            tax = 0;
            total = amount + tax;
        }

        String tax_string = String.format("%.2f", tax);
        String total_string = String.format("%.2f", total);

        System.out.println("The tax is $" + tax_string + ".\nThe total is $" + total_string + ".");
    }
}
