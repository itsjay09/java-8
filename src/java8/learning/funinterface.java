package java8.learning;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class funinterface {

    public static void main(String[] args) {

        Consumer<String> consumerTest = test -> System.out.println(test);
        consumerTest.accept("fsf");


        Supplier<Double> supplierTest = () -> Math.random();
        System.out.println(supplierTest.get());



        String str = "testing of the aplid sciene";
        Function<String, Integer> function = (string) -> string.length();
        System.out.println(function.apply(str));




        Predicate<Integer> isIntegerBoolean = (input) -> input % 2 == 0;
        System.out.println(isIntegerBoolean.test(21));





    }
}
