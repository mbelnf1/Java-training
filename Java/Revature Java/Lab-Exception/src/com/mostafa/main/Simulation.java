package com.mostafa.main;
import java.util.Scanner;

public class Simulation {

    public static void main(String[] args) {
        try {
            getInput();
        } catch (EverNumberExceptions e){
            e.printStackTrace();
        }
    }

    public static void getInput() throws EvenrNumberExceptions{
        Scanner in = new Scanner(System.in);

        //get input from user
        System.out.println("Type in a number and press Enter...");
      
        String line = in.nextLine();
        System.out.println("You've typed: " + line);

        //test if number is even, throw exception if true
        if (isEven(line)) {
            try {
                throw new EverNumberExceptions();
            } finally {
                in.close();
            }
        }

        //close resources
        in.close();
    }