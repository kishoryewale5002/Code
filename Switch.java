import java.util.*;
public class Switch {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter The First NO :");

        int a = sc.nextInt();
        System.out.print("Enter The Second No :");
        int b = sc.nextInt();
        System.out.print("Enter The Operation :- + - * / % :-");
        char Operation = sc.next().charAt(0);

        switch (Operation) {
            case '+':
                int Sum = a+b;
                System.out.print("The Sum is :"+Sum); 
                break;
            case '-':
                int Sub = a-b;
                System.out.print("The Sub is :"+Sub); 
                break;   
            case '*':
                int Mul = a*b;
                System.out.print("The Mul is :"+Mul); 
                break; 
            case '/':
                int Div = a/b;
                System.out.print("The Div is :"+Div); 
                break; 
            case '%':
                int Mod = a%b;
                System.out.print("The Mod is :"+Mod); 
                break;     
            default:
                System.out.println("............Operation is Invalid ............");
                break;
        }
        

    }
}