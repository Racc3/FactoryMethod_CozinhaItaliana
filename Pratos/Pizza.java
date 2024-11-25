package Pratos;

public class Pizza implements Prato {
    @Override
    public void preparar() {
        System.out.println("Preparando Pizza com trigo, queijo, molho, e assada no forno a lenha.");
    }
}
