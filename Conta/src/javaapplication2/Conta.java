package javaapplication2;
/**
 *
 * @author Bernardo
 */
class Conta {
    //atributos
   private int numero;
   private Cliente titular;
   private double saldo;
   private double limite;
    //get e set
    public int getNumero(){
        return numero;
    }
    public void setNumero(int numero){
        this.numero = numero;
    }
    public Cliente getCliente(){
        return titular;
    }
    public void setCliente(Cliente titular){
        this.titular = titular;
    }
    public double getSaldo(){
        return saldo;
   }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    public double getLimite(){
        return limite;
   }
    public void setLimite(double limite){
        this.limite = limite;
    }
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