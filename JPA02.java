import java.util.Scanner;
public class JPA02 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("Input:");
        int a=scn.nextInt();
        int b=scn.nextInt();
        if(a<b){
            System.out.println(b+" is larger than "+a);
        }else{
            System.out.println(a+" is larger than "+b);
        }
    }
}
