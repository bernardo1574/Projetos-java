package javaapplication2;

import java.util.Scanner;

public class JavaApplication2 {

    public static void main(String[] args) {
    Conta c1 = new Conta();
    Scanner leitor = new Scanner(System.in);
    c1.titular.dono = "Bernardo1";
    c1.numero = 1;
    c1.saldo = 50000;
    c1.limite = 25000;
    // Instanciar um objeto do tipo conta
    Conta c2 = new Conta();
    c2.titular.dono = "Bernardo2";
    c2.numero = 2;
    c2.saldo = 50000;
    c2.limite = 25000;
    System.out.println("Digite o número da conta:");
    int conta = leitor.nextInt();
    Conta aux = new Conta();
    Conta aux2 = new Conta();
    if(conta==c1.numero){
        aux = c1;
        aux2= c2;
    }else{
        aux = c2;
        aux2= c1;
    }
            System.out.println("---------------------------------------");
            System.out.println("Olá senhor(a) "+aux.titular.dono+",tudo bem?");
            System.out.println("");
            System.out.println("Aqui estão os seus dados:");
            System.out.println("");
            System.out.println("Nome: "+aux.titular.dono);
            System.out.println("Número da conta: "+aux.numero);
            System.out.println("Seu saldo: "+"R$"+aux.saldo);
            System.out.println("Seu limite"+"R$"+c1.limite);
            System.out.println("");
            System.out.println("---------------------------------------");
         
    int op = 1;
    while(op != 0){
            System.out.println("Escolha 1 para saque, 2 para depósito ou 3 para transferência:");
    int opcao = leitor.nextInt();
    switch (opcao){
        case 1:
            System.out.println("Digite o valor de saque:");
            System.out.println("---------------------------------------");
            System.out.println("Aguarde!");
            System.out.println("---------------------------------------");
            if(!aux.saca(leitor.nextDouble())){
            System.out.println("Não foi possível realizar o seu saque!"); 
            System.out.println("");
            }else{
            System.out.println("Saque bem sucedido!");
            System.out.println("");
            }
            break;
        case 2:
            System.out.println("Digite o valor do depósito:");
            System.out.println("---------------------------------------");
            System.out.println("Aguarde!");
            System.out.println("---------------------------------------");
            aux.deposita(leitor.nextDouble());
            System.out.println("Depósito bem sucedido!");
            System.out.println("");
            break;
        case 3:
            System.out.println("Digite o valor da transferência");
            System.out.println("---------------------------------------");
            System.out.println("Aguarde!");
            System.out.println("---------------------------------------");
            aux.tranfere(leitor.nextDouble(), aux2);
            System.out.println("saldo da sua conta:"+aux.saldo);
            System.out.println("saldo da sua segunda conta:"+aux2.saldo);
            System.out.println("---------------------------------------");
            break;
        default:
            System.out.println("Você digitou uma operação inválida.");
    }
            System.out.println("Insira 0 para finalizar e 1 para fazer nova operação");
        op = leitor.nextInt();
    }
            
            System.out.println("---------------------------------------");
            System.out.println("Novos dados:");
            System.out.println("Nome:" + aux.titular.dono);
            System.out.println("Número da conta:" + aux.numero);
            System.out.println("valor em conta:" + aux.saldo);
            System.out.println("Seu limite:" + aux.limite); 
            System.out.println("Tenha um excelente dia!");
        
}
}
