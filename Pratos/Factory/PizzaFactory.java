package Pratos.Factory;

import Pratos.ModoPreparo;
import Pratos.Pizza;
import Pratos.Prato;

public class PizzaFactory extends PratoFactory {
    @Override
    public Prato criarPrato(ModoPreparo modoPreparo) {
        System.out.println("Usando modo de preparo: " + modoPreparo);
        return new Pizza();
    }
}
