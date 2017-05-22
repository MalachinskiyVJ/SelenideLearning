/**
 * Created by malchinskiy on 22.05.2017.
 */
public class TouchScreenDevices {

    private int id;
    private String brand;
    private String model;
    private String category;
    private int price;
    private float diagonal;
    private String batterycharge;
    private String colour;

    public TouchScreenDevices(int id, String model, String brand, String category) {
        this.id = id;
        this.model = model;
        this.brand = brand;
        this.category = category;
    }

    //get methods:
    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getCategory() {
        return category;
    }

    public int getPrice() {
        return price;
    }

    public float getDiagonal() {
        return diagonal;
    }

    public String getBatterycharge() {
        return batterycharge;
    }

    public String getColour() {
        return colour;
    }

    //set methods:
    public void setId(int id) {
        this.id = id;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setDiagonal(float diagonal) {
        this.diagonal = diagonal;
    }

    public void setBatterycharge(String batterycharge) {
        this.batterycharge = batterycharge;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public static void main(String args[])

    {
        TouchScreenDevices object1 = new TouchScreenDevices(12345, "S820", "Lenovo", "smartphone");
        TouchScreenDevices object2 = new TouchScreenDevices(12398, "Galaxy Tab S2", "Samsung", "tablet");

        System.out.println("The most optimal battery charge from cheap phones has a " + object1.getCategory() +
                " " + object1.getBrand() + " " + object1.getModel());
        object2.setColour("black");
        object2.setBatterycharge("4000 mAh");
        System.out.println("The battery charge of this " + object2.getColour() + " " + object2.getCategory() +
                " is " + object2.getBatterycharge());
    }
}
