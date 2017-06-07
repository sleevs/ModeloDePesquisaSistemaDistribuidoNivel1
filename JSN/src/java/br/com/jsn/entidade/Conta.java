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
@Table(name = "conta")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Conta.findAll", query = "SELECT c FROM Conta c")
    , @NamedQuery(name = "Conta.findByContaId", query = "SELECT c FROM Conta c WHERE c.contaId = :contaId")
    , @NamedQuery(name = "Conta.findByContaNome", query = "SELECT c FROM Conta c WHERE c.contaNome = :contaNome")
    , @NamedQuery(name = "Conta.findByContaSobrenome", query = "SELECT c FROM Conta c WHERE c.contaSobrenome = :contaSobrenome")
    , @NamedQuery(name = "Conta.findByContaTipo", query = "SELECT c FROM Conta c WHERE c.contaTipo = :contaTipo")
    , @NamedQuery(name = "Conta.findByContaCategoria", query = "SELECT c FROM Conta c WHERE c.contaCategoria = :contaCategoria")
    , @NamedQuery(name = "Conta.findByContaEmail", query = "SELECT c FROM Conta c WHERE c.contaEmail = :contaEmail")
    , @NamedQuery(name = "Conta.findByContaApelido", query = "SELECT c FROM Conta c WHERE c.contaApelido = :contaApelido")
    , @NamedQuery(name = "Conta.findByContaData", query = "SELECT c FROM Conta c WHERE c.contaData = :contaData")
    , @NamedQuery(name = "Conta.findByContaNascimento", query = "SELECT c FROM Conta c WHERE c.contaNascimento = :contaNascimento")
    , @NamedQuery(name = "Conta.findByContaSenha", query = "SELECT c FROM Conta c WHERE c.contaSenha = :contaSenha")})
