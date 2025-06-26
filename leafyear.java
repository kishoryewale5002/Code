import java.util.*;
public class leafyear{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter The Year :");
        int year=sc.nextInt();
        if(year%4==0 && year%100!=0 || year%400==0)
        {
            System.out.println(year+" is Leaf Year");
        }else{
            System.out.println(year+" is Not Leaf Year");
        }
    
        
    }
}