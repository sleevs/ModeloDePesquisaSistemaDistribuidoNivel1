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
@Table(name = "solucao")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Solucao.findAll", query = "SELECT s FROM Solucao s")
    , @NamedQuery(name = "Solucao.findBySolucaoId", query = "SELECT s FROM Solucao s WHERE s.solucaoId = :solucaoId")
    , @NamedQuery(name = "Solucao.findBySolucaoData", query = "SELECT s FROM Solucao s WHERE s.solucaoData = :solucaoData")
    , @NamedQuery(name = "Solucao.findBySolucaoOcorrencia", query = "SELECT s FROM Solucao s WHERE s.solucaoOcorrencia = :solucaoOcorrencia")
    , @NamedQuery(name = "Solucao.findBySolucaoNivel", query = "SELECT s FROM Solucao s WHERE s.solucaoNivel = :solucaoNivel")})
public class Solucao implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "solucao_id")
    private Integer solucaoId;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "solucao_descricao")
    private String solucaoDescricao;
    @Column(name = "solucao_data")
    @Temporal(TemporalType.DATE)
    private Date solucaoData;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "solucao_ocorrencia")
    private Double solucaoOcorrencia;
    @Size(max = 45)
    @Column(name = "solucao_nivel")
    private String solucaoNivel;
    @Lob
    @Size(max = 65535)
    @Column(name = "solucao_arquivo")
    private String solucaoArquivo;
    @OneToMany(mappedBy = "solucaoSolucaoId")
    private List<SolucaoProblema> solucaoProblemaList;

    public Solucao() {
    }

    public Solucao(Integer solucaoId) {
        this.solucaoId = solucaoId;
    }

    public Integer getSolucaoId() {
        return solucaoId;
    }

    public void setSolucaoId(Integer solucaoId) {
        this.solucaoId = solucaoId;
    }

    public String getSolucaoDescricao() {
        return solucaoDescricao;
    }

    public void setSolucaoDescricao(String solucaoDescricao) {
        this.solucaoDescricao = solucaoDescricao;
    }

    public Date getSolucaoData() {
        return solucaoData;
    }

    public void setSolucaoData(Date solucaoData) {
        this.solucaoData = solucaoData;
    }

    public Double getSolucaoOcorrencia() {
        return solucaoOcorrencia;
    }

    public void setSolucaoOcorrencia(Double solucaoOcorrencia) {
        this.solucaoOcorrencia = solucaoOcorrencia;
    }

    public String getSolucaoNivel() {
        return solucaoNivel;
    }

    public void setSolucaoNivel(String solucaoNivel) {
        this.solucaoNivel = solucaoNivel;
    }

    public String getSolucaoArquivo() {
        return solucaoArquivo;
    }

    public void setSolucaoArquivo(String solucaoArquivo) {
        this.solucaoArquivo = solucaoArquivo;
    }

    @XmlTransient
    public List<SolucaoProblema> getSolucaoProblemaList() {
        return solucaoProblemaList;
    }

    public void setSolucaoProblemaList(List<SolucaoProblema> solucaoProblemaList) {
        this.solucaoProblemaList = solucaoProblemaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (solucaoId != null ? solucaoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Solucao)) {
            return false;
        }
        Solucao other = (Solucao) object;
        if ((this.solucaoId == null && other.solucaoId != null) || (this.solucaoId != null && !this.solucaoId.equals(other.solucaoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jsn.entidade.Solucao[ solucaoId=" + solucaoId + " ]";
    }
    
}
