public class TypePromotion {
    public static void main(String[] args) {
        byte b = 25;
        short s = 10;
        char ch = 'a';
        System.out.println(b+s+ch);//byte short and char are promoted to int

        int num1 = 10;
        float num2 = 21.0f;
        double num3 = 23.899;
        System.out.println(num1 + num2 + num3);
    }
}
