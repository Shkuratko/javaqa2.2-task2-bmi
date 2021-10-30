public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();
        double bmi = service.calculate(1.7, 61);
        System.out.println(bmi);
    }
}
