class SuperClass{
    void Get(){

        System.out.println("This Is Super Class ");
    }
}
class Child extends SuperClass{
    void Put(){

        System.out.println("This Is Child Class");
    }
}
public class SingleLevel {
    public static void main(String[] args) {
        Child ch = new Child();
        ch.Get();
        ch.Put();

        }
    
}
