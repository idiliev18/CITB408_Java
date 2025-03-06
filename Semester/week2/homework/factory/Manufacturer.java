package week2.homework.factory;

public class Manufacturer {

    private String name;
    private boolean haveExtendedWarranty;
    private int extendedWarranty = 12;

    public String getName() {
        return name;
    }

    public boolean isHaveExtendedWarranty() {
        return haveExtendedWarranty;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHaveExtendedWarranty(boolean haveExtendedWarranty) {
        this.haveExtendedWarranty = haveExtendedWarranty;
    }

    public Manufacturer() {}

    public Manufacturer(String name, boolean extendedWarranty) {
        this.setName(name);
        this.setHaveExtendedWarranty(extendedWarranty);
    }

    public Manufacturer(String name) {
        this.setName(name);
    }

    public int getExtendedWarranty() {
        return extendedWarranty;
    }

    public void setExtendedWarranty(int extendedWarranty) {
        this.extendedWarranty = extendedWarranty;
    }
}
