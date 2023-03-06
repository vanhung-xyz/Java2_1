package Java2_1;

import java.util.ArrayList;
import java.util.List;

public class TestArrayList {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();
        animals.add("Nguyen");
        animals.add("Van");
        animals.add("Hung");
        System.out.println(animals);
        animals.add(3, "Hung");
        System.out.println(animals);



        List<Integer> first = new ArrayList<>();
        first.add(22);
        first.add(11);
        first.add(2003);

        List<Integer> firstTen = new ArrayList<>(first);

        List<Integer> nextFive = new ArrayList<>();
        nextFive.add(22);
        nextFive.add(33);
        nextFive.add(44);

        firstTen.addAll(nextFive);
        System.out.println(firstTen);


        List<String> top = new ArrayList<>();
        System.out.println("Is the top list empty");
        top.add("Google");
        top.add("Email");
        top.add("Facebook");
        System.out.println("Here are the top " + top.size() + " in the ");
        String bestCompany = top.get(0);
        String secondBestCompany = top.get(1);
        String lastCompany = top.get(top.size() - 1);
        System.out.println("Best Company: " + bestCompany);
        System.out.println("Second Best Company: " + secondBestCompany);
        System.out.println("Last Company the list: " + lastCompany);


        String a =top.set(1, "Walmart");
        System.out.println("Modified top companies list: " + a);
        System.out.println(top);
        firstTen.remove(1);
        System.out.println(firstTen);

        boolean isString = firstTen.remove("Van");
        System.out.println(isString);
        System.out.println(top);
        System.out.println(firstTen);

        firstTen.removeAll(top);


        firstTen.clear();
        System.out.println(firstTen);
    }
}
