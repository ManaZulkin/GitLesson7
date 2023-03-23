import java.util.Scanner;

public class Calculator {
    static int calculate(int num1, int num2, int num3){
        int middle;
        middle = (num1 + num2 + num3)/3;
        return middle;
    }

    public static void main(String[] args) {
        int n1, n2, n3;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter one by one 3 numbers for calculation");
        n1 = in.nextInt();
        n2 = in.nextInt();
        n3 = in.nextInt();
        System.out.println("Middle number is " + calculate(n1, n2, n3));
    }
}
