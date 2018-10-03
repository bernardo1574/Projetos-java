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
public class Exemplar {
    private String titulo;
    private String autor;
    private String editora;
    private boolean disponibilidade;
    
    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public String getAutor(){
        return autor;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public String getEditora(){
        return editora;
    }
    public void setEditora(String editora){
        this.editora = editora;
    }
    public boolean getDisponiblidade(){
        return disponibilidade;
    }
    public void setDisponibilidade(boolean editora){
        this.disponibilidade = disponibilidade;
    }
    
    public void Exemplar(){
        System.out.println("Título: "+this.getTitulo());
        System.out.println("Autor: "+this.getAutor());
        System.out.println("Editora: "+this.getEditora());
        System.out.println("Disponibilidade: "+this.getDisponiblidade());
    }
}
