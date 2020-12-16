public class ConditionalStatement {
    public static void main(String[] args) {
        int age = 30;
        if(age > 20) {
            System.out.println("Person over 20 years of age");
        }

        char sex = 'M';
        if(sex == 'M') {
            System.out.println("Male person");
        }
        if(sex != 'M') {
            System.out.println("Female person");
        }

        double height = 1.5;
        if(height < 1.80) {
            System.out.println("Person below 1.80 m");
        } else {
            System.out.println("The person above 1.80 m");
        }

        char firstLetterOfName = 'M';
        if(firstLetterOfName == 'M') {
            System.out.println("First letter of the name \"M\"");
        } else if (firstLetterOfName == 'I') {
            System.out.println("First letter of the name \"I\"");
        } else {
            System.out.println("First letter of the name is not \"M\" or \"I\"");
        }
    }
}