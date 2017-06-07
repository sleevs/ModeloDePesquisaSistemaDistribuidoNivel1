package br.com.jsn.entidade;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Mensagem.class)
public abstract class Mensagem_ {

	public static volatile SingularAttribute<Mensagem, Conta> contaConta;
	public static volatile SingularAttribute<Mensagem, Proposta> propostaPropostaId;
	public static volatile SingularAttribute<Mensagem, Integer> mensagemId;
	public static volatile SingularAttribute<Mensagem, Anuncio> anuncioAnuncioId;
	public static volatile SingularAttribute<Mensagem, Date> mensagemData;
	public static volatile SingularAttribute<Mensagem, String> mensagemDescricao;
	public static volatile SingularAttribute<Mensagem, String> mensagemFlag;

}

