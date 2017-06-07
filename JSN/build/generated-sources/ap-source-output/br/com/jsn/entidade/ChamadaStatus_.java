package br.com.jsn.entidade;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ChamadaStatus.class)
public abstract class ChamadaStatus_ {

	public static volatile SingularAttribute<ChamadaStatus, Integer> chamadaStatusFlag;
	public static volatile SingularAttribute<ChamadaStatus, String> chamadaStatusTipo;
	public static volatile ListAttribute<ChamadaStatus, Chamada> chamadaList;
	public static volatile SingularAttribute<ChamadaStatus, Integer> chamadaStatusId;
	public static volatile SingularAttribute<ChamadaStatus, Date> chamadaStatusUpdate;

}

