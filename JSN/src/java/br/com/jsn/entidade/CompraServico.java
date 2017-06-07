/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jsn.entidade;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ADMINIBM
 */
@Entity
@Table(name = "compra_servico")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CompraServico.findAll", query = "SELECT c FROM CompraServico c")
    , @NamedQuery(name = "CompraServico.findByCompraServicoId", query = "SELECT c FROM CompraServico c WHERE c.compraServicoId = :compraServicoId")
    , @NamedQuery(name = "CompraServico.findByCompraServicoData", query = "SELECT c FROM CompraServico c WHERE c.compraServicoData = :compraServicoData")
    , @NamedQuery(name = "CompraServico.findByCompraServicoFlag", query = "SELECT c FROM CompraServico c WHERE c.compraServicoFlag = :compraServicoFlag")})
public class CompraServico implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "compra_servico_id")
    private Integer compraServicoId;
    @Column(name = "compra_servico_data")
    @Temporal(TemporalType.DATE)
    private Date compraServicoData;
    @Column(name = "compra_servico_flag")
    private Integer compraServicoFlag;
    @JoinColumn(name = "compra_compra_id", referencedColumnName = "compra_id")
    @ManyToOne(optional = false)
    private Compra compraCompraId;
    @JoinColumn(name = "servico_servico_id", referencedColumnName = "servico_id")
    @ManyToOne(optional = false)
    private Servico servicoServicoId;

    public CompraServico() {
    }

    public CompraServico(Integer compraServicoId) {
        this.compraServicoId = compraServicoId;
    }

    public Integer getCompraServicoId() {
        return compraServicoId;
    }

    public void setCompraServicoId(Integer compraServicoId) {
        this.compraServicoId = compraServicoId;
    }

    public Date getCompraServicoData() {
        return compraServicoData;
    }

    public void setCompraServicoData(Date compraServicoData) {
        this.compraServicoData = compraServicoData;
    }

    public Integer getCompraServicoFlag() {
        return compraServicoFlag;
    }

    public void setCompraServicoFlag(Integer compraServicoFlag) {
        this.compraServicoFlag = compraServicoFlag;
    }

    public Compra getCompraCompraId() {
        return compraCompraId;
    }

    public void setCompraCompraId(Compra compraCompraId) {
        this.compraCompraId = compraCompraId;
    }

    public Servico getServicoServicoId() {
        return servicoServicoId;
    }

    public void setServicoServicoId(Servico servicoServicoId) {
        this.servicoServicoId = servicoServicoId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (compraServicoId != null ? compraServicoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CompraServico)) {
            return false;
        }
        CompraServico other = (CompraServico) object;
        if ((this.compraServicoId == null && other.compraServicoId != null) || (this.compraServicoId != null && !this.compraServicoId.equals(other.compraServicoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jsn.entidade.CompraServico[ compraServicoId=" + compraServicoId + " ]";
    }
    
}
