public class Person {
    String name = "Grisha";
    String sex = "male";
    double height = 1.75;
    double weight = 70.4;
    int age = 37;
    public go (int speed) {
        if(speed > 0 && speed < 7) {
            System.out.println(name + " идёт со скоростью " + speed + " км/ч.");
            }
        return speed;
    }
    public void sit() {
        System.out.println(name + " сидит.");
    }
    public run(int speed) {
        if(speed > 6) {
            System.out.println(name + " бежит со скоростью " + speed + " км/ч.");
        }
        return speed;
    }
    public void speak() {
        System.out.println(name + " говорит: \"Привет!\"");
    }
    public void learnJava() {
        System.out.println(name + " учит Java.");
    }
}