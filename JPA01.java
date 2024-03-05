import java.util.Scanner;
public class JPA01{
public static void main(String[] args) {
    
    for(int i=1;i<=2;i++){
        System.out.print("Please enter score:");
        Scanner scn=new Scanner(System.in);
        int a=scn.nextInt();
        if(a>=60){
            System.out.println("You Pass");
        }else{
            System.out.print("");
        }
        System.out.println("end");
    }
    
}
}