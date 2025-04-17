package java8.learning;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class InBuiltLambdaFunction {

    public static void main(String[] args) {
        String[] countries = {"India", "Australia", "England", "South Africa", "Srilanka", "Newzealand", "West Indies", "Scotland"};

        // Function<Input, Return>
        Function<String[], String> printValueFunction = (array) -> {
            String names = "";
            for (String n : array) {
                String result = n.substring(0, n.indexOf(""));
                result = n.substring(n.indexOf("")) + " " + result;
                names += result + "\n";
            }
            return names;
        };
        System.out.println(printValueFunction.apply(countries));

        //Supplier Interface
        Supplier<String> supplierFunction = ()->{
            return "Jayesh Patil";
        };
        System.out.println(supplierFunction.get());

        //Predicate Interface
        Predicate<Integer> predicateFunction = (value)->{
            if(value == 12){
                return true;
            }
            return false;
        };
        System.out.println(predicateFunction.test(12));

        //Consumer Interface
        Consumer<String> consumerFunction = (value)->{
            System.out.println(value);
        };
        consumerFunction.accept("test");
    }
}
