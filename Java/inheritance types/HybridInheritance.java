// hybrid inheritance with multiple inheritance and single inheritance
interface A{
    void method1();
}
interface B{
    void method2();
}
class C{
    void method3(){
        System.out.println("C method3");
    }
}
class D extends C implements A,B{
    public void method1(){
        System.out.println("D method1");
    }
    public void method2(){
        System.out.println("D method2");
    }
    public void method3(){
        System.out.println("D method3");
    }
}
// Hybrid inheritance with multilevel inheritance and hierachial inheritance

class GrandParent{
    void intoduce(){
        System.out.println("I am a grand parent");
    }
}
class Parent extends GrandParent{
    void introduce(){
        System.out.println("I am a parent");
    }
}
class Son extends Parent{
    void introduce(){
        System.out.println("I am a son");
    }
}
class Daughter extends Parent{
    void introduce(){
        System.out.println("I am a daughter");
    }
}
public class HybridInheritance {
    public static void main(String[] args) {
        D d = new D();
        d.method1();
        d.method2();
        d.method3();
    }
}
