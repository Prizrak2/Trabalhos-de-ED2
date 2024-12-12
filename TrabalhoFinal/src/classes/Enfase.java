/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author misuka
 */
public class Enfase {
    
    private int idEnfase = 0;
    private String descricao = "";

    public Enfase() {
    }
    
    public Enfase(int idCurso, String descricao) {
        this.idEnfase = idCurso;
        this.descricao = descricao;
    }

    public int getIdEnfase() {
        return idEnfase;
    }

    public void setIdEnfase(int idEnfase) {
        this.idEnfase = idEnfase;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return idEnfase + ";" + descricao + '\n';
    }
    
    public String viewAsString(){
        return idEnfase + " - " + descricao;
    }
    
}
