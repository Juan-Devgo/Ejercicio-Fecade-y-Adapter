package co.uniquindio.ejercicioclase.Model;

public class AdaptadorCalculadora implements CalculadoraEnteros{
    private CalculadoraDecimales calculadoraDecimales;

    public AdaptadorCalculadora(){
        this.calculadoraDecimales = new CalculadoraDecimal();
    }

    @Override
    public int sumar(int num1, int num2) {
        double real1 = adaptar(num1); double real2 = adaptar(num2);
        return (int) calculadoraDecimales.sumar(real1, real2);
    }

    public double sumar(double num1, double num2) {
        return calculadoraDecimales.sumar(num1, num2);
    }

    private double adaptar(Integer num) {
        return num.doubleValue();
    }
}