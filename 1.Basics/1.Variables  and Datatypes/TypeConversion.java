import java.util.*;

public class TypeConversion {
    public static void main(String[] args) {
        int a = 5;
        long b = a; //int->long
        System.out.println(b);

        Scanner sc = new Scanner(System.in);
        float num = sc.nextInt(); //int->float
        System.out.println(num);

        char ch = 'a';
        int num1 = ch;
        System.out.println(num1);
    }
}
