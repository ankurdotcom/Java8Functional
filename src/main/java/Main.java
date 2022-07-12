import com.ankur.java8.funprog.Person;

import java.util.List;
import java.util.stream.Collectors;

import static com.ankur.java8.funprog.Gender.FEMALE;
import static com.ankur.java8.funprog.Gender.MALE;

public class Main {
    public static void main(String[] args) {
        List<Person> personList = List.of(
            new Person("Ankur", MALE),
                new Person("Komal", FEMALE),
                new Person("Aradhaya", FEMALE),
                new Person("Bhavya", FEMALE),
                new Person("Usha", FEMALE),
                new Person("Ks", MALE)
        );

        personList.stream()
                .filter(person -> MALE.equals(person.getGender()))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
