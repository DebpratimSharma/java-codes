interface Bank{
    float rateOfInterest();
}

class SBI implements Bank{
    public float rateOfInterest(){
        return 8.4f;
    }
}

class PNB implements Bank{
    public float rateOfInterest(){
        return 9.7f;
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Bank b;
        b= new SBI();
        System.out.println("SBI Rate of Interest: " + b.rateOfInterest());

        b= new PNB();
        System.out.println("PNB Rate of Interest: " + b.rateOfInterest());
    }
    
}
