/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jsn.entidade;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
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
@Table(name = "item")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Item.findAll", query = "SELECT i FROM Item i")
    , @NamedQuery(name = "Item.findByItemId", query = "SELECT i FROM Item i WHERE i.itemId = :itemId")
    , @NamedQuery(name = "Item.findByItemNome", query = "SELECT i FROM Item i WHERE i.itemNome = :itemNome")
    , @NamedQuery(name = "Item.findByItemTipo", query = "SELECT i FROM Item i WHERE i.itemTipo = :itemTipo")
    , @NamedQuery(name = "Item.findByItemValor", query = "SELECT i FROM Item i WHERE i.itemValor = :itemValor")
    , @NamedQuery(name = "Item.findByItemDesconto", query = "SELECT i FROM Item i WHERE i.itemDesconto = :itemDesconto")
    , @NamedQuery(name = "Item.findByItemTarifa", query = "SELECT i FROM Item i WHERE i.itemTarifa = :itemTarifa")
    , @NamedQuery(name = "Item.findByItemCategoria", query = "SELECT i FROM Item i WHERE i.itemCategoria = :itemCategoria")
    , @NamedQuery(name = "Item.findByItemQuantidade", query = "SELECT i FROM Item i WHERE i.itemQuantidade = :itemQuantidade")})
public class Item implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "item_id")
    private Integer itemId;
    @Size(max = 45)
    @Column(name = "item_nome")
    private String itemNome;
    @Size(max = 45)
    @Column(name = "item_tipo")
    private String itemTipo;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "item_valor")
    private Double itemValor;
    @Column(name = "item_desconto")
    private Double itemDesconto;
    @Column(name = "item_tarifa")
    private Double itemTarifa;
    @Lob
    @Size(max = 65535)
    @Column(name = "item_imagem")
    private String itemImagem;
    @Size(max = 45)
    @Column(name = "item_categoria")
    private String itemCategoria;
    @Size(max = 45)
    @Column(name = "item_quantidade")
    private String itemQuantidade;
    @OneToMany(mappedBy = "itemItemId")
    private List<ItemProduto> itemProdutoList;

    public Item() {
    }

    public Item(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public String getItemNome() {
        return itemNome;
    }

    public void setItemNome(String itemNome) {
        this.itemNome = itemNome;
    }

    public String getItemTipo() {
        return itemTipo;
    }

    public void setItemTipo(String itemTipo) {
        this.itemTipo = itemTipo;
    }

    public Double getItemValor() {
        return itemValor;
    }

    public void setItemValor(Double itemValor) {
        this.itemValor = itemValor;
    }

    public Double getItemDesconto() {
        return itemDesconto;
    }

    public void setItemDesconto(Double itemDesconto) {
        this.itemDesconto = itemDesconto;
    }

    public Double getItemTarifa() {
        return itemTarifa;
    }

    public void setItemTarifa(Double itemTarifa) {
        this.itemTarifa = itemTarifa;
    }

    public String getItemImagem() {
        return itemImagem;
    }

    public void setItemImagem(String itemImagem) {
        this.itemImagem = itemImagem;
    }

    public String getItemCategoria() {
        return itemCategoria;
    }

    public void setItemCategoria(String itemCategoria) {
        this.itemCategoria = itemCategoria;
    }

    public String getItemQuantidade() {
        return itemQuantidade;
    }

    public void setItemQuantidade(String itemQuantidade) {
        this.itemQuantidade = itemQuantidade;
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
        hash += (itemId != null ? itemId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Item)) {
            return false;
        }
        Item other = (Item) object;
        if ((this.itemId == null && other.itemId != null) || (this.itemId != null && !this.itemId.equals(other.itemId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jsn.entidade.Item[ itemId=" + itemId + " ]";
    }
    
}
