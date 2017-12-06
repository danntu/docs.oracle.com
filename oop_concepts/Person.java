package oop_concepts;

import java.time.LocalDate;
import java.time.chrono.IsoChronology;
import java.util.ArrayList;
import java.util.List;

public class Person {

    public enum Sex{
        MALE, FEMALE
    }

    String name;
    LocalDate birthday;
    Sex gender;
    String emailAddress;

    public Person(String name, LocalDate birthday, Sex gender, String emailAddress) {
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.emailAddress = emailAddress;
    }

    public int getAge() {
        return birthday.until(IsoChronology.INSTANCE.dateNow()).getYears();
    }

    public void printPerson(){
        System.out.println(name+" , "+this.getAge());
    }

    public Sex getGender(){
        return gender;
    }

    public String getName(){
        return name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public static int compareByAge(Person a, Person b){
        return a.birthday.compareTo(b.birthday);
    }

    public static List<Person> createRoster(){
        List<Person> roster = new ArrayList<>();
        roster.add(new Person(
                "Danik",
                IsoChronology.INSTANCE.date(1986,02,21),
                Sex.MALE,
                "dmyrzakanov@gmail.com"));
        roster.add(new Person(
                "Daniyar",
                IsoChronology.INSTANCE.date(2000,03,21),
                Sex.MALE,
                "dan_ntu@mail.ru"
        ));
        roster.add(new Person(
                "Dancho",
                IsoChronology.INSTANCE.date(1995,03,21),
                Sex.MALE,
                "dan_ntu@mail.ru"
        ));
        return roster;
    }
}
