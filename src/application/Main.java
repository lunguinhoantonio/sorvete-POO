package application;
import entities.Sorvete;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantity;
        System.out.println("1. Adicionar um novo sabor");
        System.out.println("2. Remover um sabor");
        switch (scanner.nextInt()) {
            case 1:
                Sorvete sorvete = new Sorvete();
                System.out.print("Sabor: ");
                sorvete.setName(scanner.nextLine());
                do {
                    System.out.print("Quantidade: ");
                    quantity = scanner.nextInt();
                    if (quantity < 0) {
                        System.out.println("Não pode colocar números negativos!");
                    }
                } while (quantity < 0);
                sorvete.setQuantity(quantity);

        }
    }
}