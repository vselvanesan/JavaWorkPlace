// Fig. 3.9: AccountTest.java
// Inputting and outputting floating-point numbers with Account objects.
package Week_2;

public class EmployeeTest {
   public static void main(String[] args) {
      Employee emp1 = new Employee("Jane","Green", 5089.80);
      Employee emp2 = new Employee("Nesan","Selvan", 7329.89);

      // display first employee object
      System.out.printf("First Name: %s%nLast Name: %s%nYearly Salary:$%.2f%n%n",
         emp1.getFirstName(), emp1.getLastName(),emp1.getMonthSalary()*12); 
      
   // display second employee object
      System.out.printf("First Name: %s%nLast Name: %s%nYearly Salary:$%.2f%n%n",
         emp2.getFirstName(), emp2.getLastName(),emp2.getMonthSalary()*12); 
      
   // increase monthlySalary by 20%
      emp1.setMonthlySalary(emp1.getMonthSalary()*1.2); 

      // display first employee object
      System.out.printf("First Name: %s%nLast Name: %s%nYearly Salary:$%.2f%n%n",
         emp1.getFirstName(), emp1.getLastName(),emp1.getMonthSalary()*12); 
      
   // display second employee object
      System.out.printf("First Name: %s%nLast Name: %s%nYearly Salary:$%.2f%n%n",
         emp2.getFirstName(), emp2.getLastName(),emp2.getMonthSalary()*12);

   } 
} 

