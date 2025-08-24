package com.example;

public class TipCalculator {
    //WRITE YOUR PROGRAM IN calculateTip
    public static String calculateTip(int people, int percent, double cost) { //You must use these  variable in your calculations
        //DO NOT DELETE ANY OF THE CODE BELOW      
        // StringBuilder result = new StringBuilder();
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
     //TEST YOUR PROGRAM IN main
     public static void main(String[] args) {
        //try different values for people, percent, and cost to test your program before running test cases
        int people=10; 
        int percent=8;
        double cost=10.5;              
        System.out.println(calculateTip(people,percent,cost));
    }
}
        
