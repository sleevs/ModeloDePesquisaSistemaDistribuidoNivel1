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
@Table(name = "pedido")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pedido.findAll", query = "SELECT p FROM Pedido p")
    , @NamedQuery(name = "Pedido.findByPedidoId", query = "SELECT p FROM Pedido p WHERE p.pedidoId = :pedidoId")
    , @NamedQuery(name = "Pedido.findByPedidoData", query = "SELECT p FROM Pedido p WHERE p.pedidoData = :pedidoData")
    , @NamedQuery(name = "Pedido.findByPedidoValor", query = "SELECT p FROM Pedido p WHERE p.pedidoValor = :pedidoValor")
    , @NamedQuery(name = "Pedido.findByPedidoValortotal", query = "SELECT p FROM Pedido p WHERE p.pedidoValortotal = :pedidoValortotal")
    , @NamedQuery(name = "Pedido.findByPedidoTipo", query = "SELECT p FROM Pedido p WHERE p.pedidoTipo = :pedidoTipo")})
public class Pedido implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "pedido_id")
    private Integer pedidoId;
    @Column(name = "pedido_data")
    @Temporal(TemporalType.DATE)
    private Date pedidoData;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "pedido_valor")
    private Double pedidoValor;
    @Column(name = "pedido_valortotal")
    private Double pedidoValortotal;
    @Size(max = 45)
    @Column(name = "pedido_tipo")
    private String pedidoTipo;
    @Lob
    @Size(max = 16777215)
    @Column(name = "pedido_descricao")
    private String pedidoDescricao;
    @JoinColumn(name = "carga_carga_id", referencedColumnName = "carga_id")
    @ManyToOne(optional = false)
    private Carga cargaCargaId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pedidoPedidoId")
    private List<Entrega> entregaList;

    public Pedido() {
    }

    public Pedido(Integer pedidoId) {
        this.pedidoId = pedidoId;
    }

    public Integer getPedidoId() {
        return pedidoId;
    }

    public void setPedidoId(Integer pedidoId) {
        this.pedidoId = pedidoId;
    }

    public Date getPedidoData() {
        return pedidoData;
    }

    public void setPedidoData(Date pedidoData) {
        this.pedidoData = pedidoData;
    }

    public Double getPedidoValor() {
        return pedidoValor;
    }

    public void setPedidoValor(Double pedidoValor) {
        this.pedidoValor = pedidoValor;
    }

    public Double getPedidoValortotal() {
        return pedidoValortotal;
    }

    public void setPedidoValortotal(Double pedidoValortotal) {
        this.pedidoValortotal = pedidoValortotal;
    }

    public String getPedidoTipo() {
        return pedidoTipo;
    }

    public void setPedidoTipo(String pedidoTipo) {
        this.pedidoTipo = pedidoTipo;
    }

    public String getPedidoDescricao() {
        return pedidoDescricao;
    }

    public void setPedidoDescricao(String pedidoDescricao) {
        this.pedidoDescricao = pedidoDescricao;
    }

    public Carga getCargaCargaId() {
        return cargaCargaId;
    }

    public void setCargaCargaId(Carga cargaCargaId) {
        this.cargaCargaId = cargaCargaId;
    }

    @XmlTransient
    public List<Entrega> getEntregaList() {
        return entregaList;
    }

    public void setEntregaList(List<Entrega> entregaList) {
        this.entregaList = entregaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pedidoId != null ? pedidoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pedido)) {
            return false;
        }
        Pedido other = (Pedido) object;
        if ((this.pedidoId == null && other.pedidoId != null) || (this.pedidoId != null && !this.pedidoId.equals(other.pedidoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jsn.entidade.Pedido[ pedidoId=" + pedidoId + " ]";
    }
    
}
