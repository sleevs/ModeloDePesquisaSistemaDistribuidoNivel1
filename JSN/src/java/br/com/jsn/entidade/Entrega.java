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
import javax.persistence.Lob;
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
@Table(name = "entrega")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Entrega.findAll", query = "SELECT e FROM Entrega e")
    , @NamedQuery(name = "Entrega.findByEntregaId", query = "SELECT e FROM Entrega e WHERE e.entregaId = :entregaId")
    , @NamedQuery(name = "Entrega.findByEntregaData", query = "SELECT e FROM Entrega e WHERE e.entregaData = :entregaData")
    , @NamedQuery(name = "Entrega.findByEntregaValor", query = "SELECT e FROM Entrega e WHERE e.entregaValor = :entregaValor")
    , @NamedQuery(name = "Entrega.findByEntregaValortotal", query = "SELECT e FROM Entrega e WHERE e.entregaValortotal = :entregaValortotal")
    , @NamedQuery(name = "Entrega.findByEntregaTipo", query = "SELECT e FROM Entrega e WHERE e.entregaTipo = :entregaTipo")
    , @NamedQuery(name = "Entrega.findByEntregaCategoria", query = "SELECT e FROM Entrega e WHERE e.entregaCategoria = :entregaCategoria")})
public class Entrega implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "entrega_id")
    private Integer entregaId;
    @Column(name = "entrega_data")
    @Temporal(TemporalType.DATE)
    private Date entregaData;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "entrega_valor")
    private Double entregaValor;
    @Column(name = "entrega_valortotal")
    private Double entregaValortotal;
    @Size(max = 45)
    @Column(name = "entrega_tipo")
    private String entregaTipo;
    @Size(max = 45)
    @Column(name = "entrega_categoria")
    private String entregaCategoria;
    @Lob
    @Size(max = 16777215)
    @Column(name = "entrega_descricao")
    private String entregaDescricao;
    @JoinColumn(name = "entrega_status_entrega_servico_id", referencedColumnName = "entrega_servico_id")
    @ManyToOne(optional = false)
    private EntregaStatus entregaStatusEntregaServicoId;
    @JoinColumn(name = "pedido_pedido_id", referencedColumnName = "pedido_id")
    @ManyToOne(optional = false)
    private Pedido pedidoPedidoId;
    @JoinColumn(name = "rota_rota_id", referencedColumnName = "rota_id")
    @ManyToOne(optional = false)
    private Rota rotaRotaId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "entregaEntregaId")
    private List<EntregaServico> entregaServicoList;

    public Entrega() {
    }

    public Entrega(Integer entregaId) {
        this.entregaId = entregaId;
    }

    public Integer getEntregaId() {
        return entregaId;
    }

    public void setEntregaId(Integer entregaId) {
        this.entregaId = entregaId;
    }

    public Date getEntregaData() {
        return entregaData;
    }

    public void setEntregaData(Date entregaData) {
        this.entregaData = entregaData;
    }

    public Double getEntregaValor() {
        return entregaValor;
    }

    public void setEntregaValor(Double entregaValor) {
        this.entregaValor = entregaValor;
    }

    public Double getEntregaValortotal() {
        return entregaValortotal;
    }

    public void setEntregaValortotal(Double entregaValortotal) {
        this.entregaValortotal = entregaValortotal;
    }

    public String getEntregaTipo() {
        return entregaTipo;
    }

    public void setEntregaTipo(String entregaTipo) {
        this.entregaTipo = entregaTipo;
    }

    public String getEntregaCategoria() {
        return entregaCategoria;
    }

    public void setEntregaCategoria(String entregaCategoria) {
        this.entregaCategoria = entregaCategoria;
    }

    public String getEntregaDescricao() {
        return entregaDescricao;
    }

    public void setEntregaDescricao(String entregaDescricao) {
        this.entregaDescricao = entregaDescricao;
    }

    public EntregaStatus getEntregaStatusEntregaServicoId() {
        return entregaStatusEntregaServicoId;
    }

    public void setEntregaStatusEntregaServicoId(EntregaStatus entregaStatusEntregaServicoId) {
        this.entregaStatusEntregaServicoId = entregaStatusEntregaServicoId;
    }

    public Pedido getPedidoPedidoId() {
        return pedidoPedidoId;
    }

    public void setPedidoPedidoId(Pedido pedidoPedidoId) {
        this.pedidoPedidoId = pedidoPedidoId;
    }

    public Rota getRotaRotaId() {
        return rotaRotaId;
    }

    public void setRotaRotaId(Rota rotaRotaId) {
        this.rotaRotaId = rotaRotaId;
    }

    @XmlTransient
    public List<EntregaServico> getEntregaServicoList() {
        return entregaServicoList;
    }

    public void setEntregaServicoList(List<EntregaServico> entregaServicoList) {
        this.entregaServicoList = entregaServicoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (entregaId != null ? entregaId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Entrega)) {
            return false;
        }
        Entrega other = (Entrega) object;
        if ((this.entregaId == null && other.entregaId != null) || (this.entregaId != null && !this.entregaId.equals(other.entregaId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jsn.entidade.Entrega[ entregaId=" + entregaId + " ]";
    }
    
}
