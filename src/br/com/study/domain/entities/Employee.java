package br.com.study.domain.entities;

public 
class Employee extends Person {
    private double salary;

    public Employee(Person person, double salary) {
        super(person.getId(), person.getFirstName(), person.getLastName(), person.getAge());
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [salary=" + salary + ", getFullName()=" + getFullName() + "]";
    }
}