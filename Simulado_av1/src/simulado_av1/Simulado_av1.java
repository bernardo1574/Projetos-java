/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulado_av1;

/**
 *
 * @author aluno
 */
public class Simulado_av1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Objetos da classe Exemplar;
        Exemplar E1 = new Exemplar();
        Exemplar E2 = new Exemplar();
        Exemplar E3 = new Exemplar();
//        Objetos da classe Cliente;
        Cliente C1 = new Cliente();
        Cliente C2 = new Cliente();
//        Objetos da classe Emprestimo;
        Emprestimo e1 = new Emprestimo();
        
        E1.setAutor("Autor_1");
        E1.setEditora("Editora_1");
        E1.setTitulo("Titulo_1");
        E1.setDisponibilidade(true);
        
        E2.setAutor("Autor_2");
        E2.setEditora("Editora_2");
        E2.setTitulo("Titulo_2");
        E2.setDisponibilidade(true);
        
        E3.setAutor("Autor_3");
        E3.setEditora("Editora_3");
        E3.setTitulo("Titulo_3");
        E3.setDisponibilidade(true);
        
        C1.setNome("Nome_1");
        C1.setIdade(1);
        C1.setCpf("Cpf_1");
        C1.setDesconto(true);
        
        C2.setNome("Nome_2");
        C2.setIdade(2);
        C2.setCpf("Cpf_2");
        C2.setDesconto(true);
        
        e1.setDiasEmprestimo(5);
        e1.setClienteEmprestimo(C1);
        e1.setExemplarEmprestimo(E1);
        
        E1.Exemplar();
        C1.consultaCliente();
        e1.valorEmprestimo();
        e1.consultaEmprestimo();
        
         
        
        
        
    }
    
}
