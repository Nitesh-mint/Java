import java.time.LocalDate;
import java.time.Period;

public class addDates {
  public static void main(String[] args) {
    // Create two LocalDate objects representing the dates
    LocalDate date1 = LocalDate.of(2022, 1, 15);
    LocalDate date2 = LocalDate.of(2022, 3, 15);

    // Use the plusDays method to add the two dates
    LocalDate result = date1.plusDays(date2.toEpochDay());

    // Print the result
    System.out.println("Result: " + result);
  }
}
