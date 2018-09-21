package javaapplication2;
/**
 *
 * @author Bernardo
 */
public class Cliente {
    private String dono;
    private String sobrenome;
    private String cpf;
    
    public String getDono(){
        return dono;
    }
    public void setDono(String dono){
        this.dono = dono;
    }
    public String getSobrenome (){
        return sobrenome;
    }
    public void setSobrenome (String sobrenome){
        this.sobrenome = sobrenome;
    }
    public String getCpf (){
        return cpf;
    }
    public void setCpf (String cpf){
        this.cpf = cpf;
    }
}
