package Pratos.Factory;

import Pratos.ModoPreparo;
import Pratos.Prato;

public abstract class PratoFactory {
    public abstract Prato criarPrato(ModoPreparo modoPreparo);

    public Prato prepararPrato(ModoPreparo modoPreparo) {
        Prato prato = criarPrato(modoPreparo);
        prato.preparar();
        return prato;
    }
}
