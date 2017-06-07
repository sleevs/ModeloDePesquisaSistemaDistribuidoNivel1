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
@Table(name = "proposta")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Proposta.findAll", query = "SELECT p FROM Proposta p")
    , @NamedQuery(name = "Proposta.findByPropostaId", query = "SELECT p FROM Proposta p WHERE p.propostaId = :propostaId")
    , @NamedQuery(name = "Proposta.findByPropostaValor", query = "SELECT p FROM Proposta p WHERE p.propostaValor = :propostaValor")
    , @NamedQuery(name = "Proposta.findByPropostaData", query = "SELECT p FROM Proposta p WHERE p.propostaData = :propostaData")
    , @NamedQuery(name = "Proposta.findByPropostaTipo", query = "SELECT p FROM Proposta p WHERE p.propostaTipo = :propostaTipo")
    , @NamedQuery(name = "Proposta.findByPropostaAnexo", query = "SELECT p FROM Proposta p WHERE p.propostaAnexo = :propostaAnexo")
    , @NamedQuery(name = "Proposta.findByPropostaUrl", query = "SELECT p FROM Proposta p WHERE p.propostaUrl = :propostaUrl")
    , @NamedQuery(name = "Proposta.findByPropostaCategoria", query = "SELECT p FROM Proposta p WHERE p.propostaCategoria = :propostaCategoria")
    , @NamedQuery(name = "Proposta.findByPropostaFlag", query = "SELECT p FROM Proposta p WHERE p.propostaFlag = :propostaFlag")
    , @NamedQuery(name = "Proposta.findByPropostaStatus", query = "SELECT p FROM Proposta p WHERE p.propostaStatus = :propostaStatus")})
public class Proposta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "proposta_id")
    private Integer propostaId;
    @Size(max = 45)
    @Column(name = "proposta_valor")
    private String propostaValor;
    @Column(name = "proposta_data")
    @Temporal(TemporalType.DATE)
    private Date propostaData;
    @Size(max = 45)
    @Column(name = "proposta_tipo")
    private String propostaTipo;
    @Lob
    @Size(max = 16777215)
    @Column(name = "proposta_descricao")
    private String propostaDescricao;
    @Size(max = 45)
    @Column(name = "proposta_anexo")
    private String propostaAnexo;
    @Size(max = 45)
    @Column(name = "proposta_url")
    private String propostaUrl;
    @Size(max = 45)
    @Column(name = "proposta_categoria")
    private String propostaCategoria;
    @Size(max = 45)
    @Column(name = "proposta_flag")
    private String propostaFlag;
    @Size(max = 45)
    @Column(name = "proposta_status")
    private String propostaStatus;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "propostaPropostaId")
    private List<Mensagem> mensagemList;
    @JoinColumn(name = "proposta_status_proposta_status_id", referencedColumnName = "proposta_status_id")
    @ManyToOne(optional = false)
    private PropostaStatus propostaStatusPropostaStatusId;

    public Proposta() {
    }

    public Proposta(Integer propostaId) {
        this.propostaId = propostaId;
    }

    public Integer getPropostaId() {
        return propostaId;
    }

    public void setPropostaId(Integer propostaId) {
        this.propostaId = propostaId;
    }

    public String getPropostaValor() {
        return propostaValor;
    }

    public void setPropostaValor(String propostaValor) {
        this.propostaValor = propostaValor;
    }

    public Date getPropostaData() {
        return propostaData;
    }

    public void setPropostaData(Date propostaData) {
        this.propostaData = propostaData;
    }

    public String getPropostaTipo() {
        return propostaTipo;
    }

    public void setPropostaTipo(String propostaTipo) {
        this.propostaTipo = propostaTipo;
    }

    public String getPropostaDescricao() {
        return propostaDescricao;
    }

    public void setPropostaDescricao(String propostaDescricao) {
        this.propostaDescricao = propostaDescricao;
    }

    public String getPropostaAnexo() {
        return propostaAnexo;
    }

    public void setPropostaAnexo(String propostaAnexo) {
        this.propostaAnexo = propostaAnexo;
    }

    public String getPropostaUrl() {
        return propostaUrl;
    }

    public void setPropostaUrl(String propostaUrl) {
        this.propostaUrl = propostaUrl;
    }

    public String getPropostaCategoria() {
        return propostaCategoria;
    }

    public void setPropostaCategoria(String propostaCategoria) {
        this.propostaCategoria = propostaCategoria;
    }

    public String getPropostaFlag() {
        return propostaFlag;
    }

    public void setPropostaFlag(String propostaFlag) {
        this.propostaFlag = propostaFlag;
    }

    public String getPropostaStatus() {
        return propostaStatus;
    }

    public void setPropostaStatus(String propostaStatus) {
        this.propostaStatus = propostaStatus;
    }

    @XmlTransient
    public List<Mensagem> getMensagemList() {
        return mensagemList;
    }

    public void setMensagemList(List<Mensagem> mensagemList) {
        this.mensagemList = mensagemList;
    }

    public PropostaStatus getPropostaStatusPropostaStatusId() {
        return propostaStatusPropostaStatusId;
    }

    public void setPropostaStatusPropostaStatusId(PropostaStatus propostaStatusPropostaStatusId) {
        this.propostaStatusPropostaStatusId = propostaStatusPropostaStatusId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (propostaId != null ? propostaId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Proposta)) {
            return false;
        }
        Proposta other = (Proposta) object;
        if ((this.propostaId == null && other.propostaId != null) || (this.propostaId != null && !this.propostaId.equals(other.propostaId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jsn.entidade.Proposta[ propostaId=" + propostaId + " ]";
    }
    
}
