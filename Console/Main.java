package Console;

import Pratos.Factory.LasanhaFactory;
import Pratos.Factory.NhoqueFactory;
import Pratos.Factory.PizzaFactory;
import Pratos.Factory.PratoFactory;
import Pratos.ModoPreparo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            try {
                System.out.println("=== Menu de Preparação de Pratos ===");
                System.out.println("1. Preparar Pizza");
                System.out.println("2. Preparar Lasanha");
                System.out.println("3. Preparar Nhoque");
                System.out.println("4. Sair");
                System.out.print("Escolha uma opção: ");
                int escolhaPrato = Integer.parseInt(scanner.nextLine()); // Captura exceções de entrada inválida

                if (escolhaPrato == 4) {
                    System.out.println("Encerrando o programa. Até mais!");
                    continuar = false;
                    break;
                }

                System.out.println("=== Modos de Preparo ===");
                System.out.println("1. Forno a Lenha");
                System.out.println("2. Fogão");
                System.out.print("Escolha o modo de preparo: ");
                int escolhaModoPreparo = Integer.parseInt(scanner.nextLine());

                ModoPreparo modoPreparo;
                switch (escolhaModoPreparo) {
                    case 1:
                        modoPreparo = ModoPreparo.FORNO_A_LENHA;
                        break;
                    case 2:
                        modoPreparo = ModoPreparo.FOGAO;
                        break;
                    default:
                        throw new IllegalArgumentException("Modo de preparo inválido."); // Lança exceção
                }

                PratoFactory pratoFactory;
                switch (escolhaPrato) {
                    case 1:
                        pratoFactory = new PizzaFactory();
                        break;
                    case 2:
                        pratoFactory = new LasanhaFactory();
                        break;
                    case 3:
                        pratoFactory = new NhoqueFactory();
                        break;
                    default:
                        throw new IllegalArgumentException("Prato inválido."); // Lança exceção
                }

                pratoFactory.prepararPrato(modoPreparo);
                System.out.println("Prato preparado com sucesso!\n");

            } catch (NumberFormatException e) {
                System.out.println("Erro: Entrada inválida. Por favor, insira um número.");
            } catch (IllegalArgumentException e) {
                System.out.println("Erro: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Erro inesperado: " + e.getMessage());
            }
        }

        scanner.close();
    }
}
