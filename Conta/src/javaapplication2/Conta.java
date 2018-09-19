/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author Estacio
 */
class Conta {
    //atributos
   int numero;
   Cliente titular;
   double saldo;
   double limite;
    //métodos   
//   void saca (double quantidade){
//       this.saldo -=quantidade;
//   }
   
   boolean saca(double quantidade){
       if(quantidade>this.saldo){
           return false;
       }else{
           this.saldo-=quantidade;
           return true;
       }
   }
   
   
   
   void deposita (double quantidade){
       this.saldo+= quantidade;
   }
void tranfere(double quantidade, Conta destino){
   if(this.saca(quantidade)){
       destino.deposita(quantidade);
       System.out.println("Transferência feita com sucesso!");
       System.out.println("");
   }else{
       System.out.println("Não tem saldo suficiente!");    
       System.out.println("");
}
}
}