import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class BTVN3 {
    public static void main(String[] args) {
        int a = 857402;
        int b = a/100000;
        int c = a%100000;
        if (b == 8){
            System.out.printf("" +b);
            int d = c/10000;
            int e = c%10000;
//            System.out.println("Số e =" +e );
                System.out.printf("5");
                int f = e/1000;
                int g = e%1000;
//                System.out.println("Số g =" + g);
                if (f == 7){
                    System.out.printf("7");
                    int h = g - 2;
                    int i = h/100;
//                    System.out.println("Số h =" + h);
                    if( i == 4){
                        System.out.printf("4");
                        int l = h - 400;
                        if (l == 0){
                            System.out.printf("0");
                            int k = h/200;
                            if (k == 2){
                                System.out.printf("2");
                            }
                        }
                    }
                }
            }
        }
    }
