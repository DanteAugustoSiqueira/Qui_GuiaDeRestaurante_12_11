
package br.com.guiaderestaurante.model;

public enum MeioPagamento {
    DEBITO("Debito"),
    CREDITO("Credito"),
    PIX("Pix"),
    VOUCHER("Voucher"),
    DINHEIRO("Dinheiro");

    public String descricao;

    MeioPagamento(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "MeioPagamento{" +
                "descricao='" + descricao + '\'' +
                '}';
    }
}
