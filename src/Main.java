public class Main {

    public static void main(String[] args) {

        int ticketPrice = 15000;
        int milePrice = 20;

        int bonusMile = ticketPrice / milePrice * 1;

        System.out.println("Начислено бонусных миль: " + bonusMile);


    }
}