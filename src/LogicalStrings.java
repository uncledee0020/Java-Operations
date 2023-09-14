public class LogicalStrings {
    public static void main(String[] args){
        boolean isWatchInStock = true;
        int watchPrice = 200;
        int myBudget = 180;
        boolean isThereASale = true;
        int saleDiscount = 30;

        System.out.println("Is the watch available and affordable?:\t" + (isWatchInStock && (watchPrice <= myBudget)));
        System.out.println("is the watch available and affordable on a sale?:\t" +(isWatchInStock && ((watchPrice-saleDiscount)<=myBudget)));
        System.out.println("Can I buy a the watch today?:\t" +(isWatchInStock && ((watchPrice-saleDiscount)<=myBudget) && isThereASale));
    }
}
