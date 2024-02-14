import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
/**Cоздайте класс Reader с полями
 (fullName, library(библиотека),
 cardNumber, dateOfBirth,
 phoneNumber).
 Методы takeBook(), returnBook().
 - takeBook, будет принимать в
 качестве параметра количество
 взятых книг. Выводит на консоль
 сообщение "Петров В. В. взял 3
 книги".
 Mетод returnBook(). Выводит на
 консоль сообщение "Петров В. В.
 вернул 3 книги**/

            // Создаем объект класса Reader
            Reader reader = new Reader("Петров В. В.", "Библиотека ", "1234567890", "01.01.1930", "+12345343890");

            // Используем метод takeBook
            reader.takeBook(5);

            // Используем метод returnBook
            reader.returnBook(5);


    }
}