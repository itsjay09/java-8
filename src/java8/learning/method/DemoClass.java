package java8.learning.method;

public class DemoClass implements InterfaceMethod{

    public static void main(String[] args) {

        // interface static method call
        String str = InterfaceMethod.staticMethod();
        System.out.println(str);

        // interface normal method call
        DemoClass demoClass = new DemoClass();
        String str1 = demoClass.normalMethod();
        System.out.println(str1);

        // interface normal method call
        String str2 = demoClass.defaultMethod();
        System.out.println(str2);


    }

    @Override
    public String normalMethod() {
        return "Interface Normal Method";
    }
}
