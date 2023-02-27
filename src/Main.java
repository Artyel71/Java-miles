public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
       // int price = 20_000;
        //int miles = service.calculate(price); // должно получиться 500
        System.out.println(service.calculate(30000));
        System.out.println(service.calculate(50000));
        System.out.println(service.calculate(1000));
    }
}
