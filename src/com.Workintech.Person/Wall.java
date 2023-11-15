package com.Workintech.Person;

public class Wall {
    double width;
    double height;

    public Wall(double width,double height){
        this.width=width;
        this.height=height;
        System.out.println("wall created.");
    }

    public double getWidth(){
        return this.width;
    }

    public double getHeight(){
        return this.height;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public double getArea(){
        return this.width*this.height;
    }
}
