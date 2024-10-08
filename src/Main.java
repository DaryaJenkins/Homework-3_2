public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double myBmi = (int)service.calculate(1.53, 56);
        System.out.println("Мой индекс массы тела: " + myBmi);
        }
    }