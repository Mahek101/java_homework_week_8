package methodoverriding24;
//child class

public class ICICI extends Bank{
    @Override
    public int getRateOfInterest() {
        return 7;
    }
}
