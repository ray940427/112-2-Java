import java.util.Scanner;
public class JPA03 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("Input an integer:");
        int a=scn.nextInt();
        if(a%2==0){
            System.out.println("The number is even.");
        }else{
            System.out.println("The number is odd");

        }
    }
}
