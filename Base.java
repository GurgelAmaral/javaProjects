package exsgaba;

import java.util.*;

public class Base {

    public static void main(String[] args) {

        Scanner k = new Scanner(System.in);
        System.out.println("Bem-vindo(a) ao cinemaja!");
        System.out.print("Por favor, informe seu nome para prosseguir: ");

        String name = k.nextLine();

        System.out.println("Hoje há duas sessões disponíveis: ");
        System.out.println("1. As branquelas");
        System.out.println("2. A chegada");
        System.out.print("Por favor digite o número da sessão desejada: ");
        int choice = k.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Sessão escolhida: 'AS BRANQUELAS'");
                System.out.print("Gostaria de cotinuar?: ");
                String confirm = k.next();
                if ("sim".equals(confirm.toLowerCase()) || "s".equals(confirm.toLowerCase())) {
                    System.out.println("Sr(a) " + name + ", quantos ingressos gostaria de comprar?");
                    int ings = k.nextInt();
                    System.out.println("A sessão " + choice + " apresenta 6 fileiras ao todo (A, "
                            + "B, C, D e F) e 12 assentos para PCD");
                    System.out.println("Na fileira A há 27 assentos comuns disponíveis");
                    System.out.println("Na fileira B há 27 assentos comuns disponíveis");
                    System.out.println("Na fileira C há 27 assentos comuns disponíveis");
                    System.out.println("Na fileira D há 27 assentos comunsdisponíveis");
                    System.out.println("Na fileira E há 27 assentos comuns disponíveis");
                    System.out.println("Na fileira F há 5 assentos comuns disponíveis");
                    System.out.println("Na sala há 12 assentos para PCD disponíveis");
                    int counter = 1;
                    int a = 0;
                    int b = 0;
                    int c = 0;
                    int d = 0;
                    int e = 0;
                    int f = 0;
                    int apcd = 0;
                    while (counter <= ings) {
                        System.out.print("Em qual fileira gostaria de cadastrar o ingresso " + counter + "(A, B, C D, E ou PCD): ");
                        String row = k.next();
                        switch (row) {
                            case "a":
                                System.out.println("===============================================================");
                                if (a >= 27) {
                                    System.out.println("A fileira está completamente ocupada");
                                    --counter;
                                } else {
                                    System.out.println("ingresso " + counter + " cadastrado na fileira A com sucesso");
                                    a++;
                                }

                                break;
                            case "b":
                                System.out.println("===============================================================");
                                if (b >= 27) {
                                    System.out.println("A fileira está completamente ocupada");
                                    --counter;
                                } else {
                                    System.out.println("ingresso " + counter + " cadastrado na fileira B com sucesso");
                                    b++;
                                }
                                break;
                            case "c":
                                if (c >= 27) {
                                    System.out.println("A fileira está completamente ocupada");
                                    --counter;
                                } else {
                                    System.out.println("===============================================================");
                                    System.out.println("ingresso " + counter + " cadastrado na fileira C com sucesso");
                                    c++;
                                }
                                break;
                            case "d":
                                System.out.println("===============================================================");
                                if (d >= 27) {
                                    System.out.println("A fileira está completamente ocupada");
                                    --counter;
                                } else {
                                    System.out.println("ingresso " + counter + " cadastrado na fileira D com sucesso");
                                    d++;
                                }
                                break;
                            case "e":
                                System.out.println("===============================================================");
                                if (e >= 27) {
                                    System.out.println("A fileira está completamente ocupada");
                                    --counter;
                                } else {
                                    System.out.println("ingresso " + counter + " cadastrado na fileira E com sucesso");
                                    e++;
                                }
                                break;
                            case "f":
                                System.out.println("===============================================================");
                                if (f >= 5) {
                                    System.out.println("A fileira está completamente ocupada");
                                    --counter;
                                } else {
                                    System.out.println("ingresso " + counter + " cadastrado na fileira F com sucesso");
                                    f++;
                                }
                                break;
                            case "pcd":
                                System.out.println("===============================================================");
                                if (apcd >= 12) {
                                    System.out.println("A fileira está completamente ocupada");
                                    --counter;
                                } else {
                                    System.out.println("ingresso " + counter + " cadastrado na fileira de assentos PCD com sucesso");
                                    apcd++;
                                }
                                break;
                            default:
                                System.out.println("===============================================================");
                                System.out.println("fileira inválida");
                                --counter;
                        }
                        counter++;
                        System.out.println("==============================================================");
                        System.out.println("Na sala ainda restam " + (152 - a - b - c - d - e - f - apcd) + " assentos ao total");

                        System.out.println("Na fileira A há " + (27 - a) + " assentos comuns disponíveis");

                        System.out.println("Na fileira B há " + (27 - b) + " assentos comuns disponíveis");

                        System.out.println("Na fileira C há " + (27 - c) + " assentos comuns disponíveis");

                        System.out.println("Na fileira D há " + (27 - d) + " assentos comunsdisponíveis");

                        System.out.println("Na fileira E há " + (27 - e) + " assentos comuns disponíveis");

                        System.out.println("Na fileira F há " + (5 - f) + " assentos comuns disponíveis");

                        System.out.println("Na sala há " + (12 - apcd) + " assentos para PCD disponíveis");
                        System.out.println("==============================================================");
                    }

                    System.out.println("Sr(a) " + name + ", seus ingressos foram comprados com sucesso. Aproveite a pipoca grátis e tenha um bom filme");

                } else if ("não".equals(confirm.toLowerCase()) || "nao".equals(confirm.toLowerCase()) || "n".equals(confirm.toLowerCase())) {
                    System.exit(0);

                } else {
                    System.out.println("Entrada inválida");
                }
                break;
            case 2:
                System.out.println("Sessão escolhida: 'A CHEGADA'");
                System.out.print("Gostaria de cotinuar?: ");
                confirm = k.next();
                if ("sim".equals(confirm.toLowerCase()) || "s".equals(confirm.toLowerCase())) {
                    System.out.println("Sr(a) " + name + ", quantos ingressos gostaria de comprar?");
                    int ings = k.nextInt();
                    System.out.println("A sessão " + choice + " apresenta 5 fileiras ao todo (A, "
                            + "B, C, D e E) e 6 assentos para PCD");
                    System.out.println("Na fileira A há 24 assentos comuns disponíveis");
                    System.out.println("Na fileira B há 24 assentos comuns disponíveis");
                    System.out.println("Na fileira C há 24 assentos comuns disponíveis");
                    System.out.println("Na fileira D há 24 assentos comunsdisponíveis");
                    System.out.println("Na fileira E há 24 assentos comuns disponíveis");
                    System.out.println("Na sala há 6 assentos para PCD disponíveis");
                    int counter = 1;
                    int a = 0;
                    int b = 0;
                    int c = 0;
                    int d = 0;
                    int e = 0;
                    int f = 0;
                    int apcd = 0;
                    while (counter <= ings) {
                        System.out.print("Em qual fileira gostaria de cadastrar o ingresso " + counter + "(A, B, C, D, E ou PCD): ");
                        String row = k.next();
                        switch (row) {
                            case "a":
                                System.out.println("===============================================================");
                                if (a >= 24) {
                                    System.out.println("A fileira está completamente ocupada");
                                    --counter;
                                } else {
                                    System.out.println("ingresso " + counter + " cadastrado na fileira A com sucesso");
                                    a++;
                                }
                                break;
                            case "b":
                                System.out.println("===============================================================");
                                if (b >= 24) {
                                    System.out.println("A fileira está completamente ocupada");
                                    --counter;
                                } else {
                                    System.out.println("ingresso " + counter + " cadastrado na fileira B com sucesso");
                                    b++;
                                }
                                break;
                            case "c":
                                System.out.println("===============================================================");
                                if (c >= 24) {
                                    System.out.println("A fileira está completamente ocupada");
                                    --counter;
                                } else {
                                    System.out.println("ingresso " + counter + " cadastrado na fileira C com sucesso");
                                    c++;
                                }
                                break;
                            case "d":
                                System.out.println("===============================================================");
                                if (d >= 24) {
                                    System.out.println("A fileira está completamente ocupada");
                                    --counter;
                                } else {
                                    System.out.println("ingresso " + counter + " cadastrado na fileira D com sucesso");
                                    d++;
                                }
                                break;
                            case "e":
                                System.out.println("===============================================================");
                                if (e >= 24) {
                                    System.out.println("A fileira está completamente ocupada");
                                    --counter;
                                } else {
                                    System.out.println("ingresso " + counter + " cadastrado na fileira E com sucesso");
                                    e++;
                                }
                                break;
                            case "pcd":
                                System.out.println("===============================================================");
                                if (apcd >= 6) {
                                    System.out.println("A fileira está completamente ocupada");
                                    --counter;
                                } else {
                                    System.out.println("ingresso " + counter + " cadastrado na fileira de assentos PCD com sucesso");
                                    apcd++;
                                }
                                break;
                            default:
                                System.out.println("===============================================================");
                                System.out.println("fileira inválida");
                                --counter;
                        }
                        counter++;
                        System.out.println("==============================================================");
                        System.out.println("Na sala ainda restam " + (120 - a - b - c - d - e - apcd) + " assentos ao total");

                        System.out.println("Na fileira A há " + (25 - a) + " assentos comuns disponíveis");

                        System.out.println("Na fileira B há " + (25 - b) + " assentos comuns disponíveis");

                        System.out.println("Na fileira C há " + (25 - c) + " assentos comuns disponíveis");

                        System.out.println("Na fileira D há " + (25 - d) + " assentos comunsdisponíveis");

                        System.out.println("Na fileira E há " + (25 - e) + " assentos comuns disponíveis");

                        System.out.println("Na sala há " + (6 - apcd) + " assentos para PCD disponíveis");
                        System.out.println("==============================================================");
                    }

                    System.out.println("Sr(a) " + name + ", seus ingressos foram comprados com sucesso. Aproveite a pipoca grátis e tenha um bom filme");

                } else if ("não".equals(confirm.toLowerCase()) || "nao".equals(confirm.toLowerCase()) || "n".equals(confirm.toLowerCase())) {
                    System.exit(0);

                } else {
                    System.out.println("Entrada inválida");
                }
                break;
            default:
                System.out.println("Digite uma opção válida (1 ou 2)");
                System.exit(0);
        }
    }
}
