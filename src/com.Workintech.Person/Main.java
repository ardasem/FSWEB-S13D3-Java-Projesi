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

        Person person = new Person("John", "Doe", 20);

        System.out.println("Firstname: " + person.getFirstName());

        System.out.println("LastName: " + person.getLastName());

        System.out.println("Age: " + person.getAge());


        System.out.println("<------------------------------------------>");

        Wall wall1 = new Wall(21.2,23.6);
        Wall wall2 = new Wall(4,5);

        System.out.println(wall1.getWidth());
        wall1.setWidth(-1.5);
        System.out.println(wall1.getWidth());


        System.out.println("<------------------------------------------>");
        Wall wall = new Wall(5,4);

        System.out.println("area= " + wall.getArea());

        wall.setHeight(-1.5);

        System.out.println("width= " + wall.getWidth());

        System.out.println("height= " + wall.getHeight());

        System.out.println("area= " + wall.getArea());

        }

    }
