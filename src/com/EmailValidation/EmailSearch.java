package com.EmailValidation;

import java.util.Scanner;

public class EmailSearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println();
		System.out.println("***********WELCOME DEVELOPER***********");
		System.out.println();
//Taking size of employees to be added
		System.out.println("How Many Employee EmailId's do you want to add? : ");
		int n=sc.nextInt();

		String[] emails=new String[n];

		System.out.println("Enter those "+n+" EmailId's  :");
		// taking emailId's of employees as input
		for(int i=0; i<n; i++)
			emails[i]=sc.next();
		System.out.println("EmailId,s Added Successfully");
		System.out.println("Do You want to search any email Id? \nYes/No");
		String option=sc.next();
		if(option.equalsIgnoreCase("Yes")) {
			
		System.out.println("Enter emailId you want to search:");
		String search=sc.next();
		//using Linear Search to search an emailid
		int temp=0;
		for(int i=0; i<emails.length;i++) {
			if(emails[i].equals(search)) {
				System.out.println(search+" Email is Available in the data");
				temp=temp+1;
			}
			
		}
		if(temp==0) {
			System.out.println("Email is NOT FOUND in data");
		}}
		else
			System.out.println("Thank You");
	sc.close();
	}

}


