
    import java.util.Scanner;
public class JPA04 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("Input:");
        int a=scn.nextInt();
        if(a%5==0 && a%9==0){
            System.out.println("Yes");
        }else{
            System.out.println("No");

        }
}
}
