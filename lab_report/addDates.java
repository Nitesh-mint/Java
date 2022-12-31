import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class addDates {
  public static void main(String[] args) {
    // Create two LocalDate objects representing the dates
    LocalDate date1 = LocalDate.of(2020, 1, 15);
    LocalDate date2 = LocalDate.of(2020, 3, 15);

    // Calculate the difference between the two dates in years, months, and days
    long years = ChronoUnit.YEARS.between(date1, date2);
    long months = ChronoUnit.MONTHS.between(date1, date2);
    long days = ChronoUnit.DAYS.between(date1, date2);

    // Add the years, months, and days separately
    LocalDate result = date1.plusYears(years)
        .plusMonths(months)
        .plusDays(days);

    // Print the result
    System.out.println("Result: " + result);
  }
}
