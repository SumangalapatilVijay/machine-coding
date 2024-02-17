package com.example.democomparable;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@SpringBootApplication
public class DemoComparableApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoComparableApplication.class, args);
        List<Person> persons = new ArrayList<>();
        Person p1 = new Person("A",10,"",1);
        Person p2 = new Person("B",15,"",9);
        Person p3 = new Person("F",25,"",3);
        Person p4 = new Person("X",10,"",2);
        Person p5 = new Person("Z",12,"",1);
        Person p6 = new Person("V",6,"",1);
        Person p7 = new Person("S",8,"",2);
        persons.add(p1);
        persons.add(p2);

        persons.add(p3);
        persons.add(p4);

        persons.add(p5);
        persons.add(p6);

        persons.add(p7);
        System.out.println(persons);
        Collections.sort(persons);
        System.out.println(persons);
        System.out.println("BASED on RANKING");
        System.out.println(persons);
        //Sort based on the name
        persons.sort((Comparator.comparingInt(Person::getRanking)));
        System.out.println(persons);
    }



}