public class Conta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "conta_id")
    private Integer contaId;
    @Size(max = 45)
    @Column(name = "conta_nome")
    private String contaNome;
    @Size(max = 45)
    @Column(name = "conta_sobrenome")
    private String contaSobrenome;
    @Size(max = 45)
    @Column(name = "conta_tipo")
    private String contaTipo;
    @Size(max = 45)
    @Column(name = "conta_categoria")
    private String contaCategoria;
    @Size(max = 45)
    @Column(name = "conta_email")
    private String contaEmail;
    @Size(max = 45)
    @Column(name = "conta_apelido")
    private String contaApelido;
    @Column(name = "conta_data")
    @Temporal(TemporalType.DATE)
    private Date contaData;
    @Column(name = "conta_nascimento")
    @Temporal(TemporalType.DATE)
    private Date contaNascimento;
    @Size(max = 45)
    @Column(name = "conta_senha")
    private String contaSenha;
    @Lob
    @Size(max = 65535)
    @Column(name = "conta_foto")
    private String contaFoto;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "contaContaId")
    private List<FormaPagamento> formaPagamentoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "contaConta")
    private List<Anuncio> anuncioList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "contaConta")
    private List<Arquivo> arquivoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "contaConta")
    private List<Chamada> chamadaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "contaConta")
    private List<Visita> visitaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "contaContaId")
    private List<Pagamento> pagamentoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "contaConta")
    private List<Mensagem> mensagemList;
    @JoinColumn(name = "assinatura_assinatura_id", referencedColumnName = "assinatura_id")
    @ManyToOne(optional = false)
    private Assinatura assinaturaAssinaturaId;
    @JoinColumn(name = "conta_status_conta_status_id", referencedColumnName = "conta_status_id")
    @ManyToOne(optional = false)
    private ContaStatus contaStatusContaStatusId;
    @JoinColumn(name = "security_conta_security_security_id", referencedColumnName = "security_security_id")
    @ManyToOne(optional = false)
    private SecurityConta securityContaSecuritySecurityId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "contaConta")
    private List<Curtir> curtirList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "contaConta")
    private List<Qualificar> qualificarList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "contaConta")
    private List<Membro> membroList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "contaConta")
    private List<Registro> registroList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "contaConta")
    private List<Compartilhar> compartilharList;

    public Conta() {
    }

    public Conta(Integer contaId) {
        this.contaId = contaId;
    }

    public Integer getContaId() {
        return contaId;
    }

    public void setContaId(Integer contaId) {
        this.contaId = contaId;
    }

    public String getContaNome() {
        return contaNome;
    }

    public void setContaNome(String contaNome) {
        this.contaNome = contaNome;
    }

    public String getContaSobrenome() {
        return contaSobrenome;
    }

    public void setContaSobrenome(String contaSobrenome) {
        this.contaSobrenome = contaSobrenome;
    }

    public String getContaTipo() {
        return contaTipo;
    }

    public void setContaTipo(String contaTipo) {
        this.contaTipo = contaTipo;
    }

    public String getContaCategoria() {
        return contaCategoria;
    }

    public void setContaCategoria(String contaCategoria) {
        this.contaCategoria = contaCategoria;
    }

    public String getContaEmail() {
        return contaEmail;
    }

    public void setContaEmail(String contaEmail) {
        this.contaEmail = contaEmail;
    }

    public String getContaApelido() {
        return contaApelido;
    }

    public void setContaApelido(String contaApelido) {
        this.contaApelido = contaApelido;
    }

    public Date getContaData() {
        return contaData;
    }

    public void setContaData(Date contaData) {
        this.contaData = contaData;
    }

    public Date getContaNascimento() {
        return contaNascimento;
    }

    public void setContaNascimento(Date contaNascimento) {
        this.contaNascimento = contaNascimento;
    }

    public String getContaSenha() {
        return contaSenha;
    }

    public void setContaSenha(String contaSenha) {
        this.contaSenha = contaSenha;
    }

    public String getContaFoto() {
        return contaFoto;
    }

    public void setContaFoto(String contaFoto) {
        this.contaFoto = contaFoto;
    }

    @XmlTransient
    public List<FormaPagamento> getFormaPagamentoList() {
        return formaPagamentoList;
    }

    public void setFormaPagamentoList(List<FormaPagamento> formaPagamentoList) {
        this.formaPagamentoList = formaPagamentoList;
    }

    @XmlTransient
    public List<Anuncio> getAnuncioList() {
        return anuncioList;
    }

    public void setAnuncioList(List<Anuncio> anuncioList) {
        this.anuncioList = anuncioList;
    }

    @XmlTransient
    public List<Arquivo> getArquivoList() {
        return arquivoList;
    }

    public void setArquivoList(List<Arquivo> arquivoList) {
        this.arquivoList = arquivoList;
    }

    @XmlTransient
    public List<Chamada> getChamadaList() {
        return chamadaList;
    }

    public void setChamadaList(List<Chamada> chamadaList) {
        this.chamadaList = chamadaList;
    }

    @XmlTransient
    public List<Visita> getVisitaList() {
        return visitaList;
    }

    public void setVisitaList(List<Visita> visitaList) {
        this.visitaList = visitaList;
    }

    @XmlTransient
    public List<Pagamento> getPagamentoList() {
        return pagamentoList;
    }

    public void setPagamentoList(List<Pagamento> pagamentoList) {
        this.pagamentoList = pagamentoList;
    }

    @XmlTransient
    public List<Mensagem> getMensagemList() {
        return mensagemList;
    }

    public void setMensagemList(List<Mensagem> mensagemList) {
        this.mensagemList = mensagemList;
    }

    public Assinatura getAssinaturaAssinaturaId() {
        return assinaturaAssinaturaId;
    }

    public void setAssinaturaAssinaturaId(Assinatura assinaturaAssinaturaId) {
        this.assinaturaAssinaturaId = assinaturaAssinaturaId;
    }

    public ContaStatus getContaStatusContaStatusId() {
        return contaStatusContaStatusId;
    }

    public void setContaStatusContaStatusId(ContaStatus contaStatusContaStatusId) {
        this.contaStatusContaStatusId = contaStatusContaStatusId;
    }

    public SecurityConta getSecurityContaSecuritySecurityId() {
        return securityContaSecuritySecurityId;
    }

    public void setSecurityContaSecuritySecurityId(SecurityConta securityContaSecuritySecurityId) {
        this.securityContaSecuritySecurityId = securityContaSecuritySecurityId;
    }

    @XmlTransient
    public List<Curtir> getCurtirList() {
        return curtirList;
    }

    public void setCurtirList(List<Curtir> curtirList) {
        this.curtirList = curtirList;
    }

    @XmlTransient
    public List<Qualificar> getQualificarList() {
        return qualificarList;
    }

    public void setQualificarList(List<Qualificar> qualificarList) {
        this.qualificarList = qualificarList;
    }

    @XmlTransient
    public List<Membro> getMembroList() {
        return membroList;
    }

    public void setMembroList(List<Membro> membroList) {
        this.membroList = membroList;
    }

    @XmlTransient
    public List<Registro> getRegistroList() {
        return registroList;
    }

    public void setRegistroList(List<Registro> registroList) {
        this.registroList = registroList;
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
        hash += (contaId != null ? contaId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Conta)) {
            return false;
        }
        Conta other = (Conta) object;
        if ((this.contaId == null && other.contaId != null) || (this.contaId != null && !this.contaId.equals(other.contaId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jsn.entidade.Conta[ contaId=" + contaId + " ]";
    }
    
}
