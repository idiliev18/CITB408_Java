package week1.homework.task3;

import week1.homework.task3.managers.Manager;

import java.time.LocalDate;
import java.time.Month;

public class Solution {
    public static void main(String[] args) {
        Manager manager = new Manager("Ivan");
        manager.setHireDate(LocalDate.of(2014, Month.APRIL, 20));
        System.out.println(manager.getHireDate());
        System.out.println(manager.getExperienceDuration(LocalDate.of(2025, Month.FEBRUARY, 27)));

    }
}
