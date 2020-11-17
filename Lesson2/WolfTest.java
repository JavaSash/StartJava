/* Создайте класс WolfTest с методом main
создайте объект типа Wolf
присвойте в нем полям экземпляра класса Wolf какие-то значения
считайте эти значения из полей и отобразите в консоли
вызовите методы объекта */

public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.sex = "male";
        wolf.name = "Voldo";
        wolf.weight = 24.5;
        wolf.age = 4;
        wolf.color = "grey";
        System.out.println("Пол волка: " + wolf.sex);
        System.out.println("Имя волка: " + wolf.name);
        System.out.println("Вес: " + wolf.weight);
        System.out.println("Возраст: " + wolf.age);
        System.out.println("Цвет: " + wolf.color);
        wolf.go(2);
        wolf.sit();
        wolf.run(5);
        wolf.howl();
        wolf.hunt();
	}
}