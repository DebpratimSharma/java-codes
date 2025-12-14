class Gen<T>{
    T ob;
    Gen(T o){
        ob = o;
    }
    T getOb(){
        return ob;
    }

    void showType(){
        System.out.println("Type of T is: "+ob.getClass().getName());
    }
}

public class GenericsTest1 {
    public static void main(String[] args) {
        Gen<Integer> iOb= new Gen<Integer>(88);
        iOb.showType();
        int v = iOb.getOb();
        System.out.println("Value of ob is :"+v);
        Gen<String> iOb2= new Gen<String>("Debpratim");
        iOb2.showType();
        String v2 = iOb2.getOb();
        System.out.println("Value of ob is :"+v2);
    }
}
