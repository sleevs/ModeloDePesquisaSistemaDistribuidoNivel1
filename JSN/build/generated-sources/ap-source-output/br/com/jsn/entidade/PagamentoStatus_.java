package br.com.jsn.entidade;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(PagamentoStatus.class)
public abstract class PagamentoStatus_ {

	public static volatile SingularAttribute<PagamentoStatus, Integer> pagamentoStatusFlag;
	public static volatile ListAttribute<PagamentoStatus, Pagamento> pagamentoList;
	public static volatile SingularAttribute<PagamentoStatus, Date> pagamentoStatusUpdate;
	public static volatile SingularAttribute<PagamentoStatus, Integer> pagamentoStatus;
	public static volatile SingularAttribute<PagamentoStatus, String> pagamentoStatusTipo;

}

