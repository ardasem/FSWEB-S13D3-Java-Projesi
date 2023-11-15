package com.Workintech.Person;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("Arda","Semercioglu",27);
        Person person3 = new Person("John","Doe",14);

        System.out.println(person3.getFirstName());
        System.out.println(person3.getLastName());
        System.out.println(person3.getAge());
        System.out.println(person3.isTeen());
        System.out.println("<------------------------------------------>");


        Wall wall1 = new Wall(21.2,23.6);
        Wall wall2 = new Wall(4,5);

        System.out.println(wall1.getWidth());
        System.out.println(wall2.getArea());

        }

    }
