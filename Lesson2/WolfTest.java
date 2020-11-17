public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.setSex("male");
        wolf.setName("Voldo");
        wolf.setWeight(24.5);
        wolf.setAge(4);
        wolf.setColor("grey");
        System.out.println("Пол волка: " + wolf.getSex());
        System.out.println("Имя волка: " + wolf.getName());
        System.out.println("Вес: " + wolf.getWeight());
        System.out.println("Возраст: " + wolf.getAge());
        System.out.println("Цвет: " + wolf.getColor());
        wolf.go(2);
        wolf.sit();
        wolf.run(5);
        wolf.howl();
        wolf.hunt();
    }
}