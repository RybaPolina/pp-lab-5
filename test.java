import company.beans.Person;
import company.exceptions.InvalidAgeException;

public class test {
    public static void main(String[] args) {
        try {
            Person person = new Person("Polina Rybachuk", 23);
            System.out.println("Imię: " + person.getName());
            System.out.println("Wiek: " + person.getAge());
        } catch (InvalidAgeException e) {
            System.err.println("Błąd: " + e.getMessage());
        }
    }
}