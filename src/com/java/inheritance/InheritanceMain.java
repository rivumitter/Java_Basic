package com.java.inheritance;

public class InheritanceMain {
    public static void main(String[] args) {
        /*
            class extends a class
            class implements a interface
            interface extends interface
         */
        //single inh. parent -> child

        Animal animal1 = new Dog(); // dynamic polymorphism

        animal1.whoAreYou();

        Animal animal2 = new Cat();

        animal2.whoAreYou();


        // multilevel inh. parent -> child -> grandchild

        Animal animal3 = new BabyDog();

        animal3.whoAreYou();

        // hierarchical inh. parent -> child1 , parent-> child2
        // see above cat and dog extending Animal

        // java doesn't allow multiple inh. parent1 -> child , parent2->child
        // bcz complier wont know which parent's method to override

        // inheritance part 2

        Student student1 = new Student("sch1","20/40","student1",12);

        System.out.println(student1.getSchoolAddr());

        student1.getTotalAddressOfSchool();


    }
}
