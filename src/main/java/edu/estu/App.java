package edu.estu;


import edu.estu.business.CardReader;
import edu.estu.business.FingerPrintReader;

public class App
{
    public static void main( String[] args )
    {
        System.out.println("If user wants to use card reader these steps are processing...");
        CardReader cardReader = new CardReader();
        cardReader.add();
        cardReader.isMatches(1, "01234567891");
        System.out.println("----------------------------------------");
        System.out.println("If user wants to use fingerprint reader these steps are processing...");
        FingerPrintReader fingerPrintReader = new FingerPrintReader();
        fingerPrintReader.isMatches("ABC");

    }
}
