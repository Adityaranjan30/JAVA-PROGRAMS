import java.util.*;

public class Si {
    public static void si(int p,int r,int t){
        int SI;
        SI=(p*r*t)/100;
        System.out.println(SI);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER PRINCIPLE AMOUNT");
        int p=sc.nextInt();
        System.out.println("ENTER RATE");
        int r=sc.nextInt();
        System.out.println("ENTER TIME");
        int t=sc.nextInt();
        si(p,r,t);
    }
    
}
