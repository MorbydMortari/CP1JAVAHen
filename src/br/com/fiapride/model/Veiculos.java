package br.com.fiapride.model;

public class Veiculos {
    private String individuo;
    private String placa;
    private int gas;

    public Veiculos(String individuo, String placa) {
        this.individuo = individuo;
        this.placa = placa;
        this.gas = 0;
    }

    public void adicionar(int v) {
        this.gas += v;
    }

    public String getIndividuo() {
        return individuo;
    }

    public String getPlaca() {
        return placa;
    }

    public int getGas() {
        return gas;
    }

    public void gasta(int v) {
        if (v > 0 && this.gas >= v) {
            this.gas -= v;
            System.out.println("Viagem realizada! Combustível consumido: " + v + "L");
        } else {
            System.out.println("ERRO: Combustível insuficiente para realizar a viagem!");
        }
    }

}