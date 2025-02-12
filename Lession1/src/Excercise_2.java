import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Excercise_2 {
    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt(2000)-1000;
        System.out.println("Giá trị của a là: " + a);
        if (a == 0){
            System.out.println("a = " + a);
        }else if (a > 0) {
            System.out.println("a lớn hơn 0");
        }else {
            System.out.println("a nhỏ hơn 0");
        }
    }
}
