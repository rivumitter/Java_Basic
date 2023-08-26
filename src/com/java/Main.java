package com.java;

public class Main {
    public static void main(String[] args) {

        // inorder to access the class we have to create a instance of a class ie. object

        Customer customer = new Customer("Srijita","test@test.com",25);

        System.out.println("Customer name before:"+ customer);

        customer.setName("Arghya");

        System.out.println("Customer name after"+ customer);


        Customer customer1 = new Customer();

        customer1.setAge(10);



    }
}