package com.example.democomparable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Person implements Comparable<Person>{
    private String name;
    private int age;
    private String email;
    private int ranking;

    @Override
    public int compareTo(Person o) {
            return Integer.compare(this.age,o.getAge());
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", ranking=" + ranking +
                '}'+'\n';
    }
}
