import java.util.List;
import java.util.stream.Stream;

public class Searches {

    public static void printPersonsOlderThan(List<Person> roster, int age) {
        for (Person p : roster) {
            if (p.getAge() >= age) {
                System.out.println(p.printPerson());
            }
        }
    }

    public static void printPersonsWithinAgeRange(List<Person> roster, int low, int high) {
        for (Person p : roster) {
            if (low <= p.getAge() && p.getAge() < high) {
                System.out.println(p.printPerson());
            }
        }
    }

    public static void printPersons(List<Person> roster, CheckPerson tester) {
        for (Person p : roster) {
            if (tester.test(p)) {
                System.out.println(p.printPerson());
            }
        }
    }

    public static void lambdaSearch(List<Person> roster, int age){
        roster.stream().filter(x -> x.getAge() > age).forEach(System.out::println);
    }


}