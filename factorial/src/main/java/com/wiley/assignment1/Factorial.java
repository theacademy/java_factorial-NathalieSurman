package com.wiley.assignment1;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;


public class Factorial {

	private Scanner scanner;
	private PrintStream printStream;
	private int num;


	public Factorial(InputStream inputStream, PrintStream printStream) {
		this.scanner = new Scanner(inputStream);
		this.printStream = printStream;
	}

	public int isInputNumberValid()  {

        /*
		- Update this method to accept a number from the user and store the value in an instance variable `num`. 
			- Use an instance variable `scanner` to accept the input from the user.
		
		- If the input value is valid, return the number input by the user (NOT the factorial of the number).
		
		- In case of invalid input:
			- Print the following message to the console: "Invalid entry. Please enter an integer between 1 and 10, inclusive."
			    - Use `this.printStream.print()` and NOT `System.out.println()` to print to the console.
			- Return -1
			
		- All code should be inside the placeholders below.
		*/

		//YOUR CODE STARTS HERE
		// The "printStream.print()" method is used to output prompts and error messages to the console instead of System.out.println()
//		this.printStream.print(" Please enter a number between 1 and 10: ");

		try {
			num =Integer.parseInt(scanner.nextLine()); // Getting the user's input

		} catch (NumberFormatException ex){
			//printStream.print("Invalid entry. Please enter an integer between 1 and 10, inclusive.");
		}


			// Next we want to check if the input value is valid or NOT
			// If the input is valid, return the number input by the user (NOT the factorial of the number).
			if (num >= 1 && num <= 10){
				return num;
			} else{
				printStream.print("Invalid entry. Please enter an integer between 1 and 10, inclusive.");
				return -1;
			}


			//YOUR CODE ENDS HERE


		}


		private void calculateFactorial(int num) {

          /*
		  Use this method to calculate the factorial of the number input by the user.
		  
		  - All code should be inside the placeholders below.
		*/

			int result = 1;
			//YOUR CODE STARTS HERE
			//The loop iterates from 1 to the input number (num)
			// Note it starts from i = 1 and continues until i reaches (num)
			// It will loop over each number in the range to calculate the factorial.
			for (int i = 1; i <= num; i++) {
				// the result is multiplied by the loop variable i
				//This calculates the factorial by multiplying all the numbers from 1 to (num) together.
				result *= i;
			}

			//YOUR CODE ENDS HERE
			this.printStream.print("The Factorial is: " + result);

		}

		public void calculateFactorial() {
         /*
		 Do not change this method.
		 */

			int input = this.isInputNumberValid();
			if(input != -1) {
				calculateFactorial(input);
			}

		}


		public static void main(String[] args) {
        /*
		 Do not change this method.
		 */
			Factorial fact = new Factorial(System.in,System.out);
			System.out.println("Enter an integer between 1 and 10, inclusive");
			fact.calculateFactorial();
		}


	}
