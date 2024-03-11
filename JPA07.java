import java.util.Scanner;

public class JPA07{
public static void main(String[] args) {
    for(int i=1;i<=4;i++){
        Scanner scn=new Scanner(System.in);
        System.out.print("請輸入三個整數:");
        int a=scn.nextInt();
        int b=scn.nextInt();
        int c=scn.nextInt();
        if (a<=b&&b<c||b<=a&&b<c){
            int max=c;
            int q=b;
            int w=a;
            if(q*q-4*w*max>0||w*w-4*q*max>0){
                System.out.println("不可構成三角形");
            }
            else if(q*q+w*w>max*max){
                System.out.println("銳角三角形");
            }else if(q*q+w*w==max*max){
                System.out.println("直角三角形");
            }else if(q*q+w*w<max*max){
                System.out.println("鈍角三角形");
            } 
        }else if(c<=a&&a<b||a<=c&&a<b){
            int max=b;
            int q=a;
            int w=c;
            if(q*q-4*w*max<0||w*w-4*q*max<0){
                System.out.println("不可構成三角形");
            }
            else if(q*q+w*w>max*max){
                System.out.println("銳角三角形");
            }else if(q*q+w*w==max*max){
                System.out.println("直角三角形");
            }else if(q*q+w*w<max*max){
                System.out.println("鈍角三角形");
            } 
        }else if(b<=c&&b<a||c<=b&&b<a){
            int max=a;
            int q=b;
            int w=c;
            if(w*w-4*q*max<0||w*w-4*q*max<0){
                System.out.println("不可構成三角形");
            }
            else if(q*q+w*w>max*max){
                System.out.println("銳角三角形");
            }else if(q*q+w*w==max*max){
                System.out.println("直角三角形");
            }else if(q*q+w*w<max*max){
                System.out.println("鈍角三角形");
            } 
        
        }
    }
}
}