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
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ADMINIBM
 */
@Entity
@Table(name = "arquivo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Arquivo.findAll", query = "SELECT a FROM Arquivo a")
    , @NamedQuery(name = "Arquivo.findByArquivoId", query = "SELECT a FROM Arquivo a WHERE a.arquivoId = :arquivoId")
    , @NamedQuery(name = "Arquivo.findByArquivoNome", query = "SELECT a FROM Arquivo a WHERE a.arquivoNome = :arquivoNome")
    , @NamedQuery(name = "Arquivo.findByArquivoTipo", query = "SELECT a FROM Arquivo a WHERE a.arquivoTipo = :arquivoTipo")
    , @NamedQuery(name = "Arquivo.findByArquivoDescricao", query = "SELECT a FROM Arquivo a WHERE a.arquivoDescricao = :arquivoDescricao")
    , @NamedQuery(name = "Arquivo.findByArquivoFlag", query = "SELECT a FROM Arquivo a WHERE a.arquivoFlag = :arquivoFlag")
    , @NamedQuery(name = "Arquivo.findByArquivoData", query = "SELECT a FROM Arquivo a WHERE a.arquivoData = :arquivoData")
    , @NamedQuery(name = "Arquivo.findByArquivoUpdate", query = "SELECT a FROM Arquivo a WHERE a.arquivoUpdate = :arquivoUpdate")})
public class Arquivo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "arquivo_id")
    private Integer arquivoId;
    @Size(max = 45)
    @Column(name = "arquivo_nome")
    private String arquivoNome;
    @Size(max = 45)
    @Column(name = "arquivo_tipo")
    private String arquivoTipo;
    @Size(max = 45)
    @Column(name = "arquivo_descricao")
    private String arquivoDescricao;
    @Lob
    @Size(max = 65535)
    @Column(name = "arquivo_conteudo")
    private String arquivoConteudo;
    @Column(name = "arquivo_flag")
    private Integer arquivoFlag;
    @Column(name = "arquivo_data")
    @Temporal(TemporalType.DATE)
    private Date arquivoData;
    @Column(name = "arquivo_update")
    @Temporal(TemporalType.DATE)
    private Date arquivoUpdate;
    @Lob
    @Size(max = 65535)
    @Column(name = "arquivo_url")
    private String arquivoUrl;
    @JoinColumn(name = "conta_conta", referencedColumnName = "conta_id")
    @ManyToOne(optional = false)
    private Conta contaConta;

    public Arquivo() {
    }

    public Arquivo(Integer arquivoId) {
        this.arquivoId = arquivoId;
    }

    public Integer getArquivoId() {
        return arquivoId;
    }

    public void setArquivoId(Integer arquivoId) {
        this.arquivoId = arquivoId;
    }

    public String getArquivoNome() {
        return arquivoNome;
    }

    public void setArquivoNome(String arquivoNome) {
        this.arquivoNome = arquivoNome;
    }

    public String getArquivoTipo() {
        return arquivoTipo;
    }

    public void setArquivoTipo(String arquivoTipo) {
        this.arquivoTipo = arquivoTipo;
    }

    public String getArquivoDescricao() {
        return arquivoDescricao;
    }

    public void setArquivoDescricao(String arquivoDescricao) {
        this.arquivoDescricao = arquivoDescricao;
    }

    public String getArquivoConteudo() {
        return arquivoConteudo;
    }

    public void setArquivoConteudo(String arquivoConteudo) {
        this.arquivoConteudo = arquivoConteudo;
    }

    public Integer getArquivoFlag() {
        return arquivoFlag;
    }

    public void setArquivoFlag(Integer arquivoFlag) {
        this.arquivoFlag = arquivoFlag;
    }

    public Date getArquivoData() {
        return arquivoData;
    }

    public void setArquivoData(Date arquivoData) {
        this.arquivoData = arquivoData;
    }

    public Date getArquivoUpdate() {
        return arquivoUpdate;
    }

    public void setArquivoUpdate(Date arquivoUpdate) {
        this.arquivoUpdate = arquivoUpdate;
    }

    public String getArquivoUrl() {
        return arquivoUrl;
    }

    public void setArquivoUrl(String arquivoUrl) {
        this.arquivoUrl = arquivoUrl;
    }

    public Conta getContaConta() {
        return contaConta;
    }

    public void setContaConta(Conta contaConta) {
        this.contaConta = contaConta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (arquivoId != null ? arquivoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Arquivo)) {
            return false;
        }
        Arquivo other = (Arquivo) object;
        if ((this.arquivoId == null && other.arquivoId != null) || (this.arquivoId != null && !this.arquivoId.equals(other.arquivoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jsn.entidade.Arquivo[ arquivoId=" + arquivoId + " ]";
    }
    
}
