    interface A{
        void showA();
    }
    interface B{
        void showB();
    }

    class C implements A,B{
        public void showA(){
            System.out.println("Interface A method");
        }
        public void showB(){
            System.out.println("Interface B method");
        }
        void showC(){
            System.out.println("Class C method");
        }
    }

    class D extends C{
        void showD(){
            System.out.println("Class D method");
        }
    }

public class Hybrid_Inheritance {


    public static void main(String[] args){
        D obj = new D();
        obj.showA();
        obj.showB();
        obj.showC();
        obj.showD();
        
    }
}
