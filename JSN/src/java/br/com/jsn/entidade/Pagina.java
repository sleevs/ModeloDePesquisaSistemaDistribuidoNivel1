/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jsn.entidade;

import java.io.Serializable;
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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author ADMINIBM
 */
@Entity
@Table(name = "pagina")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pagina.findAll", query = "SELECT p FROM Pagina p")
    , @NamedQuery(name = "Pagina.findByPaginaId", query = "SELECT p FROM Pagina p WHERE p.paginaId = :paginaId")
    , @NamedQuery(name = "Pagina.findByPaginaTipo", query = "SELECT p FROM Pagina p WHERE p.paginaTipo = :paginaTipo")
    , @NamedQuery(name = "Pagina.findByPaginaCategoria", query = "SELECT p FROM Pagina p WHERE p.paginaCategoria = :paginaCategoria")})
public class Pagina implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "pagina_id")
    private Integer paginaId;
    @Size(max = 45)
    @Column(name = "pagina_tipo")
    private String paginaTipo;
    @Size(max = 45)
    @Column(name = "pagina_categoria")
    private String paginaCategoria;
    @Lob
    @Size(max = 65535)
    @Column(name = "pagina_url")
    private String paginaUrl;
    @Lob
    @Size(max = 65535)
    @Column(name = "pagina_endereco")
    private String paginaEndereco;
    @JoinColumn(name = "anuncio_anuncio_id", referencedColumnName = "anuncio_id")
    @ManyToOne(optional = false)
    private Anuncio anuncioAnuncioId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "paginaPaginaId")
    private List<VisitaPagina> visitaPaginaList;

    public Pagina() {
    }

    public Pagina(Integer paginaId) {
        this.paginaId = paginaId;
    }

    public Integer getPaginaId() {
        return paginaId;
    }

    public void setPaginaId(Integer paginaId) {
        this.paginaId = paginaId;
    }

    public String getPaginaTipo() {
        return paginaTipo;
    }

    public void setPaginaTipo(String paginaTipo) {
        this.paginaTipo = paginaTipo;
    }

    public String getPaginaCategoria() {
        return paginaCategoria;
    }

    public void setPaginaCategoria(String paginaCategoria) {
        this.paginaCategoria = paginaCategoria;
    }

    public String getPaginaUrl() {
        return paginaUrl;
    }

    public void setPaginaUrl(String paginaUrl) {
        this.paginaUrl = paginaUrl;
    }

    public String getPaginaEndereco() {
        return paginaEndereco;
    }

    public void setPaginaEndereco(String paginaEndereco) {
        this.paginaEndereco = paginaEndereco;
    }

    public Anuncio getAnuncioAnuncioId() {
        return anuncioAnuncioId;
    }

    public void setAnuncioAnuncioId(Anuncio anuncioAnuncioId) {
        this.anuncioAnuncioId = anuncioAnuncioId;
    }

    @XmlTransient
    public List<VisitaPagina> getVisitaPaginaList() {
        return visitaPaginaList;
    }

    public void setVisitaPaginaList(List<VisitaPagina> visitaPaginaList) {
        this.visitaPaginaList = visitaPaginaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (paginaId != null ? paginaId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pagina)) {
            return false;
        }
        Pagina other = (Pagina) object;
        if ((this.paginaId == null && other.paginaId != null) || (this.paginaId != null && !this.paginaId.equals(other.paginaId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jsn.entidade.Pagina[ paginaId=" + paginaId + " ]";
    }
    
}
