/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos.classes;

/**
 *
 * @author lusra
 */
public class Aluno {
    private String matricula = "";
    private String nome = "";
    private String turno = "";
    private String periodo = "";
    private String enfase = "";
    private String curso = "";
    
    public Aluno (String matricula, String nome, String turno, String periodo, String enfase, String curso){
        this.matricula = matricula;
        this.nome = nome;
        this.turno = turno;
        this.periodo = periodo;
        this.enfase = enfase;
        this.curso = curso;
    }
    
    public Aluno (){
        
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getEnfase() {
        return enfase;
    }

    public void setEnfase(String enfase) {
        this.enfase = enfase;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Aluno{" + "matricula=" + matricula + ", nome=" + nome + ", turno=" + turno + ", periodo=" + periodo + ", enfase=" + enfase + ", curso=" + curso + '}';
    }
    
    
}
