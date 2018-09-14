package Week_2;
// Fig. 3.8: Account.java
// Account class with a double instance variable balance and a constructor
// and deposit method that perform validation.

public class Employee {
   private String firstName; // instance variable 
   private String lastName;
   private double monthlySalary; // instance variable 

   // Account constructor that receives two parameters  
   public Employee(String firstName,String lastName, double monthlySalary) {
      this.firstName = firstName; // assign first name to instance variable firstName
      this.lastName=lastName; // assign last name to instance variable lastName
      // validate that the balance is greater than 0.0; if it's not,
      // instance variable balance keeps its default initial value of 0.0
      if (monthlySalary > 0.0) { // if the balance is valid
         this.monthlySalary = monthlySalary; // assign it to instance variable balance
      }
   }

   // method that sets the monthlySalary
   public void setMonthlySalary(double monthlySalary) {      
      if (monthlySalary > 0.0) { // if the monthlySalary is valid
         this.monthlySalary=monthlySalary; 
      }
   }

   // method returns the monthlySalary
   public double getMonthSalary() {
      return monthlySalary; 
   } 

   // method that sets the first name
   public void setfirstName(String firstName) {
      this.firstName = firstName; 
   } 
   
   // method that sets the last name
   public void setlastName(String lastName) {
      this.lastName = lastName; 
   } 

   // method that returns the firstName
   public String getFirstName() {
      return firstName; 
   } 
   
   // method that returns the lastName
   public String getLastName() {
      return lastName; 
   }
}

