public class MethodClass {

    public static int maximum(int number1, int number2) {

        if (number1 > number2) {
            return number1;
        } else {
            return number2;
        }
    }

    public static void main(String[] args) {

        int result = maximum(5, 8);

        System.out.println("The maximum is: " + result);
    }
}
