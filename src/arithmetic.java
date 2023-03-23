import java.util.Scanner;

public class arithmetic {
    static void add(int operant1, int operant2) {
        System.out.println(operant1 + " + " + operant2 + " = " + (operant1 + operant2));
    }

    static void sub(int operant1, int operant2) {
        System.out.println(operant1 + " - " + operant2 + " = " + (operant1 - operant2));
    }

    static void mul(int operant1, int operant2) {
        System.out.println(operant1 + " * " + operant2 + " = " + (operant1 * operant2));

    }

    static void div(double operant1, int operant2) {
        if (operant2 == 0) {
            System.out.println("ERROR! Not posible divide on 0");
            return;
        }

        System.out.println((int)operant1 + " / " + operant2 + " = " + (operant1 / operant2));

    }


    public static void main(String[] args) {
        int operant1, operant2;
        byte choise;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number");
        operant1 = in.nextInt();
        System.out.println("Enter second number");
        operant2 = in.nextInt();
        System.out.println("Enter \n1 - adding \n2 - subtraction \n3 - multiply \n4 - divine");
        choise = in.nextByte();
        switch (choise){
            case 1: {
                add(operant1,operant2);
                break;
            }
            case 2: {
                sub(operant1,operant2);
                break;
            }
            case 3: {
                mul(operant1,operant2);
                break;
            }
            case 4: {
                div(operant1,operant2);
                break;
            }
        }
    }
}
