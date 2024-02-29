import java.util.Scanner;
public class JPA103{
    public static void main(String[]args){
        Scanner scn=new Scanner(System.in);
        System.out.print("Please input:");
        float a=scn.nextInt();  
        float b=scn.nextInt();  
        float c=scn.nextInt();
        float k=(a+b+c)/3;
        System.out.printf("Average:k=%.2f",k);
    }

}