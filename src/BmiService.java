public class BmiService {
    public int calculate(double m, int kg) {
        double bmi;
        bmi = kg / (m*m);
        return (int) bmi;
    }
}