/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import modelos.classes.Professor;

/**
 *
 * @author puc
 */
public class ManipulacaoArq {
    private String nomeDoArquivo = "";
    
    public ManipulacaoArq(String nomeDoArquivo){
        this.nomeDoArquivo = nomeDoArquivo;
    }
    
    public Map<Integer, Professor> obterListaProfessores() throws Exception{
        try{
            FileReader fr = new FileReader(nomeDoArquivo);
            BufferedReader br = new BufferedReader(fr);
            String linha = "";
            Map<Integer, Professor> professores = new TreeMap<>();
            while((linha = br.readLine()) != null){
                String vetorStr[] = linha.split(";");
                Professor objProfessor = new Professor(Integer.parseInt(vetorStr[0]),
                          vetorStr[1],vetorStr[2],vetorStr[3],vetorStr[4]);
                professores.put(objProfessor.getMatricula(), objProfessor);
            }
            br.close();
            return professores;
            
        } catch(Exception erro){
            throw erro;
        }
    }
}
