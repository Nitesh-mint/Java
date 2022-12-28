import java.time.LocalDate;
import java.time.Period;

public class AddDates {
  public static void main(String[] args) {
    // Create two LocalDate objects representing two dates
    LocalDate date1 = LocalDate.of(2022, 1, 15);
    LocalDate date2 = LocalDate.of(2022, 3, 15);

    // Use the plus method to add the two dates
    LocalDate result = date1.plus(Period.between(date1, date2));

    // Print the result
    System.out.println(result);
  }
}
