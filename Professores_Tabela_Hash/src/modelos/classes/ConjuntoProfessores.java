/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos.classes;
import modelos.interfaces.ICrud;
import java.util.LinkedList;

/**
 *
 * @author puc
 */
public class ConjuntoProfessores implements ICrud{
    //Atributos
    private int tamanho = 0;
    private LinkedList<Professor> array[] = null;
    private int numeroDeColisoes = -1;
    //Metodos

    public ConjuntoProfessores(int tamanho, int numeroDeColisoes)throws Exception {
      if(tamanho <= 0) throw new Exception("Tamanho não pode ser <= 0 ");
      this.tamanho = tamanho;
      if(numeroDeColisoes <= 0) throw new Exception("Número de colisões não pode ser <= 0 ");
      this.numeroDeColisoes = numeroDeColisoes;
      array = new LinkedList[calcularTamanhoTabelaHash()];
    }

    public int getTamanho() {
      return tamanho;
    }

    public int getNumeroDeColisoes() {
        return numeroDeColisoes;
    }
    
    public boolean verificarEstaVAzio(int pos){
        return (array[pos] == null);
    }
    
    public boolean ePrimo(int numero) {
        if (numero < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public int calcularTamanhoTabelaHash(){
        int tamanhoTabelaHash = (int) (tamanho/numeroDeColisoes);
        
        while(!ePrimo(tamanhoTabelaHash)){
            tamanhoTabelaHash++;
        }
        
        return tamanhoTabelaHash;
    }
    
    public int calcularHash(int matricula){
        return matricula%calcularTamanhoTabelaHash();
    }

    @Override
    public void incluir(Professor professor) throws Exception {
        int hash = calcularHash(professor.getMatricula());
        
        if(verificarEstaVAzio(hash)){
            array[hash] = new LinkedList<>();
        }
        
        if(!array[hash].contains(professor)){
            array[hash].addFirst(professor);
        }else{
            throw new Exception("Elemento já existente");
        }
    }

    @Override
    public void excluir(int matricula) throws Exception {
        int hash = calcularHash(matricula);
        boolean removido = array[hash].removeIf(professor -> professor.getMatricula() == matricula);
        if(!removido) throw new Exception("O Elemento não existe");
    }

    @Override
    public void alterar(Professor objeto) throws Exception {
        int hash = calcularHash(objeto.getMatricula());
        int index = array[hash].indexOf(objeto);
        if(index == -1) throw new Exception("Elemento não existe");
        array[hash].set(index, objeto);
    }

    @Override
    public LinkedList<Professor>[] listagemDeProfessores() throws Exception {
        return array.clone();
    }
}
