package week1.homework.task4;
import week1.homework.task4.studios.Studio;
import java.math.BigDecimal;

public class Solution {
    public static void main(String[] args) {
        Studio studio = new Studio(1, 22);
        Studio.setMinPrice(BigDecimal.valueOf(22.23));
        Studio.setEuroExchangeRate(BigDecimal.valueOf(1.9856));
        studio.setPricePerHour(BigDecimal.valueOf(26.36));
        studio.setHoursPerDay(12);
        System.out.println(studio.getEarnings());
        System.out.println(studio.getEarningsInEuro());

        Studio studio2 = new Studio(2, 16);
        studio2.setPricePerHour(BigDecimal.valueOf(36.36));
        studio2.setHoursPerDay(9);
        System.out.println(studio.studioWithLargerPrice(studio2));
        System.out.println(studio.studioWithLargerEarnings(studio2));
    }
}
