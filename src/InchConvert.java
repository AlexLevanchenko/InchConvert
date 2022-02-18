import java.util.Scanner;
public class InchConvert {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите значение для дюйма: ");
        final double meterInInch = 0.0254;
        double inch, meter;
        inch = input.nextInt();
        meter = inch * meterInInch;
        System.out.println(inch + " дюйма - это "+ meter + " метра");
    }
}
