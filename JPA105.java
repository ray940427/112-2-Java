import java.util.Scanner;
public class JPA105{
    public static void main (String[]args){
        Scanner scn=new Scanner(System.in);
        System.out.print("請輸入你的名字:");
        String a=scn.next();
        System.out.println("Hi,"+a+"請輸入你的銅板個數:");
        System.out.print("請輸入1元的數量:");
        int b=scn.nextInt();
        System.out.print("請輸入5元的數量:");
        int c=scn.nextInt();
        System.out.print("請輸入10元的數量:");
        int d=scn.nextInt();
        System.out.print("請輸入50元的數量:");
        int e=scn.nextInt();
        int q=b+5*c+10*d+50*e;
        int w=q/1000;
        int r=(q-w*1000)/100;
        int t=(q-w*1000-r*100)/10;
        int y=q-w*1000-r*100-t*10;
        System.out.print(w+"千"+r+"百"+t+"十"+y+"元");

    }   
}