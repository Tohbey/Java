package com.company;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
	    System.out.println("Enter a number between 0 and 100");
	    number = input.nextInt();
	    if(number <= 100){
	        System.out.println("valid");
	        if(number%2 == 0){
	            System.out.println(number +" is even");
	            if(number >= 2 && number <= 5){
                    System.out.println("Not Weird");
                }else if(number >= 6 && number <=20){
	                System.out.println("Weird");
                }else{
	                System.out.println("Not weird");
                }
            }else{
	            System.out.println(number +" is odd and Wierd");
            }
        }else{
	        System.out.println(number+ " not valid");
        }
    }
}
