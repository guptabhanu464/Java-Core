package exception;

public class ExceptionTest {

    public static void main(String[] args) {

        int[] num = {10,20,30,40};
        int[] deo = {1,2,0,4};

        for(int i  = 0 ; i < num.length ;  i++) {
//            if(deo[i] == 0) {
//                deo[i] = 1;
//            }
            System.out.println(divide(num[i],deo[i]));
        }

        System.out.println("Division is successful");

        // Above code will give error
        // This is runtime error
    }

    public static int divide(int a , int b) {
        try {
            return a / b;
        } catch (Exception e) {
            System.out.println(e);
            return 1;
        }
    }
}
