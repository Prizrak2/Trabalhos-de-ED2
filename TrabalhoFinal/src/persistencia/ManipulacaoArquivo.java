/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import classes.Aluno;
import classes.Curso;
import classes.Enfase;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author puc
 */
public class ManipulacaoArquivo {
    
    public ManipulacaoArquivo() {
    }
    
    public Map<String, Aluno> getDadosAlunos() throws Exception{
        try{
            Map<String, Aluno> arvoreAluno = new TreeMap<>();
            BufferedReader arquivoAlunos = new BufferedReader(new FileReader("./src/arquivos/DadosDosAlunos.csv"));
            Map<Integer, Enfase> arvoreAuxiliarEnfase = getDadosEnfase();
            Map<Integer, Curso> arvoreAuxiliarCurso = getDadosCurso();
            String linha;
            while((linha = arquivoAlunos.readLine()) != null){

                if(linha.codePointAt(0) == 65279){ //Ignora o caractere BOM(Byte Order Mark) caso ele esteja 
                    //no inicio da linha
                    linha = linha.substring(1);
                }

                String[] camposDaLinha = linha.split(";");
                Enfase enfaseAux = arvoreAuxiliarEnfase.get(Integer.valueOf(camposDaLinha[4]));
                Curso cursoAux = arvoreAuxiliarCurso.get(Integer.valueOf(camposDaLinha[5]));
                Aluno alunoAux = new Aluno(camposDaLinha[0], camposDaLinha[1], 
                        camposDaLinha[2], Integer.parseInt(camposDaLinha[3]), 
                        enfaseAux, cursoAux);
                arvoreAluno.put(camposDaLinha[0], alunoAux);
            }
            arquivoAlunos.close();
            return arvoreAluno;
        }catch(IOException | NumberFormatException erro){
            throw erro;
        }
    }
    
    public Map<Integer, Enfase> getDadosEnfase() throws Exception{
        try{
            Map<Integer, Enfase> arvoreEnfase = new TreeMap<>();
            BufferedReader arquivoEnfases = new BufferedReader(new FileReader("./src/arquivos/Enfase.csv"));
            String linha;
            while((linha = arquivoEnfases.readLine()) != null){

                if(linha.codePointAt(0) == 65279){ //Ignora o caractere BOM(Byte Order Mark) caso ele esteja 
                    //no inicio da linha
                    linha = linha.substring(1);
                }

                String[] camposDaLinha = linha.split(";");
                Enfase novaEnfase = new Enfase(Integer.parseInt(camposDaLinha[0]), camposDaLinha[1]);
                arvoreEnfase.put(Integer.valueOf(camposDaLinha[0]), novaEnfase);
            }
            arquivoEnfases.close();
            return arvoreEnfase;
        }catch(IOException | NumberFormatException erro){
            throw erro;
        }
    }
    
    public Map<Integer, Curso> getDadosCurso() throws Exception{
        try{
            Map<Integer, Curso> arvoreCurso = new TreeMap<>();
            BufferedReader arquivoCursos = new BufferedReader(new FileReader("./src/arquivos/Cursos.csv"));
            String linha;
            while((linha = arquivoCursos.readLine()) != null){

                if(linha.codePointAt(0) == 65279){ //Ignora o caractere BOM(Byte Order Mark) caso ele esteja 
                    //no inicio da linha
                    linha = linha.substring(1);
                }

                String[] camposDaLinha = linha.split(";");
                Curso novoCurso = new Curso(Integer.parseInt(camposDaLinha[0]), camposDaLinha[1]);
                arvoreCurso.put(Integer.valueOf(camposDaLinha[0]), novoCurso);
            }
            arquivoCursos.close();
            return arvoreCurso;
        }catch(IOException | NumberFormatException erro){
            throw erro;
        }
    }
    
    public void atualizarBancoDeDados(Map<String, Aluno> arvoreAluno, Map<Integer, 
            Enfase> arvoreEnfase, Map<Integer, Curso> arvoreCurso) throws Exception{
        
        try{
            BufferedWriter arquivoAlunos = new BufferedWriter(new FileWriter("./src/arquivos/DadosDosAlunos.csv", false));
            BufferedWriter arquivoEnfases = new BufferedWriter(new FileWriter("./src/arquivos/Enfase.csv", false));
            BufferedWriter arquivoCursos = new BufferedWriter(new FileWriter("./src/arquivos/Cursos.csv", false));

            Iterator<Aluno> iteradorDeAlunos = arvoreAluno.values().iterator();
            while(iteradorDeAlunos.hasNext()){
                arquivoAlunos.write(iteradorDeAlunos.next().toString());
                arquivoAlunos.flush();
            }
            arquivoAlunos.close();

            Iterator<Enfase> iteradorDeEnfases = arvoreEnfase.values().iterator();
            while(iteradorDeEnfases.hasNext()){
                arquivoEnfases.write(iteradorDeEnfases.next().toString());
                arquivoEnfases.flush();
            }
            arquivoEnfases.close();

            Iterator<Curso> iteradorDeCursos = arvoreCurso.values().iterator();
            while(iteradorDeCursos.hasNext()){
                arquivoCursos.write(iteradorDeCursos.next().toString());
                arquivoCursos.flush();
            }
            arquivoCursos.close();
        }catch(IOException | NumberFormatException erro){
            throw erro;
        }
    }
    
}
