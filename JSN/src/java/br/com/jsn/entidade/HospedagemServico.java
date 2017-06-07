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
@Table(name = "hospedagem_servico")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "HospedagemServico.findAll", query = "SELECT h FROM HospedagemServico h")
    , @NamedQuery(name = "HospedagemServico.findByHospedagemServicoId", query = "SELECT h FROM HospedagemServico h WHERE h.hospedagemServicoId = :hospedagemServicoId")
    , @NamedQuery(name = "HospedagemServico.findByHospedagemServicoData", query = "SELECT h FROM HospedagemServico h WHERE h.hospedagemServicoData = :hospedagemServicoData")
    , @NamedQuery(name = "HospedagemServico.findByHospedagemServicoFlag", query = "SELECT h FROM HospedagemServico h WHERE h.hospedagemServicoFlag = :hospedagemServicoFlag")})
public class HospedagemServico implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "hospedagem_servico_id")
    private Integer hospedagemServicoId;
    @Size(max = 45)
    @Column(name = "hospedagem_servico_data")
    private String hospedagemServicoData;
    @Size(max = 45)
    @Column(name = "hospedagem_servico_flag")
    private String hospedagemServicoFlag;
    @JoinColumn(name = "hospedagem_hospedagem_id", referencedColumnName = "hospedagem_id")
    @ManyToOne(optional = false)
    private Hospedagem hospedagemHospedagemId;
    @JoinColumn(name = "servico_servico_id", referencedColumnName = "servico_id")
    @ManyToOne(optional = false)
    private Servico servicoServicoId;

    public HospedagemServico() {
    }

    public HospedagemServico(Integer hospedagemServicoId) {
        this.hospedagemServicoId = hospedagemServicoId;
    }

    public Integer getHospedagemServicoId() {
        return hospedagemServicoId;
    }

    public void setHospedagemServicoId(Integer hospedagemServicoId) {
        this.hospedagemServicoId = hospedagemServicoId;
    }

    public String getHospedagemServicoData() {
        return hospedagemServicoData;
    }

    public void setHospedagemServicoData(String hospedagemServicoData) {
        this.hospedagemServicoData = hospedagemServicoData;
    }

    public String getHospedagemServicoFlag() {
        return hospedagemServicoFlag;
    }

    public void setHospedagemServicoFlag(String hospedagemServicoFlag) {
        this.hospedagemServicoFlag = hospedagemServicoFlag;
    }

    public Hospedagem getHospedagemHospedagemId() {
        return hospedagemHospedagemId;
    }

    public void setHospedagemHospedagemId(Hospedagem hospedagemHospedagemId) {
        this.hospedagemHospedagemId = hospedagemHospedagemId;
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
        hash += (hospedagemServicoId != null ? hospedagemServicoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HospedagemServico)) {
            return false;
        }
        HospedagemServico other = (HospedagemServico) object;
        if ((this.hospedagemServicoId == null && other.hospedagemServicoId != null) || (this.hospedagemServicoId != null && !this.hospedagemServicoId.equals(other.hospedagemServicoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jsn.entidade.HospedagemServico[ hospedagemServicoId=" + hospedagemServicoId + " ]";
    }
    
}
