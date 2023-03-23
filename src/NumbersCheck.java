import java.util.Scanner;

public class NumbersCheck {
    public static void main(String[] args) {
        int number;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        number = in.nextInt();
        numberCheck(number);
    }
    static void numberCheck(int number){
        if (number >= 0 ) System.out.println("Number is positive");
        else System.out.println("Number is negative");
        if (true) {

        }else System.out.println("Number is not simple");
        if(number % 2 == 0) System.out.println("This number can be fully devided on 2");
        if (number % 5 == 0) System.out.println("This number can be fully devided on 5");
        if (number % 3 == 0) System.out.println("This number can be fully devided on 3");
        if (number % 6 == 0) System.out.println("This number can be fully devided on 6");
        if (number % 9 == 0) System.out.println("This number can be fully devided on 9");
    }
}
