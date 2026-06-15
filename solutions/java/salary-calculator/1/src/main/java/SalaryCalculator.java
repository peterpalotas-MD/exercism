public class SalaryCalculator {
    public double salaryMultiplier(int daysSkipped) {

        double multiplier = (daysSkipped < 5 ) ? 1 : 0.85;
        return multiplier;
    }

    public int bonusMultiplier(int productsSold) {

        int bonus = (productsSold>=20) ? 13 : 10;
        return bonus;
    }

    public double bonusForProductsSold(int productsSold) {
        return productsSold * bonusMultiplier(productsSold);
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double salary = 1000 * salaryMultiplier(daysSkipped) + bonusForProductsSold(productsSold);
        double total = (salary>2000) ? 2000 : salary;
        return total;
    }
}
