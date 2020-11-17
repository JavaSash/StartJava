public class Wolf {
    String sex;
    String name;
    double weight;
    int age;
    String color;

    public void go(int speed) {
        if(speed > 0 && speed < 4) {
        System.out.println("Волк идёт со скоростью " + speed);
        }
    }

    public void sit() {
        System.out.println("Волк сидит");
    }

    public void run(int speed) {
        if(speed > 3) {
        System.out.println("Волк бежит со скоростью " + speed);
        }
    }

    public void howl() {
        System.out.println("Волк воет: \"Ууууууу\"");
    }

    public void hunt() {
        System.out.println("Волк охотится");
    }
}