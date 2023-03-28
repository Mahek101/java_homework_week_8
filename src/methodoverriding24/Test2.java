package methodoverriding24;
//Test class to create objects and call the methods

public class Test2 {
    public static void main(String[] args) {
        SBI s = new SBI();
        ICICI i = new ICICI();
        AXIS a = new AXIS();
        System.out.println("SBI Rale of Interest "+ s.getRateOfInterest());
        System.out.println("ICICI Rale of Interest "+ i.getRateOfInterest());
        System.out.println("AXIS Rale of Interest "+ a.getRateOfInterest());
    }
}
