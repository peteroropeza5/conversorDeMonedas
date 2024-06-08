package com.aluracursos.conversordemonedas.modulos;

public class Conversiones{

    double pesoARS;
    double dolarUSD;
    double realBRL;
    double pesoMXN;
    double total = 0;

    public Conversiones(Moneda moneda){
        this.pesoARS = moneda.conversion_rates().get("ARS");
        this.dolarUSD = moneda.conversion_rates().get("USD");
        this.realBRL = moneda.conversion_rates().get("BRL");
        this.pesoMXN = moneda.conversion_rates().get("MXN");
    }

    public void dolarArgentino(double cantidad){
        total = cantidad * pesoARS;
    }
    public void dolarReal(double cantidad){
        total = cantidad * realBRL;
    }
    public void dolarMexicano(double cantidad){
        total = cantidad * pesoMXN;
    }
    public void argentinoDolar(double cantidad){
        total = cantidad / pesoARS;
    }
    public void realDolar(double cantidad){
        total = cantidad / realBRL;
    }
    public void mexicanoDolar(double cantidad){
        total = cantidad / pesoMXN;
    }

    public double getTotal() {
        return total;
    }
}
