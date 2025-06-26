
import java.util.*;
public class palledrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter string to check pallendrome or not :");
        String str = sc.nextLine();
        String reverse = "";

        for(int i =str.length()-1; i>=0; i--){
            reverse +=str.charAt(i);
        }

        if(str.equals(reverse)){
            System.out.println("String is pallendrome");
        }else{
            System.out.println("string is not pallendrome");
        }
    }
    
}
