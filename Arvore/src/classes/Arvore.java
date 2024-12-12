/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;
import interfaces.iArvoreBinaria;

/**
 *
 * @author lusra
 */
public class Arvore implements iArvoreBinaria{
    private No raiz;
    private int numeroElementos;

    public Arvore() {
        raiz = null;
        numeroElementos = 0;
    }

    public void adicionar(int valor) throws Exception{
        raiz = adicionarRecursivo(raiz, valor);
        numeroElementos++;
    }

    private No adicionarRecursivo(No atual, int valor) throws Exception{
        if (atual == null) {
            return new No(valor);
        }

        if (valor < atual.getValor()) {
            atual.setEsquerda(adicionarRecursivo(atual.getEsquerda(), valor));
        } else if (valor > atual.getValor()) {
            atual.setDireita(adicionarRecursivo(atual.getDireita(), valor));
        } else {
            throw new Exception("Elemento não pode ser repetido");
        }

        return atual;
    }

    // Pré-fixado à esquerda
    public String preFixadoEsquerda() {
        String saida = "";
        saida = preFixadoEsquerda(raiz, saida);
        return saida;
    }

    private String preFixadoEsquerda(No no, String saida) {
        if (no != null) {
            saida += no.getValor() + " ";
            saida = preFixadoEsquerda(no.getEsquerda(), saida);
            saida = preFixadoEsquerda(no.getDireita(), saida);
        }
        return saida;
    }

    // Central à esquerda
    public String centralEsquerda() {
        String saida = "";
        saida = centralEsquerda(raiz, saida);
        return saida;
    }

    private String centralEsquerda(No no, String saida) {
        if (no != null) {
            saida = centralEsquerda(no.getEsquerda(), saida);
            saida += no.getValor() + " ";
            saida = centralEsquerda(no.getDireita(), saida);
        }
        return saida;
    }

    // Pós-fixado à esquerda
    public String posFixadoEsquerda() {
        String saida = "";
        saida = posFixadoEsquerda(raiz, saida);
        return saida;
    }

    private String posFixadoEsquerda(No no, String saida) {
        if (no != null) {
            saida = posFixadoEsquerda(no.getEsquerda(), saida);
            saida = posFixadoEsquerda(no.getDireita(), saida);
            saida += no.getValor() + " ";
        }
        return saida;
    }

    // Pré-fixado à direita
    public String preFixadoDireita() {
        String saida = "";
        saida = preFixadoDireita(raiz, saida);
        return saida;
    }

    private String preFixadoDireita(No no, String saida) {
        if (no != null) {
            saida += no.getValor() + " ";
            saida = preFixadoDireita(no.getDireita(), saida);
            saida = preFixadoDireita(no.getEsquerda(), saida);
        }
        return saida;
    }

    // Central à direita
    public String centralDireita() {
        String saida = "";
        saida = centralDireita(raiz, saida);
        return saida;
    }

    private String centralDireita(No no, String saida) {
        if (no != null) {
            saida = centralDireita(no.getDireita(), saida);
            saida += no.getValor() + " ";
            saida = centralDireita(no.getEsquerda(), saida);
        }
        return saida;
    }

    // Pós-fixado à direita
    public String posFixadoDireita() {
        String saida = "";
        saida = posFixadoDireita(raiz, saida);
        return saida;
    }

    private String posFixadoDireita(No no, String saida) {
        if (no != null) {
            saida = posFixadoDireita(no.getDireita(), saida);
            saida = posFixadoDireita(no.getEsquerda(), saida);
            saida += no.getValor() + " ";
        }
        return saida;
    }

    public int tamanhoArvore() {
        return numeroElementos;
    }
}
