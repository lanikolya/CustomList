package com.company;


public class Person {
//    Fields of class
    private String name;
    private int age;
    private int salary;
    private int level;
    private int experiens;
    private String position;
    private String job;
//  Constructor to initialize objects of class
    public Person(String name, int age, String position) {
        this.name = name;
        this.age = age;
        this.position = position;
    }
//    Create getters and setters for all fields of class
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public void setExperiens(int experiens) {
        this.experiens = experiens;
    }

    public int getExperiens() {
        return experiens;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getJob() {
        return job;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPosition() {
        return position;
    }


    public static void quit() {
        System.out.println("Good by");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        if (salary != person.salary) return false;
        if (level != person.level) return false;
        if (experiens != person.experiens) return false;
        if (name != null ? !name.equals(person.name) : person.name != null) return false;
        if (position != null ? !position.equals(person.position) : person.position != null) return false;
        return job != null ? job.equals(person.job) : person.job == null;

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        result = 31 * result + salary;
        result = 31 * result + level;
        result = 31 * result + experiens;
        result = 31 * result + (position != null ? position.hashCode() : 0);
        result = 31 * result + (job != null ? job.hashCode() : 0);
        return result;
    }
}
