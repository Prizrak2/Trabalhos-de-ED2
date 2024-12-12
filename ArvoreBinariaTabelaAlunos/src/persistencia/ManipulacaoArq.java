/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.List;
import modelos.classes.Aluno;

/**
 *
 * @author puc
 */
public class ManipulacaoArq {
    private String nomeDoArquivo = "";
    
    public ManipulacaoArq(String nomeDoArquivo){
        this.nomeDoArquivo = nomeDoArquivo;
    }
    
    public List<Aluno> obterListaAlunos() throws Exception{
        try{
            FileReader fr = new FileReader(nomeDoArquivo);
            BufferedReader br = new BufferedReader(fr);
            String linha = "";
            List<Aluno> alunos = new LinkedList<>();
            while((linha = br.readLine()) != null){
                String vetorStr[] = linha.split(";");
                Aluno objAluno = new Aluno((vetorStr[0]),
                          vetorStr[1],vetorStr[2],vetorStr[3],vetorStr[4], vetorStr[5]);
                alunos.addFirst(objAluno);
            }
            br.close();
            return alunos;
            
        } catch(Exception erro){
            throw erro;
        }
    }
}
