
class Adder{
    int add(int a,int b){
        return a+b;
    }

}
class DoubleAdder extends Adder{
    int add(double a,double b){
        return 3;
    }
}
public class Opeartoroverloading {
    public static void main(String[] args) {
        Adder a=new Adder();
        DoubleAdder d=new DoubleAdder();
        System.out.println(a.add(10,20));
        System.out.println(d.add(10.5,20.5));
    }
}
