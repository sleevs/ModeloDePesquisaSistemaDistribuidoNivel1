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
@Table(name = "problema")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Problema.findAll", query = "SELECT p FROM Problema p")
    , @NamedQuery(name = "Problema.findByProblema", query = "SELECT p FROM Problema p WHERE p.problema = :problema")
    , @NamedQuery(name = "Problema.findByProblemaData", query = "SELECT p FROM Problema p WHERE p.problemaData = :problemaData")
    , @NamedQuery(name = "Problema.findByProblemaOcorrencia", query = "SELECT p FROM Problema p WHERE p.problemaOcorrencia = :problemaOcorrencia")
    , @NamedQuery(name = "Problema.findByProblemaNivel", query = "SELECT p FROM Problema p WHERE p.problemaNivel = :problemaNivel")})
public class Problema implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "problema")
    private Integer problema;
    @Column(name = "problema_data")
    @Temporal(TemporalType.DATE)
    private Date problemaData;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "problema_descricao")
    private String problemaDescricao;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "problema_ocorrencia")
    private Double problemaOcorrencia;
    @Size(max = 45)
    @Column(name = "problema_nivel")
    private String problemaNivel;
    @Lob
    @Size(max = 65535)
    @Column(name = "problema_arquivo")
    private String problemaArquivo;
    @OneToMany(mappedBy = "problemaProblema")
    private List<SolucaoProblema> solucaoProblemaList;

    public Problema() {
    }

    public Problema(Integer problema) {
        this.problema = problema;
    }

    public Integer getProblema() {
        return problema;
    }

    public void setProblema(Integer problema) {
        this.problema = problema;
    }

    public Date getProblemaData() {
        return problemaData;
    }

    public void setProblemaData(Date problemaData) {
        this.problemaData = problemaData;
    }

    public String getProblemaDescricao() {
        return problemaDescricao;
    }

    public void setProblemaDescricao(String problemaDescricao) {
        this.problemaDescricao = problemaDescricao;
    }

    public Double getProblemaOcorrencia() {
        return problemaOcorrencia;
    }

    public void setProblemaOcorrencia(Double problemaOcorrencia) {
        this.problemaOcorrencia = problemaOcorrencia;
    }

    public String getProblemaNivel() {
        return problemaNivel;
    }

    public void setProblemaNivel(String problemaNivel) {
        this.problemaNivel = problemaNivel;
    }

    public String getProblemaArquivo() {
        return problemaArquivo;
    }

    public void setProblemaArquivo(String problemaArquivo) {
        this.problemaArquivo = problemaArquivo;
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
        hash += (problema != null ? problema.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Problema)) {
            return false;
        }
        Problema other = (Problema) object;
        if ((this.problema == null && other.problema != null) || (this.problema != null && !this.problema.equals(other.problema))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jsn.entidade.Problema[ problema=" + problema + " ]";
    }
    
}
