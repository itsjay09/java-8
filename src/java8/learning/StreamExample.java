package java8.learning;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamExample {

    static class Employee {
        String name;
        long salary;

        public Employee(String name, long salary) {
            this.name = name;
            this.salary = salary;
        }
        
        public long getSalary(){
            return this.salary;
        }
    }

    public static void main(String[] args) {
        List<Employee> myList = new ArrayList<>();
        myList.add(new Employee("Employee 1", 100));
        myList.add(new Employee("Employee 2", 200));
        myList.add(new Employee("Employee 3", 300));
        myList.add(new Employee("Employee 4", 400));
        myList.add(new Employee("Employee 5", 500));
        myList.add(new Employee("Employee 6", 600));
        myList.add(new Employee("Employee 7", 300));
        myList.add(new Employee("Employee 8", 200));

        // filter and collect the list
        List<Employee> collect = myList.stream()
                .filter(employee -> employee.salary >= 300)
                .collect(Collectors.toList());


        // Filter and get the salary list
        List<Long> salaryList = myList.stream()
                .filter(employee -> employee.salary >= 300)
                .map(employee -> employee.salary)
                .collect(Collectors.toList());
        collect.forEach(employee -> System.out.print(employee.salary+ ", "));
        System.out.println();

        //reduce() Method in Collection
        Long reduce = myList.stream()
                .map(employee -> employee.salary)
                .reduce(0l, (sum, sal) -> sum + sal);
        System.out.println("reduce() Method "+reduce);

        //Find Max and Min Product Price
        Optional<Employee> max = myList.stream().max((emp1, emp2) -> emp1.salary > emp2.salary ? 1 : -1);
        System.out.println("Max salary: "+max.get().salary);

        Optional<Employee> min = myList.stream().min((emp1, emp2) -> emp1.salary > emp2.salary ? 1 : -1);
        System.out.println("Min salary: "+min.get().salary);

        // Count
        long count = myList.stream().filter(employee -> employee.salary > 300).count();
        System.out.println("Count > 300 : "+ count);
        
        // grouping by 
        Map<Long, List<String>> collect1 = myList.stream()
                .collect(Collectors.groupingBy(Employee::getSalary, Collectors.mapping(emp -> emp.name, Collectors.toList())));
        System.out.println(collect1);
    }
}
