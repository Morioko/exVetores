import entidades.aluguel;

import java.util.Scanner;

public class exVetores {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        aluguel[] vet = new aluguel[10];

        System.out.println("Quantos quartos serão alugados?");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println();
            System.out.println("Aluguel #" + i + ":");
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.next();
            System.out.print("Quarto: ");
            int quartoNum = sc.nextInt();

            vet[quartoNum] = new aluguel(nome, email);
        }

        System.out.println();
        System.out.println("Quartos Ocupados: ");
        for (int i = 0; i <10; i++) {
            if (vet[i] != null) {
                System.out.println(i + ": " + vet[i]);
            }

        }
        sc.close();
    }
}