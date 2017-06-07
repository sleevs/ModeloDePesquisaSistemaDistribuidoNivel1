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
@Table(name = "documento")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Documento.findAll", query = "SELECT d FROM Documento d")
    , @NamedQuery(name = "Documento.findByDocumentoId", query = "SELECT d FROM Documento d WHERE d.documentoId = :documentoId")
    , @NamedQuery(name = "Documento.findByDocumentoNome", query = "SELECT d FROM Documento d WHERE d.documentoNome = :documentoNome")
    , @NamedQuery(name = "Documento.findByDocumentoOrigem", query = "SELECT d FROM Documento d WHERE d.documentoOrigem = :documentoOrigem")
    , @NamedQuery(name = "Documento.findByDocumentoTipo", query = "SELECT d FROM Documento d WHERE d.documentoTipo = :documentoTipo")
    , @NamedQuery(name = "Documento.findByDocumentoData", query = "SELECT d FROM Documento d WHERE d.documentoData = :documentoData")})
public class Documento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "documento_id")
    private Integer documentoId;
    @Size(max = 45)
    @Column(name = "documento_nome")
    private String documentoNome;
    @Size(max = 45)
    @Column(name = "documento_origem")
    private String documentoOrigem;
    @Size(max = 45)
    @Column(name = "documento_tipo")
    private String documentoTipo;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "documento_pdf")
    private String documentoPdf;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "documento_anexo")
    private String documentoAnexo;
    @Column(name = "documento_data")
    @Temporal(TemporalType.DATE)
    private Date documentoData;
    @JoinColumn(name = "anuncio_anuncio_id", referencedColumnName = "anuncio_id")
    @ManyToOne(optional = false)
    private Anuncio anuncioAnuncioId;

    public Documento() {
    }

    public Documento(Integer documentoId) {
        this.documentoId = documentoId;
    }

    public Integer getDocumentoId() {
        return documentoId;
    }

    public void setDocumentoId(Integer documentoId) {
        this.documentoId = documentoId;
    }

    public String getDocumentoNome() {
        return documentoNome;
    }

    public void setDocumentoNome(String documentoNome) {
        this.documentoNome = documentoNome;
    }

    public String getDocumentoOrigem() {
        return documentoOrigem;
    }

    public void setDocumentoOrigem(String documentoOrigem) {
        this.documentoOrigem = documentoOrigem;
    }

    public String getDocumentoTipo() {
        return documentoTipo;
    }

    public void setDocumentoTipo(String documentoTipo) {
        this.documentoTipo = documentoTipo;
    }

    public String getDocumentoPdf() {
        return documentoPdf;
    }

    public void setDocumentoPdf(String documentoPdf) {
        this.documentoPdf = documentoPdf;
    }

    public String getDocumentoAnexo() {
        return documentoAnexo;
    }

    public void setDocumentoAnexo(String documentoAnexo) {
        this.documentoAnexo = documentoAnexo;
    }

    public Date getDocumentoData() {
        return documentoData;
    }

    public void setDocumentoData(Date documentoData) {
        this.documentoData = documentoData;
    }

    public Anuncio getAnuncioAnuncioId() {
        return anuncioAnuncioId;
    }

    public void setAnuncioAnuncioId(Anuncio anuncioAnuncioId) {
        this.anuncioAnuncioId = anuncioAnuncioId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (documentoId != null ? documentoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Documento)) {
            return false;
        }
        Documento other = (Documento) object;
        if ((this.documentoId == null && other.documentoId != null) || (this.documentoId != null && !this.documentoId.equals(other.documentoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jsn.entidade.Documento[ documentoId=" + documentoId + " ]";
    }
    
}
