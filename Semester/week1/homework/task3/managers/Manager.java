package week1.homework.task3.managers;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class Manager {
    private String name;
    private LocalDate hireDate;

    public String getName() {
        return name;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        if(hireDate.isBefore(LocalDate.now())) {
            this.hireDate = hireDate;
        }else{
            this.hireDate = LocalDate.of(2018, Month.JANUARY, 1);
        }
    }

    public long getExperienceDuration(LocalDate date) {
        return ChronoUnit.YEARS.between(this.getHireDate(), date);
    }

    public Manager(String name) {
        this.name = name;
    }
}
