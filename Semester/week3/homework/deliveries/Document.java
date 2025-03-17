package week3.homework.deliveries;

class Document extends DeliverableItem {
    double minPrice;

    public void setMinPrice(double minPrice) {
        if (minPrice <= 0)
            this.minPrice = 1;
        else
            this.minPrice = minPrice;
    }

    public double deliveryPrice() {

        if (toClientsAddress) {
            return minPrice + DeliverableItem.additionalPrice;
        }
        return minPrice;
    }

    public Document(boolean toHome, double minPrice) {
        super(toHome);
        setMinPrice(minPrice);
    }
}

