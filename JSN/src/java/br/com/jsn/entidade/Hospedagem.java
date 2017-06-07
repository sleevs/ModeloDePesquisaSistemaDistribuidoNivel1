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
@Table(name = "hospedagem")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Hospedagem.findAll", query = "SELECT h FROM Hospedagem h")
    , @NamedQuery(name = "Hospedagem.findByHospedagemId", query = "SELECT h FROM Hospedagem h WHERE h.hospedagemId = :hospedagemId")
    , @NamedQuery(name = "Hospedagem.findByHospedagemData", query = "SELECT h FROM Hospedagem h WHERE h.hospedagemData = :hospedagemData")
    , @NamedQuery(name = "Hospedagem.findByHospedagemValor", query = "SELECT h FROM Hospedagem h WHERE h.hospedagemValor = :hospedagemValor")
    , @NamedQuery(name = "Hospedagem.findByHospedagemTotal", query = "SELECT h FROM Hospedagem h WHERE h.hospedagemTotal = :hospedagemTotal")
    , @NamedQuery(name = "Hospedagem.findByHospedagemTipo", query = "SELECT h FROM Hospedagem h WHERE h.hospedagemTipo = :hospedagemTipo")
    , @NamedQuery(name = "Hospedagem.findByHospedagemCategoria", query = "SELECT h FROM Hospedagem h WHERE h.hospedagemCategoria = :hospedagemCategoria")
    , @NamedQuery(name = "Hospedagem.findByEnderecoLocalizacao", query = "SELECT h FROM Hospedagem h WHERE h.enderecoLocalizacao = :enderecoLocalizacao")})
public class Hospedagem implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "hospedagem_id")
    private Integer hospedagemId;
    @Column(name = "hospedagem_data")
    @Temporal(TemporalType.DATE)
    private Date hospedagemData;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "hospedagem_valor")
    private Double hospedagemValor;
    @Column(name = "hospedagem_total")
    private Double hospedagemTotal;
    @Size(max = 45)
    @Column(name = "hospedagem_tipo")
    private String hospedagemTipo;
    @Size(max = 45)
    @Column(name = "hospedagem_categoria")
    private String hospedagemCategoria;
    @Lob
    @Size(max = 65535)
    @Column(name = "hospedagem_imagem")
    private String hospedagemImagem;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "hospedagem_descricao")
    private String hospedagemDescricao;
    @Size(max = 45)
    @Column(name = "endereco_localizacao")
    private String enderecoLocalizacao;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "hospedagemHospedagemId")
    private List<Reserva> reservaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "hospedagemHospedagemId")
    private List<HospedagemServico> hospedagemServicoList;
    @JoinColumn(name = "endereco_endereco_id", referencedColumnName = "endereco_id")
    @ManyToOne(optional = false)
    private Endereco enderecoEnderecoId;
    @JoinColumn(name = "hospedagem_status_hospedagem_status_id", referencedColumnName = "hospedagem_status_id")
    @ManyToOne(optional = false)
    private HospedagemStatus hospedagemStatusHospedagemStatusId;
    @JoinColumn(name = "precos_preco_id", referencedColumnName = "preco_id")
    @ManyToOne(optional = false)
    private Precos precosPrecoId;

    public Hospedagem() {
    }

    public Hospedagem(Integer hospedagemId) {
        this.hospedagemId = hospedagemId;
    }

    public Integer getHospedagemId() {
        return hospedagemId;
    }

    public void setHospedagemId(Integer hospedagemId) {
        this.hospedagemId = hospedagemId;
    }

    public Date getHospedagemData() {
        return hospedagemData;
    }

    public void setHospedagemData(Date hospedagemData) {
        this.hospedagemData = hospedagemData;
    }

    public Double getHospedagemValor() {
        return hospedagemValor;
    }

    public void setHospedagemValor(Double hospedagemValor) {
        this.hospedagemValor = hospedagemValor;
    }

    public Double getHospedagemTotal() {
        return hospedagemTotal;
    }

    public void setHospedagemTotal(Double hospedagemTotal) {
        this.hospedagemTotal = hospedagemTotal;
    }

    public String getHospedagemTipo() {
        return hospedagemTipo;
    }

    public void setHospedagemTipo(String hospedagemTipo) {
        this.hospedagemTipo = hospedagemTipo;
    }

    public String getHospedagemCategoria() {
        return hospedagemCategoria;
    }

    public void setHospedagemCategoria(String hospedagemCategoria) {
        this.hospedagemCategoria = hospedagemCategoria;
    }

    public String getHospedagemImagem() {
        return hospedagemImagem;
    }

    public void setHospedagemImagem(String hospedagemImagem) {
        this.hospedagemImagem = hospedagemImagem;
    }

    public String getHospedagemDescricao() {
        return hospedagemDescricao;
    }

    public void setHospedagemDescricao(String hospedagemDescricao) {
        this.hospedagemDescricao = hospedagemDescricao;
    }

    public String getEnderecoLocalizacao() {
        return enderecoLocalizacao;
    }

    public void setEnderecoLocalizacao(String enderecoLocalizacao) {
        this.enderecoLocalizacao = enderecoLocalizacao;
    }

    @XmlTransient
    public List<Reserva> getReservaList() {
        return reservaList;
    }

    public void setReservaList(List<Reserva> reservaList) {
        this.reservaList = reservaList;
    }

    @XmlTransient
    public List<HospedagemServico> getHospedagemServicoList() {
        return hospedagemServicoList;
    }

    public void setHospedagemServicoList(List<HospedagemServico> hospedagemServicoList) {
        this.hospedagemServicoList = hospedagemServicoList;
    }

    public Endereco getEnderecoEnderecoId() {
        return enderecoEnderecoId;
    }

    public void setEnderecoEnderecoId(Endereco enderecoEnderecoId) {
        this.enderecoEnderecoId = enderecoEnderecoId;
    }

    public HospedagemStatus getHospedagemStatusHospedagemStatusId() {
        return hospedagemStatusHospedagemStatusId;
    }

    public void setHospedagemStatusHospedagemStatusId(HospedagemStatus hospedagemStatusHospedagemStatusId) {
        this.hospedagemStatusHospedagemStatusId = hospedagemStatusHospedagemStatusId;
    }

    public Precos getPrecosPrecoId() {
        return precosPrecoId;
    }

    public void setPrecosPrecoId(Precos precosPrecoId) {
        this.precosPrecoId = precosPrecoId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (hospedagemId != null ? hospedagemId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Hospedagem)) {
            return false;
        }
        Hospedagem other = (Hospedagem) object;
        if ((this.hospedagemId == null && other.hospedagemId != null) || (this.hospedagemId != null && !this.hospedagemId.equals(other.hospedagemId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jsn.entidade.Hospedagem[ hospedagemId=" + hospedagemId + " ]";
    }
    
}
