package Imperative;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = List.of(new Person("Toheeb",Gender.MALE),
                new Person("Maria",Gender.FEMALE),
                new Person("Aisha",Gender.FEMALE),
                new Person("Toheeb",Gender.MALE),
                new Person("Toheeb",Gender.MALE)

        );
    }
     static class Person {
        private final String name;
        private final Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }
         @Override
         public String toString() {
             return "Person{" +
                     "name='" + name + '\'' +
                     ", gender=" + gender +
                     '}';
         }
     }
    enum Gender {
        MALE, FEMALE
    }

}
