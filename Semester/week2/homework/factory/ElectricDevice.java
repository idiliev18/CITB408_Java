package week2.homework.factory;

public class ElectricDevice {

    protected Manufacturer manufacturer;
    protected int minWarranty;

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public int getMinWarranty() {
        return minWarranty;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setMinWarranty(int minWarranty) {
        if (minWarranty < 6) {
            this.minWarranty = 6;
        } else {
            this.minWarranty = minWarranty;
        }
    }

    public ElectricDevice(Manufacturer manufacturer, int minWarranty) {
        this.setManufacturer(manufacturer);
        this.setMinWarranty(minWarranty);
    }

    public int warranty() {
        if (this.manufacturer.isHaveExtendedWarranty()) {
            return this.minWarranty + this.manufacturer.getExtendedWarranty();
        }

        return this.minWarranty;
    }
}
