import company.beans.Person;
import company.exceptions.InvalidAgeException;
import company.implementations.EmailMessenger;
import company.interfaces.Messenger;
import company.utils.MathUtils;

public class test {
    public static void main(String[] args) {

        //Zadanie 4 - robię tabelkę
        Person[] people = new Person[5];
        int b = 10;

        try {
            people[0] = new Person("Polina Rybachuk", 24);
            people[1] = new Person("Konrad Ceprynski", 29);
            people[2] = new Person("Kacper Molewski", 26);
            people[3] = new Person("Kamila Schetela", 25);
            people[4] = new Person("Adrianna Jankowska", 30);

        } catch (InvalidAgeException e) {
                System.err.println("Błąd: " + e.getMessage());
        }
        //Licznik do numeru osoby aby dane wyjściowe były bardziej zrozumiałe (zamiast 0 dałam 1 aby indeks był bardziej zrozumiały dla użytkownika)                  
        int i=1;
        for (Person osoba : people) {
            System.out.println("Dane osoby " + i);
            System.out.println("Imię: " + osoba.getName());
            System.out.println("Wiek: " + osoba.getAge());
            
            int wiek = osoba.getAge();
            int wartosc = MathUtils.add(wiek, b);
            System.out.println("Nowa obliczona wartość: " + wartosc);
    
            Messenger messenger = new EmailMessenger();
            messenger.sendMessage("No wyszedł mi wynik sumy " + wartosc);
            System.out.println();
            i++;

            }
    }
}