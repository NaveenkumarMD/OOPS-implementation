interface A{
    void sayHello();
}
interface B{
    void sayGoodBye();
}
class C implements A,B{
    public void sayHello(){
        System.out.println("Hello");
    }
    public void sayGoodBye(){
        System.out.println("Goodbye");
    }
}
public class MultipleInheritance {
    public static void main(String[] args) {
        C c=new C();
        c.sayHello();
        c.sayGoodBye();
    }    
}
