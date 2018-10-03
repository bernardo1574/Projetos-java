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
public class Emprestimo {
    private int diasEmprestimo;
    private Cliente clienteEmprestimo;
    private Exemplar exemplarEmprestimo;
    
    public int getDiasEmprestimo(){
    return diasEmprestimo;
    }
    public void setDiasEmprestimo(int diasEmprestimo){
        this.diasEmprestimo = diasEmprestimo;
    }
    public Cliente getClienteEmprestimo(){
        return clienteEmprestimo;
    }
    public void setClienteEmprestimo(Cliente clienteEmprestimo){
        this.clienteEmprestimo = clienteEmprestimo;
    }
    public Exemplar getExemplarEmprestimo(){
        return this.exemplarEmprestimo;
    }
    public void setExemplarEmprestimo(Exemplar exemplarEmprestimo){
        this.exemplarEmprestimo = exemplarEmprestimo;
    }
   
    public void consultaEmprestimo(){
        System.out.println("Dias de empréstimo: "+this.getDiasEmprestimo());
        System.out.println("Cliente do empréstimo: "+this.getClienteEmprestimo().getNome());
        System.out.println("Exemplar Emprestado: "+this.exemplarEmprestimo.getTitulo());
    }
    public float valorEmprestimo(){
        float valor;
        valor = diasEmprestimo * 5; 
        System.out.println("Valor do Emprestimo: R$:"+valor);
        return valor;
    }

}
