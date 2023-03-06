package com.revature;

public class Driver {
    public static void main(String[] args) {
        try{
            System.out.println("Hello world from " + args[0]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
    }
}
