import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class BTVN2 {
    public static void main(String[] args) {
        Random random = new Random();

        int a = random.nextInt(8) + 1;
        System.out.println("Giá trị của a là: " + a);
        if(a==1) {
            System.out.println("Không có thứ phù hợp");
        }else {
            if (a==2){
                System.out.println("Monday");
            }else {
                if (a == 3){
                    System.out.println("Tuesday");
                }else {
                    if ( a == 4){
                        System.out.println("Wednesday");
                    }else {
                        if (a == 5){
                            System.out.println("Thursday");
                        }else {
                            if (a == 6){
                                System.out.println("Friday");
                            }else {
                                if (a == 7){
                                    System.out.println("Saturday");
                                }else {
                                    System.out.println("Sunday");
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}