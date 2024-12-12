/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos.classes;

import java.util.Comparator;
import modelos.classes.Professor;

/**
 *
 * @author Cliente
 */
public class Comparator_Nome implements Comparator<Professor>{

    @Override
    public int compare(Professor p1, Professor p2) {
        return p1.getNome().compareToIgnoreCase(p2.getNome());
    }
    
}
