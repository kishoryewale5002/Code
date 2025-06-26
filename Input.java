import java.util.*;

public class Input {
    public static int Sub(int a,int b){
        int Sub2= a - b;
        return Sub2;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Input i = new Input();
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sub1=i.Sub(a, b);
        System.out.println(sub1);

    }
    
    }

