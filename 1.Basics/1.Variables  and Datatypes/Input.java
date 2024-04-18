import java.util.*;
public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.next();//next ignores everything after space
        System.out.println(input);

        String name = sc.nextLine();//nextLine is used to store spaces
        System.out.println(name);

        int num = sc.nextInt();//nextInt is used to take integer input
        System.out.println(num);
    }
}
