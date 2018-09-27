/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airbnb;

/**
 *
 * @author berna
 */
public class hospedagem {
    private int id;
    private Cliente hospede;
    private Chale quarto;
    private String dataIn;
    private String dataFim;
    private int qtdPessoas;

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public Cliente getHospede(){
        return hospede;
    }
    public void setHospede(Cliente hospede){
        this.hospede = hospede;
    }
    public Chale getQuarto(){
        return quarto;
    }
    public void setChale(Chale quarto){
        this.quarto = quarto;
    }
    public String getDatain(){
        return dataIn;
    }
    public void setDatain(String datain){
        this.dataIn = datain;
    }
    public String getDatafim(){
        return dataFim;
    }
    public void setDatafim(String datafim){
        this.dataFim = datafim;
    }
    public int getqtdpessoas(){
        return qtdPessoas;
    }
    public void setQtdpessoas(int qtdPessoas){
        this.qtdPessoas = qtdPessoas;
    }
    public void GerarResumoReserva(){
//       Cliente novo = new Cliente();
//       Chale c1 = new Chale();
//       novo.getWhatsapp();
//       novo.getNome();
//       this.dataIn = dataIn;
//       this.dataFim = dataFim;
//       c1.getPreco();
         System.out.println("****Resumo*****");
         System.out.println("");
         System.out.println("Nome: "+this.getHospede().getNome());
         System.out.println("Whatsapp: "+this.getHospede().getWhatsapp());
         System.out.println("Data Início: "+this.getDatain());
         System.out.println("Data fim: "+this.getDatafim());
         System.out.println("Preço: "+this.getQuarto().getPreco());            System.out.println("");
         System.out.println("******************");
             }
}