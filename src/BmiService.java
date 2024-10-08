public class BmiService {
    public double calculate(double m, int kg) {
        double bmi;
        bmi = kg / (m*m);
        return bmi;
    }
}