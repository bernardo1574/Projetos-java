/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bernardo_201601187475;

/**
 *
 * @author Estacio
 */
public class Bernardo_201601187475 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Objeto da classe Motorista;
        Motorista M1 = new Motorista();
        M1.setNome("Nome_1");
        M1.setCnh("CNH_1");
        
//        Objeto da classe Carro;
        Carro C1 = new Carro();
        C1.setPreco(22000);
        C1.setPlaca("4888");
        
        C1.calculaAluguel(5);
        M1.dadosMotoristas();
    }
    
}
