import java.util.Scanner;
public class JPA06 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("Input Chinese score:");
        int a=scn.nextInt();
        System.out.print("Input English score:");
        int b=scn.nextInt();
        System.out.print("Input Math score:");
        int c=scn.nextInt();
        if(a<60){
            System.out.println("Chinese failed");
        }if(b<60){
            System.out.println("English failed");
        }if(c<60){
            System.out.println("Math failed");
        }if(a>=60 && b>=60 && c>=60){
            System.out.println("All Pass");
        }
    }
    
}
