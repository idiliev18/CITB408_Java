package week3.homework.deliveries;

class WeightedItem extends DeliverableItem {
    Material material;
    double weight;
    double pricePerWeight;

    public void setWeight(double weight) {
        if (weight <= 0) {
            this.weight = 1;
        } else
            this.weight = weight;
    }

    public void setPricePerWeight(double pricePerWeight) {
        if (pricePerWeight <= 0)
            this.pricePerWeight = 1;
        else
            this.pricePerWeight = pricePerWeight;
    }

    public WeightedItem(boolean toHome, Material material, double weight, double pricePerWeight) {
        super(toHome);
        this.material = material;
        setWeight(weight);
        setPricePerWeight(pricePerWeight);
    }

    public double deliveryPrice() {
        double sum = weight *= pricePerWeight;
        if (toClientsAddress) {
            sum = sum + DeliverableItem.additionalPrice;
        }
        if (material.isFragile) {
            sum = 1.01 * sum;
        }
        return sum;

    }
}
