public class Wolf {
    private String sex;
    private String name;
    private double weight;
    private int age;
    private String color;

    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if(age > 8) {
            System.out.println("Некорректный возраст");
        }
        this.age = age;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public void go(int speed) {
        if(speed > 0 && speed < 4) {
        System.out.println("Волк идёт со скоростью " + speed + " км/ч");
        }
    }

    public void sit() {
        System.out.println("Волк сидит");
    }

    public void run(int speed) {
        if(speed > 3) {
        System.out.println("Волк бежит со скоростью " + speed + " км/ч");
        }
    }

    public void howl() {
        System.out.println("Волк воет: \"Ууууууу\"");
    }

    public void hunt() {
        System.out.println("Волк охотится");
    }
}