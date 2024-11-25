package Pratos.Factory;

import Pratos.ModoPreparo;
import Pratos.Nhoque;
import Pratos.Prato;

public class NhoqueFactory extends PratoFactory {
    @Override
    public Prato criarPrato(ModoPreparo modoPreparo) {
        System.out.println("Usando modo de preparo: " + modoPreparo);
        return new Nhoque();
    }
}
