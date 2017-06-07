package br.com.jsn.entidade;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Conta.class)
public abstract class Conta_ {

	public static volatile SingularAttribute<Conta, String> contaEmail;
	public static volatile ListAttribute<Conta, Curtir> curtirList;
	public static volatile ListAttribute<Conta, Registro> registroList;
	public static volatile SingularAttribute<Conta, SecurityConta> securityContaSecuritySecurityId;
	public static volatile SingularAttribute<Conta, String> contaSenha;
	public static volatile SingularAttribute<Conta, Date> contaData;
	public static volatile SingularAttribute<Conta, Date> contaNascimento;
	public static volatile SingularAttribute<Conta, ContaStatus> contaStatusContaStatusId;
	public static volatile ListAttribute<Conta, Chamada> chamadaList;
	public static volatile ListAttribute<Conta, Visita> visitaList;
	public static volatile SingularAttribute<Conta, Integer> contaId;
	public static volatile SingularAttribute<Conta, String> contaNome;
	public static volatile SingularAttribute<Conta, String> contaCategoria;
	public static volatile SingularAttribute<Conta, String> contaFoto;
	public static volatile ListAttribute<Conta, Compartilhar> compartilharList;
	public static volatile ListAttribute<Conta, Arquivo> arquivoList;
	public static volatile ListAttribute<Conta, Pagamento> pagamentoList;
	public static volatile ListAttribute<Conta, Mensagem> mensagemList;
	public static volatile SingularAttribute<Conta, String> contaTipo;
	public static volatile ListAttribute<Conta, Anuncio> anuncioList;
	public static volatile SingularAttribute<Conta, Assinatura> assinaturaAssinaturaId;
	public static volatile ListAttribute<Conta, Membro> membroList;
	public static volatile SingularAttribute<Conta, String> contaApelido;
	public static volatile SingularAttribute<Conta, String> contaSobrenome;
	public static volatile ListAttribute<Conta, Qualificar> qualificarList;

}

