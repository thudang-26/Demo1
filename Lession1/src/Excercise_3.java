import java.util.Random;
import java.util.SortedMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Excercise_3 {
    public static void main(String[] args) {
        Random random = new Random();
        int A = random.nextInt(2000)-1000;
        System.out.println("Giá trị của a là: " + A);
        int B = random.nextInt(2000)-1000;
        System.out.println("Giá trị của b là: " + B);
        int C = random.nextInt(2000)-1000;
        System.out.println("Giá trị của c là: " + C);
        if (A == 0){
            System.out.println("Phương trình có nghiệm là: x = " + -C/B);
            if (B == 0){
                if (C==0){
                    System.out.println("Phương trình có vô số nghiệm");
                }
            }
        }else if (C == 0) {
            System.out.println("hương trình có 2 nghiệm là: x = 0 và x = " + -B / A);
        }else if (B == 0) {
            int D = -C/A;
            if (D == 0) {
                System.out.println("Phương trình có nghiệm là: x = 0");
            }else if (D > 0){
                System.out.println("Phương trình có nghiệm là: x = " + -Math.sqrt(-C)/A);
                System.out.println("x2 = " + Math.sqrt(-C)/A);
            }else {
                System.out.println("Phương trình vô nghiệm");
            }
        }else {
            int denta = B * B - 4 * A * C;
            System.out.println("Denta =: " + denta);
            if (denta < 0) {
                System.out.println("Phương trình vô nghiệm");
            } else if (denta == 0) {
                System.out.println("Phương trình có nghiệm kép x1 = x2 = " + -B / 2 * A);
            } else {
                System.out.println("Phương trình có 2 nghiệm phân biệt x1 = " + (-B + Math.sqrt(denta)) / 2 * A + ", ");
                System.out.printf("x2 = " + (-B - Math.sqrt(denta)) / 2 * A);
            }
        }
    }
}
