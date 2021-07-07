/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contabanca;

import java.util.Scanner;

/**
 *
 * @author Lucas Gurgel
 */
public class TesteConta {

    public static void main(String[] args) {

        //senha padrão = 1234
        //número da conta padrão = 1234
        Scanner key = new Scanner(System.in);

        ContaBanca cont = new ContaBanca();

        cont.init();

        while (!"1234".equals(cont.getSenha()) || cont.numContaInformed != cont.getNumeroConta()) {

            System.out.println("senha ou número da conta inválido");
            System.out.print("Digite o número da conta novamente: ");
            int rightNum = key.nextInt();
            cont.numContaInformed = rightNum;
            System.out.print("Digite novamente a senha: ");
            String passAgain = key.next();
            cont.setSenha(passAgain);
        }

        System.out.println("bem-vindo ao GurgaBank, " + cont.getNomeTitular());

        int choice;

        do {
            System.out.println("(1) Consultar saldo        (2) Realizar saque");
            System.out.println("(3) Realizar depósito      (4) Verificar rendimento mensal");
            System.out.println("                    (5) Sair");
            System.out.print("digite o número da operação para prosseguir: ");
            choice = key.nextInt();

            switch (choice) {
                case 1:
                    System.out.println(cont.getNomeTitular() + ", você apresenta um saldo de R$" + cont.getSaldo());
                    break;
                case 2:
                    cont.saca();
                    break;
                case 3:
                    cont.deposita();
                    break;
                case 4:
                    cont.calculoRendimento();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Entrada inválida");
                    System.exit(0);
            }
           
        } while (choice == 1 || choice == 2 || choice == 3 || choice == 4);

    }

}
