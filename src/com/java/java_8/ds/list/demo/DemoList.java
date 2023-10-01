package com.java.java_8.ds.list.demo;
import java.util.*;

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

    }
}
