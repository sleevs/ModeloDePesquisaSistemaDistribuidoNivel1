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
import javax.persistence.Lob;
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
@Table(name = "carga")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Carga.findAll", query = "SELECT c FROM Carga c")
    , @NamedQuery(name = "Carga.findByCargaId", query = "SELECT c FROM Carga c WHERE c.cargaId = :cargaId")
    , @NamedQuery(name = "Carga.findByCargaTipo", query = "SELECT c FROM Carga c WHERE c.cargaTipo = :cargaTipo")
    , @NamedQuery(name = "Carga.findByCargaCategoria", query = "SELECT c FROM Carga c WHERE c.cargaCategoria = :cargaCategoria")
    , @NamedQuery(name = "Carga.findByCargaQuantidade", query = "SELECT c FROM Carga c WHERE c.cargaQuantidade = :cargaQuantidade")
    , @NamedQuery(name = "Carga.findByCargaPeso", query = "SELECT c FROM Carga c WHERE c.cargaPeso = :cargaPeso")
    , @NamedQuery(name = "Carga.findByCargaLargura", query = "SELECT c FROM Carga c WHERE c.cargaLargura = :cargaLargura")
    , @NamedQuery(name = "Carga.findByCargaAltura", query = "SELECT c FROM Carga c WHERE c.cargaAltura = :cargaAltura")
    , @NamedQuery(name = "Carga.findByCargaComprimento", query = "SELECT c FROM Carga c WHERE c.cargaComprimento = :cargaComprimento")
    , @NamedQuery(name = "Carga.findByCargaDescricao", query = "SELECT c FROM Carga c WHERE c.cargaDescricao = :cargaDescricao")
    , @NamedQuery(name = "Carga.findByCargaEstado", query = "SELECT c FROM Carga c WHERE c.cargaEstado = :cargaEstado")})
public class Carga implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "carga_id")
    private Integer cargaId;
    @Size(max = 45)
    @Column(name = "carga_tipo")
    private String cargaTipo;
    @Size(max = 45)
    @Column(name = "carga_categoria")
    private String cargaCategoria;
    @Size(max = 45)
    @Column(name = "carga_quantidade")
    private String cargaQuantidade;
    @Size(max = 45)
    @Column(name = "carga_peso")
    private String cargaPeso;
    @Size(max = 45)
    @Column(name = "carga_largura")
    private String cargaLargura;
    @Size(max = 45)
    @Column(name = "carga_altura")
    private String cargaAltura;
    @Size(max = 45)
    @Column(name = "carga_comprimento")
    private String cargaComprimento;
    @Size(max = 45)
    @Column(name = "carga_descricao")
    private String cargaDescricao;
    @Lob
    @Size(max = 65535)
    @Column(name = "carga_imagem")
    private String cargaImagem;
    @Size(max = 45)
    @Column(name = "carga_estado")
    private String cargaEstado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cargaCargaId")
    private List<Pedido> pedidoList;

    public Carga() {
    }

    public Carga(Integer cargaId) {
        this.cargaId = cargaId;
    }

    public Integer getCargaId() {
        return cargaId;
    }

    public void setCargaId(Integer cargaId) {
        this.cargaId = cargaId;
    }

    public String getCargaTipo() {
        return cargaTipo;
    }

    public void setCargaTipo(String cargaTipo) {
        this.cargaTipo = cargaTipo;
    }

    public String getCargaCategoria() {
        return cargaCategoria;
    }

    public void setCargaCategoria(String cargaCategoria) {
        this.cargaCategoria = cargaCategoria;
    }

    public String getCargaQuantidade() {
        return cargaQuantidade;
    }

    public void setCargaQuantidade(String cargaQuantidade) {
        this.cargaQuantidade = cargaQuantidade;
    }

    public String getCargaPeso() {
        return cargaPeso;
    }

    public void setCargaPeso(String cargaPeso) {
        this.cargaPeso = cargaPeso;
    }

    public String getCargaLargura() {
        return cargaLargura;
    }

    public void setCargaLargura(String cargaLargura) {
        this.cargaLargura = cargaLargura;
    }

    public String getCargaAltura() {
        return cargaAltura;
    }

    public void setCargaAltura(String cargaAltura) {
        this.cargaAltura = cargaAltura;
    }

    public String getCargaComprimento() {
        return cargaComprimento;
    }

    public void setCargaComprimento(String cargaComprimento) {
        this.cargaComprimento = cargaComprimento;
    }

    public String getCargaDescricao() {
        return cargaDescricao;
    }

    public void setCargaDescricao(String cargaDescricao) {
        this.cargaDescricao = cargaDescricao;
    }

    public String getCargaImagem() {
        return cargaImagem;
    }

    public void setCargaImagem(String cargaImagem) {
        this.cargaImagem = cargaImagem;
    }

    public String getCargaEstado() {
        return cargaEstado;
    }

    public void setCargaEstado(String cargaEstado) {
        this.cargaEstado = cargaEstado;
    }

    @XmlTransient
    public List<Pedido> getPedidoList() {
        return pedidoList;
    }

    public void setPedidoList(List<Pedido> pedidoList) {
        this.pedidoList = pedidoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cargaId != null ? cargaId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Carga)) {
            return false;
        }
        Carga other = (Carga) object;
        if ((this.cargaId == null && other.cargaId != null) || (this.cargaId != null && !this.cargaId.equals(other.cargaId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jsn.entidade.Carga[ cargaId=" + cargaId + " ]";
    }
    
}
