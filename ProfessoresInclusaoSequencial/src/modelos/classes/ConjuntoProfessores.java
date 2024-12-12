/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos.classes;
import modelos.interfaces.ICrud;

/**
 *
 * @author puc
 */
public class ConjuntoProfessores implements ICrud{
    //Atributos
    private int tamanho = 0;
    private int indiceOcupacao = -1;
    private Professor array[] = null;
    //Metodos

    public ConjuntoProfessores(int tamanho)throws Exception {
      if(tamanho <= 0) throw new Exception("Tamanho não pode ser <= 0 ");
      this.tamanho = tamanho;
      array = new Professor[tamanho];
    }

    public int getTamanho() {
      return tamanho;
    }
    public int getIndiceOcupacao() {
      return indiceOcupacao;
    }
    public boolean verificarEstaCheio(){
      return (tamanho-1 == indiceOcupacao);
    }
    
    private int buscaSequencial(int matricula) {
        for (int pos = 0; pos <= indiceOcupacao; pos++) {
            if (matricula == array[pos].getMatricula()) {
                return pos;
            }
        }
        return -1;
    }

    @Override
    public void incluir(Professor professor) throws Exception {
        if (verificarEstaCheio()) {
            throw new Exception("Conjunto está cheio");
        }

        if (buscaSequencial(professor.getMatricula()) != -1){
            throw new Exception("Elemento já existente");
        }

        indiceOcupacao++;
        array[indiceOcupacao] = professor;
    }

    @Override
    public void excluir(int matricula) throws Exception {
        int pos = buscaSequencial(matricula);
        if (pos == -1){
            throw new Exception("Elemento não existente");
        }
        
        array[pos] = array[indiceOcupacao];
        indiceOcupacao--;
    }

    @Override
    public void alterar(Professor objeto) throws Exception {
        int index = buscaSequencial(objeto.getMatricula());
        if(index == -1) throw new Exception("Elemento não existente");
        array[index] = objeto;
    }

    @Override
    public Professor[] listagemDeProfessores() throws Exception {
        return array.clone();
    }
}
