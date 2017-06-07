/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jsn.entidade;

import java.io.Serializable;
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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ADMINIBM
 */
@Entity
@Table(name = "entrega_servico")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EntregaServico.findAll", query = "SELECT e FROM EntregaServico e")
    , @NamedQuery(name = "EntregaServico.findByEntregaServicoId", query = "SELECT e FROM EntregaServico e WHERE e.entregaServicoId = :entregaServicoId")
    , @NamedQuery(name = "EntregaServico.findByEntregaServicoData", query = "SELECT e FROM EntregaServico e WHERE e.entregaServicoData = :entregaServicoData")
    , @NamedQuery(name = "EntregaServico.findByEntregaServicoFlag", query = "SELECT e FROM EntregaServico e WHERE e.entregaServicoFlag = :entregaServicoFlag")})
public class EntregaServico implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "entrega_servico_id")
    private Integer entregaServicoId;
    @Size(max = 45)
    @Column(name = "entrega_servico_data")
    private String entregaServicoData;
    @Column(name = "entrega_servico_flag")
    private Integer entregaServicoFlag;
    @JoinColumn(name = "entrega_entrega_id", referencedColumnName = "entrega_id")
    @ManyToOne(optional = false)
    private Entrega entregaEntregaId;
    @JoinColumn(name = "servico_servico_id", referencedColumnName = "servico_id")
    @ManyToOne(optional = false)
    private Servico servicoServicoId;

    public EntregaServico() {
    }

    public EntregaServico(Integer entregaServicoId) {
        this.entregaServicoId = entregaServicoId;
    }

    public Integer getEntregaServicoId() {
        return entregaServicoId;
    }

    public void setEntregaServicoId(Integer entregaServicoId) {
        this.entregaServicoId = entregaServicoId;
    }

    public String getEntregaServicoData() {
        return entregaServicoData;
    }

    public void setEntregaServicoData(String entregaServicoData) {
        this.entregaServicoData = entregaServicoData;
    }

    public Integer getEntregaServicoFlag() {
        return entregaServicoFlag;
    }

    public void setEntregaServicoFlag(Integer entregaServicoFlag) {
        this.entregaServicoFlag = entregaServicoFlag;
    }

    public Entrega getEntregaEntregaId() {
        return entregaEntregaId;
    }

    public void setEntregaEntregaId(Entrega entregaEntregaId) {
        this.entregaEntregaId = entregaEntregaId;
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
        hash += (entregaServicoId != null ? entregaServicoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EntregaServico)) {
            return false;
        }
        EntregaServico other = (EntregaServico) object;
        if ((this.entregaServicoId == null && other.entregaServicoId != null) || (this.entregaServicoId != null && !this.entregaServicoId.equals(other.entregaServicoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jsn.entidade.EntregaServico[ entregaServicoId=" + entregaServicoId + " ]";
    }
    
}
