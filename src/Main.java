public class Main {
        public static void main(String[] args) {
            long priceInKopek = 22_000_55;
            int coefficientInKopeck = 20_00;
            long bonusInMiles = priceInKopek / coefficientInKopeck;
            System.out.println(bonusInMiles);
        }
}
