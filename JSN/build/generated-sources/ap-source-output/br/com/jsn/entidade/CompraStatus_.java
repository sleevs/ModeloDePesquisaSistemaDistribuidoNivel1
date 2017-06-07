package br.com.jsn.entidade;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(CompraStatus.class)
public abstract class CompraStatus_ {

	public static volatile SingularAttribute<CompraStatus, Date> compraStatusUpdate;
	public static volatile SingularAttribute<CompraStatus, Integer> compraStatusId;
	public static volatile SingularAttribute<CompraStatus, Integer> compraStatusFlag;
	public static volatile ListAttribute<CompraStatus, Compra> compraList;
	public static volatile SingularAttribute<CompraStatus, String> compraStatusTipo;

}

