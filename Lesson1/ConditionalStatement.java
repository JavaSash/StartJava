public class ConditionalStatement {
    public static void main(String[] args) {
        int age = 30;
        if(age > 20){
            System.out.println("Person over 20 years of age");
        }
        char sex = ♀;
        if(sex == ♀){
            System.out.println("Male person");
        }
        if(sex != ♀){
            System.out.println("Female person");
        }
        double height = 1.5;
        if(height < 1.80){
            System.out.println("Person below 1.80 m");
        } else {
            System.out.println("The person above 1.80 m");
        }
        char firstLetterOfName = 'M';
        if(firstLetterOfTheName == 'M'){
            System.out.println("First letter of the name \"M\"");
        } else if (firstLetterOfTheName == 'I'){
            System.out.println("First letter of the name \"I\"");
        } else {
            System.out.println("First letter of the name is not \"M\" or \"I\"");
        }
    }
}