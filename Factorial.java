import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number to find factorial :");
        int num = sc.nextInt();
        long Factorial = 1;
        if(num<0){
            System.out.println("cannot find factorial of negative number");
        }else{
        for(int i=1; i<=num; i++){
           Factorial*=i;
           
        }
         System.out.println(Factorial);
     }
    } 
}

