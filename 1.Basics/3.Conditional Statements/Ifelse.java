import java.util.*;
public class ifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age>=18){
            System.out.println("Can Vote");
        }else{
            System.out.println("Cannot Vote");
        }
    }
}
//SYNTAX
// if(condition){

// }else{

// }