import java.time.LocalDate;

public class Reader {

    String fullName;
    String library;
    String cardNumber;
    String dateOfBirth;
    String phoneNumber;

    public Reader(String fullName, String library, String cardNumber, String dateOfBirth, String phoneNumber) {
        this.fullName = fullName;
        this.library = library;
        this.cardNumber = cardNumber;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
    }
    public void takeBook(int numberOfBooks) {
        System.out.println(fullName + " взял " + numberOfBooks + " книги");
    }
    public void returnBook(int numberOfBooks) {
        System.out.println(fullName + " вернул " + numberOfBooks + " книги");
    }
}
