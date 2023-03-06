package Java2_1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class ArrayListSortExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Lisa");
        names.add("Jennifer");
        names.add("Mark");
        names.add("David");

        System.out.println("Names : " + names);
        names.sort(new Comparator<String>() {
            @Override
            public int compare(String name1, String name2) {
                return name1.compareTo(name2);
            }
        });
        names.sort((names1,names2) -> names1.compareTo(names2));

        names.sort(Comparator.naturalOrder());

        System.out.println("Sorted Names : " + names);
    }
}
