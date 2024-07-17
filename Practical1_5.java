public class Practical1_5 {

    public static void main(String[] args) {
       
        int[] productCodes = {1, 2, 3, 4, 5};
        double[] prices = {1000, 500, 300, 200, 400}; 

        
        double totalBill = 0.0;

        for (int i = 0; i < productCodes.length; i++) {
            int code = productCodes[i];
            double price = prices[i];
            double tax = 0.0;
            switch (code) {
                case 1:
                    tax = 0.08; 
                    break;
                case 2:
                    tax = 0.12; 
                    break;
                case 3:
                    tax = 0.05; 
                    break;
                case 4:
                    tax = 0.075; 
                    break;
                default:
                    tax = 0.03; 
                    break;
            }

            
            double priceWithTax = price + (price * tax);
            totalBill += priceWithTax;

              System.out.printf("Product Code: %d, Price: %.2f, Tax: %.2f%%, Price with Tax: %.2f%n", 
                              code, price, tax * 100, priceWithTax);
        }

        System.out.printf("Total Bill: %.2f%n", totalBill);
        System.out.println("Aryan Pate 23CS057");

    }
}
