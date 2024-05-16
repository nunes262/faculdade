package model;

public class Worker {
    String name;
    Double salary;
    int dependents;

    public Worker(String name, Double salary, int dependents) {
        this.name = name;
        this.salary = salary;
        this.dependents = dependents;
    }

    public String toString() {
        return "Nome: " + name + "\nSalario: " + salary + "\nDependentes: " + dependents;
    }

}
