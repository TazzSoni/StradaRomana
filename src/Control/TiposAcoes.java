/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

/**
 *
 * @author guilh
 */
public enum TiposAcoes {
    
    MOVIMENTAR_WAGON("Movimentar wagon"),
    PEGAR_WAGON_TILE("Pegar wagon tile"),
    PASSAR_VEZ("Passar a vez");

    private String descricao;

    TiposAcoes(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
