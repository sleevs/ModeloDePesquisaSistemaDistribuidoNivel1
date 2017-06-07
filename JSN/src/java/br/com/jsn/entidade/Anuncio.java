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
@Table(name = "anuncio")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Anuncio.findAll", query = "SELECT a FROM Anuncio a")
    , @NamedQuery(name = "Anuncio.findByAnuncioId", query = "SELECT a FROM Anuncio a WHERE a.anuncioId = :anuncioId")
    , @NamedQuery(name = "Anuncio.findByAnuncioTipo", query = "SELECT a FROM Anuncio a WHERE a.anuncioTipo = :anuncioTipo")
    , @NamedQuery(name = "Anuncio.findByAnuncioCategoria", query = "SELECT a FROM Anuncio a WHERE a.anuncioCategoria = :anuncioCategoria")
    , @NamedQuery(name = "Anuncio.findByAnuncioData", query = "SELECT a FROM Anuncio a WHERE a.anuncioData = :anuncioData")
    , @NamedQuery(name = "Anuncio.findByAnuncioTempo", query = "SELECT a FROM Anuncio a WHERE a.anuncioTempo = :anuncioTempo")})
public class Anuncio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "anuncio_id")
    private Integer anuncioId;
    @Size(max = 45)
    @Column(name = "anuncio_tipo")
    private String anuncioTipo;
    @Size(max = 45)
    @Column(name = "anuncio_categoria")
    private String anuncioCategoria;
    @Lob
    @Size(max = 16777215)
    @Column(name = "anuncio_descricao")
    private String anuncioDescricao;
    @Column(name = "anuncio_data")
    @Temporal(TemporalType.DATE)
    private Date anuncioData;
    @Lob
    @Size(max = 65535)
    @Column(name = "anuncio_imagem")
    private String anuncioImagem;
    @Size(max = 45)
    @Column(name = "anuncio_tempo")
    private String anuncioTempo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "anuncioAnuncioId")
    private List<Documento> documentoList;
    @JoinColumn(name = "anuncio_status_anuncio_status_id", referencedColumnName = "anuncio_status_id")
    @ManyToOne(optional = false)
    private AnuncioStatus anuncioStatusAnuncioStatusId;
    @JoinColumn(name = "conta_conta", referencedColumnName = "conta_id")
    @ManyToOne(optional = false)
    private Conta contaConta;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "anuncioAnuncioId")
    private List<Pagina> paginaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "anuncioAnuncioId")
    private List<Mensagem> mensagemList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "anuncioAnuncioId")
    private List<Social> socialList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "anuncioAnuncioId")
    private List<Servico> servicoList;

    public Anuncio() {
    }

    public Anuncio(Integer anuncioId) {
        this.anuncioId = anuncioId;
    }

    public Integer getAnuncioId() {
        return anuncioId;
    }

    public void setAnuncioId(Integer anuncioId) {
        this.anuncioId = anuncioId;
    }

    public String getAnuncioTipo() {
        return anuncioTipo;
    }

    public void setAnuncioTipo(String anuncioTipo) {
        this.anuncioTipo = anuncioTipo;
    }

    public String getAnuncioCategoria() {
        return anuncioCategoria;
    }

    public void setAnuncioCategoria(String anuncioCategoria) {
        this.anuncioCategoria = anuncioCategoria;
    }

    public String getAnuncioDescricao() {
        return anuncioDescricao;
    }

    public void setAnuncioDescricao(String anuncioDescricao) {
        this.anuncioDescricao = anuncioDescricao;
    }

    public Date getAnuncioData() {
        return anuncioData;
    }

    public void setAnuncioData(Date anuncioData) {
        this.anuncioData = anuncioData;
    }

    public String getAnuncioImagem() {
        return anuncioImagem;
    }

    public void setAnuncioImagem(String anuncioImagem) {
        this.anuncioImagem = anuncioImagem;
    }

    public String getAnuncioTempo() {
        return anuncioTempo;
    }

    public void setAnuncioTempo(String anuncioTempo) {
        this.anuncioTempo = anuncioTempo;
    }

    @XmlTransient
    public List<Documento> getDocumentoList() {
        return documentoList;
    }

    public void setDocumentoList(List<Documento> documentoList) {
        this.documentoList = documentoList;
    }

    public AnuncioStatus getAnuncioStatusAnuncioStatusId() {
        return anuncioStatusAnuncioStatusId;
    }

    public void setAnuncioStatusAnuncioStatusId(AnuncioStatus anuncioStatusAnuncioStatusId) {
        this.anuncioStatusAnuncioStatusId = anuncioStatusAnuncioStatusId;
    }

    public Conta getContaConta() {
        return contaConta;
    }

    public void setContaConta(Conta contaConta) {
        this.contaConta = contaConta;
    }

    @XmlTransient
    public List<Pagina> getPaginaList() {
        return paginaList;
    }

    public void setPaginaList(List<Pagina> paginaList) {
        this.paginaList = paginaList;
    }

    @XmlTransient
    public List<Mensagem> getMensagemList() {
        return mensagemList;
    }

    public void setMensagemList(List<Mensagem> mensagemList) {
        this.mensagemList = mensagemList;
    }

    @XmlTransient
    public List<Social> getSocialList() {
        return socialList;
    }

    public void setSocialList(List<Social> socialList) {
        this.socialList = socialList;
    }

    @XmlTransient
    public List<Servico> getServicoList() {
        return servicoList;
    }

    public void setServicoList(List<Servico> servicoList) {
        this.servicoList = servicoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (anuncioId != null ? anuncioId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Anuncio)) {
            return false;
        }
        Anuncio other = (Anuncio) object;
        if ((this.anuncioId == null && other.anuncioId != null) || (this.anuncioId != null && !this.anuncioId.equals(other.anuncioId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jsn.entidade.Anuncio[ anuncioId=" + anuncioId + " ]";
    }
    
}
