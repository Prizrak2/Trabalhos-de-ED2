/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos.classes;

/**
 *
 * @author puc
 */
public class Professor {
    private int matricula = 0;
    private String nome = "";
    private String escola = "";
    private String titulacao = "";
    private String tipoContrato = "";
    
    public Professor(int matricula, String nome, String escola, String titulacao, String tipoContrato){
        this.matricula = matricula;
        this.nome = nome;
        this.escola = escola;
        this.titulacao = titulacao;
        this.tipoContrato = tipoContrato;
    }
    
    public Professor(){
        
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEscola() {
        return escola;
    }

    public void setEscola(String escola) {
        this.escola = escola;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public String getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    @Override
    public String toString() {
        return "Professor{" + "matricula=" + matricula + ", nome=" + nome + ", escola=" + escola + ", titulacao=" + titulacao + ", tipoContrato=" + tipoContrato + '}';
    }
    
    
}
