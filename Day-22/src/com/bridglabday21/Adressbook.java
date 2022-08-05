package com.bridglabday21;

import java.util.Scanner;

public class Adressbook {
	
   public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        String name = scanner.next();

	        if (name.equalsIgnoreCase("Anshul")) {
	            System.out.println("0845505050");
	        } else if (name.equalsIgnoreCase("ravi")) {
	            System.out.println("004925000");
	        } else if (name.equalsIgnoreCase("aman")) {
	            System.out.println("9450037051");
	        }

	        // ADD MORE!

	    }
	}


