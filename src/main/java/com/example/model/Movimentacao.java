package com.example.model;

import java.time.LocalDate;

public class Movimentacao {
    private int id;
    private String tipoMovimentacao;
    private int qtde;
    private LocalDate data;
    private String fornecedor;
    private String produto;
    public Movimentacao() {
    }
    public Movimentacao(int id, String tipoMovimentacao, int qtde, LocalDate data, String fornecedor, String produto) {
        this.id = id;
        this.tipoMovimentacao = tipoMovimentacao;
        this.qtde = qtde;
        this.data = data;
        this.fornecedor = fornecedor;
        this.produto = produto;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTipoMovimentacao() {
        return tipoMovimentacao;
    }
    public void setTipoMovimentacao(String tipoMovimentacao) {
        this.tipoMovimentacao = tipoMovimentacao;
    }
    public int getQtde() {
        return qtde;
    }
    public void setQtde(int qtde) {
        this.qtde = qtde;
    }
    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }
    public String getFornecedor() {
        return fornecedor;
    }
    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }
    public String getProduto() {
        return produto;
    }
    public void setProduto(String produto) {
        this.produto = produto;
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
        Movimentacao other = (Movimentacao) obj;
        if (id != other.id)
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "Movimentacao [id=" + id + ", tipoMovimentacao=" + tipoMovimentacao + ", qtde=" + qtde + ", data=" + data
                + ", fornecedor=" + fornecedor + ", produto=" + produto + "]";
    }
       
    

}
