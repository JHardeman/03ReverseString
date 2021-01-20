package org.wcci;

public class Main {

    /*
    Here is a quick coding challenge where you will reverse a String
    Java has a built in API know as "reverse String Builder" which we will display
    Along with typing the logic manually in the event you are asked something similar in a coding interview
     */

    public static void main(String[] args) {

        String str = "Hello World!";
        // So here is our String "Hello World"

        // Here we are printing out the "reverseWithStringBuilder" method that is explained below
        System.out.println(reverseWithStringBuilder(str));

        // Here is the print out of our manual version
        System.out.println(reverseManually(str));

    }
    // We will take a String as an input argument and return the reversed via this method below

    private static String reverseWithStringBuilder(String str) {
        // Here is our string builder instance
        // This is what is used to manipulate the String
        return new StringBuilder(str)
                // We call the reverse method - a benefit to the string builder - it will reverse the contents
                // of that string
                .reverse()
                // the .toString method will now return the reversed order as a new string
                .toString();
    }

    private static String reverseManually(String str) {
        // First we will get a string builder instance to hold the reverse string
        StringBuilder sb = new StringBuilder();

        // Here we will loop from the length of the string -1
        // So it will start from the LAST point and ending at the FIRST
        for(int i = str.length() - 1; i >= 0; i--) {
            // Here we are getting the character at that particular index i
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
}
