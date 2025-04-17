package java8.learning;

import java.util.ArrayList;
import java.util.List;

public class MethodReferences {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Student 1", 30));
        students.add(new Student("Student 2", 12));
        students.add(new Student("Student 3", 26));
        students.add(new Student("Student 4", 50));
        students.add(new Student("Student 5", 18));

        students.forEach(p-> System.out.println(p));

        //Reference to a Static Method
        //boolean flag = students.stream().anyMatch(student -> MethodReferences.checkAge(student));
        boolean flag = students.stream().anyMatch(MethodReferences :: checkAge);
        System.out.println(flag);

        //Reference to an Instance Method
        MethodReferences methodReferences = new MethodReferences();
        //boolean flag2 = students.stream().anyMatch(methodReferences :: checkAge);
        //System.out.println(flag2);

    }

    public static boolean checkAge(Student student){
        if(student.age > 50){
            return true;
        }
        return false;
    }

    public boolean checkAge1(Student student){
        if(student.age > 50){
            return true;
        }
        return false;
    }

    static class Student {
        private String name;
        private int age;

        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }
}
