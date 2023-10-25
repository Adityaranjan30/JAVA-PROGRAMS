import java.util.*;

public class EmployeeSal {
    public static void netsal(int bs){
        int pf=1400;
        int hra=(bs*30)/100;
        int da=(bs*20)/100;
        int ta=(bs*10)/100;
        int netsal=(bs+hra+da+ta)-pf;
        System.out.println("NET SALARY IS: " + netsal);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER BASIC SALARY");
        int bs=sc.nextInt();
        netsal(bs);
    }
}
