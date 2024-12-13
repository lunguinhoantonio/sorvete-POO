package application;
import entities.Sorvete;

import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Sorvete> sorvetes = new ArrayList<>();
        int quantity;
        System.out.println("1. Adicionar um novo sabor");
        System.out.println("2. Remover um sabor");
        System.out.println("3. Listar sorvetes");
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
                sorvetes.add(sorvete);
                break;
            case 2:
                if (sorvetes.isEmpty()) {
                    System.out.println("Nenhum sorvete foi cadastrado!");
                    break;
                }
                System.out.println("Qual sorvete deseja remover?");

        }
    }
}