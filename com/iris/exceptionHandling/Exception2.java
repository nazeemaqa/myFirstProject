package com.iris.exceptionHandling;

public class Exception2 {
    public static void main(String args[]){
        try{
            int a=10;

           int[] array={1,2,3,4};
           char[]vowels={'a','e','i','o','u'};
           System.out.println(vowels[5]);
        }
        catch(Exception e)
        {
            e.getMessage();
        }
        System.out.println("End of program");





    }




}
