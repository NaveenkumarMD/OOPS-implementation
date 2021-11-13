class Adder{
    int add(int a,int b){
        return a+b;
    }
}
class DoubleAdder extends Adder{
    double add(double a,double b){
        return a+b;
    }
}
class FloatAdder extends Adder{
    float add(Float a,Float b,Float c){
        return a+b+c;
    }
public class Methodoverloading {
    public static void main(String[] args) {
        Adder a=new Adder();
        System.out.println(a.add(10,20));
        DoubleAdder d=new DoubleAdder();
        System.out.println(d.add(10.5,20.5));
        FloatAdder f=new FloatAdder();
        System.out.println(f.add(10.5f,20.5f,30.5f));
    }
}
