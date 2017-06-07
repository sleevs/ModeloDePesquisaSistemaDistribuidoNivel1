package br.com.jsn.entidade;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(VisitaStatus.class)
public abstract class VisitaStatus_ {

	public static volatile SingularAttribute<VisitaStatus, Integer> visitaStatusFlag;
	public static volatile SingularAttribute<VisitaStatus, String> visitaStatusTipo;
	public static volatile ListAttribute<VisitaStatus, Visita> visitaList;
	public static volatile SingularAttribute<VisitaStatus, Date> visitaStatusUpdate;
	public static volatile SingularAttribute<VisitaStatus, Integer> visitaStatusId;

}

