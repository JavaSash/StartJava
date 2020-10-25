public class Cycle {
    public static void main(String[] args) {
        System.out.println("Последовательность числел от 0 до 20:");
        for(int i = 0; i <= 20; i++) {
            System.out.print(i + " ");
        }

        System.out.println("\n Все числа от 6 до -6 с шагом 2");
        int count = 6;
        while(count >= -6){
            System.out.print(count + " ");
            count -= 2;
        }

        System.out.print("\n Сумма нечетных чисел от 10 до 20 равна ");
        int count2 = 10;
        int sum = 0;
        do {
            if(count2%2 != 0) {
                sum += count2;
            }
            count2++;
        } while(count2 <= 20);
            System.out.println(sum);
    }
}