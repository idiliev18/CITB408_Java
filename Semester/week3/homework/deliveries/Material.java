package week3.homework.deliveries;

class Material {
    String name;
    boolean isFragile;

    public Material(String name, boolean isFrigile) {
        this.name = name;
        this.isFragile = isFrigile;
    }

    public boolean isFragile() {
        return isFragile;
    }
}