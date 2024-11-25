package Pratos.Factory;

import Pratos.Lasanha;
import Pratos.ModoPreparo;
import Pratos.Prato;

public class LasanhaFactory extends PratoFactory {
    @Override
    public Prato criarPrato(ModoPreparo modoPreparo) {
        System.out.println("Usando modo de preparo: " + modoPreparo);
        return new Lasanha();
    }
}
