import java.util.Scanner;

public class PowA234 {

    public static void main(String[] args) {
        int n1, n2, n3, n4, n5;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter one by one 5 numbers for calculation");
        n1 = in.nextInt();
        n2 = in.nextInt();
        n3 = in.nextInt();
        n4 = in.nextInt();
        n5 = in.nextInt();
        System.out.println("Pow " + n1 + " number is " + " pow2 " + pow2(n1) + " pow3 " + pow3(n1) + " pow4 " + pow4(n1));
        System.out.println("Pow " + n2 + " number is " + " pow2 " + pow2(n2) + " pow3 " + pow3(n2) + " pow4 " + pow4(n2));
        System.out.println("Pow " + n3 + " number is " + " pow2 " + pow2(n3) + " pow3 " + pow3(n3) + " pow4 " + pow4(n3));
        System.out.println("Pow " + n4 + " number is " + " pow2 " + pow2(n4) + " pow3 " + pow3(n4) + " pow4 " + pow4(n4));
        System.out.println("Pow " + n5 + " number is " + " pow2 " + pow2(n5) + " pow3 " + pow3(n5) + " pow4 " + pow4(n5));
    }


    static int pow2(int number){
        int power2;
        power2 = number * number;
        return power2;
    }

    static int pow3(int number){
        int power3;
        power3 = number * number * number;
        return power3;
    }

    static int pow4(int number){
        int power4;
        power4 = number * number * number * number;
        return power4;
    }
}


