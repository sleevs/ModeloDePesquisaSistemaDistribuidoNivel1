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
@Table(name = "pagamento_status")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PagamentoStatus.findAll", query = "SELECT p FROM PagamentoStatus p")
    , @NamedQuery(name = "PagamentoStatus.findByPagamentoStatus", query = "SELECT p FROM PagamentoStatus p WHERE p.pagamentoStatus = :pagamentoStatus")
    , @NamedQuery(name = "PagamentoStatus.findByPagamentoStatusUpdate", query = "SELECT p FROM PagamentoStatus p WHERE p.pagamentoStatusUpdate = :pagamentoStatusUpdate")
    , @NamedQuery(name = "PagamentoStatus.findByPagamentoStatusTipo", query = "SELECT p FROM PagamentoStatus p WHERE p.pagamentoStatusTipo = :pagamentoStatusTipo")
    , @NamedQuery(name = "PagamentoStatus.findByPagamentoStatusFlag", query = "SELECT p FROM PagamentoStatus p WHERE p.pagamentoStatusFlag = :pagamentoStatusFlag")})
public class PagamentoStatus implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "pagamento_status")
    private Integer pagamentoStatus;
    @Column(name = "pagamento_status_update")
    @Temporal(TemporalType.DATE)
    private Date pagamentoStatusUpdate;
    @Size(max = 45)
    @Column(name = "pagamento_status_tipo")
    private String pagamentoStatusTipo;
    @Column(name = "pagamento_status_flag")
    private Integer pagamentoStatusFlag;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pagamentoStatusPagamentoStatus")
    private List<Pagamento> pagamentoList;

    public PagamentoStatus() {
    }

    public PagamentoStatus(Integer pagamentoStatus) {
        this.pagamentoStatus = pagamentoStatus;
    }

    public Integer getPagamentoStatus() {
        return pagamentoStatus;
    }

    public void setPagamentoStatus(Integer pagamentoStatus) {
        this.pagamentoStatus = pagamentoStatus;
    }

    public Date getPagamentoStatusUpdate() {
        return pagamentoStatusUpdate;
    }

    public void setPagamentoStatusUpdate(Date pagamentoStatusUpdate) {
        this.pagamentoStatusUpdate = pagamentoStatusUpdate;
    }

    public String getPagamentoStatusTipo() {
        return pagamentoStatusTipo;
    }

    public void setPagamentoStatusTipo(String pagamentoStatusTipo) {
        this.pagamentoStatusTipo = pagamentoStatusTipo;
    }

    public Integer getPagamentoStatusFlag() {
        return pagamentoStatusFlag;
    }

    public void setPagamentoStatusFlag(Integer pagamentoStatusFlag) {
        this.pagamentoStatusFlag = pagamentoStatusFlag;
    }

    @XmlTransient
    public List<Pagamento> getPagamentoList() {
        return pagamentoList;
    }

    public void setPagamentoList(List<Pagamento> pagamentoList) {
        this.pagamentoList = pagamentoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pagamentoStatus != null ? pagamentoStatus.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PagamentoStatus)) {
            return false;
        }
        PagamentoStatus other = (PagamentoStatus) object;
        if ((this.pagamentoStatus == null && other.pagamentoStatus != null) || (this.pagamentoStatus != null && !this.pagamentoStatus.equals(other.pagamentoStatus))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jsn.entidade.PagamentoStatus[ pagamentoStatus=" + pagamentoStatus + " ]";
    }
    
}
