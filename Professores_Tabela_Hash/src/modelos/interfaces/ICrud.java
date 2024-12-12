/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package modelos.interfaces;

import java.io.File;
import java.util.LinkedList;
import java.util.List;
import modelos.classes.Professor;

/**
 *
 * @author puc
 */
public interface ICrud {
    void incluir(Professor objeto) throws Exception;
    void excluir(int matricula) throws Exception;
    void alterar(Professor objeto) throws Exception;
    List<Professor>[] listagemDeProfessores() throws Exception;
}
