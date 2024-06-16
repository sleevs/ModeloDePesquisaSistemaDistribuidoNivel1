package br.com.jsn.sistemadistribuidonoa.dto;

public class ProductDto {
    

    private String nome;
    private String preco;
    private String tipo;
    private String categoria;

    public ProductDto(){}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "ProductDto [nome=" + nome + ", preco=" + preco + ", tipo=" + tipo + ", categoria=" + categoria
                + ", getNome()=" + getNome() + ", getPreco()=" + getPreco() + ", getTipo()=" + getTipo()
                + ", getCategoria()=" + getCategoria() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
                + ", toString()=" + super.toString() + "]";
    }

    
    
}
