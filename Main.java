package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the text for check: ");
        String text = scanner.nextLine();
        System.out.println(isPalindrome(text));

    }

    public static boolean isPalindrome(String text){
        text = text.toLowerCase(); //considering the case difference
        for( int i=0; i<text.length()/2;i++){
            if(text.charAt(i)==text.charAt(text.length()-1-i)){
                return true;

            }
        }
        return false;
    }


}
