/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import classes.enums.TurnoEnum;

/**
 *
 * @author puc
 */
public class Aluno {
    private String matricula = "";
    private String nome = "";
    private TurnoEnum turno = null;
    private int periodo = 0;
    private Enfase enfase = null;
    private Curso curso = null;

    public Aluno(String matricula, String nome, String turno, int periodo, Enfase enfase, Curso curso) {
        this.matricula = matricula;
        this.nome = nome;
        this.turno = TurnoEnum.converterDescricao(turno);
        this.periodo = periodo;
        this.enfase = enfase;
        this.curso = curso;
    }

    public Aluno() {
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
        return turno.getDescricao();
    }

    public void setTurno(String turno) {
        this.turno = TurnoEnum.converterDescricao(turno);
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public Enfase getEnfase() {
        return enfase;
    }

    public void setEnfase(Enfase enfase) {
        this.enfase = enfase;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return matricula + ";" + nome + ";" + turno + ";" + periodo + ";" + enfase.getIdEnfase() + ";" + curso.getIdCurso() + "\n";
    }
    
    
    
}
