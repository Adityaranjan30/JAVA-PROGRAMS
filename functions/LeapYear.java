import java.util.*;

public class LeapYear {
    public static void lp(int year){
        if(year%4==0 && year%100!=0 || year%400==0 ){
            System.out.println("IT IS A LEAP YEAR");
        }
        else{
            System.out.println("IT IS NOT A LEAP YEAR");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER YEAR");
        int year=sc.nextInt();
        lp(year);
    }
    
}
