package java8.learning;


    /*
        Before Java 8, interfaces could have only public abstract methods.
        It was not possible to add new functionality to the existing interface without forcing all
        implementing classes to create an implementation of the new methods, nor it was possible to create
        interface methods with an implementation.
        Starting with Java 8, interfaces can have static and  default methods that, despite being
        declared in an interface, have a defined behavior.
    */

public interface InterfaceMethod {

    public String normalMethod();

    public static String staticMethod() {
        return "Interface Static Method";
    }

    public default String defaultMethod(){
        return "Interface Default Method";
    }

}
