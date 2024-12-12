/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author misuka
 */
public class Curso {
    
    private int idCurso = 0;
    private String descricao = "";

    public Curso() {
    }
    
    public Curso(int idCurso, String descricao) {
        this.idCurso = idCurso;
        this.descricao = descricao;
    }

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return idCurso + ";" + descricao + '\n';
    }
    
    public String viewAsString(){
        return idCurso + " - " + descricao;
    }
    
}
