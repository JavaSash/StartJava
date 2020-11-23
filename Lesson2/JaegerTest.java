public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaeger1 = new Jaeger();
        Jaeger jaeger2 = new Jaeger();
        jaeger1.setModelName("Gipsy Danger");
        jaeger1.setMark("Mark-3");
        jaeger1.setHeight(79.25);
        jaeger1.setWeight(1.980);
        jaeger1.setSpeed(7);
        jaeger1.setArmor(6);
        jaeger1.drift();
        jaeger1.move(7);
        jaeger1.scanKaiju();
        jaeger1.printParametres();

        jaeger2.setModelName("Striker Eureka");
        jaeger2.setMark("Mark-5");
        jaeger2.setHeight(76.2);
        jaeger2.setWeight(1.850);
        jaeger2.setSpeed(10);
        jaeger2.setArmor(9);
        jaeger2.drift();
        jaeger2.move(10);
        jaeger2.attack();
        jaeger2.printParametres();

        jaeger2.setModelName("Striker from MK");
        jaeger2.setMark("human");
        jaeger2.setHeight(1.8);
        jaeger2.setWeight(0.08);
        jaeger2.setSpeed(3);
        jaeger2.setArmor(1);
        jaeger2.move(3);
        jaeger2.attack();
        jaeger2.printParametres();

    }
}