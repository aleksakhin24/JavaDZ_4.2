public class BmiService {
    public double calculate (int weightKg, double heightM){
        double bmi = weightKg / (heightM*heightM);
        int result = (int)bmi;
        return result;
    }
}