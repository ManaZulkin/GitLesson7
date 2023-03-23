import java.util.Scanner;

public class PowA3 {

    public static void main(String[] args) {
        int n1, n2, n3, n4, n5;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter one by one 5 numbers for calculation");
        n1 = in.nextInt();
        n2 = in.nextInt();
        n3 = in.nextInt();
        n4 = in.nextInt();
        n5 = in.nextInt();
        System.out.println("Pow " + n1 + " number is " + pow(n1));
        System.out.println("Pow " + n2 + " number is " + pow(n2));
        System.out.println("Pow " + n3 + " number is " + pow(n3));
        System.out.println("Pow " + n4 + " number is " + pow(n4));
        System.out.println("Pow " + n5 + " number is " + pow(n5));
    }


    static int pow(int number){
        int power;
        return power = number * number * number;

    }
}
