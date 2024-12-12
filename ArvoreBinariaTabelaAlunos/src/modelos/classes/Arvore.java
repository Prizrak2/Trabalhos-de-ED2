/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos.classes;
import java.util.LinkedList;
import java.util.List;
import modelos.interfaces.iArvoreBinaria;

/**
 *
 * @author lusra
 */
public class Arvore implements iArvoreBinaria{
    private No raiz;

    public Arvore() {
        raiz = null;
    }

    @Override
    public void adicionar(Aluno aluno, String ordem) throws Exception {
        switch (ordem) {
            case "crescente - nome":
                adicionarNomeCrescente(aluno);
                break;
            case "decrescente - nome":
                adicionarNomeDecrescente(aluno);
                break;
            case "crescente - matricula":
                adicionarMatriculaCrescente(aluno);
                break;
            case "decrescente - matricula":
                adicionarMatriculaDecrescente(aluno);
                break;
        }
    }
    
    public void adicionarNomeCrescente(Aluno aluno) throws Exception{
        raiz = adicionarNomeCrescenteRecursivo(raiz, aluno);
    }

    private No adicionarNomeCrescenteRecursivo(No atual, Aluno aluno) throws Exception{
        if (atual == null) {
            return new No(aluno);
        }

        if (aluno.getNome().trim().compareTo(atual.getAluno().getNome().trim()) < 0) {
            atual.setEsquerda(adicionarNomeCrescenteRecursivo(atual.getEsquerda(), aluno));
        } else {
            atual.setDireita(adicionarNomeCrescenteRecursivo(atual.getDireita(), aluno));
        }

        return atual;
    }

    public void adicionarNomeDecrescente(Aluno aluno) throws Exception {
        raiz = adicionarNomeDecrescenteRecursivo(raiz, aluno);
    }
    
    private No adicionarNomeDecrescenteRecursivo(No atual, Aluno aluno) throws Exception{
        if (atual == null) {
            return new No(aluno);
        }

        if (aluno.getNome().trim().compareTo(atual.getAluno().getNome().trim()) > 0) {
            atual.setEsquerda(adicionarNomeDecrescenteRecursivo(atual.getEsquerda(), aluno));
        } else {
            atual.setDireita(adicionarNomeDecrescenteRecursivo(atual.getDireita(), aluno));
        }

        return atual;
    }
    
    public List<Aluno> percorrerEmOrdem() {
        List<Aluno> alunos = new LinkedList<>();
        percorrerEmOrdemRecursivo(raiz, alunos);
        return alunos;
    }

    private void percorrerEmOrdemRecursivo(No atual, List<Aluno> alunos) {
        if (atual != null) {
            percorrerEmOrdemRecursivo(atual.getEsquerda(), alunos);
            alunos.add(atual.getAluno());
            percorrerEmOrdemRecursivo(atual.getDireita(), alunos);
        }
    }

    public void adicionarMatriculaCrescente(Aluno aluno) throws Exception {
        raiz = adicionarMatriculaCrescenteRecursivo(raiz, aluno);
    }
    
    private No adicionarMatriculaCrescenteRecursivo(No atual, Aluno aluno) throws Exception{
        if (atual == null) {
            return new No(aluno);
        }

        if (aluno.getMatricula().trim().compareTo(atual.getAluno().getMatricula().trim()) < 0) {
            atual.setEsquerda(adicionarMatriculaCrescenteRecursivo(atual.getEsquerda(), aluno));
        } else {
            atual.setDireita(adicionarMatriculaCrescenteRecursivo(atual.getDireita(), aluno));
        }

        return atual;
    }

    public void adicionarMatriculaDecrescente(Aluno aluno) throws Exception {
        raiz = adicionarMatriculaDecrescenteRecursivo(raiz, aluno);
    }
    
    private No adicionarMatriculaDecrescenteRecursivo(No atual, Aluno aluno) throws Exception{
        if (atual == null) {
            return new No(aluno);
        }

        if (aluno.getMatricula().trim().compareTo(atual.getAluno().getMatricula().trim()) > 0) {
            atual.setEsquerda(adicionarMatriculaDecrescenteRecursivo(atual.getEsquerda(), aluno));
        } else {
            atual.setDireita(adicionarMatriculaDecrescenteRecursivo(atual.getDireita(), aluno));
        }

        return atual;
    }
    
    public Aluno buscarNaArvore(String dado, String ordem) throws Exception {
        Aluno aluno = buscarNaArvoreRecursivo(raiz, dado, ordem);
        if (aluno == null) {
            throw new Exception("Aluno não encontrado");
        }
        return aluno;
    }

    private Aluno buscarNaArvoreRecursivo(No atual, String dado, String ordem) {
        if (atual == null) {
            return null;
        }

        String valorAtual = ordem.equals("MATRICULA") 
            ? atual.getAluno().getMatricula() 
            : atual.getAluno().getNome();
        System.out.println("Valor Inserido: '" + dado + "'");
        System.out.println("Valor a percorrer: '" + valorAtual + "'");

        if (dado.compareTo(valorAtual) == 0) {
            return atual.getAluno();
        }

        Aluno aluno = buscarNaArvoreRecursivo(atual.getEsquerda(), dado, ordem);
        if (aluno != null) {
            return aluno;
        }

        return buscarNaArvoreRecursivo(atual.getDireita(), dado, ordem);
    }

    Aluno minValue(No raiz) {
        No atual = raiz;
        while (atual.getEsquerda() != null) {
            atual = atual.getEsquerda();
        }
        return atual.getAluno();
    }

    @Override
    public void excluir(String valor, String ordem) throws Exception {
        raiz = excluirRec(raiz, valor, ordem);
    }

    private No excluirRec(No raiz, String valor, String ordem) {
        if (raiz == null) {
            return null;
        }

        String valorAtual = ordem.equals("MATRICULA") 
            ? raiz.getAluno().getMatricula() 
            : raiz.getAluno().getNome();
        
        valorAtual = valorAtual.trim();
        valor = valor.trim();
        
        System.out.println("Valor Inserido: '" + valor + "'");
        System.out.println("Valor a percorrer: '" + valorAtual + "'");
        
        if (valor.compareTo(valorAtual) < 0) {
            raiz.setEsquerda(excluirRec(raiz.getEsquerda(), valor, ordem));
        } else if (valor.compareTo(valorAtual) > 0) {
            raiz.setDireita(excluirRec(raiz.getDireita(), valor, ordem));
        } else {
            if (raiz.getEsquerda() == null) {
                return raiz.getDireita();
            } else if (raiz.getDireita() == null) {
                return raiz.getEsquerda();
            }

            raiz.setAluno(minValue(raiz.getDireita()));
            raiz.setDireita(excluirRec(raiz.getDireita(), 
                ordem.equals("MATRICULA") ? raiz.getAluno().getMatricula() : raiz.getAluno().getNome(), 
                ordem));
        }

        return raiz;
    }
}
