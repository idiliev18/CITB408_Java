package week3.homework.deliveries;

abstract class DeliverableItem implements Deliverable {
    boolean toClientsAddress;
    static double additionalPrice;

    public abstract double deliveryPrice();

    public DeliverableItem(boolean toHome) {
        this.toClientsAddress = toHome;
    }

    public static void setAdditionalPrice(double additionalPrice) {
        if (additionalPrice <= 0)
            DeliverableItem.additionalPrice = 1;
        else
            DeliverableItem.additionalPrice = additionalPrice;
    }
}
