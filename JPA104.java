import java.util.Scanner;
import java.lang.Math;
public class JPA104 {
    public static void main(String[]args){
        Scanner scn=new Scanner(System.in);
        System.out.print("輸入第一組的x和y座標:");
        float a=scn.nextInt();
        float b=scn.nextInt();
        System.out.print("輸入第二組的x和y座標:");
        float c=scn.nextInt();
        float d=scn.nextInt();
        float k=(int)Math.pow(a-c,2)+(int)Math.pow(b-d,2);
        float z=(float)Math.sqrt(k);
        System.out.printf("介於(%.2f,%.2f)和(%.2f,%.2f)之間的距離是%.2f",a,b,c,d,z);
    }

}
