package Java2_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayListObjectSortExample {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Sachin" , 47));
        people.add(new Person("Chris",34));
        people.add(new Person("Rajeev" , 25));
        people.add(new Person("David",31));

        System.out.println("Person List : " + people);

        people.sort((people1,people2) -> {
            return people1.getAge() - people2.getAge();
        });
        people.sort(Comparator.comparing(Person::getAge));
        System.out.println("Sorted Person List by Age : " + people);

        Collections.sort(people, Comparator.comparing(Person::getName));
        System.out.println("Sorted Person List by Name : " + people);
    }
}
