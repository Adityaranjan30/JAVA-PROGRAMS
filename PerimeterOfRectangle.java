import java.util.*;

public class PerimeterOfRectangle {
    public static void perimeter(int l,int b){
        int p=2*(l+b);
        System.out.println("PERIMETER IS:" + p);
    }
    public static void area(int l,int b){
        int a=l*b;
        System.out.println("AREA IS:" + a);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE LENGTH OF RECTANGLE");
        int l=sc.nextInt();
        System.out.println("ENTER THE BREADTH OF RECTANGLE");
        int b=sc.nextInt();
        System.out.println("PRESS 1. FOR PERIMETER");
        System.out.println("PRESS 2. FOR AREA");
        int choice=sc.nextInt();
        switch(choice){
            case 1:{
            perimeter(l,b);
            break;}
            case 2:{
                area(l,b);
                break;
            }

        }
    }
    
}
