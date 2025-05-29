public class Car {
    private String make;
    private String model;
    private int year;
    private double price;

    /**
     * car object with make, model, year, and price
     *
     * @param make the make of the car
     * @param model the model of the car
     * @param year the manufacture year of the car
     * @param price the price of the car
     */
    public Car(String make, String model, int year, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    /**
     * returns the make of the car
     *
     * @return the car's make
     */
    public String getMake() {
        return make;
    }

    /**
     * sets the make of the car
     *
     * @param make the car's new make
     */
    public void setMake(String make) {
        this.make = make;
    }

    /**
     * returns the model of the car
     *
     * @return the car's model
     */
    public String getModel() {
        return model;
    }

    /**
     * sets the model of the car
     *
     * @param model the car's new model
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * returns the year of the car.
     *
     * @return the car's manufacture year
     */
    public int getYear() {
        return year;
    }

    /**
     * 
     *
     * @param year 
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     *
     *
     * @return the car's price
     */
    public double getPrice() {
        return price;
    }

    /**
     *
     *
     * @param price the car's new price
     */
    public void setPrice(double price) {
        this.price = price;
    }
}