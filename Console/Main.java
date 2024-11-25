package Console;

import Pratos.Factory.LasanhaFactory;
import Pratos.Factory.NhoqueFactory;
import Pratos.Factory.PizzaFactory;
import Pratos.Factory.PratoFactory;
import Pratos.ModoPreparo;

public class Main {
    public static void main(String[] args) {
        PratoFactory pizzaFactory = new PizzaFactory();
        pizzaFactory.prepararPrato(ModoPreparo.FORNO_A_LENHA);

        PratoFactory lasanhaFactory = new LasanhaFactory();
        lasanhaFactory.prepararPrato(ModoPreparo.FORNO_A_LENHA);

        PratoFactory nhoqueFactory = new NhoqueFactory();
        nhoqueFactory.prepararPrato(ModoPreparo.FOGAO);
    }
}
