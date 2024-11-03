package com.zipcodewilmington.person;

/**
 * If you did ObjectsOne lab, you might recognize this code?
 */
public class Person {
    private String name;
    private int age;
    private String race;
    private String lastname;
    private String middlename;
    private double birthday;
    private String hometown;

    public Person(String name, int age, String race, String lastname, String middlename, double birthday, String hometown) {
        this.name = name;
        this.age= age;
        this.race = race;
        this.lastname = lastname;
        this.middlename = middlename;
        this.birthday = birthday;
        this.hometown = hometown;
    }

    public Person(int age) {
       this.age = age;

    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {

    }

    public void setName(String name) {
       this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    public double getBirthday() {
        return birthday;
    }

    public void setBirthday(double birthday) {
        this.birthday = birthday;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }
}
