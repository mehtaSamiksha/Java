//Binary -> + - * / %    These are called binary because we need to operand 
//Unary -> ++ --         These are called unary because we need one operand for these
//Ternary -> ?:

import java.util.*;

public class ArithmeticOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Sum = " + (a + b));
        System.out.println("Difference = " + (a - b));
        System.out.println("Product = " + (a * b));
        System.out.println("Division = " + (a / b));
        System.out.println("Remainder = " + (a % b));

    }
}
