public class Dog {
    private String name;
    private String breed;
    private int weight;

    /**
     * Dog object with name, breed, and weight
     *
     * @param name the name of the dog
     * @param breed the breed of the dog
     * @param weight the weight of the dog
     */
    public Dog(String name, String breed, int weight) {
        this.name = name;
        this.breed = breed;
        this.weight = weight;
    }

    /**
     * returns the name of the dog
     *
     * @return the dog's name
     */
    public String getName() {
        return name;
    }

    /**
     * sets the name of the dog
     *
     * @param name the dog's new name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * returns the dog's breed
     *
     * @return the dog's breed
     */
    public String getBreed() {
        return breed;
    }

    /**
     * sets the dog's breed
     *
     * @param breed the dog's new breed
     */
    public void setBreed(String breed) {
        this.breed = breed;
    }

    /**
     * returns the dog's weight
     *
     * @return the dog's weight
     */
    public int getWeight() {
        return weight;
    }

    /**
     * sets the dog's weight
     *
     * @param weight the dog's new weight
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }
}