/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

/**
 *
 * @author puc
 */
public interface iArvoreBinaria {
    public void adicionar(int valor) throws Exception;
    public String preFixadoEsquerda();
    public String preFixadoDireita();
    public String centralEsquerda();
    public String centralDireita();
    public String posFixadoEsquerda();
    public String posFixadoDireita();
    public int tamanhoArvore();
}
