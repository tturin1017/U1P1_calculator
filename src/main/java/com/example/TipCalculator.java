package com.example;

import java.util.Scanner;

public class TipCalculator {
    //WRITE YOUR PROGRAM IN calculateTip
    public static String calculateTip(int people, int percent, double cost) { //You must use these  variable in your calculations
        //DO NOT DELETE ANY OF THE CODE BELOW      
        double tipAmount = cost * percent / 100.0;
        double totalWithTip = cost + tipAmount;
        double costPerPerson = cost / people;
        double tipPerPerson = tipAmount / people;
        double totalPerPerson = totalWithTip / people;


        // String result = "-------------------------------\n" +
        //                "Total bill before tip: $" + "" + "\n" +
        //                "Total percentage: " + "" + "%\n" +
        //                "Total tip: $" + "" + "\n" +
        //                "Total Bill with tip: $" + "" + "\n" +
        //                "Per person cost before tip: $" + "" + "\n" +
        //                "Tip per person: $" + "" + "\n" +
        //                "Total cost per person: $" + "" + "\n" +
        //                "-------------------------------\n";
                String result = "-------------------------------\n" +
                "Total bill before tip: $" + (Math.round(cost * 100.0) / 100.0) + "\n" +
                "Total percentage: " + percent + "%\n" +
                "Total tip: $" + (Math.round(tipAmount * 100.0) / 100.0) + "\n" +
                "Total Bill with tip: $" + (Math.round(totalWithTip * 100.0) / 100.0) + "\n" +
                "Per person cost before tip: $" + (Math.round(costPerPerson * 100.0) / 100.0) + "\n" +
                "Tip per person: $" + (Math.round(tipPerPerson * 100.0) / 100.0) + "\n" +
                "Total cost per person: $" + (Math.round(totalPerPerson * 100.0) / 100.0) + "\n" +
                "-------------------------------\n";
        return result;
    }

    public static String extraCredit(int people, int percent, double cost) {

            Scanner scan = new Scanner(System.in);
           // System.out.print("Enter an item or type -l to exit");
            String character = "a";
            String item = "start";
        
            //  COPY AND PASTE YOUR PROGRAM FROM CALCULATETIP HERE 
            double tipAmount = cost * percent / 100.0;
            double totalWithTip = cost + tipAmount;
            double costPerPerson = cost / people;
            double tipPerPerson = tipAmount / people;
            double totalPerPerson = totalWithTip / people;

            String result = "-------------------------------\n" +
                "Total bill before tip: $" + (Math.round(cost * 100.0) / 100.0) + "\n" +
                "Total percentage: " + percent + "%\n" +
                "Total tip: $" + (Math.round(tipAmount * 100.0) / 100.0) + "\n" +
                "Total Bill with tip: $" + (Math.round(totalWithTip * 100.0) / 100.0) + "\n" +
                "Per person cost before tip: $" + (Math.round(costPerPerson * 100.0) / 100.0) + "\n" +
                "Tip per person: $" + (Math.round(tipPerPerson * 100.0) / 100.0) + "\n" +
                "Total cost per person: $" + (Math.round(totalPerPerson * 100.0) / 100.0) + "\n" +
                "-------------------------------\n";


            // the while loop condition is checked,
            // and if TRUE, runs the code inside.
            // when the code inside is done running, the condition is rechecked,
            // and the loop repeats as long as the condition remains TRUE.
            // when the condition becomes FALSE, it stops
            result+="Items ordered:\n";
            while (!item.equals("-l")) {
                System.out.print("Enter an item or type -l to exit\n");
                item = scan.nextLine();
                System.out.println(item);
                if(!item.equals("-l")){
                    result+=item+"\n";
                }
            }
            result+="-------------------------------\n";

            // code below the while loop runs after the loop ends
            

        //IF YOU ARE DOING THE EXTRA CREDDIT, COMMENT OUT THE LINE BELOW AND UNCOMMENT return result;
        //return "Extra credit not implemented";
        return result;

    }
    
    
     //TEST YOUR PROGRAM IN main
     public static void main(String[] args) {
        //try different values for people, percent, and cost to test your program before running test cases
        int people=10; 
        int percent=8;
        double cost=10.5;              
        //System.out.println(calculateTip(people,percent,cost));
        System.out.println(extraCredit(people, percent, cost));
    }
}
        
