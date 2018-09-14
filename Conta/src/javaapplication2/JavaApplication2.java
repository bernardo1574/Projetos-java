package javaapplication2;

import java.util.Scanner;

public class JavaApplication2 {

    public static void main(String[] args) {
    Conta c1 = new Conta();
    Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o seu nome:");
    c1.dono = leitor.nextLine();
        System.out.println("Digite o número da conta:");
    c1.conta = leitor.nextInt();
    c1.saldo = 50000;
    c1.limite = 25000;
         System.out.println("Olá senhor(a) "+c1.dono+", tudo bem?");
         System.out.println("Aqui estão os seus dados:");
         System.out.println("Nome: "+c1.dono);
         System.out.println("Número da conta: "+c1.conta);
         System.out.println("Seu saldo: "+"R$"+c1.saldo);
         System.out.println("Seu limite"+"R$"+c1.limite);
    int op = 1;
    while(op != 0){
        System.out.println("Escolha 1 para saque e 2 para depósito:");
    int opcao = leitor.nextInt();
    switch (opcao){
        case 1:
            System.out.println("Digite o valor de saque:");
            if(!c1.saca(leitor.nextDouble())){
                System.out.println("Não foi possível realizar o seu saque!"); 
            }else{
                System.out.println("Saque bem sucedido!");
            }
            break;
        case 2:
            System.out.println("Digite o valor do depósito:");
            c1.deposita(leitor.nextDouble());
            System.out.println("Depósito bem sucedido!");
            break;
        default:
            System.out.println("Você digitou uma operação inválida.");
    }
    System.out.println("Insira 0 para finalizar e 1 para fazer nova operação");
        op = leitor.nextInt();
    }
        
        System.out.println("Novos dados:");
        System.out.println("Número da conta:" + c1.conta);
        System.out.println("Nome:" + c1.dono);
        System.out.println("valor em conta:" + c1.saldo);
        System.out.println("Seu limite:" + c1.limite); 
        System.out.println("Tenha um escelente dia!");
}
}
