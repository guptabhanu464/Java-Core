package exception;

public class TestA {


    public static void main(String[] args) {
        try{
            int a =9;
            System.out.println(a/2);
        }catch(Exception e){
            System.out.println(e);
        }finally{
            System.out.println("Hello world");
        }
    }
}
