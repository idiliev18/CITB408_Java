package week2.homework.factory;

public class WashingMachine extends ElectricDevice{

    private boolean isDrying;
    private final int dryingWarranty;

    public WashingMachine(String manufacturerName, boolean haveExtendedWarranty, int minWarranty, boolean isDrying) {
        super(new Manufacturer(manufacturerName, haveExtendedWarranty), minWarranty);
        this.dryingWarranty = this.minWarranty / 2;
        this.isDrying = isDrying;
    }

    public boolean isDrying() {
        return isDrying;
    }

    public void setDrying(boolean drying) {
        isDrying = drying;
    }

    public int getDryingWarranty() {
        return dryingWarranty;
    }

    @Override
    public int warranty() {
        if(this.isDrying){
            return super.warranty() + this.dryingWarranty;
        }

        return super.warranty();
    }

}
