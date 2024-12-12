/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos.classes;

/**
 *
 * @author lusra
 */
public class No {
    private int valor;
    private No esquerda;
    private No direita;
    private Aluno aluno = null;

    public No(int valor) {
        this.valor = valor;
        esquerda = null;
        direita = null;
    }
    
    public No(Aluno aluno) {
        this.aluno = new Aluno(
            aluno.getMatricula(),
            aluno.getNome(),
            aluno.getTurno(),
            aluno.getPeriodo(),
            aluno.getEnfase(),
            aluno.getCurso()
        );
        esquerda = null;
        direita = null;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public No getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(No esquerda) {
        this.esquerda = esquerda;
    }

    public No getDireita() {
        return direita;
    }

    public void setDireita(No direita) {
        this.direita = direita;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
    
    
}
