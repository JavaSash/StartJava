public class Jaeger {
    private String modelName;
    private String mark;
    private double height;
    private double weight;
    private int speed;
    private int armor;

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }
    public String getModelName() {
        return modelName;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }
    public String getMark() {
        return mark;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getHeight() {
        return height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public double getWeight() {
        return weight;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public int getSpeed() {
        return speed;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }
    public int getArmor() {
        return armor;
    }

    boolean drift() {
        System.out.println("You are enter the drift \n");
        return true;
    }

    int move(int moveSpeed) {
        System.out.println("Jaeger " + modelName + " moves with speed " + moveSpeed + " km/h \n");
        return moveSpeed;
    }

    String scanKaiju() {
        return "nothing";
    }

    void attack() {
        System.out.println("Tra-ta-ta-ta-ta \n");
    }

    void printParametres () {
        System.out.println("\n ModelName: " + modelName);
        System.out.println("Mark: " + mark);
        System.out.println("Height: " + height + "metres");
        System.out.println("Weight: " + weight + " tons");
        System.out.println("Speed: " + speed);
        System.out.println("Armor: " + armor + "\n");
    }
}