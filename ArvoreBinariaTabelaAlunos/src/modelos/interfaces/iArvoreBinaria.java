/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package modelos.interfaces;

import java.util.List;
import modelos.classes.Aluno;

/**
 *
 * @author puc
 */
public interface iArvoreBinaria {
    public void adicionar(Aluno aluno, String ordem) throws Exception;
    public Aluno buscarNaArvore(String matricula, String ordem) throws Exception;
    public List<Aluno> percorrerEmOrdem();

    public void excluir(String valor, String ordem) throws Exception;
    
}
