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
   int numero;
   String dono;
   double saldo;
   double limite;
   double conta;
   
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
}
