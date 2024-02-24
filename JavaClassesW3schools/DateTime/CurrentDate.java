import java.time.LocalDate; // import the LocalDate class
import java.time.LocalTime; // import the LocalTime class
import java.time.LocalDateTime; // import the LocalDateTime class

class CurrentDate {
  public static void main(String[] args) {
    LocalDate myObj = LocalDate.now(); // Create a date object
    LocalTime myObj2 = LocalTime.now(); // Create a time object
    LocalDateTime myObj3 = LocalDateTime.now(); // Create a date and time object
    System.out.println(myObj); // Display the current date
    System.out.println(myObj2); // Display the current time
    System.out.println(myObj3); // Display the current date and time
  }
}