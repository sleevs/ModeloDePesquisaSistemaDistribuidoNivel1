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
@Table(name = "rota")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Rota.findAll", query = "SELECT r FROM Rota r")
    , @NamedQuery(name = "Rota.findByRotaId", query = "SELECT r FROM Rota r WHERE r.rotaId = :rotaId")
    , @NamedQuery(name = "Rota.findByRotaOrigemLogradouro", query = "SELECT r FROM Rota r WHERE r.rotaOrigemLogradouro = :rotaOrigemLogradouro")
    , @NamedQuery(name = "Rota.findByRotaOrigemCep", query = "SELECT r FROM Rota r WHERE r.rotaOrigemCep = :rotaOrigemCep")
    , @NamedQuery(name = "Rota.findByRotaOrigemCidade", query = "SELECT r FROM Rota r WHERE r.rotaOrigemCidade = :rotaOrigemCidade")
    , @NamedQuery(name = "Rota.findByRotaOrigemUf", query = "SELECT r FROM Rota r WHERE r.rotaOrigemUf = :rotaOrigemUf")
    , @NamedQuery(name = "Rota.findByRotaOrigemBairro", query = "SELECT r FROM Rota r WHERE r.rotaOrigemBairro = :rotaOrigemBairro")
    , @NamedQuery(name = "Rota.findByRotaOrigemPais", query = "SELECT r FROM Rota r WHERE r.rotaOrigemPais = :rotaOrigemPais")
    , @NamedQuery(name = "Rota.findByRotaOrigemComplemento", query = "SELECT r FROM Rota r WHERE r.rotaOrigemComplemento = :rotaOrigemComplemento")
    , @NamedQuery(name = "Rota.findByRotaDestinoCep", query = "SELECT r FROM Rota r WHERE r.rotaDestinoCep = :rotaDestinoCep")
    , @NamedQuery(name = "Rota.findByRotaDestinoLogradouro", query = "SELECT r FROM Rota r WHERE r.rotaDestinoLogradouro = :rotaDestinoLogradouro")
    , @NamedQuery(name = "Rota.findByRotaDestinoUf", query = "SELECT r FROM Rota r WHERE r.rotaDestinoUf = :rotaDestinoUf")
    , @NamedQuery(name = "Rota.findByRotaDestinoCidade", query = "SELECT r FROM Rota r WHERE r.rotaDestinoCidade = :rotaDestinoCidade")
    , @NamedQuery(name = "Rota.findByRotaDestinoBairro", query = "SELECT r FROM Rota r WHERE r.rotaDestinoBairro = :rotaDestinoBairro")
    , @NamedQuery(name = "Rota.findByRotaDestinoPais", query = "SELECT r FROM Rota r WHERE r.rotaDestinoPais = :rotaDestinoPais")
    , @NamedQuery(name = "Rota.findByRotaDestinoComplemento", query = "SELECT r FROM Rota r WHERE r.rotaDestinoComplemento = :rotaDestinoComplemento")
    , @NamedQuery(name = "Rota.findByRotaTipo", query = "SELECT r FROM Rota r WHERE r.rotaTipo = :rotaTipo")
    , @NamedQuery(name = "Rota.findByRotaFlag", query = "SELECT r FROM Rota r WHERE r.rotaFlag = :rotaFlag")
    , @NamedQuery(name = "Rota.findByRotaCategoria", query = "SELECT r FROM Rota r WHERE r.rotaCategoria = :rotaCategoria")
    , @NamedQuery(name = "Rota.findByRotaDataSaida", query = "SELECT r FROM Rota r WHERE r.rotaDataSaida = :rotaDataSaida")
    , @NamedQuery(name = "Rota.findByRotaDataChegada", query = "SELECT r FROM Rota r WHERE r.rotaDataChegada = :rotaDataChegada")
    , @NamedQuery(name = "Rota.findByRotaDescricao", query = "SELECT r FROM Rota r WHERE r.rotaDescricao = :rotaDescricao")})
