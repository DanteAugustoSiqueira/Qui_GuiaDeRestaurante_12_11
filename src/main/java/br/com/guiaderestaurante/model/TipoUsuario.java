
package br.com.guiaderestaurante.model;

public enum TipoUsuario {
    ADMIN("Administrador"),
    CLIENTE("Cliente"),
    PROPRIETARIO("Proprietario");

    public String descricao;

    TipoUsuario(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "TipoUsuario{" +
                "descricao='" + descricao + '\'' +
                '}';
    }
}
