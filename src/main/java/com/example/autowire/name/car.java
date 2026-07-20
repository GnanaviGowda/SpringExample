package com.example.autowire.name;

public class car {
    private specification Specification;

    public car(specification Specification) {
        this.Specification = Specification;
    }

    public void display(){
        System.out.println("car details:"+Specification.toString());
    }

}
