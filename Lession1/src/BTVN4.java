import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class BTVN4 {
    public static void main(String[] args) {
        int a = 1900;
        int b = a%100;
        if(b != 0 && a%4==0) {
            System.out.println( a + " là năm nhuận");
        }else {
            if (a%4!=0){
                System.out.println( a + " không phải năm nhuận");
            }else {
                int d = a%400;
                if (d != 0){
                    System.out.println( a + " không phải năm nhuận");
                }else {
                    System.out.println( a + " là phải năm nhuận");
                    }
                }
            }
        }
    }