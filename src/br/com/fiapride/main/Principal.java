package br.com.fiapride.main;

import br.com.fiapride.model.Veiculos;

public class Principal {
    public static void main(String[] args) {

        Veiculos v1 = new Veiculos("Henrique", "HEN-1056");

        v1.adicionar(50);
        v1.gasta(20);

        System.out.println("Dono: " + v1.getIndividuo());
        System.out.println("Placa: " + v1.getPlaca());
        System.out.println("Gasolina atual: " + v1.getGas() + "L");
    }
}