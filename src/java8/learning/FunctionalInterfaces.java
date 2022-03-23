package java8.learning;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class FunctionalInterfaces {

    public static void main(String[] args) {
        Consumer<Integer> printValue  = value -> System.out.println(value);
        //printValue.accept(10);
        //printValue.accept(11);

        // Consumer to multiply 10 to every integer of a list
        Consumer<List<Integer>>  listConsumer = list -> {
            for (int i = 0; i < list.size(); i++)
                list.set(i, list.get(i) *10);
        };

        List<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(1);
        list.add(3);

        // Implement modify using accept()
        listConsumer.accept(list);
        list.forEach(item -> System.out.println(item));
    }
}
