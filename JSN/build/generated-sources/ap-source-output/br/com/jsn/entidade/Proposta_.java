package br.com.jsn.entidade;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Proposta.class)
public abstract class Proposta_ {

	public static volatile SingularAttribute<Proposta, String> propostaTipo;
	public static volatile SingularAttribute<Proposta, PropostaStatus> propostaStatusPropostaStatusId;
	public static volatile SingularAttribute<Proposta, String> propostaFlag;
	public static volatile ListAttribute<Proposta, Mensagem> mensagemList;
	public static volatile SingularAttribute<Proposta, Integer> propostaId;
	public static volatile SingularAttribute<Proposta, String> propostaCategoria;
	public static volatile SingularAttribute<Proposta, String> propostaStatus;
	public static volatile SingularAttribute<Proposta, String> propostaAnexo;
	public static volatile SingularAttribute<Proposta, String> propostaUrl;
	public static volatile SingularAttribute<Proposta, String> propostaDescricao;
	public static volatile SingularAttribute<Proposta, String> propostaValor;
	public static volatile SingularAttribute<Proposta, Date> propostaData;

}

