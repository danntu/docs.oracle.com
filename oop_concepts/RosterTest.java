package oop_concepts;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.List;

public class RosterTest {

    interface CheckPerson{
        boolean test(Person p);
    }
    public static void printPersonsOlderThan(List<Person> roster, int age){
        for (Person p : roster){
            if(p.getAge()>=age){
                p.printPerson();
            }
        }
    }

    public static void printPersonsWithinAgeRange(List<Person> roster,int low, int high){
        for(Person p : roster){
            if(low<=p.getAge() && p.getAge() < high){
                p.printPerson();
            }
        }
    }

    public static void printPersons(List<Person> roster, CheckPerson tester){
        for (Person p : roster){
            if(tester.test(p)){
                p.printPerson();
            }
        }
    }

    public static void main(String[] args) {
        List<Person> roster = Person.createRoster();

//        for (Person p:
//             roster) {
//            p.printPerson();
//        }

        //Approach 1
        System.out.println("Persons olderthan 20");
        printPersonsOlderThan(roster,20);
        System.out.println();

        //Approach 2
        System.out.println("Persons between the ages of 14 and 32");
        printPersonsWithinAgeRange(roster,14,32);
        System.out.println();

        //Approach 3
        System.out.println("Persons who are eligible for Selective Service:");
        class CheckPersonEligibleForSelectiveService implements CheckPerson{
            @Override
            public boolean test(Person p) {
                return p.getGender()==Person.Sex.MALE && p.getAge()>=16 && p.getAge()<=25;
            }
        }
        printPersons(roster,new CheckPersonEligibleForSelectiveService());
        System.out.println();

        //Approach 4
        System.out.println("Persons who are eligible for Selective Service " +
                "(anonymous class):");
        printPersons(roster, new CheckPerson() {
            @Override
            public boolean test(Person p) {
                return p.getGender()==Person.Sex.MALE && p.getAge()>=18 && p.getAge()<=35;
            }
        });

        //Approach 5
        System.out.println("Persons who are eligible for Selective Service " +
                "(lambda expression):");
        printPersons(roster,(Person p)->p.getGender()==Person.Sex.MALE && p.getAge()>=18 && p.getAge()<=25);
        System.out.println();

    }
}
