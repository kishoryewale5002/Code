  class Super1 {

    void Dispay(int a){

        System.out.println(a);
    }
    void Dispay(int a,int b){

        System.out.println(a+"&"+b);

    }
    void Display(Double d){

         System.out.println(d);
    }
    void Dispay(Double a, Double b){

         System.out.println(a+"&"+b);
    }
    void Dispay(int a,Double b){

         System.out.println(a+"&"+b);
    }
    void Dispay(String a){

         System.out.println(a);
    }
    void Dispay(String a, int b){

         System.out.println(a+"&"+b);    
    }
    void Dispay(String a, Double b){

        System.out.println(a+"&"+b);
    }
    void Dispay(Boolean a){
        
        System.out.println(a);
    }
    void Dispay(Boolean a, int b){

        System.out.println(a+"&"+b);
    }  
    void Dispay(Float a){

        System.out.println(a);
    } 
}
 class Method {
public static void main(String[] args) {
    Super1 sp = new Super1();
    sp.Dispay(1);
    sp.Dispay(true);
    sp.Dispay(2);
    sp.Dispay(67);
    
    
}
}