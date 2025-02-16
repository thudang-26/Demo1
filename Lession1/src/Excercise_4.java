import java.util.Random;
public class Excercise_4 {
    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt(991)+10;
        System.out.println("Giá trị của a là: " + a);
        boolean ketqua= true;
        for (int i = 2; i <= a; i ++){
            if (a%i==0){
                ketqua = false;
            }
        }
        if (ketqua==false){
            System.out.println("a không phải số nguyên tố");
        }else {
            System.out.println("a là số nguyên tố");
        }
    }
}
