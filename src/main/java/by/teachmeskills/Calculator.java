package by.teachmeskills;

public class Calculator implements ICalculator {
    public double add(String addendum1, String addendum2) {
        double add1 = Double.parseDouble(addendum1);
        double add2 = Double.parseDouble(addendum2);
        return add1 + add2;
    }

    public double subtract(String minuend, String subtrahend) {
        double min = Double.parseDouble(minuend);
        double sub = Double.parseDouble(subtrahend);
        return min - sub;
    }

    public double divide(String dividend, String divider) {
        double divd = Double.parseDouble(dividend);
        double divr = Double.parseDouble(divider);
        return divd / divr;
    }

    public double miltiply(String multiplier1, String multiplier2) {
        double mul1 = Double.parseDouble(multiplier1);
        double mul2 = Double.parseDouble(multiplier2);
        return mul1 * mul2;
    }
}
