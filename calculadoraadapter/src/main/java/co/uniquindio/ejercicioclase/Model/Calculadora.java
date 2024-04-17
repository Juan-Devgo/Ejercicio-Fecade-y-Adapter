package co.uniquindio.ejercicioclase.Model;

public class Calculadora implements CalculadoraEnteros{
    private AdaptadorCalculadora adaptador;

    public Calculadora(){
        this.adaptador = new AdaptadorCalculadora();
    }

    @Override
    public int sumar(int num1, int num2){
        return adaptador.sumar(num1, num2);
    }

    public double sumar(double num1, double num2) {
        return adaptador.sumar(num1, num2);
    }
}