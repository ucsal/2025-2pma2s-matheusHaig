package br.com.mariojp.solid.srp;

public class TaxCalculator {

    public double calculaTaxa(double subtotal, double porcentagem ) {
        double tax = subtotal * porcentagem;
        return tax;
    }
}
