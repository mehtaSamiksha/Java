import java.util.*;

public class PositioneOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num > 0){
            System.out.println("Positive");
        }else if( num == 0){
            System.out.println("Zero");
        }else{
            System.out.println("Negative");
        }
    }
}
