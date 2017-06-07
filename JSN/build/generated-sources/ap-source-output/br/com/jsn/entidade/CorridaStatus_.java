package br.com.jsn.entidade;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(CorridaStatus.class)
public abstract class CorridaStatus_ {

	public static volatile SingularAttribute<CorridaStatus, Date> corridaStatusUpdate;
	public static volatile SingularAttribute<CorridaStatus, String> corridaStatusLatitude;
	public static volatile SingularAttribute<CorridaStatus, String> servicoProdutoLongetude;
	public static volatile SingularAttribute<CorridaStatus, String> corridaStatusTipo;
	public static volatile SingularAttribute<CorridaStatus, String> corridaStatusFlag;
	public static volatile ListAttribute<CorridaStatus, Corrida> corridaList;
	public static volatile SingularAttribute<CorridaStatus, Integer> corridaStatusId;

}

