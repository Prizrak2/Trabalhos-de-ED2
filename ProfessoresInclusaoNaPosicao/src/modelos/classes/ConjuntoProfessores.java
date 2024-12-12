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
    public boolean verificarEstaVAzio(int pos){
        return (array[pos] == null);
    }

    @Override
    public void incluir(Professor professor) throws Exception {
        
        if (!verificarEstaVAzio(professor.getMatricula())){
            throw new Exception("Elemento já existente");
        }

        array[professor.getMatricula()] = professor;
    }

    @Override
    public void excluir(int matricula) throws Exception {
        if (verificarEstaVAzio(matricula)){
            throw new Exception("Elemento não existente");
        }
        array[matricula] = null;
    }

    @Override
    public void alterar(Professor objeto) throws Exception {
        if(verificarEstaVAzio(objeto.getMatricula())) throw new Exception("Elemento não existente");
        array[objeto.getMatricula()] = objeto;
    }

    @Override
    public Professor[] listagemDeProfessores() throws Exception {
        return array.clone();
    }
}
