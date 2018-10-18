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
public class Carro {
    private String placa;
    private float preco;
    
    public String getPlaca(){
        return placa;
    }
    public void setPlaca(String placa){
        this.placa = placa;
    }
    public float getPreco(){
        return preco;
    }
    public void setPreco(float preco){
        this.preco = preco;
    }
    public float calculaAluguel(int dias){
        this.preco *= dias;
        System.out.println("**************");
        System.out.println("Valor do Aluguel: "+this.preco);
        return preco;
    }
}
