public class largest {

    public static void main(String[] args) {

        double num1 = 5.3, num2 = 3.9, num3 = 2.5;

        if( num1 >= num2 && num1 >= num3)
            System.out.println(num1 + " is the largest number.");

        else if (num2 >= num1 && num2 >= num3)
            System.out.println(num2 + " is the largest number.");

        else
            System.out.println(num3 + " is the largest number.");
    }
}
