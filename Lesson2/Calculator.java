public class Calculator {
    private int numb1, numb2;
    private char mathOperation;

    public void setNumb1(int numb1) {
        this.numb1 = numb1;
        }

    public void setMathOperation(char mathOperation) {
        this.mathOperation = mathOperation;
    }

    public void setNumb2(int numb2) {
        this.numb2 = numb2;
    }

    private int result;
    public int getResult() {
        switch(mathOperation) {
            case '+':
                result = numb1 + numb2;
                System.out.println(result);
                break;
            case '-':
                result = numb1 - numb2;
                System.out.println(result);
                break;
            case '*':
                result = numb1 * numb2;
                System.out.println(result);
                break;
            case '/':
                if(numb2 != 0) {
                    result = numb1 / numb2;
                    System.out.println(result);
                } else {
                    System.out.println("На ноль делить нельзя");
                }
                break;
            case '%':
                result = numb1 % numb2;
                System.out.println(result);
                break;
            case '^':
                int degree = 1;
                result = numb1;
                while(degree < numb2) {
                    result *= numb1;
                    degree++;
                }
                System.out.println(result);
                break;
            default:
                System.out.println("Нет такой математической операции.");
        }
        return result;
    }
}