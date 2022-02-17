import java.util.Scanner;
public class InchConvert {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите значение для дюйма: ");
        double inch, meter;
        inch = input.nextInt();
        meter = inch*0.0254;
        System.out.println(inch + " дюйма - это "+ meter + " метра");
    }
}