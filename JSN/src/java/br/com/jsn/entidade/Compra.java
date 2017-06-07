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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author ADMINIBM
 */
@Entity
@Table(name = "compra")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Compra.findAll", query = "SELECT c FROM Compra c")
    , @NamedQuery(name = "Compra.findByCompraId", query = "SELECT c FROM Compra c WHERE c.compraId = :compraId")
    , @NamedQuery(name = "Compra.findByCompraPreco", query = "SELECT c FROM Compra c WHERE c.compraPreco = :compraPreco")
    , @NamedQuery(name = "Compra.findByCompraDesconto", query = "SELECT c FROM Compra c WHERE c.compraDesconto = :compraDesconto")
    , @NamedQuery(name = "Compra.findByCompraTotal", query = "SELECT c FROM Compra c WHERE c.compraTotal = :compraTotal")
    , @NamedQuery(name = "Compra.findByCompraData", query = "SELECT c FROM Compra c WHERE c.compraData = :compraData")
    , @NamedQuery(name = "Compra.findByCompraTipo", query = "SELECT c FROM Compra c WHERE c.compraTipo = :compraTipo")
    , @NamedQuery(name = "Compra.findByCompraDescricao", query = "SELECT c FROM Compra c WHERE c.compraDescricao = :compraDescricao")
    , @NamedQuery(name = "Compra.findByCompraEnvio", query = "SELECT c FROM Compra c WHERE c.compraEnvio = :compraEnvio")
    , @NamedQuery(name = "Compra.findByCompraCategoria", query = "SELECT c FROM Compra c WHERE c.compraCategoria = :compraCategoria")})
public class Compra implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "compra_id")
    private Integer compraId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "compra_preco")
    private Double compraPreco;
    @Column(name = "compra_desconto")
    private Double compraDesconto;
    @Column(name = "compra_total")
    private Double compraTotal;
    @Column(name = "compra_data")
    @Temporal(TemporalType.DATE)
    private Date compraData;
    @Size(max = 45)
    @Column(name = "compra_tipo")
    private String compraTipo;
    @Size(max = 255)
    @Column(name = "compra_descricao")
    private String compraDescricao;
    @Size(max = 45)
    @Column(name = "compra_envio")
    private String compraEnvio;
    @Size(max = 45)
    @Column(name = "compra_categoria")
    private String compraCategoria;
    @JoinColumn(name = "compra_status_compra_status_id", referencedColumnName = "compra_status_id")
    @ManyToOne(optional = false)
    private CompraStatus compraStatusCompraStatusId;
    @JoinColumn(name = "item_produto_item_produto_id", referencedColumnName = "item_produto_id")
    @ManyToOne(optional = false)
    private ItemProduto itemProdutoItemProdutoId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "compraCompraId")
    private List<CompraServico> compraServicoList;

    public Compra() {
    }

    public Compra(Integer compraId) {
        this.compraId = compraId;
    }

    public Integer getCompraId() {
        return compraId;
    }

    public void setCompraId(Integer compraId) {
        this.compraId = compraId;
    }

    public Double getCompraPreco() {
        return compraPreco;
    }

    public void setCompraPreco(Double compraPreco) {
        this.compraPreco = compraPreco;
    }

    public Double getCompraDesconto() {
        return compraDesconto;
    }

    public void setCompraDesconto(Double compraDesconto) {
        this.compraDesconto = compraDesconto;
    }

    public Double getCompraTotal() {
        return compraTotal;
    }

    public void setCompraTotal(Double compraTotal) {
        this.compraTotal = compraTotal;
    }

    public Date getCompraData() {
        return compraData;
    }

    public void setCompraData(Date compraData) {
        this.compraData = compraData;
    }

    public String getCompraTipo() {
        return compraTipo;
    }

    public void setCompraTipo(String compraTipo) {
        this.compraTipo = compraTipo;
    }

    public String getCompraDescricao() {
        return compraDescricao;
    }

    public void setCompraDescricao(String compraDescricao) {
        this.compraDescricao = compraDescricao;
    }

    public String getCompraEnvio() {
        return compraEnvio;
    }

    public void setCompraEnvio(String compraEnvio) {
        this.compraEnvio = compraEnvio;
    }

    public String getCompraCategoria() {
        return compraCategoria;
    }

    public void setCompraCategoria(String compraCategoria) {
        this.compraCategoria = compraCategoria;
    }

    public CompraStatus getCompraStatusCompraStatusId() {
        return compraStatusCompraStatusId;
    }

    public void setCompraStatusCompraStatusId(CompraStatus compraStatusCompraStatusId) {
        this.compraStatusCompraStatusId = compraStatusCompraStatusId;
    }

    public ItemProduto getItemProdutoItemProdutoId() {
        return itemProdutoItemProdutoId;
    }

    public void setItemProdutoItemProdutoId(ItemProduto itemProdutoItemProdutoId) {
        this.itemProdutoItemProdutoId = itemProdutoItemProdutoId;
    }

    @XmlTransient
    public List<CompraServico> getCompraServicoList() {
        return compraServicoList;
    }

    public void setCompraServicoList(List<CompraServico> compraServicoList) {
        this.compraServicoList = compraServicoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (compraId != null ? compraId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Compra)) {
            return false;
        }
        Compra other = (Compra) object;
        if ((this.compraId == null && other.compraId != null) || (this.compraId != null && !this.compraId.equals(other.compraId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jsn.entidade.Compra[ compraId=" + compraId + " ]";
    }
    
}