public class Rota implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "rota_id")
    private Integer rotaId;
    @Size(max = 45)
    @Column(name = "rota_origem_logradouro")
    private String rotaOrigemLogradouro;
    @Size(max = 45)
    @Column(name = "rota_origem_cep")
    private String rotaOrigemCep;
    @Size(max = 45)
    @Column(name = "rota_origem_cidade")
    private String rotaOrigemCidade;
    @Size(max = 45)
    @Column(name = "rota_origem_uf")
    private String rotaOrigemUf;
    @Size(max = 45)
    @Column(name = "rota_origem_bairro")
    private String rotaOrigemBairro;
    @Size(max = 45)
    @Column(name = "rota_origem_pais")
    private String rotaOrigemPais;
    @Size(max = 45)
    @Column(name = "rota_origem_complemento")
    private String rotaOrigemComplemento;
    @Size(max = 45)
    @Column(name = "rota_destino_cep")
    private String rotaDestinoCep;
    @Size(max = 45)
    @Column(name = "rota_destino_logradouro")
    private String rotaDestinoLogradouro;
    @Size(max = 45)
    @Column(name = "rota_destino_uf")
    private String rotaDestinoUf;
    @Size(max = 45)
    @Column(name = "rota_destino_cidade")
    private String rotaDestinoCidade;
    @Size(max = 45)
    @Column(name = "rota_destino_bairro")
    private String rotaDestinoBairro;
    @Size(max = 45)
    @Column(name = "rota_destino_pais")
    private String rotaDestinoPais;
    @Size(max = 45)
    @Column(name = "rota_destino_complemento")
    private String rotaDestinoComplemento;
    @Size(max = 45)
    @Column(name = "rota_tipo")
    private String rotaTipo;
    @Column(name = "rota_flag")
    private Integer rotaFlag;
    @Size(max = 45)
    @Column(name = "rota_categoria")
    private String rotaCategoria;
    @Column(name = "rota_data_saida")
    @Temporal(TemporalType.DATE)
    private Date rotaDataSaida;
    @Column(name = "rota_data_chegada")
    @Temporal(TemporalType.DATE)
    private Date rotaDataChegada;
    @Size(max = 255)
    @Column(name = "rota_descricao")
    private String rotaDescricao;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "rotaRotaId")
    private List<Entrega> entregaList;

    public Rota() {
    }

    public Rota(Integer rotaId) {
        this.rotaId = rotaId;
    }

    public Integer getRotaId() {
        return rotaId;
    }

    public void setRotaId(Integer rotaId) {
        this.rotaId = rotaId;
    }

    public String getRotaOrigemLogradouro() {
        return rotaOrigemLogradouro;
    }

    public void setRotaOrigemLogradouro(String rotaOrigemLogradouro) {
        this.rotaOrigemLogradouro = rotaOrigemLogradouro;
    }

    public String getRotaOrigemCep() {
        return rotaOrigemCep;
    }

    public void setRotaOrigemCep(String rotaOrigemCep) {
        this.rotaOrigemCep = rotaOrigemCep;
    }

    public String getRotaOrigemCidade() {
        return rotaOrigemCidade;
    }

    public void setRotaOrigemCidade(String rotaOrigemCidade) {
        this.rotaOrigemCidade = rotaOrigemCidade;
    }

    public String getRotaOrigemUf() {
        return rotaOrigemUf;
    }

    public void setRotaOrigemUf(String rotaOrigemUf) {
        this.rotaOrigemUf = rotaOrigemUf;
    }

    public String getRotaOrigemBairro() {
        return rotaOrigemBairro;
    }

    public void setRotaOrigemBairro(String rotaOrigemBairro) {
        this.rotaOrigemBairro = rotaOrigemBairro;
    }

    public String getRotaOrigemPais() {
        return rotaOrigemPais;
    }

    public void setRotaOrigemPais(String rotaOrigemPais) {
        this.rotaOrigemPais = rotaOrigemPais;
    }

    public String getRotaOrigemComplemento() {
        return rotaOrigemComplemento;
    }

    public void setRotaOrigemComplemento(String rotaOrigemComplemento) {
        this.rotaOrigemComplemento = rotaOrigemComplemento;
    }

    public String getRotaDestinoCep() {
        return rotaDestinoCep;
    }

    public void setRotaDestinoCep(String rotaDestinoCep) {
        this.rotaDestinoCep = rotaDestinoCep;
    }

    public String getRotaDestinoLogradouro() {
        return rotaDestinoLogradouro;
    }

    public void setRotaDestinoLogradouro(String rotaDestinoLogradouro) {
        this.rotaDestinoLogradouro = rotaDestinoLogradouro;
    }

    public String getRotaDestinoUf() {
        return rotaDestinoUf;
    }

    public void setRotaDestinoUf(String rotaDestinoUf) {
        this.rotaDestinoUf = rotaDestinoUf;
    }

    public String getRotaDestinoCidade() {
        return rotaDestinoCidade;
    }

    public void setRotaDestinoCidade(String rotaDestinoCidade) {
        this.rotaDestinoCidade = rotaDestinoCidade;
    }

    public String getRotaDestinoBairro() {
        return rotaDestinoBairro;
    }

    public void setRotaDestinoBairro(String rotaDestinoBairro) {
        this.rotaDestinoBairro = rotaDestinoBairro;
    }

    public String getRotaDestinoPais() {
        return rotaDestinoPais;
    }

    public void setRotaDestinoPais(String rotaDestinoPais) {
        this.rotaDestinoPais = rotaDestinoPais;
    }

    public String getRotaDestinoComplemento() {
        return rotaDestinoComplemento;
    }

    public void setRotaDestinoComplemento(String rotaDestinoComplemento) {
        this.rotaDestinoComplemento = rotaDestinoComplemento;
    }

    public String getRotaTipo() {
        return rotaTipo;
    }

    public void setRotaTipo(String rotaTipo) {
        this.rotaTipo = rotaTipo;
    }

    public Integer getRotaFlag() {
        return rotaFlag;
    }

    public void setRotaFlag(Integer rotaFlag) {
        this.rotaFlag = rotaFlag;
    }

    public String getRotaCategoria() {
        return rotaCategoria;
    }

    public void setRotaCategoria(String rotaCategoria) {
        this.rotaCategoria = rotaCategoria;
    }

    public Date getRotaDataSaida() {
        return rotaDataSaida;
    }

    public void setRotaDataSaida(Date rotaDataSaida) {
        this.rotaDataSaida = rotaDataSaida;
    }

    public Date getRotaDataChegada() {
        return rotaDataChegada;
    }

    public void setRotaDataChegada(Date rotaDataChegada) {
        this.rotaDataChegada = rotaDataChegada;
    }

    public String getRotaDescricao() {
        return rotaDescricao;
    }

    public void setRotaDescricao(String rotaDescricao) {
        this.rotaDescricao = rotaDescricao;
    }

    @XmlTransient
    public List<Entrega> getEntregaList() {
        return entregaList;
    }

    public void setEntregaList(List<Entrega> entregaList) {
        this.entregaList = entregaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rotaId != null ? rotaId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Rota)) {
            return false;
        }
        Rota other = (Rota) object;
        if ((this.rotaId == null && other.rotaId != null) || (this.rotaId != null && !this.rotaId.equals(other.rotaId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jsn.entidade.Rota[ rotaId=" + rotaId + " ]";
    }
    
}
