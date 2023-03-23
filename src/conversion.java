import java.util.Scanner;

public class conversion {
    static void convert(float summ, float cursus){
        System.out.println("Result of exchainge " + summ + " with cursus " + cursus + " = " + (summ * cursus));
    }

    public static void main(String[] args) {
        float summ, cursus;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter summ of money for exchainge");
        summ = in.nextFloat();
        System.out.println("Enter exchainge curs");
        cursus = in.nextFloat();
        convert(summ, cursus);
    }
}
