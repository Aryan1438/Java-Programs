public class Practical1_3 {
    public static void main(String[] args) {
        
        double original = 1234.5678;


        long integralPart = (long) original;

        
        double fractionalPart = original - integralPart;
        short firstFourDigitsOfFraction = (short) (fractionalPart * 10000); 

        
        System.out.println("Original double value: " + original);
        System.out.println("Integral part (as long): " + integralPart);
        System.out.println("First four digits of fractional part (as short): " + firstFourDigitsOfFraction);
        System.out.println("Aryan Patel 23CS057");
    }
}
