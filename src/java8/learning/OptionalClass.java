package java8.learning;

/*
    Before Java 8 developers had to carefully validate values they referred to, because of a possibility of throwing
    the NullPointerException (NPE). All these checks demanded a pretty annoying and error-prone boilerplate code.

    Java 8 Optional<T> class can help to handle situations where there is a possibility of getting the NPE.
    It works as a container for the object of type T. It can return a value of this object if this value is not a null.
    When the value inside this container is null it allows doing some predefined actions instead of throwing NPE.
*/

import java.util.List;
import java.util.Optional;

public class OptionalClass {

    public static void main(String[] args) {

        //Optional<String> optional = Optional.empty();
        // Wrap the value to Optional
        String str = null;
        Optional<String> optional = Optional.of(str);
        System.out.println(str);

        // Handles the null pointer exception
        String str1 = null;
        Optional<String> optional1 = Optional.ofNullable(str1);
       // System.out.println(optional1.get());
        if(optional1.isPresent()){
            System.out.println(optional1.get());
        }
    }
}
