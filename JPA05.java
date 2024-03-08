import java.util.Scanner;
public class JPA05{
    public static void main(String[] args) {
        for(int i=1;i<=4;i++){
            Scanner scn=new Scanner(System.in);
            System.out.print("Enter an inetger:");
            int a=scn.nextInt();
            if(a%2==0 && a%3==0 && a%6==0){
                    System.out.println(a+"是2,3,6的倍數");
            }else if(a%2==0){
                System.out.println(a+"是2的倍數");
            }else if(a%3==0){
                System.out.println(a+"是3的倍數");  
            }else{
                System.out.println(a+"不是2,3,6的倍數");
            }
        }
    }
}
