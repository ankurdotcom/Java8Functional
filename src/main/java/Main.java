import com.ankur.java8.funprog.Person;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static com.ankur.java8.funprog.Gender.FEMALE;
import static com.ankur.java8.funprog.Gender.MALE;

public class Main {
    public static void main(String[] args) {
        List<Person> personList = List.of(
            new Person("Ankur", MALE, 39),
                new Person("Komal", FEMALE, 36),
                new Person("Aradhaya", FEMALE, 9),
                new Person("Bhavya", FEMALE, 6),
                new Person("Usha", FEMALE, 65),
                new Person("Ks", MALE, 68)
        );

        Function<Person, Boolean> isMale = person -> person.getGender().equals(MALE);

        Predicate<Person> isMalePredicate = person -> person.getGender().equals(MALE);

        /*List<Person> malePersons  = personList.stream()
                .filter(person -> isMale.apply(person))
                .collect(Collectors.toList());*/

        //personList.stream().filter(isMalePredicate.negate().and(isAdultPred.negate())).forEach(System.out::println);

        Predicate<Person> isAdult = Main.isAdult::apply;
        personList.stream().filter(isMale::apply).filter(isAdult).forEach(System.out::println);
        //malePersons.forEach(System.out :: println);
    }

    static Function<Person, Boolean> isAdult = person -> person.getAge() >= 18;

    static Predicate<Person> isAdultPred = person -> person.getAge() >= 18;

    static Function<Person, Boolean> isMale = person -> person.getGender().equals(MALE);

    static Predicate<Person> isMalePredicate = person -> person.getGender().equals(MALE);





}
