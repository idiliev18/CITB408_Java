package week2.homework.factory;

public class Cooker extends ElectricDevice{

    private boolean isGas;
    private int gasExtendedWarranty = 12;

    public boolean isGas() {
        return isGas;
    }

    public void setGas(boolean gas) {
        isGas = gas;
    }


    public int getGasExtendedWarranty() {
        return gasExtendedWarranty;
    }

    public void setGasExtendedWarranty(int gasExtendedWarranty) {
        this.gasExtendedWarranty = gasExtendedWarranty;
    }

    public Cooker(String manufacturerName, boolean haveExtendedWarranty, int minWarranty, boolean isGas) {
        super(new Manufacturer(manufacturerName, haveExtendedWarranty), minWarranty);
        this.setGas(isGas);
    }

    @Override
    public int warranty() {
        if(this.isGas){
            return super.warranty() + this.gasExtendedWarranty;
        }

        return super.warranty();
    }

}
