package com.example.model;

public class Produto {
    private int id;
    private String nome;
    private String categoria;
    private int qtdeMinima;
    private int qtdeEstoque;
    private String unidadeMedida;
    public Produto() {
    }
    public Produto(int id, String nome, String categoria, int qtdeMinima, int qtdeEstoque, String unidadeMedida) {
        this.id = id;
        this.nome = nome;
        this.categoria = categoria;
        this.qtdeMinima = qtdeMinima;
        this.qtdeEstoque = qtdeEstoque;
        this.unidadeMedida = unidadeMedida;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public int getQtdeMinima() {
        return qtdeMinima;
    }
    public void setQtdeMinima(int qtdeMinima) {
        this.qtdeMinima = qtdeMinima;
    }
    public int getQtdeEstoque() {
        return qtdeEstoque;
    }
    public void setQtdeEstoque(int qtdeEstoque) {
        this.qtdeEstoque = qtdeEstoque;
    }
    public String getUnidadeMedida() {
        return unidadeMedida;
    }
    public void setUnidadeMedida(String unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Produto other = (Produto) obj;
        if (id != other.id)
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "Produto [id=" + id + ", nome=" + nome + ", categoria=" + categoria + ", qtdeMinima=" + qtdeMinima
                + ", qtdeEstoque=" + qtdeEstoque + ", unidadeMedida=" + unidadeMedida + "]";
    }

    
}
