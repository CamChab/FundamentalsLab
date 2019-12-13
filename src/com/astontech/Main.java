package com.astontech;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        LessonFundamentalsLAB();
    }
    private static void  LessonFundamentalsLAB() {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter a Number from 1 to 10:  ");
        String Input = read.nextLine();
        float tmp = Float.valueOf(Input);
        System.out.println("Adding 1.75 gives us: " +String.format("%.2f",((float)tmp+1.75)));

        boolean minBool = false;
        boolean maxBool = true;
        byte minByte = Byte.MIN_VALUE;
        byte maxByte = Byte.MAX_VALUE;
        int minInt = Integer.MIN_VALUE;
        int maxInt = Integer.MAX_VALUE;
        short minShort = Short.MIN_VALUE;
        short maxShort = Short.MAX_VALUE;
        float minFloat = Float.MIN_VALUE;
        float maxFloat = Float.MAX_VALUE;
        long minLong = Long.MIN_VALUE;
        long maxLong = Long.MAX_VALUE;
        double minDouble = Double.MIN_VALUE;
        double maxDouble = Double.MAX_VALUE;
        char minChar = Character.MIN_VALUE;
        char maxChar = Character.MAX_VALUE;
        System.out.println("Min Boolean Value = " + minBool);
        System.out.println("Max Boolean Value = " + maxBool);
        System.out.println("Min Byte Value = " + minByte);
        System.out.println("Max Byte Value = " + maxByte);
        System.out.println("Min Int Value = " + minInt);
        System.out.println("Max Int Value = " + maxInt);
        System.out.println("Min Short Value = " + minShort);
        System.out.println("Max Short Value = " + maxShort);
        System.out.println("Min Float Value = " + minFloat);
        System.out.println("Max Float Value = " + maxFloat);
        System.out.println("Min Long Value = " + minLong);
        System.out.println("Max Long Value = " + maxLong);
        System.out.println("Min Double Value = " + minDouble);
        System.out.println("Max Double Value = " + maxDouble);
        System.out.println("Min Char Value = " + " " + " (It's a space)");
        System.out.println("Max Char Value = " + "~");
        System.out.println("Min Typical Char = " + 'a' );
        System.out.println("Max Typical Char = "+ 'Z');
        System.out.println("\nDid you know that a String is just a sequence of characters?");
        System.out.print("I'll prove it. Enter a word: ");
        Input = read.nextLine();
        System.out.println("I will now break this string down into its smaller components...");
        for(int i=0;i<Input.length();i++)
            System.out.println(Input.charAt(i));

        System.out.println("Creating List of Random Numbers and Printing Them");
        List<Integer> IntList = new ArrayList<Integer>();
        for(int i=0;i<(int)(Math.random()*100+3);i++)
            IntList.add((int)(Math.random()*10));
        for(int SingleInt : IntList)
            System.out.print(SingleInt+" ");

        System.out.println("Did you know you can't make a list of char or int because those are data types and not classes?");
        System.out.println("int and char are for instances of variables while Integer and Character are classes.");

        System.out.println("\nCreating Variables for Lottery");
        String GameName = "Powerball";
        int[] WinningNumbers = new int[]{4, 20, 69, 100, -1, 0};
        List<Integer> WinNums = new ArrayList<Integer>();
        for(int i=0;i<6;i++)
            WinNums.add((int)(Math.random()*10));
        int Jackpot = 1000000;
        Date DrawingDate = new Date(69, 3, 20, 4, 20);
        System.out.println(DrawingDate);
        System.out.println("Lottery Game: " + GameName);
        //System.out.println("Winning Numbers: " + WinningNumbers);
        System.out.println("Winning Numbers: " + WinNums);
        System.out.println("Jackpot: $" + Jackpot);
        System.out.println("Drawing Date: " + DrawingDate);

        int i = 2;
    }
}
