import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Switch_2 {
    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt(2025)+1; /*Trả về gt 0 - 7 nên cần cộng thêm 1*/
        int b = random.nextInt(12)+1;
        System.out.println("Năm: " + a);
        System.out.println("Tháng: " + b);
        switch (b) {
            case 1:
                System.out.println("Năm " + a + " tháng " + b + " có 31 ngày");
            break;
            case 2:
                if (a%100==0 && a%400 ==0){
                    System.out.println("Năm " + a + " tháng " + b + " có 29 ngày");
                }else{
                    if (a%100==0 && a%400!=0){
                        System.out.println("Năm " + a + " tháng " + b + " có 28 ngày");
                    }else {
                        if (a%100!=0 && a%4==0){
                            System.out.println("Năm " + a + " tháng " + b + " có 29 ngày");
                        }else {
                            System.out.println("Năm " + a + " tháng " + b + " có 28 ngày");
                        }
                    }
                }
            break;
            case 3:
                System.out.println("Năm " + a + " tháng " + b + " có 31 ngày");
            break;
            case 4:
                System.out.println("Năm " + a + " tháng " + b + " có 30 ngày");
            break;
            case 5:
                System.out.println("Năm " + a + " tháng " + b + " có 31 ngày");
            break;
            case 6:
                System.out.println("Năm " + a + " tháng " + b + " có 30 ngày");
            break;
            case 7:
                System.out.println("Năm " + a + " tháng " + b + " có 31 ngày");
            break;
            case 8:
                System.out.println("Năm " + a + " tháng " + b + " có 31 ngày");
            break;
            case 9:
                System.out.println("Năm " + a + " tháng " + b + " có 30 ngày");
            break;
            case 10:
                System.out.println("Năm " + a + " tháng " + b + " có 31 ngày");
            break;
            case 11:
                System.out.println("Năm " + a + " tháng " + b + " có 30 ngày");
            break;
            case 12:
                System.out.println("Năm " + a + " tháng " + b + " có 31 ngày");
            break;}
    }
}