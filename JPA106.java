
public class JPA106 {
    public static void main(String[] args) {
        float a=(float) -3.2;
        double b= (double) (3*(Math.pow(a,3))+2*a-1);
        System.out.printf("f(-3.2)=%.4f",b);
        float   c=(float) -2.1;
        double d= (double) (3*(Math.pow(c,3))+2*c-1);
        System.out.printf("f(-2.1)=%.4f",d);
        float   e=(float) 0;
        double f= (double) (3*(Math.pow(e,3))+2*e-1);
        System.out.printf("f(0)=%.4f",f);
        float   g=(float) 2.1;
        double h= (double) (3*(Math.pow(g,3))+2*g-1);
        System.out.printf("f(2.1)=%.4f",h);
    }
}
