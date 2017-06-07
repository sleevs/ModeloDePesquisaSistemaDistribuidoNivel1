/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jsn.entidade;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author ADMINIBM
 */
@Entity
@Table(name = "item_produto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ItemProduto.findAll", query = "SELECT i FROM ItemProduto i")
    , @NamedQuery(name = "ItemProduto.findByItemProdutoId", query = "SELECT i FROM ItemProduto i WHERE i.itemProdutoId = :itemProdutoId")
    , @NamedQuery(name = "ItemProduto.findByItemProdutoData", query = "SELECT i FROM ItemProduto i WHERE i.itemProdutoData = :itemProdutoData")})
public class ItemProduto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "item_produto_id")
    private Integer itemProdutoId;
    @Column(name = "item_produto_data")
    @Temporal(TemporalType.DATE)
    private Date itemProdutoData;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "itemProdutoItemProdutoId")
    private List<Compra> compraList;
    @JoinColumn(name = "item_item_id", referencedColumnName = "item_id")
    @ManyToOne
    private Item itemItemId;
    @JoinColumn(name = "produto_produto_id", referencedColumnName = "produto_id")
    @ManyToOne(optional = false)
    private Produto produtoProdutoId;

    public ItemProduto() {
    }

    public ItemProduto(Integer itemProdutoId) {
        this.itemProdutoId = itemProdutoId;
    }

    public Integer getItemProdutoId() {
        return itemProdutoId;
    }

    public void setItemProdutoId(Integer itemProdutoId) {
        this.itemProdutoId = itemProdutoId;
    }

    public Date getItemProdutoData() {
        return itemProdutoData;
    }

    public void setItemProdutoData(Date itemProdutoData) {
        this.itemProdutoData = itemProdutoData;
    }

    @XmlTransient
    public List<Compra> getCompraList() {
        return compraList;
    }

    public void setCompraList(List<Compra> compraList) {
        this.compraList = compraList;
    }

    public Item getItemItemId() {
        return itemItemId;
    }

    public void setItemItemId(Item itemItemId) {
        this.itemItemId = itemItemId;
    }

    public Produto getProdutoProdutoId() {
        return produtoProdutoId;
    }

    public void setProdutoProdutoId(Produto produtoProdutoId) {
        this.produtoProdutoId = produtoProdutoId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (itemProdutoId != null ? itemProdutoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ItemProduto)) {
            return false;
        }
        ItemProduto other = (ItemProduto) object;
        if ((this.itemProdutoId == null && other.itemProdutoId != null) || (this.itemProdutoId != null && !this.itemProdutoId.equals(other.itemProdutoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jsn.entidade.ItemProduto[ itemProdutoId=" + itemProdutoId + " ]";
    }
    
}
