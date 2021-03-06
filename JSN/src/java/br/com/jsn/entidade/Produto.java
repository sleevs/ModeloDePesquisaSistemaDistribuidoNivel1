/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jsn.entidade;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author ADMINIBM
 */
@Entity
@Table(name = "produto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Produto.findAll", query = "SELECT p FROM Produto p")
    , @NamedQuery(name = "Produto.findByProdutoId", query = "SELECT p FROM Produto p WHERE p.produtoId = :produtoId")
    , @NamedQuery(name = "Produto.findByProdutoNome", query = "SELECT p FROM Produto p WHERE p.produtoNome = :produtoNome")
    , @NamedQuery(name = "Produto.findByProdutoTipo", query = "SELECT p FROM Produto p WHERE p.produtoTipo = :produtoTipo")
    , @NamedQuery(name = "Produto.findByProdutoCategoria", query = "SELECT p FROM Produto p WHERE p.produtoCategoria = :produtoCategoria")
    , @NamedQuery(name = "Produto.findByProdutoValor", query = "SELECT p FROM Produto p WHERE p.produtoValor = :produtoValor")
    , @NamedQuery(name = "Produto.findByProdutoDescricao", query = "SELECT p FROM Produto p WHERE p.produtoDescricao = :produtoDescricao")
    , @NamedQuery(name = "Produto.findByProdutoSerie", query = "SELECT p FROM Produto p WHERE p.produtoSerie = :produtoSerie")
    , @NamedQuery(name = "Produto.findByProdutoDesconto", query = "SELECT p FROM Produto p WHERE p.produtoDesconto = :produtoDesconto")})
public class Produto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "produto_id")
    private Integer produtoId;
    @Size(max = 45)
    @Column(name = "produto_nome")
    private String produtoNome;
    @Size(max = 45)
    @Column(name = "produto_tipo")
    private String produtoTipo;
    @Size(max = 45)
    @Column(name = "produto_categoria")
    private String produtoCategoria;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "produto_valor")
    private Double produtoValor;
    @Size(max = 255)
    @Column(name = "produto_descricao")
    private String produtoDescricao;
    @Size(max = 45)
    @Column(name = "produto_serie")
    private String produtoSerie;
    @Lob
    @Size(max = 65535)
    @Column(name = "produto_imagem")
    private String produtoImagem;
    @Column(name = "produto_desconto")
    private Double produtoDesconto;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "produtoProdutoId")
    private List<ItemProduto> itemProdutoList;

    public Produto() {
    }

    public Produto(Integer produtoId) {
        this.produtoId = produtoId;
    }

    public Integer getProdutoId() {
        return produtoId;
    }

    public void setProdutoId(Integer produtoId) {
        this.produtoId = produtoId;
    }

    public String getProdutoNome() {
        return produtoNome;
    }

    public void setProdutoNome(String produtoNome) {
        this.produtoNome = produtoNome;
    }

    public String getProdutoTipo() {
        return produtoTipo;
    }

    public void setProdutoTipo(String produtoTipo) {
        this.produtoTipo = produtoTipo;
    }

    public String getProdutoCategoria() {
        return produtoCategoria;
    }

    public void setProdutoCategoria(String produtoCategoria) {
        this.produtoCategoria = produtoCategoria;
    }

    public Double getProdutoValor() {
        return produtoValor;
    }

    public void setProdutoValor(Double produtoValor) {
        this.produtoValor = produtoValor;
    }

    public String getProdutoDescricao() {
        return produtoDescricao;
    }

    public void setProdutoDescricao(String produtoDescricao) {
        this.produtoDescricao = produtoDescricao;
    }

    public String getProdutoSerie() {
        return produtoSerie;
    }

    public void setProdutoSerie(String produtoSerie) {
        this.produtoSerie = produtoSerie;
    }

    public String getProdutoImagem() {
        return produtoImagem;
    }

    public void setProdutoImagem(String produtoImagem) {
        this.produtoImagem = produtoImagem;
    }

    public Double getProdutoDesconto() {
        return produtoDesconto;
    }

    public void setProdutoDesconto(Double produtoDesconto) {
        this.produtoDesconto = produtoDesconto;
    }

    @XmlTransient
    public List<ItemProduto> getItemProdutoList() {
        return itemProdutoList;
    }

    public void setItemProdutoList(List<ItemProduto> itemProdutoList) {
        this.itemProdutoList = itemProdutoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (produtoId != null ? produtoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Produto)) {
            return false;
        }
        Produto other = (Produto) object;
        if ((this.produtoId == null && other.produtoId != null) || (this.produtoId != null && !this.produtoId.equals(other.produtoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jsn.entidade.Produto[ produtoId=" + produtoId + " ]";
    }
    
}
