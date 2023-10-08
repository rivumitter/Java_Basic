package com.java.java_8.ds.list.demo;
import java.util.*;
import java.util.stream.Collectors;

public class DemoList {

    public static void main(String[] args) {

        // ArrayList
        List<Integer> intList = new ArrayList<>();

        intList.add(10);
        intList.add(11);
        intList.add(15);
        intList.add(22);

        /* traditional way

        for(int i=0; i<intList.size(); i++) {
            System.out.println(intList.get(i));
        }

         */

        /* Enhanced for Loop

        for(Integer intValue : intList) {
            System.out.println(intValue);
        }

        */

        // forEach loop (accepts consumer )
     //   intList.forEach(intValue -> System.out.println(intValue));

        // write same with string


        List<Employee> empList = new ArrayList<>();

        empList.add(new Employee("emp1", 1));
        empList.add(new Employee("emp20", 20));
        empList.add(new Employee("emp5", 5));

       // empList.forEach(employee -> System.out.println(employee));

        // to do operation on and data str. we need to use stream()

        // print those employees whose empId is b/w 1 - 15

        /* normal way for filter

        for(Employee employee : empList) {

            if(employee.getEmpId() >= 1 && employee.getEmpId() <=15) {
                System.out.println(employee);
            }
        }

         */

        // using stream() api

         empList.stream()
                .filter(employee -> employee.getEmpId() >= 1 && employee.getEmpId() <=15) // 1 , 5
                .forEach(employee -> System.out.println(employee));




        // collect is a terminal op. By default Stream.filter() map(), .... , are ignored without terminal op.
        // Terminal op is responsible for invoking Stream().xyz methods

        List<Employee> filteredEmp = empList.stream()
                .filter(employee -> employee.getEmpId() >= 1 && employee.getEmpId() <= 15)
                .collect(Collectors.toList());


      //  System.out.println("filteredEmp:"+ filteredEmp);

        // By default filer is ignored as it is not invoked by terminal op.
        empList.stream()
                .filter(employee -> employee.getEmpId() >= 1 && employee.getEmpId() <= 15);


        //

        ////////////////////////////////////////////////////////

        // map to do some operation on the ds. values

        // give me all the emp name in caps

        // Function<T, R> .... apply(T t)

        List<String> capsEmpList = empList.stream()
                .map(employee -> employee.getEmpName().toUpperCase()) // Function<Employee, String>
                .collect(Collectors.toList());

        // with for loop

        List<String> result = new ArrayList<>();
        for(Employee employee : empList) {
            String upCaseEmpName = employee.getEmpName().toUpperCase();
            result.add(upCaseEmpName);
        }

        System.out.println("capsEmpList: "+ capsEmpList);

        // give me employees whos empId is b/w 1 - 15 and take their name in caps

        // chaining

        List<String> filterCapsEmp = empList.stream()
                .filter(employee -> employee.getEmpId() >= 1 && employee.getEmpId() <= 15) // 1- 15
                .map(employee -> employee.getEmpName().toUpperCase()) //
                .collect(Collectors.toList());

        System.out.println("filterCapsEmp: "+ filterCapsEmp);

        // hw
        // 1. Create a list of students at lest 5 students of age grp from 8 - 15
        // 2. Give me students name in caps whose roll number is b/w 10 - 30 and whose age grp is 10 - 12 yrs





    }
}
