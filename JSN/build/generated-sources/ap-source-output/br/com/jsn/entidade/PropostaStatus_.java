package br.com.jsn.entidade;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(PropostaStatus.class)
public abstract class PropostaStatus_ {

	public static volatile SingularAttribute<PropostaStatus, Date> propostaStatusUpdate;
	public static volatile SingularAttribute<PropostaStatus, Integer> propostaStatusId;
	public static volatile SingularAttribute<PropostaStatus, Integer> propostaStatusFlag;
	public static volatile SingularAttribute<PropostaStatus, String> propostaStatusTipo;
	public static volatile ListAttribute<PropostaStatus, Proposta> propostaList;

}

