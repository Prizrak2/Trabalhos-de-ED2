/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package classes.enums;

/**
 *
 * @author misuka
 */
public enum TurnoEnum {
    MATUTINO("MATUTINO"),
    VESPERTINO("VESPERTINO"),
    NOTURNO("NOTURNO");

    private String descricao;

    private TurnoEnum(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return descricao;
    }
    
    public static TurnoEnum converterDescricao(String descricao){
        for (TurnoEnum tipoDeCliente : TurnoEnum.values()) {
            if (tipoDeCliente.getDescricao().equalsIgnoreCase(descricao)) {
                return TurnoEnum.valueOf(tipoDeCliente.name()); // Retorna o valor do enum usando o nome
            }
        }
        throw new IllegalArgumentException("Nenhum turno foi encontrada para a descrição: " + descricao);
    }
}
