class Oragnism{
    int age;
    int lifetime;
    void sayHello(){
        System.out.println("I am an organism");
    }
}
class Animal extends Oragnism{
    int legs;
    void sayHello(){
        System.out.println("I am an animal");
    }
}
class Mammal extends Animal{
    int hair;
    void sayHello(){
        System.out.println("I am a mammal");
    }
}
class MultilevelInheritance{
    public static void main(String[] args) {
        
    }    
}