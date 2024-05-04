import company.beans.Person;
import company.exceptions.InvalidAgeException;
import company.implementations.EmailMessenger;
import company.interfaces.Messenger;

public class test {
    public static void main(String[] args) {

        //Pozostałość po pierwszym zadaniu
        try {
            Person person = new Person("Polina Rybachuk", 23);
            System.out.println("Imię: " + person.getName());
            System.out.println("Wiek: " + person.getAge());
        } catch (InvalidAgeException e) {
            System.err.println("Błąd: " + e.getMessage());
        }

        Messenger messenger = new EmailMessenger();
        messenger.sendMessage("Rowerki dziś?");

    }
}