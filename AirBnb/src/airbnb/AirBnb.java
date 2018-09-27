/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airbnb;

import java.util.Scanner;

/**
 *
 * @author berna
 */
public class AirBnb {
 public static void main(String[] args) {
   Cliente c1 = new Cliente();
   hospedagem h1 = new hospedagem();
   Chale ch1 = new Chale();
   c1.setNome("Bernardo");
   c1.setCpf("111111");
   c1.setEndereco("juiz De Fora");
   c1.setWhatsapp("951651");
   h1.setDatain("26/09/2018");
   h1.setDatafim("07/10/2018");
   ch1.setPreco(500);
   
   h1.setHospede(c1);
   h1.setChale(ch1);
   h1.GerarResumoReserva();
 }
}