public class ConditionalStatement {

    public static void main(String[] args){

        int age = 30;
        char sex = 9793; //Используем символ копьё Марса
        double height = 1.5;
        char firstLetterOfTheName = 'M';

        if(age>20){
        System.out.println("Person over 20 years of age");
        }

        if(sex==9793){
        System.out.println("Male person");
        }

        if(sex!=9793){
        System.out.println("Female person");
        }

        if(height < 1.80){
        System.out.println("Person below 1.80 m");
        }
        else {
        System.out.println("The person above 1.80 m");
        }

        if(firstLetterOfTheName == 'M'){
        System.out.println("First letter of the name \"M\"");
        }
        else if (firstLetterOfTheName == 'I'){
        System.out.println("First letter of the name \"I\"");
        }
        else {
        System.out.println("First letter of the name is not \"M\" or \"I\"");
        }
    }
}
