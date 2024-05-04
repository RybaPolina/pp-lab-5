import company.beans.Person;
import company.exceptions.InvalidAgeException;
import company.implementations.EmailMessenger;
import company.interfaces.Messenger;
import company.utils.MathUtils;

public class test {
    public static void main(String[] args) {

        //Pozostałość po pierwszym zadaniu :)
        try {
            Person person = new Person("Polina Rybachuk", 23);
            System.out.println("Imię: " + person.getName());
            System.out.println("Wiek: " + person.getAge());
        } catch (InvalidAgeException e) {
            System.err.println("Błąd: " + e.getMessage());
        }

        //Można było nie definiuować int i wypisać wyświetlanie od razu jako funkcji, ale uznałam że tak będzie bardziej przejrzysty ten kod :)
        int suma = MathUtils.add(10, 15);
        System.out.println("Wynik sumy to: " + suma);

        Messenger messenger = new EmailMessenger();
        messenger.sendMessage("Rowerki dziś? Przy okazji wynik sumy to: " + suma);

    }
}