
package br.com.guiaderestaurante.model;

public enum Nota {
    UMA_ESTRELA("Pessimo", 1),
    DUAS_ESTRELAS("Ruim", 2),
    TRES_ESTRELAS("Bom", 3),
    QUATRO_ESTRELAS("Excelente", 4),
    CINCO_ESTRELAS("Perfeito", 5);

    public String texto;
    public int valor;

    Nota(String texto, int valor){
        this.texto = texto;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Nota{" +
                "texto='" + texto + '\'' +
                ", valor=" + valor +
                '}';
    }
}
