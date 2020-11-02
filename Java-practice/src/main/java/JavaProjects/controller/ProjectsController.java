package JavaProjects.controller;

import java.util.ArrayList;
import java.util.Scanner;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProjectsController {

	
	@RequestMapping("/")
	public ModelAndView index() {
		// will handle the home/index html page

		//overloaded 1st is jsp, 2nd is expressions and 3rd is value of expression
		//I am manually putting in the string to be reversed in the method below.
		return new ModelAndView("index", "reverse", reverse("Input a string"));

	}
	
	
	@RequestMapping("/replace")
	public ModelAndView replaced() {
		// will handle the home/index html page

		//overloaded 1st is jsp, 2nd is expressions and 3rd is value of expression
		return new ModelAndView("replace", "replace", replace());

	}
	
	public static  String reverse(String str) {
//		System.out.println("Hey friend, please input a string: ");
//		Scanner scnr = new Scanner(System.in);
//		String str = scnr.nextLine();
		String reverse ="";
		for (int i =str.length()-1;i >=0;i--) {
			reverse = reverse +str.charAt(i);
		}
//		scnr.close();
		return  reverse;
	}
	
//	try this way, with using only parameters and no user input.
//	public String reverse(String s) {
//
//        String reversedString = "";
//        for(int i=s.length(); i>0; i--) {
//            reversedString += s.charAt(i-1);
//        }   
//
//        return reversedString;
//    }
	
	
	
	 public static String replace()
	    {
	        Scanner scnr = new Scanner(System.in);
	         
	        System.out.println("Enter the string...");
	         
	        String inputString = scnr.nextLine();
	         
	        String newInputString = inputString.replaceAll("[AEIOUaeiou]", "");
	         
	        System.out.println("The string without vowels...");
	         
//	        System.out.println(newInputString);
	         
	        scnr.close();
			return newInputString;
	    }
	 
	 public static int fizzbuzz() {
			// Doing fizz buzz. for multiples of 3 write fizz
			// for multiples of 5 write buzz. for multiples of 3
			// and 5 write fizzbuzz

			for (int i = 1; i < 100; i++) {

				if (i % 15 == 0) {
					System.out.println("fizzbuzz");
				}
				else if (i % 5 ==0) {
					System.out.println("buzz");
				}
				else if(i % 3 ==0) {System.out.println("fizz");
				}
				else {System.out.println(i);
				}
				
			}
			return 0;

		}
	 
	 public static String palindrome() {
		    String r = ""; //To store the reverse
		    Scanner scnr = new Scanner(System.in);
		    System.out.println("Enter the String");
		    String s = scnr.next(); // Entering the string

		    for(int i= s.length() - 1;i>=0;i--) {
		        r = r + s.charAt(i);
		    }

		    if(r.equals(s)) {
		        System.out.println("Is a palindrome");
		    }
		    else {
		        System.out.println("Not a palindrome");
		    }
		    scnr.close();
			return null; //(maybe void, or -s, or r);
	}
	 
	 public static void main(String[] args) {      
		 int my_array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		 int sum = 0;

		 for (int i : my_array)
		     sum += i;
		 System.out.println("The sum is " + sum);
		 }
	 
	 public static String hello() {
		    ArrayList<String> strings = new ArrayList<String>();
		    strings.add("Hello, World!");
		    strings.add("Welcome to CoderPad.");
		    strings.add("This pad is running Java " + Runtime.version().feature());

		    for (String string : strings) {
		      System.out.println(string);
		    }
			return null;
		  }
}
