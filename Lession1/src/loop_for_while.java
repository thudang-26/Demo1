public class loop_for_while {
    public static void main(String[] args) {
        int a = 0;
        int tong = 0;
        while (a < 10){
            // System.out.println(a);
            tong = tong + a;
            a++;
        }
        // System.out.println(tong);
        for (int i = 0; i < 9; i++){
            if ( i == 2){
                System.out.println("Monday");
            }else if (i ==3){
                System.out.println("Tuesday");
            }else if ( i == 4) {
                System.out.println("Wednesday");
            }else if (i == 5) {
                System.out.println("Thursday");
            }else if (i ==6) {
                System.out.println("Friday");
            }else if ( i == 7){
                System.out.println("Saturday");
            }else if (i==8){
                System.out.println("Sunday");
            }
        }
    }
}
