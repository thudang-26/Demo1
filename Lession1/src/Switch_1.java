import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Switch_1 {
    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt(8)+1; /*Trả về gt 0 - 7 nên cần cộng thêm 1*/
        System.out.println("Giá trị của a là: " + a);
        switch (a) {
            case 1:
                System.out.println("Không có thứ phù hợp");
            break;
            case 2:
                System.out.println("Monday");
            break;
            case 3:
                System.out.println("Tuesday");
            break;
            case 4:
                System.out.println("Wednesday");
            break;
            case 5:
                System.out.println("Thursday");
            break;
            case 6:
                System.out.println("Friday");
            break;
            case 7:
                System.out.println("Saturday");
            break;
            case 8:
                System.out.println("Sunday");
            break;
        }
    }
}