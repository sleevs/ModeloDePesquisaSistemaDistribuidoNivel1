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
@Table(name = "social")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Social.findAll", query = "SELECT s FROM Social s")
    , @NamedQuery(name = "Social.findBySocialId", query = "SELECT s FROM Social s WHERE s.socialId = :socialId")
    , @NamedQuery(name = "Social.findBySocialData", query = "SELECT s FROM Social s WHERE s.socialData = :socialData")
    , @NamedQuery(name = "Social.findBySocialNome", query = "SELECT s FROM Social s WHERE s.socialNome = :socialNome")
    , @NamedQuery(name = "Social.findBySocialStatus", query = "SELECT s FROM Social s WHERE s.socialStatus = :socialStatus")
    , @NamedQuery(name = "Social.findBySocialFlag", query = "SELECT s FROM Social s WHERE s.socialFlag = :socialFlag")})
public class Social implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "social_id")
    private Integer socialId;
    @Column(name = "social_data")
    @Temporal(TemporalType.DATE)
    private Date socialData;
    @Size(max = 45)
    @Column(name = "social_nome")
    private String socialNome;
    @Size(max = 45)
    @Column(name = "social_status")
    private String socialStatus;
    @Lob
    @Size(max = 65535)
    @Column(name = "social_descricao")
    private String socialDescricao;
    @Lob
    @Size(max = 65535)
    @Column(name = "social_imagem")
    private String socialImagem;
    @Column(name = "social_flag")
    private Integer socialFlag;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "socialSocialId")
    private List<Curtir> curtirList;
    @JoinColumn(name = "anuncio_anuncio_id", referencedColumnName = "anuncio_id")
    @ManyToOne(optional = false)
    private Anuncio anuncioAnuncioId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "socialSocialId")
    private List<Membro> membroList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "socialSocialId")
    private List<Compartilhar> compartilharList;

    public Social() {
    }

    public Social(Integer socialId) {
        this.socialId = socialId;
    }

    public Integer getSocialId() {
        return socialId;
    }

    public void setSocialId(Integer socialId) {
        this.socialId = socialId;
    }

    public Date getSocialData() {
        return socialData;
    }

    public void setSocialData(Date socialData) {
        this.socialData = socialData;
    }

    public String getSocialNome() {
        return socialNome;
    }

    public void setSocialNome(String socialNome) {
        this.socialNome = socialNome;
    }

    public String getSocialStatus() {
        return socialStatus;
    }

    public void setSocialStatus(String socialStatus) {
        this.socialStatus = socialStatus;
    }

    public String getSocialDescricao() {
        return socialDescricao;
    }

    public void setSocialDescricao(String socialDescricao) {
        this.socialDescricao = socialDescricao;
    }

    public String getSocialImagem() {
        return socialImagem;
    }

    public void setSocialImagem(String socialImagem) {
        this.socialImagem = socialImagem;
    }

    public Integer getSocialFlag() {
        return socialFlag;
    }

    public void setSocialFlag(Integer socialFlag) {
        this.socialFlag = socialFlag;
    }

    @XmlTransient
    public List<Curtir> getCurtirList() {
        return curtirList;
    }

    public void setCurtirList(List<Curtir> curtirList) {
        this.curtirList = curtirList;
    }

    public Anuncio getAnuncioAnuncioId() {
        return anuncioAnuncioId;
    }

    public void setAnuncioAnuncioId(Anuncio anuncioAnuncioId) {
        this.anuncioAnuncioId = anuncioAnuncioId;
    }

    @XmlTransient
    public List<Membro> getMembroList() {
        return membroList;
    }

    public void setMembroList(List<Membro> membroList) {
        this.membroList = membroList;
    }

    @XmlTransient
    public List<Compartilhar> getCompartilharList() {
        return compartilharList;
    }

    public void setCompartilharList(List<Compartilhar> compartilharList) {
        this.compartilharList = compartilharList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (socialId != null ? socialId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Social)) {
            return false;
        }
        Social other = (Social) object;
        if ((this.socialId == null && other.socialId != null) || (this.socialId != null && !this.socialId.equals(other.socialId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jsn.entidade.Social[ socialId=" + socialId + " ]";
    }
    
}
