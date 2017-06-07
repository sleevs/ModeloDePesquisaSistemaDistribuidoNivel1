package br.com.jsn.entidade;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ContaStatus.class)
public abstract class ContaStatus_ {

	public static volatile SingularAttribute<ContaStatus, Integer> contaStatusFlag;
	public static volatile SingularAttribute<ContaStatus, String> contaStatusTipo;
	public static volatile SingularAttribute<ContaStatus, String> contaStatusLatitude;
	public static volatile ListAttribute<ContaStatus, Conta> contaList;
	public static volatile SingularAttribute<ContaStatus, Integer> contaStatusId;
	public static volatile SingularAttribute<ContaStatus, Date> contaStatusUpdate;
	public static volatile SingularAttribute<ContaStatus, String> contaStatusLongetude;

}

