public class MealAnaliser {
    public static void main(String[] args) {
        int MoneyInMyPocket = 10;
        if (MoneyInMyPocket <10){
            System.out.println("Deneg net :(");
        } else{
            if (MoneyInMyPocket < 100) {
                System.out.println("Buy Doshirak");
            } else{
                if (MoneyInMyPocket < 500) {
                    System.out.println("Buy Shaurma");
                } else {
                    System.out.println("Buy Pizza");
                }
            }
        }
    }


}
