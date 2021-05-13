/*
Exercise 1
Create a class called Person.
Each person has the following attributes:
- Name
- height
- age
Implement the comparable interface, with a natural ordering such that:
• An older person is sorted higher in the natural ordering
• If two persons are the same age, the taller person is sorted higher in the
natural ordering
Create a list of persons.
Print them from lowest to highest in the natural ordering
 */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Person implements Comparable<Person>{
    String name;
    int height;
    int age;

    //Constructor
    public Person(String name, int height, int age) {
        this.name = name;
        this.height = height;
        this.age = age;
    }

    @Override
    public int compareTo(Person person){
        if(this.age > person.age){
            return 1;
        }
        else if(this.age < person.age){
            return -1;
        }
        else if (this.age == person.age){
            if(this.height > person.height){
                return 1;
            }
            else if(this.height < person.height){
                return -1;
            }
            else{
                return 0;
            }
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Navn: " + this.name + "\nHøjde: " + this.height + "\nAlder: " + this.age + "\n";
    }

}

class Sorter {
    public static void main(String[] args) {
        Person p1 = new Person("Amanda", 170,27);
        Person p2 = new Person("Margrethe", 182,81);
        Person p3 = new Person("Frederik", 183,52);
        Person p4 = new Person("Joachim", 188,51);
        Person p5 = new Person("Maria", 165,81);
        Person p6 = new Person("Mark", 195,51);
        Person p7 = new Person("Sonja", 168,35);

        ArrayList<Person> personList = new ArrayList<Person>(Arrays.asList(p1,p2,p3,p4,p5,p6,p7));
        System.out.println("---Liste inden sortering---\n");

        for (Person person:personList){
            System.out.println(person);
        }

        Collections.sort(personList);

        System.out.println("---Liste efter sortering---\n");

        for (Person person:personList){
            System.out.println(person);
        }

    }

}
