package week1.homework.task4.studios;

import java.math.BigDecimal;

public class Studio {

    private final long id;
    private BigDecimal pricePerHour;
    private int maxHours;
    private int hoursPerDay;
    private static BigDecimal minPrice = BigDecimal.ZERO;
    private static BigDecimal euroExchangeRate = BigDecimal.ONE;

    public long getId() {
        return id;
    }

    public BigDecimal getPricePerHour() {
        return pricePerHour;
    }

    public int getMaxHours() {
        return maxHours;
    }

    public int getHoursPerDay() {
        return hoursPerDay;
    }

    public static BigDecimal getMinPrice() {
        return minPrice;
    }

    public static BigDecimal getEuroExchangeRate() {
        return euroExchangeRate;
    }

    public static void setMinPrice(BigDecimal minPrice) {
        if (minPrice.compareTo(BigDecimal.ZERO) < 0) {
            Studio.minPrice = BigDecimal.ZERO;
        } else {
            Studio.minPrice = minPrice;
        }
    }

    public static void setEuroExchangeRate(BigDecimal euroExchangeRate) {
        Studio.euroExchangeRate = euroExchangeRate;
    }

    public void setPricePerHour(BigDecimal pricePerHour) {
        if (pricePerHour.compareTo(Studio.minPrice) < 0) {
            this.pricePerHour = Studio.minPrice;
        } else {
            this.pricePerHour = pricePerHour;
        }
    }

    public void setHoursPerDay(int hoursPerDay) {
        if (hoursPerDay <= this.maxHours) {
            this.hoursPerDay = hoursPerDay;
        } else {
            this.hoursPerDay = maxHours;
        }
    }

    public void setMaxHours(int maxHours) {
        if (maxHours < 0 || maxHours > 24) {
            this.maxHours = 24;
        } else {
            this.maxHours = maxHours;
        }
    }

    public BigDecimal getEarnings() {
        return this.getPricePerHour().multiply(BigDecimal.valueOf(this.hoursPerDay));
    }

    public BigDecimal getEarningsInEuro() {
        return this.getEarnings().multiply(Studio.getEuroExchangeRate());
    }

    public long studioWithLargerPrice(Studio studio) {
        return (this.getPricePerHour().compareTo(studio.getPricePerHour()) > 0) ? this.getId() : studio.getId();
    }



    public boolean studioWithLargerEarnings(Studio studio) {
        return this.getEarnings().compareTo(studio.getEarnings()) > 0;
    }

    public Studio(long id, int maxHours) {
        this.id = id;
        this.setMaxHours(maxHours);
        this.pricePerHour = Studio.minPrice; // Ensure it's initialized
    }
}
