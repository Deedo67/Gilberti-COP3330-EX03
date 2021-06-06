package MPE3.example;

import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Derek Gilberti
 */

//class begin
public class ex03 {
    //main method begin
    public static void main(String[] args) {
        //scanner
        Scanner in = new Scanner(System.in);

        //Input
        System.out.print("What is the quote? ");
        String quote = in.nextLine();
        System.out.print("Who said it? ");
        String name = in.nextLine();

        //Output String
        String outputString = name + " says, \"" + quote + "\"";

        //output
        System.out.println(outputString);
    }
    //main method end
}
//class end
