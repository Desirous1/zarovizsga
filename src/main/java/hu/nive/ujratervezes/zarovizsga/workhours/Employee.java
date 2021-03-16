package hu.nive.ujratervezes.zarovizsga.workhours;

import java.time.LocalDate;

public class Employee {

    private String name;
    private int workHour;
    private LocalDate localDate;

    public Employee(String name, int workHour, LocalDate localDate) {
        this.name = name;
        this.workHour = workHour;
        this.localDate = localDate;
    }

    public String getName() {
        return name;
    }

    public int getWorkHour() {
        return workHour;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }
}
