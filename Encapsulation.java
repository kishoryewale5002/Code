 class Person {

     private String nm;
     private int age;
     public String GetName(){
     return nm;
    }
    public int GetAge(){
        return age;
    }
    public void SetName(String Name){
        this.nm=Name;
    }
    public void SetAge(int a){
        this.age=a;
    }

}
public class Encapsulation {
    public static void main(String[] args) {
        Person p = new Person();
        p.SetName("kishor");
        p.SetAge(19);
        String s=p.GetName();
        int b=p.GetAge();
        System.out.println("Name Is :"+s);
        System.out.println("Age Is :"+b);
        
    }
    
}
