package Week_2;
// Fig. 3.8: Account.java
// Account class with a double instance variable balance and a constructor
// and deposit method that perform validation.

public class Date {
   private int day; // instance variable 
   private int month;// instance variable 
   private int year; // instance variable 

   // Account constructor that receives two parameters  
   public Date(int day,int month, int year) {
      this.day = day; // assign day to instance variable day
      this.month=month; // assign month to instance variable month
      this.year=year; // assign year to instance variable year
   }

   // method that sets the day
   public void setDay(int day) {      
      if (day > 0) { // if the day is valid
         this.day=day; 
      }
   }

   // method returns the day
   public int getDay() {
      return day; 
   }
   
   // method that sets the month
   public void setMonth(int month) {      
      if (month > 0.0) { // if the month is valid
         this.month=month; 
      }
   }

   // method returns the month
   public int getMonth() {
      return month; 
   } 
   
   // method that sets the year
   public void setYear(int year) {      
      if (year > 0) { // if the month is valid
         this.year=year; 
      }
   }

   // method returns the year
   public int getYear() {
      return year; 
   }
   
   // method returns the year
   public String displayDate() {
      return Integer.toString(day) + "/"+Integer.toString(month)+"/"+Integer.toString(year); 
   }
}

