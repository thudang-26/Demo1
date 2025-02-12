import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Excercise_1 {
    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt(899999)+100000;
        System.out.println("Giá trị của a là: " + a);
        int b = a/100000;
        System.out.printf(b + "");
        int c = a%100000;
        int d = c/10000;
        System.out.printf(d + "");
        int e = c%10000;
        int f = e/1000;
        System.out.printf(f + "");
        int g = e%1000;
        int h = g/100;
        System.out.printf(h + "");
        int l = g%100;
        int k = l/10;
        System.out.printf(k + "");
        int i = l%10;
        System.out.printf(i + "");

    }
}
