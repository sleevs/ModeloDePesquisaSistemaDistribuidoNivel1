package br.com.jsn.entidade;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(EntregaStatus.class)
public abstract class EntregaStatus_ {

	public static volatile SingularAttribute<EntregaStatus, String> entregaStatusTipo;
	public static volatile ListAttribute<EntregaStatus, Entrega> entregaList;
	public static volatile SingularAttribute<EntregaStatus, Integer> entregaServicoFlag;
	public static volatile SingularAttribute<EntregaStatus, String> entregaStatusLatitude;
	public static volatile SingularAttribute<EntregaStatus, Integer> entregaServicoId;
	public static volatile SingularAttribute<EntregaStatus, String> entregaStatusLongitude;
	public static volatile SingularAttribute<EntregaStatus, Date> entregaServicoUpdate;

}

