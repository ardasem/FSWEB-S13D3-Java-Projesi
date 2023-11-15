package com.Workintech.Person;

public class Person {
    String firstName;
    String lastName;
    int age;
    int height;
    String occupation;
    String email;


    public Person(){
        System.out.println("Person created.");

    }

    public Person(String firstName,String lastName,int age ){
        this();
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;

    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public int getAge(){
        return this.age;
    }

    public  boolean isTeen(){
        return this.age > 13 && this.age < 19;
    }


}
