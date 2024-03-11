import java.util.Scanner;
public class JPA08 {
    public static void main(String[] args) {
        for(int i=0;i<=4;i++){
            Scanner scn=new Scanner(System.in);
            System.out.print("Input:");
            int a=scn.nextInt();
            if(a>=90){
                System.out.println("Your grade is A");
            }else if(a>=80 && a<90){
                System.out.println("Your grade is B");
            }else if(a>=70 && a<80){
                System.out.println("Your grade is C");
            }else if(a>=60 && a<70){
                System.out.println("Your grade is D");
            }else if(a<60){
                System.out.println("Your grade is F");
            }

        }
    }
}
