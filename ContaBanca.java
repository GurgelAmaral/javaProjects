/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contabanca;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Lucas Gurgel
 */
public class ContaBanca {
    
    public ContaBanca(){
       this.nomeTitular = ""; 
       this.numeroConta = 1234;
       this.agencia = "GurgaBank";
       this.saldo = 100;
       this.senha = "1234";
       this.choice = 0;
       this.dataAbertura = new Date().toString();
    }
    
    Scanner k = new Scanner(System.in);

    private String nomeTitular;
    private int numeroConta;
    private String agencia;
    private double saldo;
    private String dataAbertura;
    private String senha;
    private int choice;
    public int numContaInformed;
    
    
    public void init(){
        System.out.println("Bem-vindo(a)!");
        System.out.println("Insira seus dados para começar.");
        System.out.print("Nome: ");
        String name = k.next();
        this.setNomeTitular(name);
        System.out.print("Numero da conta: ");
        numContaInformed = k.nextInt();
        System.out.print("Senha: ");
        String pass = k.next();
        this.setSenha(pass);
        
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getSenha() {
        return senha;
    }
    

    public int getChoice() {
        return choice;
    }

    public void setChoice(int choice) {
        this.choice = choice;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(String dataAbertura) {
        this.dataAbertura = dataAbertura;
    }
    
    
    public void saca(){
        System.out.print("Digite o valor do saque: ");
        double valor = k.nextDouble();
        while(valor > saldo){
            System.out.println("Saldo insuficiente.");
            System.out.print("Digite o valor do saque: ");
            valor = k.nextDouble();
        }
        if(valor <= this.saldo){
            System.out.println("Saque realizado com sucesso!");
            double saque = this.saldo - valor;
            this.setSaldo(saque);
            System.out.println("você apresenta um saldo de R$"+this.getSaldo());
        }
        
        
    }
    
    public void deposita(){
        System.out.print("Digite o valor do depósito: ");
        double valor = k.nextDouble();
        while(valor < 0){
            System.out.println("Valor de depósito inválido.");
            System.out.print("Digite o valor do depósito: ");
            valor = k.nextDouble();
        }
        if(valor > 0){
            System.out.println("depósito realizado com sucesso!");
            double deposito = this.saldo + valor;
            this.setSaldo(deposito);
            System.out.println("Você atualmente possui um saldo de R$"+this.getSaldo());
        }
        
        
    }
     public void calculoRendimento(){
         System.out.println(this.getNomeTitular()+", você apresenta um saldo de "+this.getSaldo());
         System.out.println("E sua taxa de rendimento é de 0,34% ao mês");
         System.out.print(this.getNomeTitular()+", há quanto tempo [EM MESES] você é cliente do GurgaBank: ");
         double tds = k.nextDouble();
         System.out.println("============================================================");
         double rend = this.getSaldo() * (0.34/100) * tds;
         System.out.println("Seu rendimento mensal é de R$"+ rend);
         
     }
}
