

class Animal {

     void cat(){

        System.out.println("This Is A Super Class");

    }
}
class Dog extends Animal{

     void Bark(){

        System.out.println("This is a Child Class");
    }
}
 class  Puppy extends Dog {

       void Weep(){
         
         System.out.println("This Is Child Class 2");

       }  
}


public class MultiLevelInheritance  {
    public static void main(String[] args) {
 
      Puppy pp = new Puppy();
      pp.Weep();
      pp.Bark();
      pp.cat();
        
    }
    
}
