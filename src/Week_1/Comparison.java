package Week_1;
// Fig. 2.15: Comparison.java
// Compare integers using if statements, relational operators 
// and equality operators.
import java.util.Scanner; // program uses class Scanner

public class Comparison {
   // main method begins execution of Java application
   public static void main(String[] args) {
      // create Scanner to obtain input from command line
      Scanner input = new Scanner(System.in);

      System.out.print("Enter first number: "); // prompt 
      double number1 = input.nextDouble(); // read first number from user 

      System.out.print("Enter second number: "); // prompt 
      double number2 = input.nextDouble(); // read second number from user 
      
      if (number1 == number2) {
         System.out.printf("%f == %f%n", number1, number2);
	  }

      else if (number1 != number2) {
         System.out.printf("%f != %f%n", number1, number2);
	  }

      else if (number1 < number2) {
         System.out.printf("%f < %f%n", number1, number2);
	  }

      else if (number1 > number2) {
         System.out.printf("%f > %f%n", number1, number2);
	  }

      else if (number1 <= number2) {
         System.out.printf("%f <= %f%n", number1, number2);
	  }

      else if (number1 >= number2) {
         System.out.printf("%f >= %f%n", number1, number2);
         
     input.close();
	  }
   } // end method main
} // end class Comparison


